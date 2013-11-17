package GlobalObjects;

import java.util.ArrayList;

import Abstractions.AbstractWorld;
import GameObjects.GEffect;
import Plugins.Managers.PluginsManager;
import Providers.ItemSetProvider;

public class ItemSet {

	

	public static ItemSetProvider provide(AbstractWorld w){
		PluginsManager pm = w.getStrategy().defaultPluginsManager;
		if(w.getServer() != null){
			w.getServer().getPluginsManager();
		}
		return pm.getProviders().provideItemSet();
	}

	
	
	private short ID = 0;
	private short itemTemplateIDs[] = null;
	private ArrayList<GEffect>[] bonuses = null;
	
	
	public void setID(short iD) {
		ID = iD;
	}
	public short getID() {
		return ID;
	}
	
	/**
	 * Renvoie le nombre d'items qu'il y a au total dans cet ItemSet.
	 */
	public int getNumberOfItems(){
		return itemTemplateIDs.length;
	}
	/**
	 * @param grade - Nombre d'items équipés faisant parti de cet itemSet
	 * @return - Les bonus liés à ce nombre d'item
	 */
	public ArrayList<GEffect> getBonuses(int grade){
		grade -= 2;//Parce que cest à partir de 2 
		if(grade < 0 || grade >= bonuses.length){
			return null;
		}
		return bonuses[grade];
	}
	public ArrayList<GEffect>[] getAllBonuses(){
		return bonuses;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void setAllBonuses(ArrayList[] bonuses){
		this.bonuses = bonuses;
	}

	public void setItemTemplateIDs(short itemTemplates[]) {
		this.itemTemplateIDs = itemTemplates;
	}

	public short[] getItemTemplateIDs() {
		return itemTemplateIDs;
	}

	public boolean containsItemTemplateID(short itemTemplateID){
		for(short id : itemTemplateIDs){
			if(id == itemTemplateID){
				return true;
			}
		}
		return false;
	}
	
}