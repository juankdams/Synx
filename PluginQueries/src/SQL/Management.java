package SQL;

import static SQL.SqlServiceMySql.closeResultSet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import ConfigurationObjects.GConfig;
import Constants.CWorld;
import Core.Syn;
import Game.DofusGameServer;
import Game.GameServer;
import Game.WakfuGameServer;
import GameClientStrategies.GameClientStrategies;
import Login.LoginServer;
import Management.Users.User;
import Tool.TServer;

public class Management {


	public static HashMap<TServer, Boolean> loadToolServers() {
		try {
			ResultSet RS = Syn.Services.sqlSynService.executeQuery("SELECT * from tool_servers;");
			if(RS == null){
				return null;
			}
			HashMap<TServer, Boolean> servers = new HashMap<TServer, Boolean>();
			RS.first();
			while(RS.isAfterLast() == false){
				TServer t = new TServer();
				t.setID(RS.getShort("ID"));
				t.setPort(RS.getShort("port"));	
				servers.put(t, RS.getBoolean("enableOnLoad"));
				RS.next();
			}
			closeResultSet(RS);
			return servers;
		} catch (SQLException e) {e.printStackTrace();}
		return null;
	}
	
	
	public static void loadUsers(){
		try {
			ResultSet RS = Syn.Services.sqlSynService.executeQuery("SELECT * from users;");
			if(RS == null){
				return;
			}
			RS.first();
			while(RS.isAfterLast() == false){
				User u = new User(
						RS.getInt("ID"), 
						RS.getString("username"), 
						RS.getString("password"), 
						RS.getString("IP"), 
						RS.getString("secretQuestion"), 
						RS.getString("secretAnswer"),
						RS.getString("ownedLoginServersIDs")
						);
				Syn.Services.users.add(u);
				Syn.Services.users.usersByAccount.put(u.name, u);
				RS.next();
			}
			closeResultSet(RS);
		} catch (SQLException e) {e.printStackTrace();}
	}
	
	public static HashMap<LoginServer, Boolean> loadLoginServers(){
		try {
			ResultSet RS = Syn.Services.sqlSynService.executeQuery("SELECT * from login_servers;");
			if(RS == null){
				return null;
			}
			HashMap<LoginServer, Boolean> servers = new HashMap<LoginServer, Boolean>();
			RS.first();
			while(RS.isAfterLast() == false){
				LoginServer l = LoginServer.provide(GameClientStrategies.get(RS.getString("gameClientStrategy")))
						.createNew(
						RS.getShort("loginID"), 
						RS.getString("dbIP"), 
						RS.getString("dbName"), 
						RS.getString("dbUser"), 
						RS.getString("dbPass"), 
						RS.getString("ownerUsers")
						);
				l.setPort(RS.getShort("port"));
				
				servers.put(l, RS.getBoolean("enableOnLoad"));
				RS.next();
			}
			closeResultSet(RS);
			return servers;
		} catch (SQLException e) {e.printStackTrace();}
		return null;
	}
	
	public static HashMap<GameServer, Boolean> loadGameServers(LoginServer s) throws Exception{
		try {
			ResultSet RS = s.getSqlService().executeQuery("SELECT * from game_servers;");
			if(RS == null){
				return null;
			}
			HashMap<GameServer, Boolean> servers = new HashMap<GameServer, Boolean>();
			RS.first();
			while(RS.isAfterLast() == false){
				
				GameServer g = null;
				GConfig config = new GConfig();
				CWorld cworld = new CWorld();
				
				g = GameServer.provide(s.getGameClientStrategy()).createNew(s, config, cworld);
				
				g.setPort(RS.getShort("port"));

				//config.setPort(RS.getShort("port"));
				config.setIP(RS.getString("ip"));
				config.setDBIP(RS.getString("dbIP"));
				config.setDBName(RS.getString("dbName"));
				config.setDBUser(RS.getString("dbUser"));
				config.setDBPass(RS.getString("dbPass"));
				
				cworld.id = RS.getShort("worldID");
				cworld.name = RS.getString("worldName");
				cworld.communityID = RS.getByte("worldCommunity");
				cworld.lang = RS.getString("worldLang");
				
				servers.put(g, RS.getBoolean("enableOnLoad"));
				RS.next();
			}
			closeResultSet(RS);
			return servers;
		} catch (SQLException e) {e.printStackTrace();}
		return null;
	}

	
	
	
	
}
