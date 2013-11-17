package Providers;

import GameObjects.GDrop;
import Interfaces.IProvider;

public class GDropProvider implements IProvider {
	
	
	

	/**
	 * @param str = itemTemplateID, qty, probability, miniPlayers, miniProspec
	 * @return
	 */
	public GDrop createNew(String str, boolean isInstance) {
		GDrop d = new GDrop();
		String infos[] = str.split(",");
		d.setItemTemplateID(Integer.parseInt(infos[0]));
		d.setQuantity(Short.parseShort(infos[1]));
		d.setProbability(Double.parseDouble(infos[2]));
		d.setMinimumPlayers(Byte.parseByte(infos[3]));
		d.setMinimumProspection(Short.parseShort(infos[4]));
		
		d.isInstance = isInstance;
		return d;
	}
	
	

}
