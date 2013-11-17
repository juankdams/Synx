package SQL;

import static SQL.SqlServiceMySql.closeResultSet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import piou.scripts.ExecutableScript;
import piou.scripts.ScriptsService;
import plugin.event.Event;
import plugin.event.EventInformation;
import Abstractions.AbstractSqlService;
import Abstractions.AbstractWorld;
import ConfigurationObjects.Classe;
import ConfigurationObjects.Command;
import ConfigurationObjects.SimpleIA;
import Core.Exceptions;
import Core.Syn;
import Game.GameServer;
import GameObjects.GWorld;
import GlobalObjects.Map;
import NewThreads.Task;
import NewThreads.ThreadsManager;
import Plugins.Abstractions.AbstractActionListener;
import Plugins.Abstractions.AbstractMacro;
import Plugins.Managers.PluginsManager;
import ZPlug.MiscEvent;


public class SConfig {
	
	
	/* En fait j'veux pas le faire par bdd, mais par script. etk faut qqc de dynamique rassemblant toutes les formules de calcul ;)
	public static void loadFormulas(GConfig c){
		
		Formules à faire : bah c'quia dans Formulas.java: calcul prospec par la chance, tacle par l'agi, pods etc
	}
	*/

	
	public static AbstractActionListener loadActionListeners(GWorld w, String IDs, Map m, AbstractActionListener b){
		if(w == null || IDs == ""){
			return b;
		}
		try {																 //id,id2,id3,id4,id5,id6,id7
			ResultSet RS = w.getServer().getSqlService().executeQuery("SELECT * from actions_listeners WHERE ID IN ("+IDs+");");
			if(RS == null){
				return b;
			}
			ArrayList<AbstractActionListener> aals = new ArrayList<AbstractActionListener> ();
			while(RS.next()){
				AbstractActionListener a = w.getServer().getActionsManager().createListener(
						RS.getInt("ID"),
						RS.getString("type"), 
						RS.getString("conditions"),
						w,
						RS.getString("actions")
					);
				a = loadActionListeners(w, RS.getString("actionsListeners"), null, a);//listeners à l'intérieur d'un container
				if(a != null){
					aals.add(a);
				}
			}
			if(aals.size() <= 0){
				//nothing.
			}else if(b != null){
				if(b.getListeners() != null){
					b.getListeners().clear();
				}
				for(AbstractActionListener a : aals){
					b = b.addListener(a);//FIXME
				}
				return b;
			}else if(m != null){//Donc on ajoute les listeners à la map
				m.getActionsListeners().clear();
				for(AbstractActionListener a : aals){
					m.addActionListener(a);
				}
			}else if(w != null){//Donc on ajoute les listeners au world
				w.getListeners().clear();
				for(AbstractActionListener a : aals){
					w.addListener(a);
				}
			}
			closeResultSet(RS);
		} catch (SQLException e) {e.printStackTrace();}
		return b;
	}
	
	public static void loadCommands(GWorld w){
		try {
			ResultSet RS = w.getServer().getSqlService().executeQuery("SELECT * from commands_config;");
			if(RS == null){
				return;
			}
			w.getCommands().clear();
			while(RS.next()){
				w.addCommand(Command.createNew(
						RS.getShort("ID"), 
						RS.getString("name"), 
						RS.getString("actions").split("\\|"), 
						RS.getString("conditions"), 
						RS.getString("parameters").split("\\|"), 
						w));
			}
			closeResultSet(RS);
		} catch (SQLException e) {e.printStackTrace();}
	}
	
	public static void loadClasses(GWorld w){
		try {
			ResultSet RS = w.getServer().getSqlService().executeQuery("SELECT * from classes_config;");
			if(RS == null){
				return;
			}
			//s.getConfig()
			w.getClasses().clear();
			//s.getConfig()
			w.addClasse(null);
			while(RS.next()){
				//s.getConfig()
				w.addClasse(new Classe(w, RS));
				/*Colonnes: 
				 * 		classID, className
				 * 		startPdv, startStats (PA,PM,Prospec,Intel,Chance,Sagesse,Pods,etc)
				 * 		startSpells, learnableSpells, paliersStats
				 * 		statsGained(Capital,Vita,Intel,PtsSort) par lvl
				 * Lignes: une par classe.		
				 */
			}
			closeResultSet(RS);
		} catch (SQLException e) {e.printStackTrace();}
	}
	
	/*
	public static void createAllClasses(GConfig c){
		String updatePersosQuery = "INSERT INTO classes_config(`ID` , `name` , `startLevel` , `startKamas` , `startMap` , `startCell` , `startChannels`, `startEmotes`, `startPods`, `startItems`, `startSpells`, `startStats`, `learnableSpells`, `spellLearningLevels`, `gainedStatsPerLevel`, `paliersStats`, `maxEnergy`, `rates`, `minMaxPaPm`)"+
						" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		try
		{
			PreparedStatement p = null;

			for(int i = 1; i <= 12; i++){
				p = newTransact(updatePersosQuery);
				//Syn.d("account.getPersos() -"+account.getPersos());
				//Syn.d("toSave persosList :"+toSave.toString());
				//Syn.d("account.getID() :"+account.getID());
				p.setInt(1, i);
				p.setString(2, CPerso.classesNames[i-1]);
				p.setInt(3, 1);//startlevel
				p.setInt(4, 0);//startkamas
				p.setInt(5, 1155);//startmap
				p.setInt(6, 200);//startcell
				p.setString(7, "*#%!pi$:?");//channels
				p.setString(8, "-1-2-");//emotes
				p.setInt(9, 1000);//pods
				p.setString(10, "");//items
				if(i == 1){
					p.setString(11, "1,2,3");//startspells
				}else{
					p.setString(11, (2*i)+"1,"+(2*i)+"2,"+(2*i)+"3");//startspells
				}
				p.setString(12, "PROSPECTION,100;PA,6;PM,3".replace(i == CPerso.CLASSE_ENUTROF ? "100" : "879mjy", "120"));				
				String learnablespells = "";
				for(int s = 1; s <= 20; s++){
					if(s != 1){
						learnablespells += ",";
					}
					learnablespells += (i == 1 ? s+"" : (i*10)+s);
				}
				p.setString(13, learnablespells);
				p.setString(14, "1,3,6,9,13,17,21,26,31,36,42,48,54,60,70,80,90,100,200");//spellLearning levels
				p.setString(15, "PA,0.01;STATS_POINTS,5;SPELL_POINTS,1;LIFE_POINTS,5");//gainedStatsPerLevel
				p.setString(16, "PALIERSSTATS TODO");//paliers de stats
				p.setInt(17, 10000);//maxEnergy
				p.setString(18, "1.0;1.0;1.0;1.0;1.0;1.0;1.0;1.0");//rates
				p.setString(19, "0,0;126,126");//min;max de pa,pm
				
				
				p.executeUpdate();
				closePreparedStatement(p);
			}
			
		}catch(Exception e){
			e.printStackTrace();
			 log.error("Game: SQL ERROR: "+e.getMessage());
			 log.error("Game: Query: "+updatePersosQuery);
		}
	}
	*/
	
	
	public static void load(GameServer s){
		try {
			ResultSet RS = s.getSqlService().executeQuery("SELECT * from config;");
			if(RS == null){
				return;
			}
			String name = "";
			
			while(RS.next()){
				name = RS.getString("FieldName");

				//if(name.equals("IP")){//ip du serveur, pas de la bdd
				//	s.getConfig().setIP(RS.getString("ValueString"));
				//}else
				//if(name.equals("port")){
				//	s.getConfig().setPort(RS.getShort("ValueInt"));
				//}else
				//if(name.equals("worldID")){
				//	s.getWorld().getcWorld().id = RS.getByte("ValueInt");
					//s.getConfig().setWorldID();
				//}else
				//if(name.equals("worldName")){
				//	s.getWorld().getcWorld().name = RS.getString("ValueString");
					//s.getConfig().setServerName();
				//}else
				//if(name.equals("")){
					
				//}
				if(name.equals("ArmorSpellCharacTypes")){
					s.getConfig().setArmorSpellCharacTypes(RS.getString("ValueString").split(";"));	
				}else
				if(name.equals("WorldActionsListenersIDs")){
					s.getConfig().setWorldActionsListenersIDs(RS.getString("ValueString"));	
				}else
				if(name.equals("forbiddenWords")){
					s.getConfig().setForbiddenWords(RS.getString("ValueString").split(";"));
				}else
				if(name.equals("minLvlAskSecreteForDelete")){
					s.getConfig().setMinLvlAskSecretForDelete(RS.getShort("ValueInt"));
				}else
				if(name.equals("RATES")){
					s.getConfig().setRates(RS.getString("ValueString").split(";"));
				}else
				if(name.equals("startMessage")){
					s.getConfig().setStartMessage(RS.getString("ValueString"));
				}else
				if(name.equals("aura100lvl")){
					s.getConfig().setAura100lvl(RS.getInt("ValueInt"));
				}else
				if(name.equals("aura200lvl")){
					s.getConfig().setAura200lvl(RS.getInt("ValueInt"));
				}else
				if(name.equals("lvlMax")){
					s.getConfig().setLvlMax(RS.getInt("ValueInt"));
				}else
				if(name.equals("active_stats2")){
					s.getConfig().setActiveStats2(RS.getBoolean("ValueBool"));
				}else
				if(name.equals("kickOnExceptionCaught")){
					s.getConfig().setKickOnExceptionCaught(RS.getBoolean("ValueBool"));	
				}else
				if(name.equals("banOnExceptionCaught")){
					s.getConfig().setBanOnExceptionCaught(RS.getBoolean("ValueBool"));
				}else
				if(name.equals("kickOnPacketCantParse")){
					s.getConfig().setKickOnPacketCantParse(RS.getBoolean("ValueBool"));	
				}else
				if(name.equals("banOnPacketCantParse")){
					s.getConfig().setBanOnPacketCantParse(RS.getBoolean("ValueBool"));
				}else
				if(name.equals("maximumClients")){
					s.getConfig().setMaximumClients(RS.getInt("ValueInt"));
				}else
				if(name.equals("maxPersoPerAccount")){
					s.getConfig().setMaxPersoPerAccount((byte) RS.getInt("ValueInt"));
				}else
				if(name.equals("fightStartTimerTime")){
					s.getConfig().setFightTurnTimerTime(RS.getInt("ValueInt"));
				}else
				if(name.equals("fightTurnTimerTime")){
					s.getConfig().setFightTurnTimerTime(RS.getInt("ValueInt"));
				}else
				if(name.equals("useDefaultPlugins")){
					s.getConfig().setUseDefaultPlugins(RS.getBoolean("ValueBool"));
				}else
				if(name.equals("permanentDamagePercent")){
					s.getConfig().setPermanentDamagePercent(RS.getShort("ValueInt"));
				}
			}
			closeResultSet(RS);
			/*if(c.validateWorldID(c.getWorldID()) == false){
				Syn.d("readOneConfig Returns invalide worldID");
				c.setOpened(false);
			}
			if(c.validateServerName(c.getServerName()) == false){
				Syn.d("readOneConfig Returns invalide serverName");
				c.setOpened(false);
			}
			if(c.validateServerPort(c.getPort()) == false){
				Syn.d("readOneConfig Returns invalide serverPort");
				c.setOpened(false);
			}*/
		} catch (SQLException e) {e.printStackTrace();}
	}
	
	//public static void update(GConfig c, String field, String value){
		
	//}
	
	//public static void create(GConfig c){
		
	//}
	

	public static void loadXP(GWorld w){
		try {
			ResultSet RS = w.getServer().getSqlService().executeQuery("SELECT * from experience;");
			if(RS == null){
				return;
			}
			RS.last();
			//Vu le premier test, ca marche, mais on sait jamais :)
			for(int i = RS.getInt("lvl"); i > 0; i--){
				if(RS.getLong("perso") != -1){
					if(w.persoXPLevels == null){
						w.persoXPLevels = new long[i+1];
					}
					if(w.persoXPLevels != null){
						w.persoXPLevels[i] = RS.getLong("perso");
					}
				}
				if(RS.getLong("metier") != -1){
					if(w.jobXPLevels == null){
						w.jobXPLevels = new long[i+1];
					}
					if(w.jobXPLevels != null){
						w.jobXPLevels[i] = RS.getLong("metier");
					}
				}
				if(RS.getLong("dinde") != -1){
					if(w.mountsXPLevels == null){
						w.mountsXPLevels = new long[i+1];
					}
					if(w.mountsXPLevels != null){
						w.mountsXPLevels[i] = RS.getLong("dinde");
					}
				}
				if(RS.getLong("pvp") != -1){
					if(w.honorXPLevels == null){
						w.honorXPLevels = new long[i+1];
					}
					if(w.honorXPLevels != null){
						w.honorXPLevels[i] = RS.getLong("pvp");
					}
				}
				if(RS.getLong("bandit") != -1){
					if(w.honorXPLevels == null){
						w.honorXPLevels = new long[i+1];
					}
					if(w.honorXPLevels != null){
						w.honorXPLevels[i] = RS.getLong("bandit");
					}
				}
				RS.previous();
			}
			closeResultSet(RS);
		} catch (SQLException e) {e.printStackTrace();}
		
	}

	
	public static void loadPlugins(AbstractWorld w, String plugName) {
		PluginsManager pm = w.getServer() == null ? w.getStrategy().defaultPluginsManager : w.getServer().getPluginsManager();
		AbstractSqlService sqlService = w.getServer() == null ? w.getStrategy().sqlGlobalService : w.getServer().getSqlService();
		
		String query = "SELECT * from plugins";
		if(plugName != null && plugName.length() > 0){
			query += " WHERE `name` = '"+plugName+"'";
		}
		try {
			ResultSet RS = sqlService.executeQuery(query+";");
			if(RS == null){
				return;
			}
			while(RS.next()){
				pm.plugins.getPluginLoader().loadPlugin(
						RS.getString("url"), 
						RS.getString("name"), 
						RS.getString("fileName"), 
						RS.getString("main"), 
						RS.getString("description"), 
						RS.getString("version"),  
						RS.getBoolean("enableOnLoad"),
						new Event[]{
							new Event(MiscEvent.Set_PluginsManager, pm, new EventInformation()),
							new Event(MiscEvent.Set_GameServer, w.getServer(), new EventInformation()),
							new Event(MiscEvent.Set_GameClientStrategy, w.getStrategy().get(), new EventInformation())
						}
						);
				//Syn.d("Loading Plugin");
			}
			closeResultSet(RS);
		} catch (SQLException e) {e.printStackTrace();}
	}

	
	public static boolean loadScripts(AbstractWorld w, String scriptName) {
		ScriptsService<ExecutableScript> scripts = w.getServer() == null ? w.getStrategy().scripts : w.getServer().getScripts();
		AbstractSqlService sqlService = w.getServer() == null ? w.getStrategy().sqlGlobalService : w.getServer().getSqlService();
		ThreadsManager tm = w.getServer() == null ? Syn.Services.globalThreadsManagerService : w.getServer().threadsManager; 
		
		if(scripts == null || tm == null || sqlService == null){
			Exceptions.throwNullPointerException("SConfig.loadScripts;  Null = (scripts == "+scripts+" || tm == "+tm+" || sqlService == "+sqlService+") ");
		}
		String query = "SELECT * from scripts";
		if(scriptName != null && scriptName.length() > 0){
			query += " WHERE `name` = '"+scriptName+"'";
		}
		try {
			ResultSet RS = sqlService.executeQuery(query+";");
			if(RS == null){
				return false;
			}
			while(RS.next()){
				ExecutableScript script =  new ExecutableScript(
						RS.getInt("ID"),
						RS.getString("url"), 
						RS.getString("fileName"),
						RS.getString("name"),
						RS.getString("mainFunction"),
						RS.getString("mainArguments").split("\\|"),
						RS.getString("version"),
						RS.getString("description"),
						RS.getBoolean("precompile"),
						null
				);
				if(RS.getBoolean("executeOnLoad")){
					Future<?> f = null;
					Task<Object> task = tm.getTaskFactory().newScriptingTask(script, w.getServer());
					long interval = RS.getLong("intervalSchedule");
					long delay = RS.getLong("initialScheduleDelay");
					String timeUnit = RS.getString("timeUnit");
					timeUnit = timeUnit.length() == 0 ? TimeUnit.DAYS.name() : timeUnit;
					if(interval > 0 && delay >= 0){
						f = tm.executeScheduledRepeatedTask(task, delay, interval, TimeUnit.valueOf(timeUnit));
						//f = s.threadsManager.executeScheduledRepeatedTask(SchedulingA.EXE_SCRIPT, RS.getLong("initialScheduleDelay"), interval, TimeUnit.valueOf(timeUnit), script, s);
						//Syn.d("SConfig.intervaling ("+interval+") ("+script.getName()+") ");
					}else if(delay > 0){
						f = tm.executeScheduledTask(task, delay, TimeUnit.valueOf(timeUnit));
					}else{
						f = tm.executeDirectTask(task);
					}
					script.setFuture(f);
				}
				//Syn.d("SConfig.loadingScript ("+script.getName()+") " + ". Desc:" + script.getDescription());
				for(int i = scripts.size()-1; i >= 0; i--){ 
					if(scripts.get(i).getName().equals(script.getName())){
						//s.getScripts().get(i).getFuture().cancel(true);
						//Syn.d("isCancelled("+s.getScripts().get(i).getFuture().isCancelled()+")  isDone("+s.getScripts().get(i).getFuture().isDone()+")");
						//s.getScripts().remove(i);
						//i = s.getScripts().size()-1;//doit reloop
						//Syn.d("SConfig.overridenScript ("+script.getName()+") ");
					}
				}
				scripts.add(script);
				RS.next();
			}
			closeResultSet(RS);
			return true;
		} catch (SQLException e) {e.printStackTrace(); return false; }
	}

	public static void loadIntelligences(AbstractWorld w) {
		try {
			AbstractSqlService sql = w.getServer() == null ? w.getStrategy().sqlGlobalService : w.getServer().getSqlService();
			ResultSet RS = sql.executeQuery("SELECT * from artificial_intelligence_config;");
			if(RS == null){
				return;
			}
			HashMap<Short, SimpleIA> ias = w.getIntelligences(); //w == null ? GlobalWorld.getIntelligences() : w.getIntelligences();
			ias.clear();
			while(RS.next()){
				SimpleIA ia = SimpleIA.provide(w).createNew(
						w,
						RS.getShort("ID"), 
						RS.getString("name"), 
						RS.getString("actions")
						);
				//if(ia == null){ Exceptions.write("IllegalArgumentException", "SConfig.loadIntelligences. ia retournée null.");}
				ias.put(ia.getID(), ia);
			}

			w.setIntelligences(ias);
			//if(w == null){
			//	GlobalWorld.setIntelligences(ias);
			//}else{
			//	w.setIntelligences(ias);
			//}
			closeResultSet(RS);
		} catch (SQLException e) {e.printStackTrace();}
	}
	

	public static boolean loadMacros(AbstractWorld w, String scriptName) {
		PluginsManager pm = w.getServer() == null ? w.getStrategy().defaultPluginsManager : w.getServer().getPluginsManager();
		AbstractSqlService sqlService = w.getServer() == null ? w.getStrategy().sqlGlobalService : w.getServer().getSqlService();
		HashMap<Short, AbstractMacro> macros = new HashMap<Short, AbstractMacro>();
		
		if(sqlService == null){
			Exceptions.throwNullPointerException("in SConfig.loadMacros;  Null = (sqlService == "+sqlService+") ");
		}
		String query = "SELECT * from macros";
		if(scriptName != null && scriptName.length() > 0){
			query += " WHERE `name` = '"+scriptName+"'";
		}
		try {
			ResultSet RS = sqlService.executeQuery(query+";");
			if(RS == null){
				return false;
			}
			if(RS.first()){
				while(RS.isAfterLast() == false){
					AbstractMacro am = pm.getMacroManager().createAndpreloadMacro(
								RS.getString("url"), 
								RS.getString("fileName"),
								RS.getString("name"),
								RS.getString("version"),
								RS.getString("description")
							);
					macros.put(am.getID(), am);
					RS.next();
				}
			}
			pm.getAdapter().getMacroManager().setMacros(macros);
			closeResultSet(RS);
			return true;
		} catch (SQLException e) {e.printStackTrace(); return false; }
	}
	
	/*
	public static int[] loadTitles(GWorld w){
		try {
			ResultSet RS = w.getServer().getSqlService().executeQuery("SELECT * FROM titles;");
			if(RS == null){
				return null;
			}
			RS.last();
			int[] titles = new int[RS.getRow()];
			if(titles.length != 0){
				int i = titles.length-1;
				while(RS.isBeforeFirst() == false){
					titles[i++] = RS.getInt("ID");
					RS.previous();
				}
			}
			closeResultSet(RS);
			w.getTitleManager().setTitles(titles);
			return titles;
		} catch (SQLException e) {e.printStackTrace();}
		return new int[]{0};
	}
	*/
	
	
}
