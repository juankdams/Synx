package Abstractions;

import java.util.ArrayList;

import Game.GameServer;
import GameObjects.GItem;
import GameObjects.GWorld;
import Interfaces.IStorage;
import Plugins.Managers.EffectsManager;

public abstract class GExchangeBag implements IStorage {

	private byte type = -1;
	private ArrayList<GItem> items = null; 
	// fout plutot une GAction sur le personnage et met un GExchangeBag dans l'action puisque q'un perso ne peut faire qu'une action à la fois
	//      ensuite tu peux queuer les actions pour les exécuter une par une à la fois si tu veux
	/////private GPersonnage asker = null; cest ugly et useless.    
	/////private GPersonnage accepter = null;
	
	
	public GExchangeBag(byte type){
		
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
	
	public void setType(byte type) {
		this.type = type;
	}

	public byte getType() {
		return type;
	}
	
	
	//@Override
	public ArrayList<GItem> getItems() {
		return items;
	}

	@Override
	public void addItem(GItem i) {
		if(items == null){
			items = new ArrayList<GItem>();
		}
		items.add(i);
	}

	@Override
	public GItem getItemByID(int id) {
		for(GItem gi : items){
			if(gi.getID() == id){
				return gi;
			}
		}
		return null;
	}

	@Override
	public void removeItem(GItem i) {
		if(i == null || items == null){
			return;
		}
		items.remove(i);
	}

	@Override
	public GItem getCanStack(GItem item, EffectsManager em) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void terminate() throws Throwable{
		// TODO Auto-generated method stub
	}





	@Override @Deprecated
	public short getServerID() { return 0; }
	@Override @Deprecated
	public GameServer getServer() { return null; }
	@Override @Deprecated
	public GWorld getWorld() { return null; }
	@Override @Deprecated
	public void setServer(GameServer s) { }


	
}
