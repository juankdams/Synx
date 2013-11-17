package SQL;

import static SQL.SqlServiceMySql.closePreparedStatement;
import static SQL.SqlServiceMySql.closeResultSet;
import static SQL.SqlServiceMySql.log;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Login.LoginServer;

public class Gifts {
	private static final String deleteGiftQuery = "DELETE FROM gifts WHERE ID = ?;";

	public static LoginObjects.LGift load(LoginServer s, int ID){
		try {
			ResultSet RS = s.getSqlService().executeQuery("SELECT * from gifts WHERE `ID` = "+ID+";");
			if(RS == null){
				return null;
			}
			LoginObjects.LGift gift = null;
			if(RS.first()){
				gift = new LoginObjects.LGift(
						RS.getInt("ID"), 
						RS.getInt("type"), 
						RS.getString("title"),
						RS.getString("desc"),
						RS.getString("gfxURL"),
						RS.getString("items")
						);
				return gift;
			}
			closeResultSet(RS);
		} catch (SQLException e) {e.printStackTrace();}
		return null;
	}

	public static void delete(LoginServer s, int giftID){
		try {
			PreparedStatement p = s.getSqlService().newTransact(deleteGiftQuery);
			p.setInt(1, giftID);
			p.execute();
			closePreparedStatement(p);
		} catch (SQLException e) {
			 log.error("Game: SQL ERROR: "+e.getMessage());
			 log.error("Game: Query: "+deleteGiftQuery);
		}
	}
	
	
	
}
