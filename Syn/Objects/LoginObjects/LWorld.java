package LoginObjects;

import java.util.Collection;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Core.Syn;
import Enums.SynActions.CommonAction;
import Game.GameServer;
import Login.LoginServer;

public class LWorld {
	
	private static Logger log = LoggerFactory.getLogger(LWorld.class);

	
	private LoginServer serv = null;
	private HashMap<Integer, LAccount> accounts = new HashMap<Integer, LAccount>();	
	
	public LWorld(LoginServer s){
		serv = s;
	}
	
	public static void loadStatics() {
		//Items.loadAllTemplates();
		//Maps.loadAllTemplates(); load en lazy
		//NPC
		//  |- Quests
		//       |- Steps
		//            |- Objectives
		//  |- Ventes
		//  |- Dialogues
		//  |- Percepteurs
		//Monsters
		//  |- MapMonsters
		//  |- Invocs
		//  |- Percepteurs
		//GameActions
		//Effects
		//  |- Spells
		//  |- Items
		//  |- Commands
		//  |- ActionsListeners
	}
	
	
	
	
	public void removeAccount(int id){
		accounts.remove(id);
	}
	
	public void addAccount(LAccount a){
		accounts.put(a.getID(), a);
	}
	public LAccount getAccount(int id){
		return accounts.get(id);
	}
	public HashMap<Integer, LAccount> getAccounts(){
		return accounts;
	}
	
	public byte getNbrCoPerIP(String ip) {
		byte i = 0;
		for(LAccount a: accounts.values()){
			if(a.getCurIP().equals(ip)){
				i++;
			}
		}
		return i;
	}
	
	/**
	 * @return - AccountID s'il existe dans l'HashMap... 0 sinon.
	 */
	public int isAccountConnected(String username){
		for(LAccount a: accounts.values()){
			if(a.getUsername().equals(username)){
				Syn.d("Co/Exist dans LWorld");
				return a.getID();
			}
		}
		return 0;
	}
	
	/**
	 * Vérifie dans les queues de chaque GServer.
	 * @param username
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public boolean isAccountInQueue(String username){
		for(GameServer gs : serv.gameServers){
			if(gs.queue != null){
				for(LAccount a : (Collection<LAccount>)gs.queue.updateQueuedAccounts(CommonAction.GETVALUES, null, 0)){
					if(a.getUsername().equals(username)){
						Syn.d("Co/Exist dans Queue");//Enums.SynActions.CommonAction.GETVALUES
						return true;
					}
				}
			}
		}
		
		return false;
	}


	/**
	 * TODO: saveAll in LWorld : accounts, gifts
	 */
	public void saveAll() {
		// TODO Auto-generated method stub
		for(LAccount a : accounts.values()){
			SQL.Accounts.save(a);
		}
	}


	/**
	 * TODO: LWorld.terminate()
	 */
	public void terminate() {
		accounts.clear(); 		accounts = null;
	}


	public LoginServer getServer() {
		return serv;
	}
	public void setServer(LoginServer serv) {
		this.serv = serv;
	}
	
	
	
	
}
