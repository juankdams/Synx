package GameObjects;

import Abstractions.AbstractWorld;
import Plugins.Managers.PluginsManager;
import Providers.GDropProvider;


/**
 * GDrop = Un drop de monstre possible.
 * @author Robyn
 */
public class GDrop {


	public static GDropProvider provide(AbstractWorld w){
		PluginsManager pm = w.getStrategy().defaultPluginsManager;
		if(w.getServer() != null){
			w.getServer().getPluginsManager();
		}
		return pm.getProviders().provideDrop();
	}

	
	private int itemTemplateID = 0;
	private short quantity = 1;
	private double probability = 100;
	private byte minimumPlayers = 1;
	private short minimumProspection = 100;
	/**
	 * Pour savoir si le drop est une instance ou un template.  <br>
	 * Donc si le int itemTemplateID vise un gitem existant ou un template d'item
	 */
	public boolean isInstance = false;
	
	
	


	public void setItemTemplateID(int itemTemplateID) {
		this.itemTemplateID = itemTemplateID;
	}

	public int getItemTemplateID() {
		return itemTemplateID;
	}

	public void setQuantity(short quantity) {
		this.quantity = quantity;
	}

	public short getQuantity() {
		return quantity;
	}

	public void setProbability(double probability) {
		this.probability = probability;
	}

	public double getProbability() {
		return probability;
	}

	public void setMinimumPlayers(byte minimumPlayers) {
		this.minimumPlayers = minimumPlayers;
	}

	public byte getMinimumPlayers() {
		return minimumPlayers;
	}

	public void setMinimumProspection(short minimumProspection) {
		this.minimumProspection = minimumProspection;
	}

	public short getMinimumProspection() {
		return minimumProspection;
	}


	
	public void terminate(){
		try {
			this.finalize();
		} catch (Throwable e) { e.printStackTrace(); }
	}
	
	
	
	
}
