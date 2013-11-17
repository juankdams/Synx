package Providers;

import Abstractions.AbstractWorld;
import GameObjects.GDropItem;
import GameObjects.GItem;
import Interfaces.IProvider;
import Plugins.Managers.EffectsManager;

public class GDropItemProvider implements IProvider {
	
	public GDropItem createNew(GItem item, AbstractWorld w, short cell){
		EffectsManager em = w.getServer() == null ? w.getStrategy().defaultPluginsManager.getEffectsManager() : w.getServer().getEffectsManager();
		
		GDropItem gdi = new GDropItem();
		gdi.setID(item.getID());
		gdi.setTemplate(item.getTemplate());
		gdi.setItemEffects(item.getEffectsPacket(em), true, w);
		gdi.setQuantity(item.getQuantity());
		gdi.setCellID(cell);
		return gdi;
	}
	
}