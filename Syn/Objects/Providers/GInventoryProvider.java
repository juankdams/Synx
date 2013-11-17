package Providers;

import java.util.ArrayList;

import GameObjects.GInventory;
import GameObjects.GItem;
import GameObjects.GWorld;
import Interfaces.IProvider;

public class GInventoryProvider implements IProvider {
	

	/**
	 * Pour rebuilder l'inventaire d'un personnage déjà existant
	 * <p>utilisé dans le chargement des items (SQL.Item.loadInventoryComplete();)
	 */
	public GInventory createBase(){
		GInventory gi = new GInventory();
		gi.setItems(new ArrayList<GItem>());
		return gi;
	}
	

	/**
	 * Pour créer un tout nouvel inventory à la création d'un personnage
	 * <p> Créé automatiquement les items à
	 * @param persoID
	 * @param startItemTemplateIDs
	 * @param w
	 */
	public GInventory createNew(int persoID, int startItemTemplateIDs[][], GWorld w){
		GInventory gi = new GInventory();
		if(startItemTemplateIDs != null){
			//Syn.d("startItemTemplateIDs != null");
			for(int idAndQuantity[] : startItemTemplateIDs){
				GItem i = GItem.provide(w).createNew(w.getNextItemID(), w.getItemTemplate(idAndQuantity[0]), (short) idAndQuantity[1], false, w);
				if(i != null){
					SQL.Items.create(i, w);
					gi.getItems().add(i);
		//			w.addItem(i);
					//Syn.d("Item ID:"+i.getID()+" tempID:"+idAndQuantity[0]+" Qty:"+idAndQuantity[1]);
				}else{
					
				}
			}
		}
		w.addInventory(persoID, gi);
		return gi;
	}
	
	

}
