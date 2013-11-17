package SM;

import static SM.Sender.send;

import java.util.ArrayList;

import org.apache.mina.core.session.IoSession;

import Constants.CItems;
import GameObjects.GEffect;
import GameObjects.GItem;
import GameObjects.GPersonnage;
import GlobalObjects.ItemSet;
import Plugins.Managers.EffectsManager;

public class Objects {

	/**
	 * Envoie un packet informant le nomre de pods utilisés sur le nombre de pods maximums
	 * <p>this.aks.Items.onWeight(sData.substr(2));
       <p>this.api.datacenter.Player.maxWeight = _loc5;
       <p>this.api.datacenter.Player.currentWeight = _loc4;
	 */
	public static void Ow(IoSession out, GPersonnage p){
		send(out, "Ow"+p.getInventory().getUsedPods()+'|'+(p.getServer().getFormulingManager().calculateMaxPods(p.getStatistique(), p)));
	}
	
	/**
	 * Envoie un packet informant/updatant de la quantité d'un certain objet.
	 * <p>  this.aks.Items.onQuantity(sData.substr(2));
	 * <p>  this.api.datacenter.Player.updateItemQuantity(_loc4, _loc5)
	 */
	public static void OQ(IoSession out, GItem item){
		send(out, "OQ"+item.getID()+"|"+item.getQuantity());
	}
	
	/**
	 * Envoie un packet informant un mouvement d'objet pour dire la nouvelle position de l'item
	 * <p> Soit OM+itemID+| si on le déséquipe, soit OM+itemID+|+itemPosition si le met à une nouvelle position équipée
	 *  <p>this.aks.Items.onMovement(sData.substr(2));
	 */
	public static void OM(IoSession out, GItem item){
		send(out, "OM"+item.getID()+"|"+ (item.getPosition()==CItems.POS_notEquiped?"":item.getPosition()) );
	}
	
	/**
	 * Envoie un packet pour enlever un item de l'affichage dans l'inventaire.
	 * @param out
	 * @param item
	 */
	public static void OR(IoSession out, GItem item){
		/*
		 _loc1.onRemove = function (sExtraData)
	    {
	        var _loc3 = Number(sExtraData);
	        this.api.datacenter.Player.dropItem(_loc3);
	    };
		 */
		send(out, "OR"+item.getID());
	}

	/**
	 * Envoie un packet indiquant au joueur qu'il ne peut jeter son objet par terre ici car il n'y a plus de place.
	 * <p>Ouvre panel: "Plus de place pour jeter cet objet!"
	 */
	public static void ODEF(IoSession out) {
		send(out, "ODEF");
	}
	
	/**
	 * Envoie un packet indiquant au joueur qu'il lui est impossible de jeter son objet.
	 * <p>Ouvre panel: "Impossible de jeter cet objet."
	 */
	public static void ODEE(IoSession out) {
		send(out, "ODEE");
	}
	
	/**
	 * Envoie un packet pour ajouter un item à l'affichage de l'inventaire.
	 */
	public static void OA(IoSession out, GItem item) {
		send(out, "OA"+item.getID());
	}
	/**
	 * Envoie un packet indiquant au joueur que son niveau (Level) est trop faible pour prendre l'objet qu'il veut.
	 * <p>Ouvre panel: "Ton niveau est trop faible pour prendre cet objet"
	 */
	public static void OAEL(IoSession out, GItem item) {
		send(out, "OAEL");
	}
	
	/**
	 * Envoie un packet indiquant au joueur que son inventaire est plein (Full)
	 * <p>Ouvre panel: "Ton inventaire est plein."
	 */
	public static void OAEF(IoSession out, GItem item) {
		send(out, "OAEF");
	}

	/**
	 * Envoie un packet indiquant au joueur que l'objet qu'il veut équipé est déjà (Already) équipé.
	 * <p>Ouvre panel: "Déjà équipé!"
	 */
	public static void OAEA(IoSession out, GItem item) {
		send(out, "OAEA");
	}
	
	/**
	 * TODO: OAKO
	 * Envoie un packet au joueur pour ajouter un/des objet à son inventaire.
	 * <p>this.aks.Items.onAdd(!bError, sData.substr(3));
	 */
	public static void OAKO(IoSession out, EffectsManager pm, GItem... item) {
		StringBuilder str = new StringBuilder("OAKO");
		for(int i = item.length-1; i>=0; i--){
			if(str.length() != 4){
				str.append(';');
			}
			str.append(item[i].getHexID()).append('~')
			.append(item[i].getHexTemplateID()).append('~')
			.append(item[i].getHexQuantity()).append('~')
			.append(item[i].getHexPosition()).append('~')
			.append(item[i].getEffectsPacket(pm));
		}
		send(out, str.toString());
		str = null;
	}

	/**
	 * Informe au joueur que la destruction (delete) de son objet a failed.
	 * @param session
	 */
	public static void OdE(IoSession session) {
		send(session, "OdE");
	}
	
	/**
	 * Envoie l'affichage des bonus de panoplie et les templateID faisant de cette pano et qui sont équipés sur le joueur.
	 * @param s - Session du client
	 * @param itemSetID - ID de l'ItemSet
	 * @param itemsEquiped - Array[] des ID des itemTemplate faisant partie de cette pano et qui sont équipés sur le joueur
	 * @param bonuses - À prendre dans ItemSet.getbonus(grade)
	 */
	public static void OS(IoSession s, int itemSetID, short[] itemsEquiped, ArrayList<GEffect> bonuses){
		if(itemsEquiped.length == 0){
			send(s, "OS-"+itemSetID);
		}else{
			String packet = "OS+"+itemSetID+"|";
			for(short id : itemsEquiped){
				if(packet.endsWith("|") == false){
					packet += ";";
				}
				packet += id;
			}
			packet += "|";
			if(bonuses != null){
				for(GEffect e : bonuses){
					if(packet.endsWith("|") == false){
						packet += ",";
					}
					//packet += e.getString();
					packet += e.getHexEffectID() +"#"+ e.getJet().getValueHex() +"#0#0";
				}
			}
			send(s, packet);
			packet = null;
		}
	}
	
	public static void OS_REMOVE(IoSession s, ItemSet i){
		send(s, "OS-"+i.getID());
	}
	/*
	public static String addItemSetMessage(short itemSetId, Collection<BaseItemType> items, Collection<BaseItemEffectType> effects) {
        StringBuilder sb = new StringBuilder().append("OS+");

        sb.append(itemSetId).append('|');

        boolean first = true;
        for (BaseItemType item : items){
            if (first) first = false;
            else sb.append(';');

            sb.append(item.getTemplateId());
        }
        sb.append('|');

        first = true;
        for (BaseItemEffectType effect : effects){
            if (first) first = false;
            else sb.append(',');

            sb.append(Integer.toHexString(effect.getEffect().value())).append('#');
            sb.append(Integer.toHexString(effect.getBonus())).append('#');
            sb.append("0#");
            sb.append("0");
        }

        return sb.toString();
    }*/
	
	/*
	 
	 case "O":
            {
                switch (sAction)
                {
                    case "a":
                    {
                        this.aks.Items.onAccessories(sData.substr(2));
                        break;
                    } 
                    case "D":
                    {
                        this.aks.Items.onDrop(!bError, sData.substr(3));
                        break;
                    } 
                    case "A":
                    {
                        this.aks.Items.onAdd(!bError, sData.substr(3));
                        break;
                    } 
                    case "C":
                    {
                        this.aks.Items.onChange(sData.substr(3));
                        break;
                    } 
                    case "R":
                    {
                        this.aks.Items.onRemove(sData.substr(2));
                        break;
                    } 
                    case "Q":
                    {
                        this.aks.Items.onQuantity(sData.substr(2));
                        break;
                    } 
                    case "M":
                    {
                        this.aks.Items.onMovement(sData.substr(2));
                        break;
                    } 
                    case "T":
                    {
                        this.aks.Items.onTool(sData.substr(2));
                        break;
                    } 
                    case "w":
                    {
                        this.aks.Items.onWeight(sData.substr(2));
                        break;
                    } 
                    case "S":
                    {
                        this.aks.Items.onItemSet(sData.substr(2));
                        break;
                    } 
                    case "K":
                    {
                        this.aks.Items.onItemUseCondition(sData.substr(2));
                        break;
                    } 
                    case "F":
                    {
                        this.aks.Items.onItemFound(sData.substr(2));
                        break;
                    } 
                } // End of switch
                break;
            } 
	 
	 */
	
}
