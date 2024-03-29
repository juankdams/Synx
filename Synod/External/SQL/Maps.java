package SQL;

import static SQL.SqlServiceMySql.closePreparedStatement;
import static SQL.SqlServiceMySql.closeResultSet;
import static SQL.SqlServiceMySql.log;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import Abstractions.AbstractSqlService;
import Abstractions.AbstractWorld;
import Constants.CServers;
import Core.Syn;
import Enums.CharacterType;
import Enums.SynActions.MapAction;
import GameObjects.GMonsterGroup;
import GameObjects.GWorld;
import GlobalObjects.Map;
import Interfaces.ISprite;
import Plugins.Managers.PluginsManager;

public class Maps {

	
	/**TODO
	 * @return */
	public static Map load(int id, AbstractSqlService sqlService, AbstractWorld w){
		//AbstractSqlService sqlService = w.getServer() == null ? w.getStrategy().sqlGlobalService : w.getServer().getSqlService();
		PluginsManager pm = w.getServer() == null ? w.getStrategy().defaultPluginsManager : w.getServer().getPluginsManager();
		/*- GROS PROBLÈME : 
			- Quand on SQL.xxx.load(world)
				- Disons GameWorld.getMap(id = 7411) donc ça le transfert au global
					- là ça charge dans SQL.map.load(7411, global)
					- là ça prend le globalSqlService de la strategy, ce qui est correct
					- sauf que ça prend le defaultPluginManager de la strategy à la place de prendre celui du serveur dans lequel on est !
					- 
				- Aussi, metons qu'on charge des monstres, ça va leur mettre .setServer(null)  (à cause du globalWorld dont le .getServer = null)
				- alors qu'ils doivent obligatoirement être liés à un serveur!
		*/
		try {
			ResultSet RS = sqlService.executeQuery("SELECT * from maps WHERE `ID` = "+id+";");
			if(RS == null){
				return null;
			}
			Map map = null;
			if(RS.first()){
				map = new Map(
						RS.getShort("ID"), 
						RS.getString("mapKey"),
						//RS.getString("mapData"), 
						RS.getString("date"), 
						RS.getInt("height"), 
						RS.getInt("width"), 
						RS.getShort("subarea")
						);
				//SQL.NPCs.load();
				//SQL.Monstres.loadFixed();
				//SQL.IOs.load();
				//SQL.Triggers.load(); 
					//SConfig.loadActionListeners(w, RS.getString("actionsListeners"), map, null);
				int numberOfGroups = 0;
				//Loading des groupes de monstres déjà créés: les Fixes et les Héroiques.
				String monstersGroupsInstances = RS.getString("monstersGroupsInstances");
				if(monstersGroupsInstances != null && monstersGroupsInstances.length() > 0){
					ArrayList<GMonsterGroup> staticGroups = Monsters.loadGroupsInstances(monstersGroupsInstances, map, sqlService, w);
					map.setSprites(new ArrayList<ISprite>(staticGroups.size()));
					ArrayList<ISprite> sprites = map.updateSpriteList(MapAction.GET_SPRITES, null);
					sprites.addAll(staticGroups);
					//Syn.d("map.sprites size:"+map.getSpritesSynchroFull().size());
					numberOfGroups = staticGroups.size();
				}
				/*ArrayList<ISprite> sprites = map.updateSpriteList(MapAction.GET_SPRITES, null);
				int numberOfGroups = 0;
				if(sprites != null && sprites.size() > 0){
					for(ISprite i : sprites){
						if(i.getCharacterType() == CharacterType.MONSTER_GROUP){
							numberOfGroups ++;//nombre de groupes déjà générés et présents sur la map.
						}
					}
				}*/
				//Génération / Spawn des groupes de monstres aléatoires par subareas.
				for(int i = map.getSubArea(w).maxNumberOfGroups-1; i >= numberOfGroups; i--){
					GMonsterGroup mg = map.getSubArea(w).generateRandomMonsterGroup(w);
					if(mg != null){
						mg.attachToMap(map, pm.getFormulingManager().getFreeCellRandom(map));
						Syn.d("before updateSpriteList, while generating random groups in maps.load:  mg.getID("+mg.getID()+")");
						map.updateSpriteList(MapAction.ADD_SPRITE, mg);
					}
				}
			
				
				String listeners = RS.getString("actionsListeners");
				if(listeners != null && listeners.length() > 0){
					map.setActionsListeners(ActionListeners.loadSomeForMap(listeners, map, w));
				}
				
				//etc
				Syn.d("Loaded Map");
			}
			closeResultSet(RS);
			return map;
		} catch (SQLException e) {e.printStackTrace();}
		return null;
	}
	
	
	
	public static HashMap<Integer, Map> loadAllOfficialMapsSupplementaries(GWorld w, boolean setup){
		try {
			ResultSet RSsup = w.getServer().getSqlService().executeQuery("SELECT * from official_maps_supplementaries;");
			if(RSsup == null){
				return null;
			}
			HashMap<Integer, Map> maps = new HashMap<Integer, Map>();

			while(RSsup.next()){

				short mapID = RSsup.getShort("mapID");
				if(mapID >= CServers.minimumWorldObjectID){//minimumIDinWorldMapTable){
					Syn.log.warn("ID of supplementay for official map is invalid ("+mapID+"): >= CServers.minimumIDinWorldMapTable.");
					continue;
				}
				Map m = null;//Charge la map de l'officiel sans les friortures de monstres et cie.
				if(RSsup.first()){
					 m = new Map(
								- RSsup.getShort("ID"),  //ID en négatifs pour les complémentaries/override d'officiel
								RSsup.getString("mapKey"),
								//RS.getString("mapData"),
								RSsup.getString("date"),
								RSsup.getInt("height"), 
								RSsup.getInt("width"), 
								RSsup.getShort("subarea")
								);
				}
				//Map m = load(mapID, Config.globalDBName, w);
				if(m == null){
					Syn.log.warn("ID of supplementay for official map is invalid 2 ("+mapID+"): loading the map from official bdd returned null.");
					continue;
				}
				
				//Ensuite on ajoute les trucs supplémentaires.
				
				//SQL.NPCs.load();
				//SQL.Monstres.loadFixed();
				//SQL.IOs.load();
				//SQL.Triggers.load(); 
					//SConfig.loadActionListeners(w, RS.getString("actionsListeners"), map, null);
				
				//Loading des groupes de monstres déjà créés: les Fixes et les Héroiques.
				String monstersGroupsInstances = RSsup.getString("monstersGroupsInstances");
				if(monstersGroupsInstances != null && monstersGroupsInstances.length() > 0){
					ArrayList<GMonsterGroup> staticGroups = Monsters.loadGroupsInstances(monstersGroupsInstances, m, w.getServer().getSqlService(), w);
					m.setSprites(new ArrayList<ISprite>(staticGroups.size()));
					ArrayList<ISprite> sprites = m.updateSpriteList(MapAction.GET_SPRITES, null);
					sprites.addAll(staticGroups);
					//Syn.d("map.sprites size:"+map.getSpritesSynchroFull().size());
				}
				ArrayList<ISprite> sprites = m.updateSpriteList(MapAction.GET_SPRITES, null);
				int numberOfGroups = 0;
				for(ISprite i : sprites){
					if(i.getCharacterType() == CharacterType.MONSTER_GROUP){
						numberOfGroups ++;//nombre de groupes déjà générés et présents sur la map.
					}
				}
				//Génération / Spawn des groupes de monstres aléatoires par subareas.
				for(int i = m.getSubArea(w).maxNumberOfGroups-1; i >= numberOfGroups; i--){
					GMonsterGroup mg = m.getSubArea(w).generateRandomMonsterGroup(w);
					m.updateSpriteList(MapAction.ADD_SPRITE, mg);
				}
				
				String listeners = RSsup.getString("actionsListeners");
				if(listeners != null && listeners.length() > 0){
					m.setActionsListeners(ActionListeners.loadSomeForMap(listeners, m, w));
				}
				
				maps.put(m.getID(), m);
				//etc
				Syn.d("Loaded Map");
			}
			closeResultSet(RSsup);
			return maps;
		} catch (SQLException e) {e.printStackTrace();}
		return null;
	}
	
	
	public static void loadZenMaps(){
		try {
			ResultSet RS = Syn.Services.sqlZenService.executeQuery("SELECT * FROM `maps`;");
			if(RS == null){
				return ;
			}
			RS.first();
			while(RS.isAfterLast() == false){
				insertMap(RS.getInt("id"), RS.getString("key"), RS.getString("date"), Syn.Services.dofusClientStrategy.sqlGlobalService);
				RS.next();
			}
		} catch (SQLException e) {e.printStackTrace();}
		return;
	}
	
	public static void tansferZenMapsSubareas(){
		try {
			ResultSet RS = Syn.Services.sqlZenService.executeQuery("SELECT * FROM `maps`;");
			if(RS == null){
				return ;
			}
			RS.first();
			PreparedStatement p = Syn.Services.dofusClientStrategy.sqlGlobalService.newTransact("UPDATE maps SET subarea = ? WHERE ID = ?;");
			while(RS.isAfterLast() == false){
				String[] pos = RS.getString("mappos").split(",");
				if(pos.length != 3){
					continue;
				}
				p.setShort(1, Short.parseShort(pos[2]));
				p.setInt(2, RS.getInt("id"));
				p.execute();
				RS.next();
			}
			closePreparedStatement(p);
		} catch (SQLException e) {e.printStackTrace();}
		return;
	}
	
	public static void insertMap(int mapID, String key, String date, AbstractSqlService sqlService){
		try {
			Syn.d("insertMap ID "+mapID);
			PreparedStatement p = sqlService.newTransact("INSERT INTO `maps` ( `ID` , `mapKey` , `date` , `mapData` , `height` , `width`) VALUES (?,?,?,?,?,?)");
			p.setInt(1, mapID);
			p.setString(2, key);
			p.setString(3, date);
			p.setString(4, "");
			p.setInt(5, 15);
			p.setInt(6, 17);
			
			p.execute();
			closePreparedStatement(p);
		} catch (SQLException e) {
			 log.error("Game: SQL ERROR: "+e.getMessage());
			 log.error("Game: Query: "+"INSERT INTO `maps` ( `ID` , `mapKey` , `date`) VALUES (?,?,?)");
		}
	}


	public static String getActionsListenersIDs(Map m, AbstractWorld w){
		AbstractSqlService sqlService = w.getServer() == null ? w.getStrategy().sqlGlobalService : w.getServer().getSqlService();
		try{
			ResultSet RS = sqlService.executeQuery("SELECT actionListeners FROM maps WHERE ID = "+m.getID()+";");
			if(RS == null){
				return null;
			}
			String str = RS.getString("actionListeners");
			closeResultSet(RS);
			return str;
		} catch (SQLException e) {e.printStackTrace();}
		return "";
	}


	/**
	 * Sauvegarde la liste des instances de groupes de monstres de la map.<br> 
	 * Donc s'il y a eu de nouveaux groupes qui ont droppés en héroique, ou d'autres qui ont été vaincus, ça sera updaté.
	 * @param m - La map en question.  La DBName prise pour sauvegarder est le login si l'ID > CServers.minimumIDinWorldMapTable Et world sinon :)
	 * @param w - 
	 */
	public static void saveMonsterGroupList(Map m, AbstractWorld w) {
		if(m == null){
			return;
		}
		AbstractSqlService sqlService = null;
		if(m.getID() < CServers.minimumWorldObjectID){
			sqlService = w.getServer() == null ? w.getStrategy().sqlGlobalService : w.getServer().getSqlService();
		}
		//AbstractSqlService sqlService = m.getID() < CServers.minimumWorldObjectID//minimumIDinWorldMapTable 
		//										? 
		//							w == null 	? 
		//							null 		: 
		//							w.getServer().getSqlService() :
		//							Syn.Services.sqlGlobalService;
		if(sqlService == null){
			return;
		}
		try {
			//Syn.d("insertMap ID "+m.getID());
			PreparedStatement p = sqlService.newTransact("UPDATE maps SET monstersGroupsInstances = ? WHERE ID = ?;");
			String groupsList = "";
			for(ISprite s : m.getSpritesSynchroCopy()){
				if(s instanceof GMonsterGroup){
					if(groupsList.length() > 0){
						groupsList += ",";
					}
					groupsList += s.getID();
				}
			}
			p.setString(1, groupsList);
			p.setInt(2, m.getID());
			
			p.execute();
			closePreparedStatement(p);
		} catch (SQLException e) {
			 log.error("Game: SQL ERROR: "+e.getMessage());
			 log.error("Game: Query: "+"UPDATE maps SET monstersGroupsInstances = ? WHERE ID = ?;");
		}
	}



	public static void updateMapCoordinates() {
		// TODO Auto-generated method stub
		
	}
	
	
}
