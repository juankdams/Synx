package SQL;

import static SQL.SqlServiceMySql.closeResultSet;

import java.sql.ResultSet;
import java.sql.SQLException;

import piou.scripts.ExecutableScript;
import piou.scripts.ScriptsService;
import Abstractions.AbstractSqlService;
import Abstractions.AbstractWorld;
import Constants.CServers;
import GameObjects.GChallenge;

public class Challenges {
	
	/**
	 * @param s - Si le serveur est null, on load du global, sinon on load du game.
	 */
	public static void loadAllChallenges(AbstractWorld w){
		AbstractSqlService sqlService = w.getServer() == null ? w.getStrategy().sqlGlobalService : w.getServer().getSqlService();
		try
		{
			ResultSet RS = sqlService.executeQuery("SELECT * FROM challenges;");
			if(RS == null) return;
			while(RS.next())
			{
				ScriptsService<ExecutableScript> scripts;
				ExecutableScript script = null;
				int scriptID = RS.getInt("scriptID");
				if(scriptID >= CServers.minimumWorldObjectID){
					scripts = w.getServer().getScripts();
				}else{
					scripts = w.getStrategy().scripts;
				}
				for(ExecutableScript ss : scripts){
					if(ss.getID() == scriptID){
						script = ss;
						break;
					}
				}
				GChallenge c = new GChallenge(
						RS.getInt("ID"),
						RS.getInt("bonusXP"),
						RS.getInt("bonusDrop"),
						RS.getInt("bonusXpPerAlly"),
						RS.getInt("bonusDropPerAlly"),
						RS.getString("fightEventType"),
						script
				);

				w.addChallenge(c);
				//if(w == null){
				//	GlobalWorld.addChallenge(c);
				//}else{
				//	w.addChallenge(c);
				//}
			}
			closeResultSet(RS);
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Charge un seul challenge
	 */
	public static GChallenge load(short ID, AbstractWorld w){
		AbstractSqlService sqlService = w.getServer() == null ? w.getStrategy().sqlGlobalService : w.getServer().getSqlService();
		GChallenge c = null;
		try
		{
			ResultSet RS = sqlService.executeQuery("SELECT * FROM challenges WHERE ID = "+ID+";");
			if(RS == null){return null;}
			if(RS.next())
			{
				ScriptsService<ExecutableScript> scripts;
				ExecutableScript script = null;
				int scriptID = RS.getInt("scriptID");
				if(scriptID >= CServers.minimumWorldObjectID){
					scripts = w.getStrategy().scripts;
				}else{
					scripts = w.getServer().getScripts();
				}
				for(ExecutableScript ss : scripts){
					if(ss.getID() == scriptID){
						script = ss;
						break;
					}
				}
				c = new GChallenge(
						RS.getInt("ID"),
						RS.getInt("bonusXP"),
						RS.getInt("bonusDrop"),
						RS.getInt("bonusXpPerAlly"),
						RS.getInt("bonusDropPerAlly"),
						RS.getString("fightEventType"),
						script
				);
			}
			closeResultSet(RS);
			return c;
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	

}
