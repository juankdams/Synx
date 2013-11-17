package SQL;

import static Constants.Constants.ONE_SHORT;
import static SQL.SqlServiceMySql.closePreparedStatement;
import static SQL.SqlServiceMySql.closeResultSet;
import static SQL.SqlServiceMySql.log;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Abstractions.AbstractSqlService;
import Core.Exceptions;
import Core.Syn;
import Enums.CharacteristicType;
import Game.GameServer;
import GameObjects.GPersonnage;
import GameObjects.GStatistiques;
import GameObjects.GStatistiques.CharacteristicColumn;

public class Personnages{
	//private static final String updateChannels = "UPDATE `personnages` SET `channels`= ? WHERE `ID` = ?;";
	private static final String insertPerso = "INSERT INTO personnages( `ID` , `name` , `sexe` , `classe` , `color1` , `color2` , `color3`, `kamas`, `xp`, `mapID`, `cellID`, `channels`, `items`, `spellList`, `emotes`, `title`)"+// `spellboost` , `capital` , `energy` , `size` , `gfx` , `account`,`cell`,`map`,`spells`,`objets`,`storeObjets`)" +
						" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";//,?,?,?,?,?,?,?,?,?,'', '');";
	private static final String deletePerso = "DELETE FROM personnages WHERE `ID` = ?";
	private static final String updatePerso = "UPDATE personnages SET `channels` = ?, `kamas` = ?, `xp` = ?, `mapID` = ?, `cellID` = ?, `items` = ?, `spellList` = ?, `emotes` = ?, `title` = ?  WHERE `ID` = ?;";
	
	private static final String insertCharacteristiques = "INSERT INTO characteristiques_base (`persoID` , `PA` , `PM` , `statspoints` , `spellpoints` , `pdv` , `prospection` , `initiative` , `vitalite`, `intelligence`, `force`, `chance`, `agilite`, `energy`, `level`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
	private static final String deleteCharacteristique = "DELETE FROM characteristiques_base WHERE `persoID` = ?";
	private static final String updateCharac = "UPDATE characteristiques_base SET `PA` = ?, `PM` = ?, `statspoints` = ?, `spellpoints` = ?, `pdv` = ?, `prospection` = ?, `initiative` = ? , `vitalite` = ?, `intelligence` = ?, `force` = ?, `chance` = ?, `agilite` = ?, `energy` = ?, `level` = ? WHERE `persoID` = ?;";
	
	
	
	/**
	 * Vérifie s'il existe déjà un personnage dans la bdd avec le nom donnéé (string name)
	 */
	public static boolean exists(String name, AbstractSqlService sqlService){
		ResultSet RS = null;
		try {
			RS = sqlService.executeQuery("SELECT `name` from personnages WHERE `name` = '"+name+"';");
			if(RS != null){
				if(RS.first()){
					return true;
				}
				closeResultSet(RS);
			}
		} catch (SQLException e) {e.printStackTrace();}
		return false;
	}

	/**
	 * Quand on se co à un GServer et load les persos, on les init ici. Ou quand on créé un perso.
	 * Donc utile lécran de sélection du personnage.
	 */
	public static void loadServerPersosList(GameObjects.GPersonnage[] persos, GameServer gServ) {
		for(GameObjects.GPersonnage p : persos){
			if(p != null){
				if(p.getServerID() == gServ.getWorld().getID()){
					ResultSet RS = null;
					try {
						RS = gServ.getSqlService().executeQuery("SELECT * from personnages WHERE `ID` = '"+p.getID()+"';");
						if(RS != null){
							if(RS.first()){
								p.initGPerso(
										RS.getString("name"), 
										RS.getByte("classe"), 
										RS.getByte("sexe"), 
										RS.getInt("color1"), 
										RS.getInt("color2"),  
										RS.getInt("color3")
									);
								loadStatistiquesBase(p);
								Items.loadInventoryComplete(p, RS.getString("items"), gServ);//Fuckoff ca donne rien de faire AUTANT de lazyloading  .loadInventoryAccessories(p, RS.getString("items"), gServ);
							}
						}
						closeResultSet(RS);
					} catch (SQLException e) {e.printStackTrace();}
					//break;
				}
			}
		}
	}

	/**
	 * Create un nouveau perso dans bdd et ses statistiques aussi
	 * @param perso
	 * @param server
	 */
	public static void create(GameObjects.GPersonnage perso, GameServer server) {
		try {
			PreparedStatement p = server.getSqlService().newTransact(insertPerso);
			p.setInt(1,perso.getID());
			p.setString(2, perso.getName());
			p.setInt(3,perso.getSexe());
			p.setInt(4,perso.getClassID());
			p.setInt(5,perso.getColor1());
			p.setInt(6,perso.getColor2());
			p.setInt(7,perso.getColor3());
			p.setLong(8,perso.getKamas());
			p.setLong(9,perso.getXP());
			p.setInt(10, perso.getMapID());
			p.setInt(11, perso.getCellID());
			p.setString(12, perso.getChannels());
			p.setString(13, server.getWorld().getInventory(perso.getID()).getItemsString());
			p.setString(14, perso.getSpellListString(false));
			p.setString(15, perso.getEmotesString());
			p.setShort(16, perso.getTitle());
			
			/*
			TODO create perso
			p.setInt(9,perso.get_spellPts());
			p.setInt(10,perso.get_capital());
			p.setInt(11,perso.get_energy());
			p.setInt(14,perso.get_size());
			p.setInt(15,perso.get_gfxID());
			p.setInt(16,perso.getAccID());
			p.setInt(17,perso.get_curCell().getID());
			p.setInt(18,perso.get_curCarte().get_id());
			p.setString(19, perso.parseSpellToDB());
			*/
			p.execute();
			closePreparedStatement(p);
			
		} catch (SQLException e) {
			log.error("Game: Creation du personnage echouee: SQL ERROR: "+e.getMessage()+"\n  Game: Query: "+insertPerso);
		}
	}
	
	public static void delete(int persoID, GameServer s){
		try {
			PreparedStatement p = s.getSqlService().newTransact(deletePerso);
			p.setInt(1, persoID);
			p.execute();
			closePreparedStatement(p);
		} catch (SQLException e) {e.printStackTrace();}
		
	}
	
	/**
	 * @return - Le plus haut ID de personnage
	 */
	public static int loadLastPersoID(GameServer server) {
		ResultSet RS = null;
		int ID = 0;
		try {
			RS = server.getSqlService().executeQuery("SELECT MAX(ID) AS ID from personnages;");
			//RS = SQL.executeQuery("SELECT `ID` from personnages;", server.getConfig().getDBName());
			if(RS != null){
				RS.first();
				ID = RS.getInt("ID");
				//Syn.d("loadLastPersoID avec fonction MAX(ID) = ("+ID+")");
				//while(RS.next()){
				//	if(RS.getInt("ID") > ID){
				//		ID = RS.getInt("ID");
				//	}
				//}
				//Syn.d("loadLastPersoID avec fonction select 'ID' et boucle while = ("+ID+")");
				closeResultSet(RS);
			}
		} catch (SQLException e) {e.printStackTrace();}
		return ID;
	}

	/**
	 * Exécuté dans le perso.onSelected quand on choisi le perso (c'comme le onJoinGame)
	 * <p> C'est alors qu'on charge TOUT ce qui manquait au perso. Il devient mtn complet.
	 * @param id
	 */
	public static void loadRest(GPersonnage p){
		ResultSet RS = null;
		try {
			RS = p.getServer().getSqlService().executeQuery("SELECT * from personnages WHERE `ID` = '"+p.getID()+"';");
			if(RS != null){
				if(RS.first()){
					p.setKamas(RS.getLong("kamas"));
					p.setXP(RS.getLong("xp"));
					p.setMapID(RS.getShort("mapID"));
					p.setCellID(RS.getShort("cellID"));
					p.setChannels(RS.getString("channels"));
					p.setSpells(RS.getString("spellList"));
					p.setEmotes(RS.getString("emotes").split(","));
					p.setTitle(RS.getShort("title"));
					
					//TODO: load perso complet (onSelected = onJoinGame)
					//p.setQuests
					//p.setAlign
					//p.setHonor
					//p.setDishonor
					//p.
				}
				closeResultSet(RS);
			}
			//if(p.getgWorld().getStatistisque(p.getID()) == null){
			//	return;
			//}
		} catch (SQLException e) {e.printStackTrace();}
	}
	
	public static void save(GameObjects.GPersonnage perso, GameServer server) {
		try {
			PreparedStatement p = server.getSqlService().newTransact(updatePerso);
			Syn.d("Sperso.save  channels = "+perso.getChannels());
			p.setString(1, perso.getChannels());
			p.setLong(2,perso.getKamas());
			p.setLong(3,perso.getXP());
			p.setInt(4, perso.getMapID());
			p.setInt(5, perso.getCellID());
			if(server.getWorld().getInventory(perso.getID()) != null){
				p.setString(6, server.getWorld().getInventory(perso.getID()).getItemsString());
			}else{
				Exceptions.throwNullPointerException("SPerso.save. getInventory == null");
			}
			p.setString(7, perso.getSpellListString(false));
			p.setString(8, perso.getEmotesString());
			p.setShort(9, perso.getTitle());
			p.setInt(10,perso.getID());
			
			/*TODO save perso
			p.setInt(9,perso.get_spellPts());
			p.setInt(10,perso.get_capital());
			p.setInt(11,perso.get_energy());
			p.setInt(14,perso.get_size());
			p.setInt(15,perso.get_gfxID());
			p.setInt(16,perso.getAccID());
			p.setInt(17,perso.get_curCell().getID());
			p.setInt(18,perso.get_curCarte().get_id());
			p.setString(19, perso.parseSpellToDB());
			*/
			p.execute();
			closePreparedStatement(p);
		} catch (SQLException e) {
			log.error("Game: Sauvegarde du personnage echouee: SQL ERROR: "+e.getMessage()+"\n  Game: Query: "+updatePerso);
		}
	}
	
	
	
	
	
	
	
	
	//----------------------------------------------------------------------------
	//STATISTIQUES --------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	public static void createStatistiquesBase(GPersonnage p){
		//Syn.d("createStats. PA: "+p.getStatistique().getValue(CharacteristicType.PA.get(), CharacteristicColumn.BASE));
		try{
			PreparedStatement ps = p.getServer().getSqlService().newTransact(insertCharacteristiques);
			ps.setInt(1,p.getID());
			ps.setByte(2, (byte) p.getStatistique().getValue(CharacteristicType.PA.get(), CharacteristicColumn.BASE));
			ps.setByte(3, (byte) p.getStatistique().getValue(CharacteristicType.PM.get(), CharacteristicColumn.BASE));
			ps.setShort(4, p.getStatistique().getValue(CharacteristicType.STATS_POINTS.get(), CharacteristicColumn.BASE));
			ps.setShort(5, p.getStatistique().getValue(CharacteristicType.SPELL_POINTS.get(), CharacteristicColumn.BASE));
			ps.setShort(6, p.getStatistique().getPdv());
			ps.setShort(7, p.getStatistique().getValue(CharacteristicType.PROSPECTION.get(), CharacteristicColumn.BASE));
			ps.setShort(8, p.getStatistique().getValue(CharacteristicType.INITIATIVE.get(), CharacteristicColumn.BASE));
			ps.setShort(9, p.getStatistique().getValue(CharacteristicType.VITALITE.get(), CharacteristicColumn.BASE));
			ps.setShort(10, p.getStatistique().getValue(CharacteristicType.INTELLIGENCE.get(), CharacteristicColumn.BASE));
			ps.setShort(11, p.getStatistique().getValue(CharacteristicType.FORCE.get(), CharacteristicColumn.BASE));
			ps.setShort(12, p.getStatistique().getValue(CharacteristicType.CHANCE.get(), CharacteristicColumn.BASE));
			ps.setShort(13, p.getStatistique().getValue(CharacteristicType.AGILITE.get(), CharacteristicColumn.BASE));
			ps.setShort(14, p.getStatistique().getValue(CharacteristicType.ENERGY.get(), CharacteristicColumn.BASE));
			ps.setShort(15, p.getStatistique().getValue(CharacteristicType.LEVEL.get(), CharacteristicColumn.BASE));
			
			ps.execute();
			closePreparedStatement(ps);
		} catch (SQLException e) {
			log.error("Game: Creation du personnage (createStatistiques) echouee: SQL ERROR: "+e.getMessage()+"\n  Game: Query: "+insertCharacteristiques);
		}
	}
	
	/**
	 * Charge les statistiques du perso et les met dans le world. 
	 * <p>En créé des nouvelles si elles existent pas et les met dans le world en plus de INSERT bdd
	 * @param RS
	 * @param p
	 * @throws SQLException
	 */
	public static void loadStatistiquesBase(GPersonnage p){
		try{
			assert(p != null);
			assert(p.getServer() != null);
			assert(p.getServer().getConfig() != null);
			ResultSet RS = p.getServer().getSqlService().executeQuery("SELECT * FROM characteristiques_base WHERE `persoID` = "+p.getID()+";");
			if(RS != null){
				if(RS.first()){
				//	Syn.d("loadStatistiquesBase RS.first marche");
					
					//Créé une nouvelle instance de statistiques
					GStatistiques stats = new GStatistiques();
					//Set les charactéristiques de base
					stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.LEVEL, RS.getShort("level"));
					stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.STATS_POINTS, RS.getShort("statspoints"));
					stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.SPELL_POINTS, RS.getShort("spellpoints"));
					stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.PA, RS.getByte("PA"));
					stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.PM, RS.getByte("PM"));
					stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.VITALITE, RS.getShort("vitalite"));
					//stats.setPdvMax((short) (RS.getShort("vitalite")+CPerso.startPdv+(CPerso.pdvMaxPointsPerLevel*RS.getShort("level"))));
					//stats.setPdv(RS.getShort("pdv"));
					//stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.MAX_LIFE_POINTS, p.getServer().getFormulingManager().calculateBasePdvMax(stats, p));
					stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.LIFE_POINTS, RS.getShort("pdv"));
					
					stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.PROSPECTION, RS.getShort("prospection"));
					stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.INITIATIVE, RS.getShort("initiative"));
					stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.INTELLIGENCE, RS.getShort("intelligence"));
					stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.FORCE, RS.getShort("force"));
					stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.CHANCE, RS.getShort("chance"));
					stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.AGILITE, RS.getShort("agilite"));
					stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.ENERGY, RS.getShort("energy"));
					stats.putCharac(CharacteristicColumn.BASE, CharacteristicType.INVOCATIONS_MAX, ONE_SHORT);
					//Ajoute les statistiques au gWorld avec l'id du perso comme key
					p.getWorld().addStatistique(p.getID(), stats);
//					Syn.d(stats.toString());
				}else{
					Syn.d("loadStatistiquesBase RS.first = false so create new stats");
					GStatistiques.createNew(p);
					createStatistiquesBase(p);
				}
				closeResultSet(RS);
			}else{
				Syn.d("loadStatistiquesBase RS = null so create new stats");
				GStatistiques.createNew(p);
				createStatistiquesBase(p);
			}
		}catch(SQLException e){
			Syn.w("aksujdf");
			e.printStackTrace();
		}
		
	}

	public static void deleteStatistiques(int persoID, GameServer s) {
		try {
			PreparedStatement p = s.getSqlService().newTransact(deleteCharacteristique);
			p.setInt(1, persoID);
			p.execute();
			closePreparedStatement(p);
		} catch (SQLException e) {e.printStackTrace();}
	}

	public static void saveStatistiques(GPersonnage p, GameServer server) {
	//	Syn.d("updateStats. PA: "+p.getStatistique().getValue(CharacteristicType.PA.get(), CharacteristicColumn.BASE));
		try {
			PreparedStatement ps = server.getSqlService().newTransact(updateCharac);
			ps.setByte(1, (byte) p.getStatistique().getValue(CharacteristicType.PA.get(), CharacteristicColumn.BASE));
			ps.setByte(2, (byte) p.getStatistique().getValue(CharacteristicType.PM.get(), CharacteristicColumn.BASE));
			ps.setShort(3, p.getStatistique().getValue(CharacteristicType.STATS_POINTS.get(), CharacteristicColumn.BASE));
			ps.setShort(4, p.getStatistique().getValue(CharacteristicType.SPELL_POINTS.get(), CharacteristicColumn.BASE));
			ps.setShort(5, p.getStatistique().getPdv());
			ps.setShort(6, p.getStatistique().getValue(CharacteristicType.PROSPECTION.get(), CharacteristicColumn.BASE));
			ps.setShort(7, p.getStatistique().getValue(CharacteristicType.INITIATIVE.get(), CharacteristicColumn.BASE));
			ps.setShort(8, p.getStatistique().getValue(CharacteristicType.VITALITE.get(), CharacteristicColumn.BASE));
			ps.setShort(9, p.getStatistique().getValue(CharacteristicType.INTELLIGENCE.get(), CharacteristicColumn.BASE));
			ps.setShort(10, p.getStatistique().getValue(CharacteristicType.FORCE.get(), CharacteristicColumn.BASE));
			ps.setShort(11, p.getStatistique().getValue(CharacteristicType.CHANCE.get(), CharacteristicColumn.BASE));
			ps.setShort(12, p.getStatistique().getValue(CharacteristicType.AGILITE.get(), CharacteristicColumn.BASE));
			ps.setShort(13, p.getStatistique().getValue(CharacteristicType.ENERGY.get(), CharacteristicColumn.BASE));
			ps.setShort(14, p.getStatistique().getValue(CharacteristicType.LEVEL.get(), CharacteristicColumn.BASE));
			ps.setInt(15, p.getID());
			
			ps.execute();
			closePreparedStatement(ps);
		} catch (SQLException e) {
			log.error("Game: Sauvegarde des stats du perso echouee: SQL ERROR: "+e.getMessage()+"\n  Game: Query: "+updateCharac);
		}
		//server.getWorld().getInventory(perso.getID()).getItemsString()
	}
	
}
