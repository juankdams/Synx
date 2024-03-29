package SQL;

import static SQL.SqlServiceMySql.closePreparedStatement;
import static SQL.SqlServiceMySql.closeResultSet;
import static SQL.SqlServiceMySql.log;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Game.GameServer;
import GameObjects.GPersonnage;
import Login.LoginServer;
import LoginObjects.LAccount;
import LoginObjects.LWorld;

public class Accounts {
	//Queries
	private static final String insertAccount = "INSERT INTO `accounts` ( `ID` , `username` , `password` , `pseudo` , `secretquestion` , `secretanswer` , `gmlvl`, `community`, `curIP`, `isBanned`, `premiumTime`, `persos`, `banks`, `friends`, `ennemies`, `ignored`)"+// `spellboost` , `capital` , `energy` , `size` , `gfx` , `account`,`cell`,`map`,`spells`,`objets`,`storeObjets`)" +
	" VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";//,?,?,?,?,?,?,?,?,?,'', '');";
	private static final String updateAccountQuery = "UPDATE `accounts` SET `gmlvl`= ?, `curIP`= ?, `isBanned`= ?, `premiumTime`= ?, `giftID`= ?, `persos`= ?, `banks`= ?, `friends`= ?,`ennemies`= ?,`ignored`= ? WHERE `ID` = ?;";
	
	private static final String updatePersosQuery = "UPDATE `accounts` SET `persos`= ? WHERE `accounts`.`ID` = ?;";
	private static final String updateRelationsQuery = "UPDATE `accounts` SET `friends`= ?,`ennemies`= ?,`ignored`= ? WHERE `ID` = ?;";
	private static final String updateGiftQuery = "UPDATE `accounts` SET `giftID`= ? WHERE `accounts`.`ID` = ?;";
	private static final String updateBanQuery = "UPDATE `accounts` SET `isBanned`= ? WHERE `accounts`.`ID` = ?;";
	//private static String loadAccountsQuery = "SELECT * from accounts WHERE `username` = 'accname';";
	
	
	//Methods
	public static LoginObjects.LAccount load(LoginServer s, String username){
		try {
			ResultSet RS = s.getSqlService().executeQuery("SELECT * from accounts WHERE `username` = '"+username+"';");
			if(RS == null){
				return null;
			}
			boolean found = RS.first();
			if(found == false){
				return null;
			}
			LoginObjects.LAccount account = new LoginObjects.LAccount(
					s,
					RS.getInt("ID"),
					username,
					RS.getString("password"),
					RS.getString("pseudo"),
					RS.getString("secretquestion"),
					RS.getString("secretanswer"),
					RS.getByte("gmlvl"),
					RS.getByte("community"),
					RS.getString("curIP"),
					RS.getBoolean("isBanned"),
					RS.getLong("premiumTime"),
					RS.getInt("giftID"),
					null, 
					RS.getString("banks"),//serverID;serverID;serverID                //bankID,ServerID;bankID,ServerID;
					RS.getString("friends").split(","),
					RS.getString("ennemies").split(","),
					RS.getString("ignored").split(",")
					);
			//if(RS.next()){
				String persoss[] = RS.getString("persos").split(";");
				GPersonnage persos[] = {};
				if(persoss.length >= 1 && !persoss[0].equals("")){
					persos = new GPersonnage[persoss.length];
				}
				if(persos.length > 0){
					for(int i = persoss.length-1; i>=0; i--){
						if(persoss[i].length() >= 3 && persoss[i].indexOf(",") != -1){
							String[] persoAndPersoServ = persoss[i].split(",");
							for(GameServer gs : s.gameServers){
								if(gs.getServerID() == Byte.parseByte(persoAndPersoServ[1])){
									persos[i] = GPersonnage.provide(gs.getWorld()).createBase(
											Integer.parseInt(persoAndPersoServ[0]),	//persoID
											gs,  								   	//persoServer
											account			               			//account	
											);
								}
							}
						}
					}
				}
				account.setPersos(persos);
				//GameObjects.GBank banks[] = new GameObjects.GBank[RS.getString("banks").split(",").length];
			//}
			closeResultSet(RS);
			return account;
		} catch (SQLException e) {e.printStackTrace();}
		return null;
	}
	

	public static void updatePersos(LoginObjects.LAccount account) {
		if(account == null){
			log.error("Dans updatePersos : le compte est null");
			return;
		}
		StringBuilder toSave = new StringBuilder();
		for(GameObjects.GPersonnage p : account.getPersos()){
			if(p != null){
				if(toSave.length() != 0){
					toSave.append(";");
				}
				toSave.append(p.getID()).append(",").append(p.getServerID());
			}
		}
		try
		{
			PreparedStatement p = null;
			p = account.getLoginServer().getSqlService().newTransact(updatePersosQuery);
			//Syn.d("account.getPersos() -"+account.getPersos());
			//Syn.d("toSave persosList :"+toSave.toString());
			//Syn.d("account.getID() :"+account.getID());
			p.setString(1,toSave.toString());
			p.setInt(2,account.getID());
			p.executeUpdate();
			closePreparedStatement(p);
		}catch(Exception e){
			 log.error("Game: SQL ERROR: "+e.getMessage());
			 log.error("Game: Query: "+updatePersosQuery);
		}
	}
	
	/**
	 * Update les friends,ennemies et ignored
	 */
	public static void updateRelations(LoginObjects.LAccount account) {
		StringBuilder friends = new StringBuilder();
		for(int f : account.getFriendsIDs()){
			if(friends.length() != 0){
				friends.append(",");
			}
			friends.append(f);
		}
		StringBuilder ennemies = new StringBuilder();
		for(int e : account.getEnnemiesIDs()){
			if(ennemies.length() != 0){
				ennemies.append(",");
			}
			ennemies.append(e);
		}
		StringBuilder ignored = new StringBuilder();
		for(int i : account.getIgnoredIDs()){
			if(ignored.length() != 0){
				ignored.append(",");
			}
			ignored.append(i);
		}
		try
		{
			PreparedStatement p = null;
			p = account.getLoginServer().getSqlService().newTransact(updateRelationsQuery);
			p.setString(1,friends.toString());
			p.setString(2,ennemies.toString());
			p.setString(3,ignored.toString());
			p.setInt(4,account.getID());
			p.executeUpdate();
			closePreparedStatement(p);
		}catch(Exception e){
			 log.error("Game SQL ERROR: "+e.getMessage());
			 log.error("Game: Query: "+updateRelationsQuery);
		}
	}
	
	public static void updateGift(LAccount a, int giftID){
		try {
			PreparedStatement p = a.getLoginServer().getSqlService().newTransact(updateGiftQuery);
			p.setInt(1, giftID);
			p.setInt(2, a.getID());
			p.execute();
			closePreparedStatement(p);
		} catch (SQLException e) {
			 log.error("Game: SQL ERROR: "+e.getMessage());
			 log.error("Game: Query: "+updateGiftQuery);
		}
	}

	/**
	 * 0 = correct, 1 = banni
	 */
	public static void updateBan(LAccount a, boolean banned){
		try {
			PreparedStatement p = a.getLoginServer().getSqlService().newTransact(updateBanQuery);
			p.setInt(1, banned?1:0);
			p.setInt(2, a.getID());
			p.execute();
			closePreparedStatement(p);
		} catch (SQLException e) {
			 log.error("Game: SQL ERROR: "+e.getMessage());
			 log.error("Game: Query: "+updateBanQuery);
		}
	}

	/**
	 * TODO: SQL.Accounts.save();
	 *  -> Les relations, le premiumTime restant, le GMLvl, la curIP, le isBanned, le giftID, les persos, les banques.
	 * @param a
	 */
	public static void save(LAccount a) {
		// TODO Auto-generated method stub
		StringBuilder persos = new StringBuilder();
		for(GameObjects.GPersonnage p : a.getPersos()){
			if(p != null){
				if(persos.length() != 0){
					persos.append(";");
				}
				persos.append(p.getID()).append(",").append(p.getServerID());
			}
		}
		String friends = "";
		for(int f : a.getFriendsIDs()){
			if(friends.length() != 0){
				friends += ",";
			}
			friends += f;
		}
		String ennemies = "";
		for(int e : a.getEnnemiesIDs()){
			if(ennemies.length() != 0){
				ennemies += ",";
			}
			ennemies += e;
		}
		String ignored = "";
		for(int i : a.getIgnoredIDs()){
			if(ignored.length() != 0){
				ignored += ",";
			}
			ignored += i;
		}
		/*String banks = "";
		for(GBank b : a.getBanks()){
			if(banks.length() != 0){
				banks += ",";
			}
			banks += b.getID();
		}*/
		try {
			PreparedStatement p = a.getLoginServer().getSqlService().newTransact(updateAccountQuery);
			p.setByte(1, a.getGM());
			p.setString(2, a.getCurIP());
			p.setInt(3, a.isBanned()?1:0);
			p.setLong(4, a.getPremiumDate());
			p.setInt(5, a.getGift()==null ? 0 : a.getGift().getID());//0 si gift null, giftID si != null
			p.setString(6,persos.toString());
			p.setString(7, a.getBanks());
			p.setString(8,friends);
			p.setString(9,ennemies);
			p.setString(10,ignored);
			p.setInt(11, a.getID());
			p.execute();
			closePreparedStatement(p);
		} catch (SQLException e) {
			 log.error("Game: SQL ERROR: "+e.getMessage());
			 log.error("Game: Query: "+updateAccountQuery);
		}
	}

	/**
	 * Cherche dans la table SQL accounts à partir du pseudo d'un compte pour trouver et renvoyer sa persoList
	 * <p>(Utilisé pour quand on cherche un ami dans la liste de serveurs (Packets AF))
	 * @param pseudo
	 * @return
	 */
	public static String findAccountPersoList(LoginServer s, String pseudo) {
		try {
			ResultSet RS = s.getSqlService().executeQuery("SELECT * from accounts WHERE `pseudo` = '"+pseudo+"';");
			if(RS == null){
				return null;
			}
			if(RS.first()){
				String base = RS.getString("persos");
				if(base.length() == 0){
					return null;
				}
				String result = "";
				for(String l : base.split(";")){
					String serverID = l.substring(l.indexOf(",")+1);
					if(result.indexOf(serverID) != -1){
						continue;//Déjà compté les personnages de ce serveur
					}
					if(result.length() != 0){
						result += ";";
					}
					int num = 0;
					for(String p : base.split(";")){
						if(p.indexOf(serverID) != -1){
							num++;
						}
					}
					result += serverID+","+num;
				}
				return result;
			}
			closeResultSet(RS);
		} catch (SQLException e) {e.printStackTrace();}
		return null;
	}
	
	/**
	 * Create un nouveau compte dans bdd
	 */
	public static void create(LAccount account) {
		try {

			PreparedStatement p = account.getLoginServer().getSqlService().newTransact(insertAccount);
			p.setInt(1,account.getID());
			p.setString(2, account.getUsername());
			p.setString(3,account.getPassword());
			p.setString(4,account.getPseudo());
			p.setString(5,account.getSecretQuestion());
			p.setString(6,account.getSecretAnswer());
			p.setByte(7,account.getGM());
			p.setLong(8,account.getCommunity());
			p.setString(9,account.getCurIP());
			p.setInt(10,account.isBanned() ? 1 : 0);
			p.setLong(11, account.getPremiumTime());
			p.setString(12, "");
			p.setString(13, "");
			p.setString(14, "");
			p.setString(15, "");
			p.setString(16, "");
			p.execute();
			closePreparedStatement(p);
		} catch (SQLException e) {
			log.error("Game: Creation du compte echouee: SQL ERROR: "+e.getMessage()+"\n  Game: Query: "+insertAccount);
		}
	}
	
	/**
	 * @return - Le plus haut ID de compte
	 */
	public static int loadLastAccountID(LWorld s) {
		ResultSet RS = null;
		int ID = 0;
		try {
			RS = s.getServer().getSqlService().executeQuery("SELECT MAX(ID) AS ID from accounts;");
			if(RS != null){
				RS.first();
				ID = RS.getInt("ID");
				closeResultSet(RS);
			}
		} catch (SQLException e) {e.printStackTrace();}
		return ID;
	}
	
	
	
	
}
