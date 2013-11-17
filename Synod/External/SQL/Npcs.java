package SQL;

import static SQL.SqlServiceMySql.closeResultSet;

import java.sql.ResultSet;
import java.sql.SQLException;

import Abstractions.AbstractSqlService;
import Abstractions.AbstractWorld;
import GameObjects.GNpc;

public class Npcs {

	
	
	
	public static String getActionsListenersIDs(GNpc npc, AbstractWorld w){
		AbstractSqlService sqlService = w.getServer() == null ? w.getStrategy().sqlGlobalService : w.getServer().getSqlService();
		try{
			ResultSet RS = sqlService.executeQuery("SELECT actionListeners FROM npc_templates WHERE ID = "+npc.getID()+";");
			if(RS == null){
				return null;
			}
			String str = RS.getString("actionListeners");
			closeResultSet(RS);
			return str;
		} catch (SQLException e) {e.printStackTrace();}
		return "";
	}
	
	
}
