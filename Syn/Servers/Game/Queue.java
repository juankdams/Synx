package Game;

import static Enums.SynActions.CommonAction.ADD;
import static Enums.SynActions.CommonAction.GET;
import static Enums.SynActions.CommonAction.GETVALUES;
import static Enums.SynActions.CommonAction.REMOVE;

import java.util.concurrent.ConcurrentHashMap;

import Core.Syn;
import Enums.SynActions.CommonAction;
import LoginObjects.LAccount;

public class Queue {
	
	private ConcurrentHashMap<Integer, LAccount> accountsToRemoveIfUnused = new ConcurrentHashMap<Integer, LAccount>(); 
	
	
	public synchronized Object updateQueuedAccounts(CommonAction action, LAccount a, int accountID){
		if(action == GETVALUES){
			Syn.d("Queue.updateQueuedAccounts - GETVALUES");
			return accountsToRemoveIfUnused.values();
		}else if(a != null){
			if(action == GET){
				Syn.d("Queue.updateQueuedAccounts - GET id = "+a.getID());
				return accountsToRemoveIfUnused.get(a.getID());
			}
			if(action == REMOVE){
				Syn.d("Queue.updateQueuedAccounts - REMOVE id = "+a.getID()+" key "+(accountsToRemoveIfUnused.containsKey(a.getID())?"exists":"doesnt exist"));
				return accountsToRemoveIfUnused.remove(a.getID());
			}
			if(action == ADD){
				Syn.d("Queue.updateQueuedAccounts - PUT id = "+a.getID());
				return accountsToRemoveIfUnused.put(a.getID(), a);
			}
		}else if(accountID > 0){
			if(action == GET){
				Syn.d("Queue.updateQueuedAccounts - GET id = "+accountID);
				return accountsToRemoveIfUnused.get(accountID);
			}
			if(action == REMOVE){
				Syn.d("Queue.updateQueuedAccounts - REMOVE id = "+accountID+" key "+(accountsToRemoveIfUnused.containsKey(accountID)?"exists":"doesnt exist"));
				return accountsToRemoveIfUnused.remove(accountID);
			}
		}
		return null;
	}
	
	
}
