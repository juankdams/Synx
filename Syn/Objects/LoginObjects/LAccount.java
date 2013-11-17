package LoginObjects;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Core.Syn;
import Game.GameServer;
import GameObjects.GPersonnage;
import GameObjects.GWorld;
import Interfaces.IObject;
import Login.LoginServer;

public class LAccount implements IObject {
	public static Logger log = LoggerFactory.getLogger(LAccount.class);
	
	
	private int ID = 0;
	/** username, password, pseudo, secretquestion, secretanswer, curIP, lastConnexion */
	private String[] strings = new String[7];
	private byte curPerso = 0;//pour chercher dans l'index des persos et des banques
	private byte GMLVL = 0;
	private byte community = 0;//Pour que le client affiche la liste des serveurs de sa communauté seulement. (Sauf s'il clique "afficher les serveurs n'appartennant pas à ma communauté")
	private boolean isBanned = false;
	private long premiumDate = 0;//Date en milliseconde à laquelle l'abonnement se termine.
	
	/**TODO Pour les friends,ennemies,ignored. lors de l'envoie des packets, 
	 * faudra vérifier s'ils sont bien sur le meme serveur que celui sur 
	 * lequel le comtpe est actuellement co
	 */
	private int friendsIDs[] = null;
	private int ennemiesIDs[] = null;
	private int ignoredIDs[] = null;
	private GPersonnage[] persos = new GPersonnage[0];
	private String banks = "";//serverID,serverID,serverID..
	private LGift gift = null;
	
	
	
	public LAccount(LoginServer s, int id, String username, String password, String pseudo, String secretQuestion, String secretAnswer, byte gmlvl, byte community, String curIP, boolean isBanned, long premiumTime, int giftID, GPersonnage persoss[], String bankss, String friendsIDs[], String ennemiesIDs[], String ignoredIDs[]){
		this.ID = id;
		this.strings[0] = username;
		this.strings[1] = password;
		this.strings[2] = pseudo;
		this.strings[3] = secretQuestion;
		this.strings[4] = secretAnswer;
		this.strings[5] = curIP;
		this.GMLVL = gmlvl;
		this.community = community;
		this.isBanned = isBanned;
		this.setPremiumDate(premiumTime);
		if(giftID != 0){
			this.gift = SQL.Gifts.load(s, giftID);
		}
		this.persos = persoss;
		this.banks = bankss;
		if(friendsIDs != null && friendsIDs.length > 0 && friendsIDs[0].length() > 0){
			this.friendsIDs = new int[friendsIDs.length];
			for(int i = friendsIDs.length-1; i >= 0; i--){
				this.friendsIDs[i] = Integer.parseInt(friendsIDs[i]);
			}
		}
		if(ennemiesIDs != null && ennemiesIDs.length > 0 && ennemiesIDs[0].length() > 0){
			this.ennemiesIDs = new int[ennemiesIDs.length];
			for(int i = ennemiesIDs.length-1; i >= 0; i--){
				this.ennemiesIDs[i] = Integer.parseInt(ennemiesIDs[i]);
			}
		}
		if(ignoredIDs != null && ignoredIDs.length > 0 && ignoredIDs[0].length() > 0){
			this.ignoredIDs = new int[ignoredIDs.length];
			for(int i = ignoredIDs.length-1; i >= 0; i--){
				this.ignoredIDs[i] = Integer.parseInt(ignoredIDs[i]);
			}
		}
	}
	
	@Override
	public void terminate() throws Throwable{
		Syn.d("Terminating LAccount "+getPseudo());
		//TODO SQL.Gifts.save(this.gift); (genre s'il assign just un item du gift et ensuite déco et il reste des items)
		SQL.Accounts.save(this);
		
		getLoginServer().world.removeAccount(getID());
		
		if(this.gift != null) this.gift.terminate();
		this.curPerso = 0;
		this.banks = null;
		this.ennemiesIDs = null;
		this.friendsIDs = null;
		this.gift = null;
		this.ignoredIDs = null;
		this.persos = null;
		this.strings = null;
		this.finalize();
	}
	
	public GPersonnage getCurPerso(){
		if(getPersos() == null) { return null; }
		return getPersos()[curPerso];
	}
	public void setCurPerso(byte index){
		this.curPerso = index;
	}

	/**
	 * Pour le packet Alk dans l'LAuthentificationHandler. 
	 * Celui avec AQ_AH_Alk etc
	 */
	public byte hasGM() {
		if(GMLVL >= 1){
			return 1;
		}
		return 0;
	}
	
	public byte getGM() {
		return this.GMLVL;
	}
	
	public void setGM(byte gmlvl) {
		this.GMLVL = gmlvl;
	}

	public void setCurIP(String curIP) {
		this.strings[5] = curIP;
	}
	public String getCurIP(){
		if(strings[5] == null){
			strings[5] = "";
		}
		return this.strings[5];
	}

	public void setPersos(GPersonnage[] persos) {
		this.persos = persos;
	}

	public GPersonnage[] getPersos() {
		return persos;
	}

	public String getUsername() {
		return strings[0];
	}
	
	public String getPassword() {
		return strings[1];
	}
	
	public String getPseudo() {
		return strings[2];
	}
	
	public String getSecretQuestion(){
		return strings[3];
	}
	
	public String getSecretAnswer(){
		return strings[4];
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public byte getCommunity() {
		return community;
	}
	
	public void setCommunity(byte community) {
		this.community = community;
	}

	public void setBanned(boolean isBanned, boolean save) {
		this.isBanned = isBanned;
		if(save){
			SQL.Accounts.updateBan(this, true);
		}
	}

	public boolean isBanned() {
		return isBanned;
	}

	/**
	 * Renvoie la date en milliseconde à laquelle l'abonnement se termine
	 */
	public long getPremiumDate() {
		return premiumDate;
	}
	/**
	 * Renvoie le temps d'abonnement en milliseconde qu'il reste au compte
	 * <p> Et set la date de fin d'abonnement à 0 si le compte n'a plus de temps d'abonnement
	 * @return
	 */
	public long getPremiumTime(){
		if(isPremium()){
			return premiumDate - System.currentTimeMillis();
		}else{
			return 0;
		}
	}
	
	/**
	 * Set la date en milliseconde à laquelle l'abonnement se termine
	 * @param premiumDate
	 */
	public void setPremiumDate(long premiumDate) {
		this.premiumDate = premiumDate;
	}
	/**
	 * En comparant la date à laquelle l'abonnement fini avec la date actuelle (CurrentTimeMillis), indique si le compte est toujours abonner ou pas.
	 * <p> Et set la date de fin d'abonnement à 0 si le compte n'a plus de temps d'abonnement
	 * @return
	 */
	public boolean isPremium(){
		if(this.premiumDate <= System.currentTimeMillis()){
			premiumDate = 0;
			return false;
		}else{
			return true;
		}
	}
	
	public void setGift(LGift gift) {
		this.gift = gift;
	}

	public LGift getGift() {
		return gift;
	}

	public int[] getFriendsIDs() {
		return friendsIDs;
	}

	public void setFriendsIDs(int[] friendsIDs) {
		this.friendsIDs = friendsIDs;
	}

	/**
	 * Ajoute une relation dans l'array d'IDs
	 */
	public void addFriend(int newFriendID){
		this.friendsIDs = Misc.Utils.addIntToArray(friendsIDs, newFriendID);
	}
	/**
	 * Enleve une relation dans l'array d'IDs
	 */
	public void removeFriend(int friendID){
		this.friendsIDs = Misc.Utils.removeIntFromArray(friendsIDs, friendID);
	}
	
	public int[] getEnnemiesIDs() {
		return ennemiesIDs;
	}

	public void setEnnemiesIDs(int[] ennemiesIDs) {
		this.ennemiesIDs = ennemiesIDs;
	}
	
	/**
	 * Ajoute une relation dans l'array d'IDs
	 */
	public void addEnnemy(int newEnnemyID){
		this.ennemiesIDs = Misc.Utils.addIntToArray(ennemiesIDs, newEnnemyID);
	}
	/**
	 * Enleve une relation dans l'array d'IDs
	 */
	public void removeEnnemy(int EnnemyID){
		this.ennemiesIDs = Misc.Utils.removeIntFromArray(ennemiesIDs, EnnemyID);
	}

	public int[] getIgnoredIDs() {
		return ignoredIDs;
	}

	public void setIgnoredIDs(int[] ignoredIDs) {
		this.ignoredIDs = ignoredIDs;
	}
	/**
	 * Ajoute une relation dans l'array d'IDs
	 */
	public void addIgnored(int newEnnemyID){
		this.ignoredIDs = Misc.Utils.addIntToArray(ignoredIDs, newEnnemyID);
	}
	/**
	 * Enleve une relation dans l'array d'IDs
	 */
	public void removeIgnored(int EnnemyID){
		this.ignoredIDs = Misc.Utils.removeIntFromArray(ignoredIDs, EnnemyID);
	}
	
//	public GBank[] getBanks() {
//		return banks;
//	}
//	public void setBanks(GBank[] bankss) {
//		this.banks = bankss;
//	}
	
	/**
	 * Date en format: Année + "~" + Mois + "~" + Jour + "~" + Heure + "~" + Minute
	 */
	public String getLastConnexion(){
		if(strings[6] == null){
			strings[6] = "";
		}
		return strings[6];
	}

	/**
	 * Date en format: Année + "~" + Mois + "~" + Jour + "~" + Heure + "~" + Minute
	 */
	public void setLastConnexion(String date){
		strings[6] = date;
	}

	/**
	 * 
	 * @return - serverID,serverID,serverID...
	 */
	public String getBanks() {
		return banks;
	}
	/**
	 * 
	 * @param bankss - serverID,serverID,serverID...
	 */
	public void setBanks(String bankss){
		this.banks = bankss;
	}

	@Override
	/**
	 *	return this.getCurPerso().getServerID();
	 */
	public short getServerID() {
		return this.getCurPerso().getServerID();
	}

	@Override
	/**
	 *	return this.getCurPerso().getServer();
	 */
	public GameServer getServer() {
		return this.getCurPerso().getServer();
	}

	@Override
	/**
	 * return this.getCurPerso().getWorld();
	 */
	public GWorld getWorld() {
		return this.getCurPerso().getWorld();
	}

	@Override @Deprecated
	public void setServer(GameServer s) { }

	
	public LoginServer getLoginServer(){
		if(persos != null){
			if(this.getCurPerso() != null){
				return this.getCurPerso().getServer().getLoginServer();
			}
			for(GPersonnage p : persos){
				if(p != null && p.getServer().getLoginServer() != null){
					return p.getServer().getLoginServer();
				}
			}
		}
		for(LoginServer s : Syn.Services.serversService.loginServers.values()){
			if(s.world.getAccount(getID()) == this){
				return s;
			}
		}
		
		return null;
	}
	
	
	
	
	
}
