package Interfaces;

import GameObjects.GWorld;
import GlobalObjects.ItemSet;

public interface IItemTemplate {

	public short getID();
	public short getType();
	public short getLevel();
	public short getItemSetID();
	public ItemSet getItemSet(GWorld w);
	public short getPods();
	public String getTemplateEffects();
	public String getConditions();
	public int getPrice();
	public short[] getParams();
	public short[] setParams(short[] params);

	public void setID(short templateID);
	public void setType(short type);
	public void setLevel(short lvl);
	public void setItemSet(short itemSetID);
	public void setPods(short pods);
	public void setTemplateEffects(String templateEffects);
	public void setConditions(String conditions);
	public void setPrice(int price);
	
	/**Pour modifier l'template pour qu'il soit identique à celui en param*/
	public void setLike(IItemTemplate t);
	
	//Pour les armes
	public void setNeedsThoHands(boolean needsThoHands);
	public boolean isNeedsThoHands();
	public void setPA(short pa);
	public short getPA();
	public void setCC(short cc);
	public short getCC();
	public void setEC(short ec);
	public short getEC();
	public void setPOmin(short po);
	public short getPOmin();
	public void setPOmax(short po);
	public short getPOmax();
	public short getBonusCC();
	public void setBonusCC(short bonusCC);
	
	

	
	
	
	
	/**    Return <em>false</em> à partir de la classe <em>EquipmentItemTemplate</em>
	 * <br>Return <em>true</em> à partir de la classe <em>WeaponItemTemplate</em> (Override)
	 * @return - TRUE si le ItemTemplateType == 1, donc que la classe est une WeaponItemTemplate ou WeaponItemSetTemplate (Voir l'enum plus bas) 
	 */
	public boolean isWeapon();
	
	/** @return - True si c'est un équipement (Pas d'arme) : Coiffe/Cape/Anneau/Familier/Dragodinde/Ceinture/Amu/Bouclier/Dofus/Bottes/Sac-à-dos
	 * 			<br>FALSE sinon*/
	public boolean isEquipment();
	
	/** Miscellaneous = représentation des items allant dans l'onglet "Divers" dans l'inventaire: pains, potions, parcho, etc
	 * <p>Vérifie dans un switch à l'aide de tous les types d'items qui sont miscellaneous.
	 * <p>Pareil à la method CItems.isMiscellaneous*/
	public boolean isMiscellaneous();
	
	/** Ressource = représentation des items allant dans l'onglet "Ressources" dans l'inventaire: bois, blé, eau, pinces, bave, cornes, etc
	 * <p>Vérifie en vérifiant si ce n'est pas un miscellaneous et que ce n'est pas un equipable non plus*/
	public boolean isRessource();
	
	/**QuestItem = représentation des items allant dans l'onglet "Objet de Quete" dans l'inventaire.
	 * <p>Vérifie si le type est un objet de quête*/
	public boolean isQuestItem();
	
	/** Cursed = objet maudit comme: personnage suiveur, transformation mutante (ex en abra), malédiction/bénédiction... Il y a un champs isCursed dans le lang des items (symbol  m: true)
	 * <p>Vérifie par rapport au type qui doit être entre 27 et 32 inclus et dont le templateID n'est pas 7133,7134 ni 7135*/
	public boolean isCursed();
	
	/**Si c'est un objet vivant
	 * <p>Pareil à la method CItems.isLiving*/
	public boolean isLiving();
	
//	public boolean isSellingItem();
	
	
	
	
	
	public static enum ItemTemplateType{
		EQUIPMENT(0),
		WEAPON(1);
		private int type = 0;
		private ItemTemplateType(int value){
			type = value;
		}
		public int get(){
			return type;
		}
		/**
		 * Weapon ou autre? C'est juste pour savoir quel type de classe on fait: un EquipmentItemTemplate ou un WeaponItemTemplate. (Au chargement ds SQL.Items.loadTemplate)
		 */
		public static ItemTemplateType getItemTemplateType(byte value){
			for(ItemTemplateType itt : ItemTemplateType.values()){
				if(itt.get() == value){
					return itt;
				}
			}
			return null;
		}
		
	}





	
	
}
