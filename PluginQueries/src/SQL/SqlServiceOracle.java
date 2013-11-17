package SQL;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

import oracle.jdbc.OracleDriver;

import org.fusesource.jansi.Ansi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Abstractions.AbstractSqlService;
import Core.Syn;
import Interfaces.IService;


public class SqlServiceOracle  extends AbstractSqlService implements IService{
	public static Logger log = LoggerFactory.getLogger(SqlServiceMySql.class);
	
	
	//public static Connection main;//Management
	//public static Connection global;//Données de l'officiel
	//public static Connection zen;
	//private static ArrayList<Connection> logins = null;//Comptes, cadeaux...
	//private static ArrayList<Connection> games = null;//Personnages, maps personnalisées, etc.
	
	public Connection c = null;
	
//	private static Future<Object> connexionSetupFuture = null;
	//private static HashMap<String, ArrayList<Connection>> gamesmap = new HashMap<String, ArrayList<Connection>>();TODO ?

	//private static ConnectionPool cp = null;
	
	private Timer timerCommit;
	private boolean needCommit;
	

	@Override
	public synchronized ResultSet executeQuery(String query) throws SQLException
	{
		ResultSet RS = null;
		Statement stat = c.createStatement();
		try{
			RS = stat.executeQuery(query);
		}catch(com.mysql.jdbc.exceptions.jdbc4.CommunicationsException e){
			if(c.isClosed() || c.isValid(1000) == false){
				closeCons();
				try {
					reboot();
				} catch (Exception e1) { e1.printStackTrace(); }
			}
			RS = stat.executeQuery(query);
		}
		stat.setQueryTimeout(300);
		return RS;
		
		
	} 
	@Override
	public synchronized PreparedStatement newTransact(String baseQuery) throws SQLException
	{
		PreparedStatement toReturn = (PreparedStatement) c.prepareStatement(baseQuery);
		needCommit = true;
		return toReturn;
	}
	@Override
	protected synchronized void commitTransacts()
	{
		try
		{
			if(c.isClosed()){
				closeCons();
				reboot();
			}
			c.commit();
		}catch(SQLException e)
		{
			Syn.w("SQL ERROR:"+e.getMessage(), Ansi.Color.RED);
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	protected synchronized void closeCons()
	{
		try
		{
			commitTransacts();
			c.close();
		}catch (Exception e)
		{
			Syn.w("Erreur a la fermeture des connexions SQL:"+e.getMessage(), Ansi.Color.RED);
			e.printStackTrace();
		}
	}
	
	/*
	public static boolean setUpConnexions()
	{
		//try {
		//	zen = DriverManager.getConnection("jdbc:mysql://"+LConfig.DB_HOSTIP+"/zenremake", "root", "");
		//} catch (SQLException e1) {e1.printStackTrace();}
		
		
		try
		{
			StringBuffer str = new StringBuffer().append("jdbc:mysql://").append(LConfig.DB_HOSTIP).append("/");
			login = DriverManager.getConnection(str.append(LConfig.DB_NAME).toString(),LConfig.DB_USERNAME,LConfig.DB_PASSWORD);
			
			//Set la connexion du LoginServer
			/*try{
				login = DriverManager.getConnection(str.append(LConfig.DB_NAME).toString(),LConfig.DB_USERNAME,LConfig.DB_PASSWORD);
			}catch(com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException a){
				//Créé la BDD si elle n'existait pas.
				if(a.getMessage().contains("Unknown database")){
					Statement s = login.createStatement();
					int Result = s.executeUpdate("CREATE DATABASE "+a.getMessage().substring(a.getMessage().indexOf("'")+1, a.getMessage().lastIndexOf("'")));
					Syn.d("Result = "+Result);
					str.delete(str.indexOf(LConfig.DB_NAME), str.length());
					login = DriverManager.getConnection(str.append(LConfig.DB_NAME).toString(),LConfig.DB_USERNAME,LConfig.DB_PASSWORD);
				}
			}* /
			login.setAutoCommit(false);
			str.delete(str.indexOf(LConfig.DB_NAME), str.length());
			
			//Set les connexions GameServers
			games = new Connection[GConfig.configs.length];
			//gamesmap = new HashMap<String, ArrayList<Connection>>(GConfig.configs.length);
			boolean areWorldsConsValid = true;
			for(int i = GConfig.configs.length-1; i>=0; i--){
				//Si le serveur va ouvrir, on set la connexion, sinon on la met nulle
				if(GConfig.configs[i].isOpened()){
					try{
						//gamesmap.get(GConfig.configs[i].getDBUser()).add(DriverManager.getConnection(str.append(GConfig.configs[i].getDBName()).toString(), GConfig.configs[i].getDBUser(), GConfig.configs[i].getDBPass()));
						
						games[i] = DriverManager.getConnection(str.append(GConfig.configs[i].getDBName()).toString(), GConfig.configs[i].getDBUser(), GConfig.configs[i].getDBPass());
					}catch(com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException b){
						//Créé la BDD si elle n'existait pas.
						if(b.getMessage().contains("Unknown database")){
							Statement s = login.createStatement();
							int Result = s.executeUpdate("CREATE DATABASE "+b.getMessage().substring(b.getMessage().indexOf("'")+1, b.getMessage().lastIndexOf("'")));
							Syn.d("Result = "+Result);
							str.delete(str.indexOf(GConfig.configs[i].getDBName()), str.length());
							games[i] = DriverManager.getConnection(str.append(GConfig.configs[i].getDBName()).toString(), GConfig.configs[i].getDBUser(), GConfig.configs[i].getDBPass());
						}
					}
					games[i].setAutoCommit(false);
					if(games[i].isValid(0) == false){
						areWorldsConsValid = false;
					}
					checkExistanceOfTables(games[i], GConfig.configs[i].getDBName());
					str.delete(str.indexOf(GConfig.configs[i].getDBName()), str.length());
				}else{
					games[i] = null;
				}
			}
			str = null;
			//Vérifie la validité des connexions qu'on a ouvert
			if(!login.isValid(100) || areWorldsConsValid == false)
			{
				Syn.w("SQLError : Connexion a la BD invalide!", Ansi.Color.RED);
				return false;
			}
			needCommit = false;
			TIMER(true);
			
			return true;
		}catch(SQLException e)
		{
			
			Syn.w("SQL ERROR: "+e.getMessage(), Ansi.Color.RED);
			e.printStackTrace();
			return false;
		}
	}
	*/
	
	/**
	 * Vérifie que chaque connexion sql a bien toutes les tables qu'il lui faut dans sa bdd
	 * <p> Et créé les tables manquantes
	 * @return
	 * @throws SQLException 
	 */
	private static boolean checkExistanceOfTables(Connection c, String DBName) throws SQLException{
		DatabaseMetaData meta = c.getMetaData();
		ResultSet res = meta.getTables(null, null, null, new String[] {"TABLE"});
		StringBuilder tables = new StringBuilder();
		//Nom de BDD : res.getString("TABLE_CAT")   (Si un jour tu veux..)
		while (res.next()) {
			tables.append("-").append(res.getString("TABLE_NAME")).append("-");
		}
		for(String table : BDDWorldTemplate.tables){
			if(tables.indexOf("-"+table+"-") == -1){
				//Table existe pas -> erreur
				//Lance exception, lance une question dans console, 
				//	demande si on veut ajouter ou non la table, 
				//	ajoute automatiquement apres 1min sans réponse 
				//	(Attend sans rien faire pendant ce temps là).
				Syn.Services.consoleService.question = "[CREATE_MISSING_TABLE] La BDD %"+DBName+"% ne contient pas la table %"+table+"% nécessaire. Elle sera créée immédiatement";//Voulez-vous la lui creer?";
				log.warn(Syn.Services.consoleService.question);
		//		long questionTime = System.currentTimeMillis();
		//		try {
		//			Syn.CS.question.wait(120000);//une minute
		//		} catch (InterruptedException e) {e.printStackTrace();}
		//		if(System.currentTimeMillis() - questionTime >= 60000){
		//			Syn.CS.answerYes();
		//		}
				ScriptRunner sr = new ScriptRunner(c, false, true);
				FileReader r;
				try {
					Syn.d("Config DB path : "+XML.Config.dataWorldName+table+".sql");
					r = new FileReader(XML.Config.dataWorldName+table+".sql");
					sr.runScript(r);
				} catch (FileNotFoundException e1) {e1.printStackTrace();
				} catch (IOException e) {e.printStackTrace();}
		//		Syn.CS.question = "";
			}else{
				
			}
		}
		return true;
	}
	
	/**
	 * TODO : Vérifie que chaque colonne d'une table est bien en place, avec les bons paramètres.
	 * @return
	 * @throws SQLException 
	 */
	@SuppressWarnings("unused")
	private static boolean checkExistanceOfColumns(Connection c) throws SQLException{
		DatabaseMetaData md = c.getMetaData();
		ResultSet rs = md.getColumns(null, null, "table_name", "column_name");
		if(rs.next()){
		      //Column in table exist
		}
		return false;
	}
	
	protected static void closeResultSet(ResultSet RS)
	{
		try {
			RS.getStatement().close();
			RS.close();
		} catch (SQLException e) {e.printStackTrace();}
	}
	protected static void closePreparedStatement(PreparedStatement p)
	{
		try {
			p.clearParameters();
			p.close();
		} catch (SQLException e) {e.printStackTrace();}
	}
	
	protected void TIMER(boolean start)
	{
			if(start)
			{
				timerCommit = new Timer();
				timerCommit.schedule(new TimerTask() {
					@Override
					public void run() {
						if(!needCommit){
							return;
						}
						commitTransacts();
						needCommit = false;
					}
				}, 30000, 30000);
			}else{
				timerCommit.cancel();
			}
	}
	
	
/*	public static boolean isDoneConnecting(){
		if(connexionSetupFuture == null){
			return false;
		}else{
			return connexionSetupFuture.isDone();
		}
	}
	public static Future<Object> getConnexionSetupFuture() {
		return connexionSetupFuture;
	}
	//public static void setConnexionSetupFuture(Future<Object> connexionSetupFuture) {
		SQL.connexionSetupFuture = connexionSetupFuture;
	}
*/	
	
	
	@Override
	public Connection createConnection(String dbHostIP, String dbName, String sqlAccountName, String sqlAccountPass){
		//StringBuffer str = new StringBuffer().append("jdbc:mysql://").append(dbHostIP).append("/");
		/*try {
			Context ctx = new InitialContext();
			//ctx.bind("jdbc/pool/fastCoffeeDB", cpds);
			DataSource ds1 = (DataSource)ctx.lookup("jdbc/fastCoffeeDB");
			
		} catch (NamingException e1) {
			e1.printStackTrace();
		}*/
		//BasicDataSource ds = new BasicDataSource();
		//ds.setServerName("grinder");
		//ds.setDatabaseName("CUSTOMER_ACCOUNTS");
		//ds.setDescription("Customer accounts database for billing");

		Properties p = new Properties();
		p.put("user", sqlAccountName);
		p.put("password", sqlAccountPass);
		p.put("database", "jdbc:oracle:thin:@"+dbHostIP+":"+3306+":"+dbName);
		OracleDriver ora = new OracleDriver();
		try {
			return ora.connect("jdbc:oracle:thin:@", p);
		} catch (SQLException e1) {
			e1.printStackTrace();
			return null;
		}
	}
	
	@Override
	public void boot() throws Exception {
		//À overrider quand on instancie l'objet SQL.
	}
	@Override
	public void reboot() throws Exception {
		boot();
	}
	
	
	
	
}
