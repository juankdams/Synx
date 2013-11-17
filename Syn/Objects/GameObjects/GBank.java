package GameObjects;

import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Game.GameServer;
import Interfaces.IStorage;
import Plugins.Managers.EffectsManager;

/**
 * G for Game. Simple, right?
 * @author Robyn
 */
public class GBank implements IStorage{
	public static Logger log = LoggerFactory.getLogger(GBank.class);
	
	
	private long kamas = 0;
	//private ArrayList<GItem> items = null;
	private HashMap<Integer, GItem> items = null;
	
	public GBank(long kamas){
		this.kamas = kamas;
	}
	


	@Override
	public void setID(int iD) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override @Deprecated
	public short getServerID() { return 0; }
	@Override @Deprecated
	public GameServer getServer() { return null; }
	@Override @Deprecated
	public GWorld getWorld() { return null; }
	@Override @Deprecated
	public void setServer(GameServer s) { }
	
	/**
	 * Ajoute un item dans l'ArrayList de la banque
	 * @param item - Le nouveau item
	 */
	@Override
	public void addItem(GItem item){
		items.put(item.getID(), item);
	}
	/**
	 * Enleve un item de l'ArrayList de la banque
	 * @param item - Le vieux item
	 */
	@Override
	public void removeItem(GItem item){
		items.remove(item.getID());
	}
	/**
	 * Vide l'ArrayList d'items de la banque
	 */
	public void emptyItems(){
		items.clear();
	}

	@Override @Deprecated
	public ArrayList<GItem> getItems() {return null;}
	
	@Override
	public GItem getItemByID(int id) {
		return items.get(id);
		//for(GItem i : items){
		//	if(i.getID() == id){
		//		return i;
		//	}
		//}
		//return null;
	}
	
	/**
	 * Enleve l'item de l'ArrayList d'items de la banque
	 * Delete l'item de la base de donnée (supprime la ligne sql)
	 * Terminate l'item
	 * Nullalize l'item
	 */
	public void deleteItem(GItem item, GWorld w){
		items.remove(item.getID());
//		w.removeItem(item);
		SQL.Items.delete(item, w.getServer());
		try {
			item.terminate();
		} catch (Throwable e) {e.printStackTrace();}
		item = null;
	}
	
	
	/**
	 * TODO Quand on delete tous les persos du monde auquel appartient la banque, 
	 * <p>celle-ci n'a plus raison d'exister
	 */
	public void delete(GPersonnage p){
		//Enleve la banque de l'array dans le compte
		if(p.getAccount().getBanks().contains(p.getServerID()+",")){
			p.getAccount().setBanks(p.getAccount().getBanks().replace(p.getServerID()+",", ""));
		}
		//p.getAccount().setBanks((GBank[]) Utils.removeElementFromArray(p.getAccount().getBanks(), this));
		//Delete tous les items de la banque 
		if(items != null){
			if(items.size() > 0){
				for(GItem item : items.values()){
					SQL.Items.delete(item, p.getServer());
				}
			}
		}
		items = null;
		//Enleve la banque du GWorld
		p.getWorld().removeBank(p.getAccountID());
		//Delete la banque elle-même 
		SQL.Banks.delete(p.getAccountID(), p.getServer());
		try {
			this.finalize();
		} catch (Throwable e) {e.printStackTrace();}
	}

	/**
	 * Elle est bonne !
	 * 
	 * (Mtn on doit faire le world.removeBank() juste apres de caller le .terminate)
	 */
	public void terminate() throws Throwable {
		if(items != null){
			if(items.size() > 0){
				for(GItem item : items.values()){
					item.terminate();
					item = null;
				}
			}
			items.clear();
		}
		items = null;
		this.finalize();
	}

	public void setKamas(long kamas) {
		this.kamas = kamas;
	}

	public long getKamas() {
		return kamas;
	}
	/*
	 * itemID,itemID2,itemID3,itemID
	 */
	public String getItemsString() {
		if(items == null){
			return "";
		}
		if(items.size() == 0){
			return "";
		}
		String items = "";
		for(int i : this.items.keySet()){
			if(items.length() != 0){
				items += ",";
			}
			items += i;
		}
		return items;
	}
	
	@Override
	public GItem getCanStack(GItem item, EffectsManager em){
		for(GItem i : items.values()){
			//S'ils ont le même template sans être le même GItem et que celui déjà dans l'inventaire 
			if(i.getTemplate().getID() == item.getTemplate().getID() && i.getID() != item.getID()){
				//Si les items ont les mêmes effets/stats
				if(item.hasSameEffectsAs(em, i)){
					return i;
				}
			}
		}
		return null;
	}






	
	
	
}
