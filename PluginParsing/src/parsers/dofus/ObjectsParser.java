package parsers.dofus;



import static Handlers.GHandler.packetCantParse;
import Abstractions.AbstractCharacter;
import Constants.CItems;
import Constants.Constants;
import Core.Syn;
import Enums.EmoteEnum;
import Enums.FightState;
import Enums.ImPackets;
import Enums.ImPackets.ImType;
import Enums.ItemPosition;
import Game.DofusGameClient;
import GameObjects.GDropItem;
import GameObjects.GEffect;
import GameObjects.GItem;
import GameObjects.GPersonnage;
import Interfaces.ISprite;
import Misc.ParameterHolder;
import Misc.Utils;
import Plugins.Abstractions.AbstractPacketParser;
import Plugins.Managers.PluginsManager;
import Providers.GDropItemProvider;

public class ObjectsParser extends AbstractPacketParser<DofusGameClient, String> {
	

	@Override
	public boolean parse(DofusGameClient c, String packet){
		/*
		 _loc1.movement = function (nID, nPosition, nQuantity)
	    {
	        if (nPosition > 0)
	        {
	            this.api.kernel.GameManager.setAsModified(nPosition);
	        } // end if
	        this.aks.send("OM" + nID + "|" + nPosition + (_global.isNaN(nQuantity) ? ("") : ("|" + nQuantity)), true);
	    };
	    _loc1.drop = function (nID, nQuantity)
	    {
	        this.aks.send("OD" + nID + "|" + nQuantity, false);
	    };
	    _loc1.destroy = function (nID, nQuantity)
	    {
	        this.aks.send("Od" + nID + "|" + nQuantity, false);
	    };
	    _loc1.use = function (nID, sSpriteID, nCellNum, bConfirm)
	    {
	        this.aks.send("O" + (bConfirm ? ("u") : ("U")) + nID + (sSpriteID != undefined && !_global.isNaN(Number(sSpriteID)) ? ("|" + sSpriteID) : ("|")) + (nCellNum != undefined ? ("|" + nCellNum) : ("")), true);
	    };
	    _loc1.dissociate = function (nID, nPosition)
	    {
	        this.aks.send("Ox" + nID + "|" + nPosition, false);
	    };
	    _loc1.setSkin = function (nID, nPosition, nSkin)
	    {
	        this.aks.send("Os" + nID + "|" + nPosition + "|" + nSkin, false);
	    };
	    _loc1.feed = function (nID, nPosition, nFeededItemId)
	    {
	        this.aks.send("Of" + nID + "|" + nPosition + "|" + nFeededItemId, false);
	    };
		 */
		//Impossible de bouger/détruire/jeter un objet pendant un combat actif
		if(c.getAccount().getCurPerso().getFight() != null){
			if(c.getAccount().getCurPerso().getFight().getState() == FightState.ACTIVE.get()){
				packetCantParse(c, packet, " FightState == FightState.ACTIVE");
			}
		}
		if(packet.indexOf("|") == -1){
			packetCantParse(c, packet, " packet.indexOf(\"|\") == -1.  Il manque donc des arguments.");
		}
		String[] infos = null;
		if(packet.endsWith("\\|")){
			infos = packet.substring(2, packet.length()-1).split("\\|");
		}else{
			infos = packet.substring(2).split("\\|");
		}
		//"itemID" + "|" + "positionID" + "|" + "qty(optional)"
		//"itemID" + "|" + "targetSpriteID(optional)" + "|cellID(optional)"  onUse et onUseOnTarget
		for(int i = 0; i < infos.length; i++){
			if(i != 1 || !infos[1].equals(CItems.POS_notEquiped_String)){//positionID, si c'est -1 
				if(Utils.isParsableInteger(infos[i]) == false){
					packetCantParse(c, packet, "Impossible de parser l'info: -"+infos[i]+"- en chiffre");
				}
			}
			//else{ En gros, il testera pas le isParsable sur infos[1] si infos[1] == -1 }
		}
		GPersonnage p = c.getAccount().getCurPerso();
		GItem item = p.getInventory().getItemByID(Integer.parseInt(infos[0]));
		//Vérifie si l'perso possede bien l'item
		if(item == null){
			packetCantParse(c, packet, "Le personnage n'a pas l'item proposé par l'itemID dans le packet à infos[0].");
		}
		boolean good = false;
		switch(packet.charAt(1)){
			case 'd'://Object onDelete
				good = parseOnDelete(p, item, infos);
				break;
			case 'D'://Object onDrop
				good = parseOnDrop(p, item, infos);
				break;
			case 'M'://Object onMovement
				good = parseOnMovement(p, item, infos);
				break;
			case 'u'://Object onUse (avec confirmation)
				//if(ObjectsParser.parseOnUseConfirmation(p, item, infos) == true){
				//	return;
				//}
				good = parseOnUse(p, item, infos);
				break;
			case 'U'://Object onUse (sans confirmation)
				
				//Un Items.onUse peut venir de: un double-clic: sur un item dans la barre rapide
				//											  sur un item dans l'inventaire
				//	                          en cliquant(pointant) sur la map avec un objet
					                                         										   		
				 
				good = parseOnUseNoConfirmation(p, item, infos);
				break;
			case 'x'://Object_obvijevan_desassocier(packet);
			   
			    break;
			case 'f'://Object_obvijevan_feed(packet);
				
				break;
			case 's'://Object_obvijevan_changeSkin(packet);
				
				break;	
		}
		
		if(good){
			ParameterHolder ph = new ParameterHolder();
			if(infos.length > 2 && infos[2].length() > 0){
				ph.cellID = Short.parseShort(infos[2]);
			}
			ph.mapID = p.getMapID();
			ph.item = item;
			ph.condition = item;
			PluginsManager pm = p.getServer().getPluginsManager();
			//Notify les action listeners des packets d'objects en utilisant les Alias de packets
			pm.getActionsManager().notifyListeners(packet.substring(0,2), p, ph, true);
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
// OBJET +===========================================================================================================	
	
	
	
	
	
	

	
	public boolean parseOnDelete(GPersonnage p, GItem item, String infos[]){
		/*
		 * Client envoie: Od16980332|2
		 * Server répond: OQ16980332|2.Ow124|1005.As23334,19200,25200|2183|0|3|0~0,0,0,0,0,0|100,100|9900,10000|2|100|6,0,0,0,6|3,0,0,0,3|0,1,0,0|0,0,0,0|15,3,0,0|0,0,0,0|0,0,0,0|0,1,0,0|0,0,0,0|1,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|3,1,0,0|3,1,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|20
		 */
		
/*		if(Utils.isParsableInteger(packet.substring(2).split("\\|")[0]) == false || Utils.isParsableInteger(packet.split("\\|")[1]) == false){
			return false;
		}
		int itemID = Integer.parseInt(packet.substring(2).split("\\|")[0]);
		GItem item = p.getInventory().getItemByID(itemID);
		if(item == null){
			return false;
		}
*/		int qty = Integer.parseInt(infos[1]);
		if(item.getQuantity() < qty || qty <= 0 || item.getTemplate().getType() == CItems.ITEM_TYPE_QUETES){
			SM.Objects.OdE(p.getClient().getSession());
			return false;
		}
		//Change la quantité
		item.decrementQuantity(qty);
		if(item.getQuantity() == 0){
			//S'il n'en reste pas, enleve la ref et l'affichage
			p.getInventory().removeItem(item);
			SQL.Items.delete(item, p.getServer());
			SM.Objects.OR(p.getClient().getSession(), item);
		}else{
			//S'il en reste, change l'affichage de la quantité
			SM.Objects.OQ(p.getClient().getSession(), item);
		}
		if(item.getPosition() != CItems.POS_notEquiped){
			//Deboost des stats par les effets des items v
			p.getStatistique().boostEquipmentStats(item, CItems.POS_notEquiped, p);
			//Vu qu'on enleve un objet, faut checker si les autres objets équipés respectent encore les conditions
			p.getInventory().checkAllEquipedItemsConditions(p, item, CItems.POS_notEquiped);
		}else{
			SM.Account.As(p.getClient().getSession(), p);
		}
		SM.Objects.Ow(p.getClient().getSession(), p);
		//ActionsManager.notifyListeners("ON_ITEM_DELETE", p, item);
		return true;
	}
	
	
	public boolean parseOnDrop(GPersonnage p, GItem item, String infos[]){
		/*
		 * Client envoie: OD16980350|1
		 * Serveur répond: OR16980350.Ow134|1005.GDO+445;6900;0.As23334,19200,25200|2183|0|3|0~0,0,0,0,0,0|100,100|9900,10000|2|100|6,0,0,0,6|3,0,0,0,3|0,1,0,0|0,0,0,0|15,3,0,0|0,0,0,0|0,0,0,0|0,1,0,0|0,0,0,0|1,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|3,1,0,0|3,1,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|0,0,0,0|20.
		 */
		//Syn.d("parseOnDrop au début");
/*		if(Utils.isParsableInteger(packet.substring(2).split("\\|")[0]) == false || Utils.isParsableInteger(packet.split("\\|")[1]) == false){
			return false;
		}
*//*	int itemID = Integer.parseInt(packet.substring(2).split("\\|")[0]);
		GItem item = p.getInventory().getItemByID(itemID);
		if(item == null){
			return false;
		}
*/		short qty = Short.parseShort(infos[1]);
		if(item.getQuantity() < qty || qty <= 0 || item.getTemplate().getType() == CItems.ITEM_TYPE_QUETES){
			return false;
		}
		//Change la quantité
		item.decrementQuantity(qty);
		if(item.getQuantity() == 0){
			//S'il n'en reste pas, enleve la ref et l'affichage + delete
			p.getInventory().removeItem(item);
			SQL.Items.delete(item, p.getServer());
			SM.Objects.OR(p.getClient().getSession(), item);
		}else{
			//S'il en reste, change l'affichage de la quantité
			SM.Objects.OQ(p.getClient().getSession(), item);
		}
		//Si l'item était équipé, deboost les stats et check les conditions des autres items
		if(item.isEquiped()){
			p.getStatistique().boostEquipmentStats(item, CItems.POS_notEquiped, p);
			p.getInventory().checkAllEquipedItemsConditions(p, item, CItems.POS_notEquiped);
		}else{
			SM.Account.As(p.getClient().getSession(), p);
		}
		SM.Objects.Ow(p.getClient().getSession(), p);
		short cell = p.getServer().getFormulingManager().getFreeCellAround(p, false);
		if(cell != 0){
			GDropItemProvider pr = p.getServer().getProviders().provideDropItem();
			GDropItem gdo = pr.createNew(item, p.getWorld(), cell);
			gdo.setID(p.getWorld().getNextItemID());
			gdo.setQuantity(qty);
			p.getMap().updateSpriteList(Enums.SynActions.MapAction.ADD_SPRITE, gdo);
		}else{
			SM.Infos.Im(p, ImType.ERROR, ImPackets.NotEnoughPlaceAround, "");
		}
		//Syn.d("parseOnDrop au TRUE");
		//ActionsManager.notifyListeners("ON_ITEM_DROP", p, item);	
		return true;
	}
	
	
	/*
	 * 
	 * Vérifier les conditions de chaque objet équipé chaque fois qu'on fait un mouvement.
	 * 
	 * Si on essaye d'équiper un objet  et que ses conditions ne sont pas remplies:
	 * 		Envoyer packet message Im119|44  ("Tes caractéristiques ne conviennent pas pour équiper cet objet.")
	 * 
	 * Si on a essayé de l'équiper pardessus un autre objet déjà en place, faut enlever le premier objet,
	 * 		essayer de mettre le nouveau, voir que ca marche pas, 
	 * 			envoyer l'Im, envoyer le As & Ow (vu quon a enlevé un item)
	 * 
	 * Faut aussi gérer la quantité de l'item qu'on met en mouvement:
	 * 		 y'a: (OMid|pos) mais aussi: (OMid|pos|qty)
	 */
	public boolean parseOnMovement(GPersonnage p, GItem movingItem, String infos[]){
		if(infos.length > 3){
			return false;
		}
		byte newPos = Byte.parseByte(infos[1]);
		if(ItemPosition.getItemPosition(newPos) == null){//Vérifie que la position existe
			return false;
		}
		//Vérifie si l'item peut etre placé à cette newPos
		//Vérifie mtn si l'objet est useable/targetable si newPos = dans barre raccourci 
		if(CItems.objectCanBePlacedAtPosition(movingItem, newPos) == false){
			Syn.d("ObjectsParser.parseOnMovement problem with position for item: invalide, cantbeplaced there");
			return false;
		}
		short qty = 1;
		if(infos.length == 3){//Si une quantité est précisée
			qty = Short.parseShort(infos[2]);
		}
		if(CItems.isEquipable(movingItem.getTemplate().getType()) && qty > 1){
			qty = 1;
		}
		if(movingItem.getQuantity() < qty || qty <= 0){
			return false;
		}
		//Enleve l'ancien item à cette position s'il y en avait un.
		GItem old = p.getInventory().getItemByPosition(newPos);
		if(old != null){
			p.getInventory().unequipItem(old, p, old.getQuantity());
		}
		//Équipe/unequip l'item demandé si les conditions le permettent 
		//et déséquipe les autres items déjà équipés s'ils ne remplissent plus leurs conditions
		//Si c'est pas un objet équipable (coiffe armes,ceintures...) on sen fout
		if(CItems.isEquipable(movingItem.getTemplate().getType()) == false || p.getInventory().checkAllEquipedItemsConditions(p, movingItem, newPos)){
			if(newPos != CItems.POS_notEquiped){//Pour équiper
				p.getInventory().equipItem(movingItem, newPos, p, qty);
			}else if(newPos == CItems.POS_notEquiped){//Pour déséquiper
				p.getInventory().unequipItem(movingItem, p, qty);
			}
			if(newPos == CItems.POS_notEquiped){
				movingItem = null;//nullalize la référence à l'item
			}
		}else{
			SM.Messages.M(p, "Ton personnage ne remplie pas les conditions nécéssaires au port de cet objet.", Constants.COLOR_BLUE);
		}
		return true;
	}
	
	/**
	 * @param p
	 * @param packet
	 * @return
	 */
	public boolean parseOnUse(GPersonnage p, GItem movingItem, String infos[]){
		//Ex: Ou345|3|5
		//"itemID" + "|" + "targetSpriteID(optional)" + "|cellID(optional)"  
		//_loc1.use = function (nID, sSpriteID, nCellNum, bConfirm)
	    //{
	    //    this.aks.send("O" + (bConfirm ? ("u") : ("U")) + nID + (sSpriteID != undefined && !_global.isNaN(Number(sSpriteID)) ? ("|" + sSpriteID) : ("|")) + (nCellNum != undefined ? ("|" + nCellNum) : ("")), true);
	    //};
		
		/*
	 	* TODO: ObjectParser.parseOnUse -> commenté en attendant qu'on le fasse. Vérifier dans l'client les endroits ou il call  .onUse(..) avec le bConfirm !
		*
		* if(Pattern.matches(Constants.isNumberPattern, packet.substring(2).split("\\|")[0]) && packet.endsWith("|")){
			int itemID = Integer.parseInt(packet.substring(2).split("\\|")[0]);
			GItem item = p.getInventory().getItemByID(itemID);
			
			if(item.getTemplate().getType() == CItems.ITEM_TYPE_BONBON){
				
			}
		}*/
		return false;
	}

	
	
	public boolean parseOnUseNoConfirmation(GPersonnage p, GItem item, String[] infos) {
		// TODO Auto-generated method stub
		//Impossible d'avoir une length >3.   Le lvl doit être respecté (en tk pour certains items comme le saut sifflard (id 7799) (Non en faite ça doit juste être ds les conditions des items que le lvl est controllé)
		if(infos.length > 3 //|| p.getLevel() < item.getTemplate().getLevel()
			     //Doit être soit useable soit targetable, sinon c'pas bon.
			|| (false == (CItems.isUseable(item.getTemplate().getType(), item.getID()) || CItems.isTargetable(item.getTemplate().getType())) )){
			return false;
		}
		
		/*
		 TODO if blablabla faire les conditions ici et tout dans le ObjectsParser.parseOnUseNoConfirmation
		 */
		
		/*
		 Plugins.getPlugin("Effects").apply(item, perso, spriteTargetID, cellTargetID)
		 		Parametres utiles : item.getID, item.getType, item.getQty, item.getEffects, item.getPos
		 							booleans: isInFight, hasMount, canUseItems/isTomb (Systeme de Restrictions), etc
		*/
		if(item.getEffects() == null){
			return true;
			//On peut pas pénaliser qqn parce qu'il essaye d'utiliser un item sans effets, y'en a plein
		}
		if(item.getEffects().size() == 0){
			item.setItemEffects(null, true, p.getWorld());
			return true;
		}
		ISprite s = null;
		if(infos.length > 1 && infos[1].length() > 0){
			s = p.getMap().getSprite(Integer.parseInt(infos[1]));
			if(// s == null ||
			    s instanceof AbstractCharacter == false 
				&& s instanceof GDropItem == false
				){
				return false;//Si le ISprite visé n'est pas un AbstractChar ni un GDropItem
			}
		}
		PluginsManager pm = p.getServer().getPluginsManager();
		switch(infos.length){
			case 1:
				for(GEffect e : item.getEffects()){
					pm.getEffectsManager().applyEffect(e, p, p, null);
				}
				break;
			case 2:
				for(GEffect e : item.getEffects()){
					pm.getEffectsManager().applyEffect(e, p, (AbstractCharacter) (s instanceof AbstractCharacter? s : null), null);
				}
				break;
			case 3:
				ParameterHolder eap = new ParameterHolder();
				eap.cellID = Short.parseShort(infos[2]);
				/*if(s == null){
					Syn.d("Le fucking sprite target est null");
					for(ISprite is : p.getMap().getSpritesSynchroFull()){
						if(is.getCellID() == cellTarget){
							s = is; break;
						}
					}
				}*/
				for(GEffect e : item.getEffects()){
					//ici on utilise p.getMapID au lieu de s.getMapID pcq desfois le s peut être null
					//ça arrive par exemple si on veut poser un objet d'élevage vu qu'il n'y a originellement
					//	pas de sprite à cet endroit, ça fait que le deuxieme parametre est vide et le s == null
					//Exemple: G [RECV] << OU479||422
					pm.getEffectsManager().applyEffect(e, p, (AbstractCharacter) (s instanceof AbstractCharacter? s : null), eap);
				}
				break;
		}
		if(item.getTemplate().getType() == CItems.ITEM_TYPE_PAIN){
			//Envoie emote de manger du pain
			SM.emotes.eU(s == null ? p : (GPersonnage)s, EmoteEnum.EAT_BREAD.getValue(), 0);
		}
		if(item.getTemplate().getType() == CItems.ITEM_TYPE_BIERE){
			//Envoie emote de boire de la bière
			SM.emotes.eU(s == null ? p : (GPersonnage)s, EmoteEnum.DRINK_BEER.getValue(), 0);
		}
		//if(item.getTemplate().getType() == ItemType.ITEM_TYPE_BONBON.getValue()){
		//	p.getInventory().equipItem(item, (byte)24, p, (short)1);
		//}else{
			if(item.getQuantity() == 1){
				p.getInventory().removeItem(item);
				SM.Objects.OR(p.getClient().getSession(), item);
				SM.Objects.Ow(p.getClient().getSession(), p);
			}else{
				item.decrementQuantity(1);
				SM.Objects.OQ(p.getClient().getSession(), item);
				SM.Objects.Ow(p.getClient().getSession(), p);
			}
		//}
		//ActionsManager.notifyListeners("ON_ITEM_USE", p, item);	
		return true;
	}
	
	
	/*
	 _loc1.__get__canMoveToShortut = function ()
    {
        return (this.canUse == true || this.canTarget == true);
    };
	 */
	
	
	/*Pour les objets vivants :  (trouvé dans dofus/datacenter/Item)
	
	
	//Palier d'XP pour les objets vivant (pour chaque chiffre == un lvl up donc 20 niveaux)
	LEVEL_STEP = [0, 10, 21, 33, 46, 60, 75, 91, 108, 126, 145, 165, 186, 208, 231, 255, 280, 306, 333, 361];
	
	
	 _loc1.__get__isAssociate = function ()
    {
        return (this.skineable && this.realType != 113);
    };
    
     
	  _loc1.updateDataFromEffect = function ()
    {
        for (var k in this._aEffects)
        {
            var _loc2 = this._aEffects[k];
            switch (_loc2[0])
            {
                case 974:
                {
                    this._nLivingXp = _loc2[3] ? (_loc2[3]) : (0);
                    break;
                } 
                case 973:
                {
                    this._nRealType = _loc2[3] ? (_loc2[3]) : (0);
                    break;
                } 
                case 972:
                {
                    this._nSkin = _loc2[3] ? (_global.parseInt(_loc2[3]) - 1) : (0);
                    this._bIsSkineable = true;
                    break;
                } 
                case 971:
                {
                    this._nMood = _loc2[3] ? (_loc2[3]) : (0);
                    break;
                } 
                case 970:
                {
                    this._sRealGfx = this._oUnicInfos.g;
                    this._sGfx = this.api.lang.getItemUnicText(_loc2[3] ? (_loc2[3]) : (0)).g;
                    this._nRealUnicId = _loc2[3];
                    break;
                } 
                case 983:
                {
                    this._bCanBeExchange = false;
                    break;
                } 
            } // End of switch
        } // end of for...in
    };
	 */
	
	
}
