package Interfaces;

import java.util.ArrayList;

import GameObjects.GItem;
import Plugins.Managers.EffectsManager;

public interface IStorage extends IObject{

	
	public ArrayList<GItem> getItems();
	public void addItem(GItem i);
	public GItem getItemByID(int id);
	public void removeItem(GItem i);
	public GItem getCanStack(GItem item, EffectsManager em);
	
	
	
}
