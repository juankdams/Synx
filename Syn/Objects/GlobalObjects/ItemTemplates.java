package GlobalObjects;

import static Constants.CItems.ITEM_TYPE_AMULETTE;
import static Constants.CItems.ITEM_TYPE_ANNEAU;
import static Constants.CItems.ITEM_TYPE_BOTTES;
import static Constants.CItems.ITEM_TYPE_BOUCLIER;
import static Constants.CItems.ITEM_TYPE_CAPE;
import static Constants.CItems.ITEM_TYPE_CEINTURE;
import static Constants.CItems.ITEM_TYPE_COIFFE;
import static Constants.CItems.ITEM_TYPE_DOFUS;
import static Constants.CItems.ITEM_TYPE_DRAGODINDE;
import static Constants.CItems.ITEM_TYPE_FAMILIER;
import static Constants.CItems.ITEM_TYPE_OBJET_VIVANT;
import static Constants.CItems.ITEM_TYPE_PERSO_SUIVEUR;
import static Constants.CItems.ITEM_TYPE_QUETES;
import static Constants.CItems.ITEM_TYPE_SAC_A_DOS;
import static Constants.CItems.ITEM_TYPE_TRANSFORM;
import static Constants.CItems.PARAM_BONUSCC;
import static Constants.CItems.PARAM_ID;
import static Constants.CItems.PARAM_LEVEL;
import static Constants.CItems.PARAM_PA;
import static Constants.CItems.PARAM_PODS;
import static Constants.CItems.PARAM_POMAX;
import static Constants.CItems.PARAM_POMIN;
import static Constants.CItems.PARAM_TAUXCC;
import static Constants.CItems.PARAM_TAUXEC;
import static Constants.CItems.PARAM_TYPE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Constants.CItems;
import GameObjects.GWorld;
import Interfaces.IItemTemplate;


public class ItemTemplates {
	public static Logger log = LoggerFactory.getLogger(ItemTemplates.class);

	
	public static class ItemTemplateFactory{
		public static EquipmentItemTemplate createNewEquipment(short itemSet, Object... obj){
			if(itemSet == 0){
				return new EquipmentItemTemplate(obj);
			}//Arme de panoplie
			else{
				return new EquipmentItemSetTemplate(itemSet, obj);
			}
		}
		
		public static IItemTemplate createNewWeapon(short itemSet, Object... obj){
			if(itemSet == 0){
				return new WeaponItemTemplate(obj);
			}//Arme de panoplie
			else{
				return new WeaponItemSetTemplate(itemSet, obj);
			}
		}
	}
	
	
	
	
	
	
	
	
	public static class EquipmentItemTemplate implements IItemTemplate{
		private String templateEffects = null;
		private String conditions = null;
		private int price = 0;
		//Ptete mettre un GStatistiques dynamique à la place de l'array ?
		//en plus ca comprendrait toutes les stats. Mais c'est peut-etre mieux de le mettre dans GItem..chais pas..
		/** Pour un Weapon:      ID, Lvl, Type, Pods, PA, TauxCC, TauxEC, BonusCC, POmin, POmax
		 	Pour un Équipement:  ID, Lvl, Type, Pods, 
		 	Pour 1item enVente:  ID, Lvl, Type, Pods, price, averagePrice
		 	Pour une ressource:  ID, Lvl, Type, Pods, -------, price, averagePrice
		 	Pour une potion   :  ID, Lvl, Type, Pods, -------, price, averagePrice
		 	
		 	*/ 
		protected short params[] = null;
		
		public EquipmentItemTemplate(String templateEffects, short params[], int price, String conditions){
			this.templateEffects = templateEffects;
			this.params = params;
			this.price = price;
			this.conditions = conditions;
			if(this.conditions.length() < 2){
				this.conditions = null;
			}
		}
		public EquipmentItemTemplate(Object[] obj) {
			//Voir SQL.Items.loadTemplate et ItemTemplateFactory pour comprendre les index des objets
			this.templateEffects = (String)obj[0];
			this.params = (short[])obj[1];
			this.price = (Integer)obj[2];
			this.conditions = (String)obj[3];
			if(this.conditions.length() < 2){
				this.conditions = null;
			}
		}
		@Override
		public void setID(short templateID) {
			this.params[PARAM_ID] = templateID;
		}
		@Override
		public short getID() {
			return params[PARAM_ID];
		}
		@Override
		public void setTemplateEffects(String templateEffects) {
			this.templateEffects = templateEffects;
		}
		@Override
		public String getTemplateEffects() {
			return templateEffects;
		}
		@Override
		public void setConditions(String conditions) {
			this.conditions = conditions;
		}
		@Override
		public String getConditions() {
			return conditions;
		}
		@Override
		public void setLevel(short lvl) {
			this.params[PARAM_LEVEL] = lvl;
		}
		@Override
		public short getLevel() {
			return params[PARAM_LEVEL];
		}
		@Override
		public void setType(short type) {
			this.params[PARAM_TYPE] = type;
		}
		@Override
		public short getType() {
			return params[PARAM_TYPE];
		}
		@Override
		public short getPods(){
			return params[PARAM_PODS];
		}
		@Override
		public void setPods(short pods){
			this.params[PARAM_PODS] = pods;
		} 
		@Override
		public boolean isEquipment(){
			switch(getType()){
				case ITEM_TYPE_AMULETTE:
				case ITEM_TYPE_ANNEAU:
				case ITEM_TYPE_CEINTURE:
				case ITEM_TYPE_BOTTES:
				case ITEM_TYPE_COIFFE:
				case ITEM_TYPE_CAPE:
				case ITEM_TYPE_SAC_A_DOS:
				case ITEM_TYPE_BOUCLIER:
				case ITEM_TYPE_FAMILIER:
				case ITEM_TYPE_DRAGODINDE: 
				case ITEM_TYPE_DOFUS:
					return true;
			}
			return false;
		}
		@Override
		public boolean isWeapon(){
			return false;
		}
		@Override
		public boolean isCursed(){
			/*
			  ITEM_TYPE_TRANSFORM	 = 27;  ITEM_TYPE_BOOST_FOOD		= 28;
			  ITEM_TYPE_BENEDICTION	 = 29;  ITEM_TYPE_MALEDICTION		= 30;
			  ITEM_TYPE_RP_BUFF		 = 31;  ITEM_TYPE_PERSO_SUIVEUR		= 32;
			*///Les items de l'officiel 7133,7134,7135 = type 30, mais sont pas Cursed->pas bon
			return ((getID() < 7133 && getID() > 7135) &&
				(getType() >= ITEM_TYPE_TRANSFORM && getType() <= ITEM_TYPE_PERSO_SUIVEUR));
		}
		@Override
		public boolean isRessource(){
			//Pas Miscellaneous et pas Equipable
			return (false == (this.isMiscellaneous() || CItems.isEquipable(getType())));
		}
		@Override
		public boolean isMiscellaneous(){
			return CItems.isMiscellaneous(getType());
		}
		@Override
		public boolean isQuestItem(){
			return (getType() == ITEM_TYPE_QUETES);
		}
		@Override
		public boolean isLiving(){
			return (getType() == ITEM_TYPE_OBJET_VIVANT);
		}
		//@Override
		//public boolean isSellingItem(){
		//	false;
		//}
		@Override
		public void setPrice(int price) {
			this.price = price;
		}
		@Override
		public int getPrice() {
			return price;
		}

		@Override
		public void setItemSet(short is){}
		public ItemSet getItemSet(GWorld w) {return null;}
		public short getItemSetID() {return 0;}
		public void setNeedsThoHands(boolean needsThoHands) {}
		public boolean isNeedsThoHands(){return false;}
		public void setPA(short pa){}
		public short getPA(){return 0;}
		public void setCC(short cc){}
		public short getCC(){return 0;}
		public void setEC(short ec){}
		public short getEC(){return 0;}
		public void setPOmin(short po){}
		public short getPOmin(){return 0;}
		public void setPOmax(short po){}
		public short getPOmax(){return 0;}
		public short getBonusCC(){return 0;}
		public void setBonusCC(short bonusCC){}
		
		@Override
		public void setLike(IItemTemplate t) {
			// TODO Auto-generated method stub
			if(t.getTemplateEffects() != null){
				this.setTemplateEffects(new String(t.getTemplateEffects()));
			}
			if(t.getConditions() != null){
				this.setConditions(new String(t.getConditions()));
			}
			this.setPrice(t.getPrice());
			this.params = new short[t.getParams().length];
			for(int i = params.length-1; i >= 0; i--){
				this.params[i] = t.getParams()[i];
			}
			t = null;
		}
		
		@Override
		public short[] getParams() {
			return this.params;
		}
		@Override
		public short[] setParams(short[] params) {
			return (this.params = params);
		}
	}
	
	
	
	
	
	
	
	
	
	public static class WeaponItemTemplate extends EquipmentItemTemplate{
		private boolean needsThoHands = false;
		public WeaponItemTemplate(String templateEffects, short[] params, boolean needs2Hands, int price, String conditions) {
			super(templateEffects, params, price, conditions);
			setNeedsThoHands(needs2Hands);
		}
		public WeaponItemTemplate(Object[] obj) {
			//Voir SQL.Items.loadTemplate et ItemTemplateFactory pour comprendre les index des objets
			super((String)obj[0], (short[])obj[1], (Integer)obj[3], (String)obj[4]);
			setNeedsThoHands((Boolean) obj[2]);
		}
		@Override
		public boolean isWeapon(){
			return true;
		}
		@Override
		public boolean isEquipment(){
			return false;
		}
		@Override
		public boolean isCursed(){
			return false;
		}
		@Override
		public boolean isRessource(){
			return false;
		}
		@Override
		public boolean isMiscellaneous(){
			return false;
		}
		@Override
		public boolean isQuestItem(){
			return false;
		}
		@Override
		public boolean isLiving(){
			return false;
		}
		@Override
		public void setNeedsThoHands(boolean needsThoHands) {
			this.needsThoHands = needsThoHands;
		}
		@Override
		public boolean isNeedsThoHands() {
			//Syn.d("isNeedsThoHands dans WeaponItemTemplate");
			return needsThoHands;
		}
		@Override
		public void setPA(short pa){
			this.params[PARAM_PA] = pa;
		}
		@Override
		public short getPA(){
			return params[PARAM_PA];
		}
		@Override
		public void setCC(short cc){
			this.params[PARAM_TAUXCC] = cc;
		}
		@Override
		public short getCC(){
			return params[PARAM_TAUXCC];
		}
		@Override
		public void setEC(short ec){
			this.params[PARAM_TAUXEC] = ec;
		}
		@Override
		public short getEC(){
			return params[PARAM_TAUXEC];
		}
		@Override
		public void setPOmin(short po){
			this.params[PARAM_POMIN] = po;
		}
		@Override
		public short getPOmin(){
			return params[PARAM_POMIN];
		}
		@Override
		public void setPOmax(short po){
			this.params[PARAM_POMAX] = po;
		}
		@Override
		public short getPOmax(){
			return params[PARAM_POMAX];
		}
		@Override
		public short getBonusCC(){
			return this.params[PARAM_BONUSCC];
		}
		@Override
		public void setBonusCC(short bonusCC){
			this.params[PARAM_BONUSCC] = bonusCC;
		}
		@Override
		public void setLike(IItemTemplate t){
			super.setLike(t);
			this.needsThoHands = t.isNeedsThoHands();
		}
	}

	
	
	
	
	
	//Template d'item ayant un itemSet ---------------------------------
	
	
	
	/**
	 * Item Template de panoplie, du coté des Equipment
	 * @author Robyn
	 */
	public static class EquipmentItemSetTemplate extends EquipmentItemTemplate {
		private short itemSetID = 0;
		public EquipmentItemSetTemplate(String templateEffects, short[] params, int price, String conditions, short itemSet) {
			super(templateEffects, params, price, conditions);
			this.setItemSet(itemSet);
		}
		public EquipmentItemSetTemplate(short panoplie, Object[] obj) {
			super(obj);
			this.setItemSet(panoplie);
		}
		@Override
		public void setItemSet(short panoplie) {
			this.itemSetID = panoplie;
		}
		@Override
		public short getItemSetID() {
			return itemSetID;
		}
		@Override
		public ItemSet getItemSet(GWorld w) {
			return w.getItemSet(itemSetID);
		}
		@Override
		public void setLike(IItemTemplate t){
			super.setLike(t);
			this.itemSetID = t.getItemSetID();
		}
	}
	/**
	 * Item Template de panoplie, du coté des Weapon
	 * @author Robyn
	 */
	public static class WeaponItemSetTemplate extends WeaponItemTemplate {
		private short itemSetID = 0;
		public WeaponItemSetTemplate(String templateEffects, short[] params, boolean needs2Hands, int price, String conditions, short panoplie) {
			super(templateEffects, params, needs2Hands, price, conditions);
			this.setItemSet(panoplie);
		}
		public WeaponItemSetTemplate(short panoplie, Object[] obj) {
			super(obj);
			this.setItemSet(panoplie);
		}
		@Override
		public void setItemSet(short panoplie) {
			this.itemSetID = panoplie;
		}
		@Override
		public short getItemSetID() {
			return itemSetID;
		}
		@Override
		public ItemSet getItemSet(GWorld w) {
			return w.getItemSet(itemSetID);
		}
		@Override
		public void setLike(IItemTemplate t){
			super.setLike(t);
			this.itemSetID = t.getItemSetID();
		}
	}

		
	
	
	
	
	/*

	public static class SellingItemTemplate extends EquipmentItemTemplate{// implements IItemTemplate{
		private int price = 0;
		public SellingItemTemplate(String templateEffects, short[] params, int price) {
			super(templateEffects, params);
			setPrice(price);
			// TODO Auto-generated constructor stub
		}
		public void setPrice(int price) {
			this.price = price;
		}
		
		public int getPrice() {
			//nice(this);
			//nice2(this);
			return price;
		}
		//public void nice(IItemTemplate a){ }
		//public void nice2(EquipmentItemTemplate a){ }
	}
	*/
	
}
