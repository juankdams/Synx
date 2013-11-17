package ConfigurationObjects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class GConfig { //extends GConfig {
	public static Logger log = LoggerFactory.getLogger(GConfig.class);
	

	//private short port = 0;
	private String IP = "";
	
	private boolean isOpened = false;
	private String DBIP = "";
	private String DBName = "";
	private String DBUser = "";
	private String DBPass = "";
	
	
	public boolean ConnexionQueue = false;
	private byte maxPersoPerAccount = 5;//TODO 5 persos + 1 pour héroique.
	private int maximumClients = Integer.MAX_VALUE;
	private boolean kickOnExceptionCaught = false;
	private boolean banOnExceptionCaught = false;
	private boolean kickOnPacketCantParse = false;
	private boolean banOnPacketCantParse = false;
	private String forbiddenWords[] = {""};
	private short minLvlAskSecretForDelete = 20;
	/** XP, HONNEUR, JOB, DROP, FM, KAMAS*/
	private double rates[] = {1,1,1,1,1,1};
	private String startMessage = "Bienvenue sur le serveur!";
	private int[] auraLvls = {100,200};
	private int lvlMax = 200;
	private boolean activeStats2 = false;
	private String actionsListenersIDs = "";
	/** { {SpellID, CharacID}, {SpellID2, CharacID2} }*/
	private short[][] armorsCharacType = {{}};
	private int fightStartTimerTime = 45000;
	private int fightTurnTimerTime = 30000;
	private boolean useDefaultPlugins = true;
	private short permanentDamagePercent = 10;
	
	
	/*
	public byte getWorldID() {
		return worldID;
	}

	public void setWorldID(byte worldID) {
		this.worldID = worldID;
	}

	public void setServerName(String serverName){
		this.serverName = serverName;
	}

	public String getServerName(){
		return serverName;
	}
	*/

	/*
	public void setPort(short port){
		this.port = port;
	}

	public short getPort(){
		return port;
	}
	*/
	
	public void setIP(String iP){
		IP = iP;
	}

	public String getIP(){
		return IP;
	}
	
	
	public String[] getForbiddenWords(){
		return forbiddenWords;
	}

	public void setForbiddenWords(String[] forbiddenWords){
		this.forbiddenWords = forbiddenWords;
	}

	public short getMinLvlAskSecretForDelete(){
		return minLvlAskSecretForDelete;
	}
	
	public void setMinLvlAskSecretForDelete(short lvl){
		minLvlAskSecretForDelete = lvl;
	}
	
	public void setRates(String newRates[]){
		if(rates.length != newRates.length){
			log.error("GConfig.setRates() param String newRates[].length != rates.length : erreur de configuration bdd");
			this.setOpened(false);
			return;
		}
		try{
			for(int i = newRates.length-1; i >= 0; i--){
				this.rates[i] = Double.parseDouble(newRates[i]);
			}
		}catch(Exception e){
			e.printStackTrace();
			log.error("GConfig setRates une des valeurs de rates est pas parsable en Double, on les set toutes a 1");
			for(int i = 0; i <= rates.length-1; i++){
				rates[i] = 1;
			}
		}
	}
	
	public double getRateXP(){
		return rates[0];
	}
	public double getRateHonor(){
		return rates[1];
	}
	public double getRateJobs(){
		return rates[2];
	}
	public double getRateDrop(){
		return rates[3];
	}
	public double getRateFM(){
		return rates[4];
	}
	public double getRateKamas(){
		return rates[5];
	}

	public void setStartMessage(String startMessage){
		this.startMessage = startMessage;
	}

	public String getStartMessage(){
		return startMessage;
	}

	public void setAura100lvl(int lvl){
		auraLvls[0] = lvl;
	}
	public void setAura200lvl(int lvl){
		auraLvls[1] = lvl;
	}
	public int getAura100lvl(){
		return auraLvls[0];
	}
	public int getAura200lvl(){
		return auraLvls[1];
	}

	public void setLvlMax(int lvl) {
		lvlMax = lvl;
	}
	public int getLvlMax(){
		return lvlMax;
	}

	public void setActiveStats2(boolean activeStats2) {
		this.activeStats2 = activeStats2;
	}

	public boolean isActiveStats2() {
		return activeStats2;
	}

	public boolean isKickOnPacketCantParse() {
		return kickOnPacketCantParse;
	}

	public void setKickOnPacketCantParse(boolean kickOnPacketCantParse) {
		this.kickOnPacketCantParse = kickOnPacketCantParse;
	}

	public boolean isBanOnPacketCantParse() {
		return banOnPacketCantParse;
	}

	public void setBanOnPacketCantParse(boolean banOnPacketCantParse) {
		this.banOnPacketCantParse = banOnPacketCantParse;
	}

	
	
	
/*	
	/**
	 * Return false si l'ID n'existe pas dans les CWorlds ou qu'il est déjà prit par une autre GConfig
	 * @param worldID - Le world ID à vérifier
	 * /
	public boolean validateWorldID(byte worldID){
		//Syn.d("ID de monde en param dans validateWorldID :"+worldID+".");
		boolean cWorldExists = false;
		for(CWorld cw : CWorld.worlds){
			if(cw.id == worldID){
				//Syn.d("cWorldExists dans les CWorld"); //-> ca c'est bon ->accepte
				cWorldExists = true;
				break;
			}
		}
		if(cWorldExists == false){
			Syn.d("validateWorldID Return false à cause du Cworld");
			return false;
		}
		cWorldExists = false;
		for(GConfig c : configs){
			if(c != null){
				if(c.worldID == worldID && c != this){
					//Syn.d("cWorldExists dans les GConfig"); //-> ca cest mauvais ->refuse
					cWorldExists = true;
					break;
				}
			}
		}
		if(cWorldExists == true){
			Syn.d("validateWorldID Return false à cause d'une Config l'ayant déjà prit");
			return false;
		}
		return true;
	}
	/**
	 * Return false si le nom de serveur est déjà prit par une autre GConfig
	 * @param servName - Le nom de serveur à vérifier
	 * /
	public boolean validateServerName(String servName){
		//Syn.d("Nom de monde en param dans validateServerName :"+servName+".");
		boolean snUsed = false;
		for(GConfig c : configs){
			if(c != null && c != this){
				if(c.serverName.equalsIgnoreCase(servName)){
					Syn.d("validateServerName servName = "+servName+" c.serverName = "+c.serverName+" Donc déjà utilisé : return false");
					snUsed = true;
					break;
				}
			}
		}
		if(snUsed){
			return false;
		}
		return true;
	}

	/**
	 * Return false si le port serveur est déjà prit par une autre COnfig
	 * @param port2 - Le port de serveur à vérifier
	 * /
	public boolean validateServerPort(short port2) {
		//Syn.d("Port de monde en param dans validateServerPort :"+port2+".");
		boolean snUsed = false;
		for(GConfig c : configs){
			if(c != null && c != this){
				if(c.Port == port2){
					Syn.d("validateServerPort port2 = "+port2+" c.Port. Donc déjà utilisé : return false");
					snUsed = true;
					break;
				}
			}
		}
		if(snUsed){
			return false;
		}
		return true;
	}
*/
	
	public String getWorldActionsListenersIDs() {
		return actionsListenersIDs;
	}
	public void setWorldActionsListenersIDs(String ids){
		this.actionsListenersIDs = ids;
	}

	public void setArmorSpellCharacTypes(String[] split) {
		if(split.length == 0){
			armorsCharacType = new short[][]{{}};
			return;
		}
		armorsCharacType = new short[split.length][2];
		for(int i = split.length-1; i >= 0; i--){
			armorsCharacType[i][0] = Short.parseShort(split[i].substring(0, split[i].indexOf(",")));
			armorsCharacType[i][1] = Short.parseShort(split[i].substring(split[i].indexOf(",")+1));
		}
	}
	/**
	 * Retourne la CharacteristicType d'un sort d'armure ayant l'effet DAMAGE_REDUCED_OF_X://265  Armures Féca,...	
	 */
	public short getArmorSpellCharacType(int spellID){
		for(short[] armor: armorsCharacType){
			if(armor[0] == spellID){
				return armor[1];
			}
		}
		return 0;
	}
	


	public void setOpened(boolean isOpened){
		this.isOpened = isOpened;
	}

	public boolean isOpened(){
		return isOpened;
	}

	public void setDBName(String dBName){
		DBName = dBName;
	}

	public String getDBName(){
		return DBName;
	}

	public String getDBUser(){
		return DBUser;
	}

	public void setDBUser(String dBUser){
		DBUser = dBUser;
	}

	public String getDBPass(){
		return DBPass;
	}

	public void setDBPass(String dBPass){
		DBPass = dBPass;
	}

	public void setMaximumClients(int maximumClients) {
		this.maximumClients = maximumClients;
	}

	public int getMaximumClients() {
		return maximumClients;
	}

	public void setMaxPersoPerAccount(byte maxPersoPerAccount) {
		this.maxPersoPerAccount = maxPersoPerAccount;
	}

	public byte getMaxPersoPerAccount() {
		return maxPersoPerAccount;
	}

	public void setDBIP(String dBIP) {
		DBIP = dBIP;
	}

	public String getDBIP() {
		return DBIP;
	}

	public void setKickOnExceptionCaught(boolean kickOnExceptionCaught) {
		this.kickOnExceptionCaught = kickOnExceptionCaught;
	}

	public boolean isKickOnExceptionCaught() {
		return kickOnExceptionCaught;
	}

	public void setBanOnExceptionCaught(boolean banOnExceptionCaught) {
		this.banOnExceptionCaught = banOnExceptionCaught;
	}

	public boolean isBanOnExceptionCaught() {
		return banOnExceptionCaught;
	}

	public void setFightStartTimerTime(int fightStartTimerTime) {
		this.fightStartTimerTime = fightStartTimerTime;
	}

	public int getFightStartTimerTime() {
		return fightStartTimerTime;
	}

	public void setFightTurnTimerTime(int fightTurnTimerTime) {
		this.fightTurnTimerTime = fightTurnTimerTime;
	}

	public int getFightTurnTimerTime() {
		return fightTurnTimerTime;
	}

	public void setUseDefaultPlugins(boolean useDefaultPlugins) {
		this.useDefaultPlugins = useDefaultPlugins;
	}

	public boolean isUseDefaultPlugins() {
		return useDefaultPlugins;
	}

	public short getPermanentDamagePercent() {
		return permanentDamagePercent;
	}
	public void setPermanentDamagePercent(short percent){
		this.permanentDamagePercent = percent;
	}
	

	
}
