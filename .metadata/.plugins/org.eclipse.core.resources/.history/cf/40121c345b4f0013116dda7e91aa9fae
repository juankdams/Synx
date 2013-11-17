package SQL;

import static SQL.SqlServiceMySql.closeResultSet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Abstractions.AbstractSqlService;
import Abstractions.AbstractWorld;
import GameObjects.GArea;
import GameObjects.GArea.GSubArea;
import GameObjects.GArea.GSuperArea;


public class Areas {

	/*
	 L'idéal serai de faire une boucle de chargement à partir de ce que les superareas ont comme areas.
	 Donc le load all ferait:
	 	loadSuperArea -- RS.getString(areas)  -- for(String id : areas) SQl.Areas.loadArea(id, world);
	 	SQl.Areas.loadArea -- RS.getString(subareas)  -- for(String id : subareas) SQl.Areas.loadSubArea(id, world);
	et voilà.
	 */
	
	
	public static void loadAllAreasTypes(AbstractWorld w, boolean setup){
		/*
		 //truc qui load les superareas dans l'arraylist de superAreas du world
		 */
		loadSuperAreas(w, setup, true);
		
		/*
		  //truc qui load les superareas dans l'arraylist d'Areas du world
		 */
		//loadAreas(w, setup, true);

		/*
		  //truc qui load les superareas dans l'arraylist d'Areas du world
		 */
		//loadSubAreas(w, setup, true);
	}
	
	
	
	
	public static ArrayList<GSuperArea> loadSuperAreas(AbstractWorld w, boolean setup, boolean linkdown){
		AbstractSqlService sqlService = w.getServer() == null ? w.getStrategy().sqlGlobalService : w.getServer().getSqlService();
	
		try {
			ResultSet RS = sqlService.executeQuery("SELECT * from areas_super;");
			if(RS == null){
				return null;
			}
			ArrayList<GSuperArea> areas_super = new ArrayList<GSuperArea>();
			while(RS.next()){
				GSuperArea suparea = new GSuperArea(
						RS.getShort("ID"), 
						null
						);
				//etc
				if(linkdown){
					ArrayList<GArea> areas = loadSomeAreas(RS.getString("areas"), suparea, w, setup);
					suparea.setAreas(areas);
				}
				
				//Syn.d("Loaded SuperArea");
				areas_super.add(suparea);
			}
			//Syn.d("Loaded All SuperArea");
			if(setup){//Ajoute les SuperAreas au AbstractWorld
				if(w.getSuperAreas() == null){
					w.setSuperAreas(new ArrayList<GSuperArea>());
				}
				w.getSuperAreas().addAll(areas_super);
				/*if(w != null){
					if(w.getSuperAreas() == null){
						w.setSuperAreas(new ArrayList<GSuperArea>());
					}
					w.getSuperAreas().addAll(areas_super);
				}else{//set les Areas dans LWorld
					//Syn.d("seting up SuperAreas in GlobalWorld");
					if(GlobalWorld.getSuperAreas() == null){
						GlobalWorld.setSuperAreas(new ArrayList<GSuperArea>());
					}
					GlobalWorld.getSuperAreas().addAll(areas_super);
				}*/
			}
			closeResultSet(RS);
			return areas_super;
		} catch (SQLException e) {e.printStackTrace();}
		return null;
	}
	
	public static ArrayList<GArea> loadSomeAreas(String areasStr, GSuperArea sa, AbstractWorld w, boolean setup){
		AbstractSqlService sqlService = w.getServer() == null ? w.getStrategy().sqlGlobalService : w.getServer().getSqlService();
		
		try {
			//Syn.d("superArea ID("+sa.getID()+") , areasStr = ("+areasStr+") .");
			ResultSet RS = sqlService.executeQuery("SELECT * from areas WHERE ID IN("+areasStr+") AND superAreaID = "+sa.getID()+";");
			if(RS == null){
				return null;
			}
			ArrayList<GArea> areas = new ArrayList<GArea>();
			while(RS.next()){
				GArea area = new GArea(
						RS.getShort("ID"), 
						null
						);
				//etc
				//Link la SuperArea parente à l'area
				area.setSuperArea(sa);
				
				ArrayList<GSubArea> subareas = loadSomeSubAreas(RS.getString("subareas"), area, w, setup);
				area.setSubAreas(subareas);
				
				//Syn.d("Loaded Area("+area.getID()+")");
				areas.add(area);
			}
			//Syn.d("Loaded All Areas from a SuperArea("+sa.getID()+")");
			if(setup){//Ajoute les Areas au AbstractWorld
				if(w.getAreas() == null){
					w.setAreas(new ArrayList<GArea>(areas.size()));
				}
				w.getAreas().addAll(areas);
				/*if(w != null){
					if(w.getAreas() == null){
						w.setAreas(new ArrayList<GArea>(areas.size()));
					}
					w.getAreas().addAll(areas);
				}else{
					if(GlobalWorld.getAreas() == null){
						GlobalWorld.setAreas(new ArrayList<GArea>(areas.size()));
					}
					//Syn.d("seting up Areas in LWorld");
					GlobalWorld.getAreas().addAll(areas);
				}*/
			}
			closeResultSet(RS);
			return areas;
		} catch (SQLException e) {e.printStackTrace();}
		return null;
	}
	
	
	public static ArrayList<GSubArea> loadSomeSubAreas(String subareasStr, GArea a, AbstractWorld w, boolean setup){
		AbstractSqlService sqlService = w.getServer() == null ? w.getStrategy().sqlGlobalService : w.getServer().getSqlService();
			
			try {
				ResultSet RS = sqlService.executeQuery("SELECT * from areas_sub WHERE ID IN("+subareasStr+") AND areaID = "+a.getID()+";");
				if(RS == null){
					return null;
				}
				ArrayList<GSubArea> areas_sub = new ArrayList<GSubArea>();
				while(RS.next()){
					GSubArea area = new GSubArea(
							RS.getShort("ID"), 
							w,
							RS.getShort("maxMonsterGroupSize"), 
							RS.getShort("maxNumberOfGroups"),
							RS.getString("possiblesMobs")
							);
					//etc
					//Link l'Area parente à la subArea.
					area.setArea(a);
					
					//Syn.d("Loaded SubArea("+area.getID()+")");
					areas_sub.add(area);
				}
				//Syn.d("Loaded All SubArea from an Area("+a.getID()+")");
				if(setup){//Ajoute les SubAreas au AbstractWorld
					if(w.getSubAreas() == null){
						w.setSubAreas(new ArrayList<GSubArea>(areas_sub.size()));
					}
					w.getSubAreas().addAll(areas_sub);
					/*if(w != null){
						if(w.getSubAreas() == null){
							w.setSubAreas(new ArrayList<GSubArea>(areas_sub.size()));
						}
						w.getSubAreas().addAll(areas_sub);
					}else{
						if(GlobalWorld.getSubAreas() == null){
							GlobalWorld.setSubAreas(new ArrayList<GSubArea>(areas_sub.size()));
						}
						//Syn.d("seting up SubAreas in LWorld");
						GlobalWorld.getSubAreas().addAll(areas_sub);
					}*/
				}
				closeResultSet(RS);
				return areas_sub;
			} catch (SQLException e) {e.printStackTrace();}
			return null;
		}
	
	
	
	
	/*
	public static ArrayList<GArea> loadAreas(GWorld w, boolean setup, boolean linkup){
		String DBName = w == null ? Config.globalDBName : w.getServer().getConfig().getDBName();
		
		try {
			ResultSet RS = SQL.executeQuery("SELECT * from areas_super;", DBName);
			if(RS == null){
				return null;
			}
			ArrayList<GArea> areas = new ArrayList<GArea>();
			while(RS.next()){
				GArea area = new GArea(
						RS.getShort("ID")
						//,RS.getString("subareas")
						);
				//etc
				if(linkup){
					if(w != null){
						area.setSuperArea( w.getSuperArea(RS.getShort("superAreaID")) );		
					}else{
						area.setSuperArea( LWorld.getSuperArea(RS.getShort("superAreaID")) );			
					}
				}
				Syn.d("Loaded Area");
				areas.add(area);
			}
			closeResultSet(RS);
			if(w != null && setup){
				w.setAreas(areas);
			}else if(setup){//set les Areas dans LWorld
				LWorld.setAreas(areas);
			}
			return areas;
		} catch (SQLException e) {e.printStackTrace();}
		return null;
	}
	
	public static ArrayList<GSubArea> loadSubAreas(GWorld w, boolean setup, boolean linkup){
	String DBName = w == null ? Config.globalDBName : w.getServer().getConfig().getDBName();
		
		try {
			ResultSet RS = SQL.executeQuery("SELECT * from areas_super;", DBName);
			if(RS == null){
				return null;
			}
			ArrayList<GSubArea> areas_sub = new ArrayList<GSubArea>();
			while(RS.next()){
				GSubArea area = new GSubArea(
						RS.getShort("ID"), 
						RS.getShort("maxMonsterGroupSize"), 
						RS.getShort("maxNumberOfGroups"),
						RS.getString("possiblesMobs")
						);
				//etc

				if(linkup){
					if(w != null){
						area.setArea( w.getArea(RS.getShort("areaID")) );		
					}else{
						area.setArea( LWorld.getArea(RS.getShort("areaID")) );			
					}
				}
				Syn.d("Loaded SubArea");
				areas_sub.add(area);
			}
			if(setup){
				if(w != null){
					w.setSubAreas(areas_sub);
				}else{
					LWorld.setSubAreas(areas_sub);
				}
			}
			closeResultSet(RS);
			return areas_sub;
		} catch (SQLException e) {e.printStackTrace();}
		return null;
	}
	*/
}
