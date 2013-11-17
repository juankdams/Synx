package Constants;

import Core.Syn;
import Enums.CharacteristicType;
import GameObjects.GItem;

public class CItems {

	//ID des Effets d'items
	//ID des positions d'items dans l'inventaire
	//ID des index des parametres de l'array "params" dans ItemTemplate
	
	public static final boolean BaguetteVelueAPasBesoindeLigneDeVue = true;
	
	//Indexs:
	public static final byte lengthOfParamsForEquipment = 5;
	public static final byte lengthOfParamsForWeapon = 11;
	//public static final byte lengthOfParamsForSellItem = 5;
	
		//Index pour tout équipement ItemTemplate
	public static final byte PARAM_ID 				= 0;
	public static final byte PARAM_LEVEL 			= 1;
	public static final byte PARAM_TYPE 			= 2;
	public static final byte PARAM_PODS 			= 3;
	//Index pour ItemSetTemplate d'arme et equipment
	//public static final byte PARAM_ITEMSET 			= 4;
		//Index pour WeaponItemTemplate
	public static final byte PARAM_PA 				= 4;
	public static final byte PARAM_TAUXCC 			= 5;
	public static final byte PARAM_TAUXEC 			= 6;
	public static final byte PARAM_BONUSCC 			= 7;
	public static final byte PARAM_POMIN 			= 8;
	public static final byte PARAM_POMAX 			= 9;
	
	
	//Positions
	public static final String POS_notEquiped_String  = "-1";
	public static final byte POS_notEquiped 		= -1;
	public static final byte POS_AMULETTE		= 0;
	public static final byte POS_ARME			= 1;
	public static final byte POS_anneauGauche	= 2;
	public static final byte POS_CEINTURE		= 3;
	public static final byte POS_anneauDroite	= 4;
	public static final byte POS_BOTTES			= 5;
	public static final byte POS_COIFFE		 	= 6;
	public static final byte POS_CAPE			= 7;
	public static final byte POS_FAMILIER		= 8;
	public static final byte POS_dofus1			= 9;
	public static final byte POS_dofus2			= 10;
	public static final byte POS_dofus3			= 11;
	public static final byte POS_dofus4			= 12;
	public static final byte POS_dofus5			= 13;
	public static final byte POS_dofus6			= 14;
	public static final byte POS_BOUCLIER		= 15;
	public static final byte POS_DRAGODINDE		= 16;
	
	public static final byte POS_candyBar1 		= 20;
	public static final byte POS_candyBar2 		= 21;
	public static final byte POS_candyBar3 		= 22;
	public static final byte POS_candyBar4 		= 23;
	public static final byte POS_candyBar5 		= 24;
	public static final byte POS_candyBar6 		= 25;
	public static final byte POS_candyBar7 		= 26;
	public static final byte POS_candyBar8 		= 27;
	
	public static final byte POS_itemBar1 		= 35;
	public static final byte POS_itemBar2 		= 36;
	public static final byte POS_itemBar3 		= 37;
	public static final byte POS_itemBar4 		= 38;
	public static final byte POS_itemBar5 		= 39;
	public static final byte POS_itemBar6 		= 40;
	public static final byte POS_itemBar7 		= 41;
	public static final byte POS_itemBar8 		= 42;
	public static final byte POS_itemBar9 		= 43;
	public static final byte POS_itemBar10 		= 44;
	public static final byte POS_itemBar11 		= 45;
	public static final byte POS_itemBar12 		= 46;
	public static final byte POS_itemBar13 		= 47;
	public static final byte POS_itemBar14 		= 48;
	//TODO : CItems.position des Bonbons, envoutements(?)...
	
	//Types
	public static final int ITEM_TYPE_AMULETTE			= 1;
	public static final int ITEM_TYPE_ARC				= 2;
	public static final int ITEM_TYPE_BAGUETTE			= 3;
	public static final int ITEM_TYPE_BATON				= 4;
	public static final int ITEM_TYPE_DAGUES			= 5;
	public static final int ITEM_TYPE_EPEE				= 6;
	public static final int ITEM_TYPE_MARTEAU			= 7;
	public static final int ITEM_TYPE_PELLE				= 8;
	public static final int ITEM_TYPE_ANNEAU			= 9;
	public static final int ITEM_TYPE_CEINTURE			= 10;
	public static final int ITEM_TYPE_BOTTES			= 11;
	public static final int ITEM_TYPE_POTION			= 12;
	public static final int ITEM_TYPE_PARCHO_EXP		= 13;
	public static final int ITEM_TYPE_DONS				= 14;
	public static final int ITEM_TYPE_RESSOURCE			= 15;
	public static final int ITEM_TYPE_COIFFE			= 16;
	public static final int ITEM_TYPE_CAPE				= 17;
	public static final int ITEM_TYPE_FAMILIER			= 18;
	public static final int ITEM_TYPE_HACHE				= 19;
	public static final int ITEM_TYPE_OUTIL				= 20;
	public static final int ITEM_TYPE_PIOCHE			= 21;
	public static final int ITEM_TYPE_FAUX				= 22;
	public static final int ITEM_TYPE_DOFUS				= 23;
	public static final int ITEM_TYPE_QUETES			= 24;
	public static final int ITEM_TYPE_DOCUMENT			= 25;
	public static final int ITEM_TYPE_FM_POTION			= 26;
	public static final int ITEM_TYPE_TRANSFORM			= 27;
	public static final int ITEM_TYPE_BOOST_FOOD		= 28;
	public static final int ITEM_TYPE_BENEDICTION		= 29;
	public static final int ITEM_TYPE_MALEDICTION		= 30;
	public static final int ITEM_TYPE_RP_BUFF			= 31;
	public static final int ITEM_TYPE_PERSO_SUIVEUR		= 32;
	public static final int ITEM_TYPE_PAIN				= 33;
	public static final int ITEM_TYPE_CEREALE			= 34;
	public static final int ITEM_TYPE_FLEUR				= 35;
	public static final int ITEM_TYPE_PLANTE			= 36;
	public static final int ITEM_TYPE_BIERE				= 37;
	public static final int ITEM_TYPE_BOIS				= 38;
	public static final int ITEM_TYPE_MINERAIS			= 39;
	public static final int ITEM_TYPE_ALLIAGE			= 40;
	public static final int ITEM_TYPE_POISSON			= 41;
	public static final int ITEM_TYPE_BONBON			= 42;//Useable + Targetable
	public static final int ITEM_TYPE_POTION_OUBLIE		= 43;
	public static final int ITEM_TYPE_POTION_METIER		= 44;
	public static final int ITEM_TYPE_POTION_SORT		= 45;
	public static final int ITEM_TYPE_FRUIT				= 46;
	public static final int ITEM_TYPE_OS				= 47;
	public static final int ITEM_TYPE_POUDRE			= 48;
	public static final int ITEM_TYPE_COMESTI_POISSON	= 49;
	public static final int ITEM_TYPE_PIERRE_PRECIEUSE	= 50;
	public static final int ITEM_TYPE_PIERRE_BRUTE		=51;
	public static final int ITEM_TYPE_FARINE			=52;
	public static final int ITEM_TYPE_PLUME				=53;
	public static final int ITEM_TYPE_POIL				=54;
	public static final int ITEM_TYPE_ETOFFE			=55;
	public static final int ITEM_TYPE_CUIR				=56;
	public static final int ITEM_TYPE_LAINE				=57;
	public static final int ITEM_TYPE_GRAINE			=58;
	public static final int ITEM_TYPE_PEAU				=59;
	public static final int ITEM_TYPE_HUILE				=60;
	public static final int ITEM_TYPE_PELUCHE			=61;
	public static final int ITEM_TYPE_POISSON_VIDE		=62;
	public static final int ITEM_TYPE_VIANDE			=63;
	public static final int ITEM_TYPE_VIANDE_CONSERVEE	=64;
	public static final int ITEM_TYPE_QUEUE				=65;
	public static final int ITEM_TYPE_METARIA			=66;
	public static final int ITEM_TYPE_LEGUME			=68;
	public static final int ITEM_TYPE_VIANDE_COMESTIBLE	=69;
	public static final int ITEM_TYPE_TEINTURE			=70;
	public static final int ITEM_TYPE_EQUIP_ALCHIMIE	=71;
	public static final int ITEM_TYPE_OEUF_FAMILIER		=72;
	public static final int ITEM_TYPE_MAITRISE			=73;
	public static final int ITEM_TYPE_FEE_ARTIFICE		=74;
	public static final int ITEM_TYPE_PARCHEMIN_SORT	=75;
	public static final int ITEM_TYPE_PARCHEMIN_CARAC	=76;
	public static final int ITEM_TYPE_CERTIFICAT_CHANIL	=77;
	public static final int ITEM_TYPE_RUNE_FORGEMAGIE	=78;
	public static final int ITEM_TYPE_BOISSON			=79;
	public static final int ITEM_TYPE_OBJET_MISSION		=80;
	public static final int ITEM_TYPE_SAC_A_DOS			=81;
	public static final int ITEM_TYPE_BOUCLIER			=82;
	public static final int ITEM_TYPE_PIERRE_AME		=83;
	public static final int ITEM_TYPE_CLEFS				=84;
	public static final int ITEM_TYPE_PIERRE_AME_PLEINE	=85;
	public static final int ITEM_TYPE_POPO_OUBLI_PERCEP	=86;
	public static final int ITEM_TYPE_PARCHO_RECHERCHE	=87;
	public static final int ITEM_TYPE_RUNES_MAGIQUE		=88;//Style Fragments magiques et runes de signature.
	public static final int ITEM_TYPE_CADEAUX			=89;
	public static final int ITEM_TYPE_FANTOME_FAMILIER	=90;
	public static final int ITEM_TYPE_DRAGODINDE		=91;
	public static final int ITEM_TYPE_BOUFTOU			=92;
	public static final int ITEM_TYPE_OBJET_ELEVAGE		=93;
	public static final int ITEM_TYPE_OBJET_UTILISABLE	=94;
	public static final int ITEM_TYPE_PLANCHE			=95;
	public static final int ITEM_TYPE_ECORCE			=96;
	public static final int ITEM_TYPE_CERTIF_MONTURE	=97;
	public static final int ITEM_TYPE_RACINE			=98;
	public static final int ITEM_TYPE_FILET_CAPTURE		=99;
	public static final int ITEM_TYPE_SAC_RESSOURCE		=100;
	public static final int ITEM_TYPE_ARBALETE			=102;
	public static final int ITEM_TYPE_PATTE				=103;
	public static final int ITEM_TYPE_AILE				=104;
	public static final int ITEM_TYPE_OEUF				=105;
	public static final int ITEM_TYPE_OREILLE			=106;
	public static final int ITEM_TYPE_CARAPACE			=107;
	public static final int ITEM_TYPE_BOURGEON			=108;
	public static final int ITEM_TYPE_OEIL				=109;
	public static final int ITEM_TYPE_GELEE				=110;
	public static final int ITEM_TYPE_COQUILLE			=111;
	public static final int ITEM_TYPE_PRISME			=112;
	public static final int ITEM_TYPE_OBJET_VIVANT		=113;
	public static final int ITEM_TYPE_ARME_MAGIQUE		=114;
	public static final int ITEM_TYPE_FRAGM_AME_SHUSHU	=115;
	public static final int ITEM_TYPE_POTION_FAMILIER	=116;

	//  Items Types Créés par moi-même !
	//public static final int ITEM_TYPE_TROPHE			=117; //trophés
	//public static final int ITEM_TYPE_ARME_ROBOT		=118; //armes de robot
	//public static final int ITEM_TYPE_ARME_MERCENAIRE	=119; //armes de mercenaires
	//public static final int ITEM_TYPE_OBJET_COMBAT	=120; //objets utilisables en combat
	//public static final int ITEM_TYPE_ARME_LEGENDAIRE	=121; //armes qui lance des sorts a chaque frappe
	//public static final int ITEM_TYPE_REINFORMENT		=122; //objet de réenforcement pour boost les stats ditem
	
	

	public static final byte ITEM_SET_FECA = 91;
	public static final byte ITEM_SET_OSAMODAS = 84;
	public static final byte ITEM_SET_ENUTROF = 85;
	public static final byte ITEM_SET_SRAM = 89;
	public static final byte ITEM_SET_XELOR = 86;
	public static final byte ITEM_SET_ECAFLIP = 88;
	public static final byte ITEM_SET_ENIRIPSA = 83;
	public static final byte ITEM_SET_IOP = 81;
	public static final byte ITEM_SET_CRA = 82;
	public static final byte ITEM_SET_SADIDA = 90;
	public static final byte ITEM_SET_SACRIEUR = 87;
	public static final byte ITEM_SET_PANDAWA = 92;
	
	
	
	
	/**
	 * FIXME: Gérer les bonbons/envoutements/personnages suiveurs aux bons endroits (candyBar 1 à 8)
	 * @param movingItem
	 * @param newPos
	 * @return
	 */
	public static boolean objectCanBePlacedAtPosition(GItem movingItem, byte newPos) {
		//Cheat, c'est impossible en jeu d'essayer d'équiper un item au meme endroit qu'il était déjà v.
		if(newPos == movingItem.getPosition()){
			Syn.d("if(newPos == movingItem.getPosition()){");
			return false;
		}
		if(newPos == POS_notEquiped){
			return true;
		}
		if(isUseable(movingItem.getTemplate().getType(), 0) || isTargetable(movingItem.getTemplate().getType())){
			return (newPos >= POS_itemBar1 && newPos <= POS_itemBar14);
		}
		if(newPos >= POS_candyBar1 && newPos <= POS_candyBar8){
			return false;
		}
		if(movingItem.getTemplate().isRessource()){
			return false;
		}
		switch(movingItem.getTemplate().getType()){
			case ITEM_TYPE_AMULETTE:
				return newPos == POS_AMULETTE;
			case ITEM_TYPE_ANNEAU:
				return (newPos == POS_anneauDroite || newPos == POS_anneauGauche);
			case ITEM_TYPE_CEINTURE:
				return newPos == POS_CEINTURE;
			case ITEM_TYPE_BOTTES:
				return newPos == POS_BOTTES;
			case ITEM_TYPE_COIFFE:
				return newPos == POS_COIFFE;
			case ITEM_TYPE_CAPE:
			case ITEM_TYPE_SAC_A_DOS:
				return newPos == POS_CAPE;
			case ITEM_TYPE_BOUCLIER:
				return newPos == POS_BOUCLIER;
			case ITEM_TYPE_FAMILIER:
			case ITEM_TYPE_DRAGODINDE:
				return newPos == POS_FAMILIER;
				
			case ITEM_TYPE_ARC:
			case ITEM_TYPE_BAGUETTE:
			case ITEM_TYPE_BATON:
			case ITEM_TYPE_DAGUES:
			case ITEM_TYPE_EPEE:
			case ITEM_TYPE_MARTEAU:
			case ITEM_TYPE_PELLE:
			case ITEM_TYPE_HACHE:
			case ITEM_TYPE_OUTIL:
			case ITEM_TYPE_PIOCHE:
			case ITEM_TYPE_FAUX:
			case ITEM_TYPE_PIERRE_AME:
			case ITEM_TYPE_FILET_CAPTURE:
			case ITEM_TYPE_ARBALETE:
			case ITEM_TYPE_ARME_MAGIQUE:
				return newPos == POS_ARME;
				
			case ITEM_TYPE_DOFUS:
				return (newPos >= POS_dofus1 && newPos <= POS_dofus6);
			//En fait, on ne peut rien mettre sur la candyBar à partir du client, 
			//c'est l'émulateur seulement qui a le droit de le faire à la suite d'une action
			//	return (newPos >= POS_candyBar1 && newPos <= POS_candyBar8);	
		}
		
		return false;
	}





	/**
	 * Equipable = représentation des items allant dans l'onglet Équipement das l'inventaire.
	 * Tout objet équipable sur le perso (équipements et armes):  anneau, une ceinture, une arme, une fami/dd, un sac/cape....
	 * @param movingItem - L'item en train d'être équipé
	 * @return
	 */
	public static boolean isEquipable(short itemTypeID){
		switch(itemTypeID){
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
				
			case ITEM_TYPE_ARC:
			case ITEM_TYPE_BAGUETTE:
			case ITEM_TYPE_BATON:
			case ITEM_TYPE_DAGUES:
			case ITEM_TYPE_EPEE:
			case ITEM_TYPE_MARTEAU:
			case ITEM_TYPE_PELLE:
			case ITEM_TYPE_HACHE:
			case ITEM_TYPE_OUTIL:
			case ITEM_TYPE_PIOCHE:
			case ITEM_TYPE_FAUX:
			case ITEM_TYPE_PIERRE_AME:
			case ITEM_TYPE_FILET_CAPTURE:
			case ITEM_TYPE_ARBALETE:
			case ITEM_TYPE_ARME_MAGIQUE:
				return true;
			default:
				return false;
		}
	}
	
	
	/** Miscellaneous = représentation des items allant dans l'onglet "Divers" dans l'inventaire: pains, potions, parcho, etc
	 * <p>Vérifie dans un switch à l'aide de tous les types d'items qui sont miscellaneous.
	 * <p>Pareil à la method IItemTemplate.isMiscellaneous*/
	public static boolean isMiscellaneous(short itemTypeID){
		switch(itemTypeID){
			case ITEM_TYPE_POTION:
			case ITEM_TYPE_PARCHO_EXP:
			case ITEM_TYPE_DONS:
			case ITEM_TYPE_BOOST_FOOD://Cursed
			case ITEM_TYPE_PAIN:
			case ITEM_TYPE_BIERE:
			//case ITEM_TYPE_POISSON:
			case ITEM_TYPE_BONBON:
			case ITEM_TYPE_POTION_OUBLIE:
			case ITEM_TYPE_POTION_METIER:
			case ITEM_TYPE_POTION_SORT:
			case ITEM_TYPE_COMESTI_POISSON:
			//case ITEM_TYPE_VIANDE:
			//case ITEM_TYPE_VIANDE_CONSERVEE:
			case ITEM_TYPE_VIANDE_COMESTIBLE:
			case ITEM_TYPE_TEINTURE:
			case ITEM_TYPE_MAITRISE:
			case ITEM_TYPE_FEE_ARTIFICE:
			case ITEM_TYPE_PARCHEMIN_SORT:
			case ITEM_TYPE_PARCHEMIN_CARAC:
			case ITEM_TYPE_CERTIFICAT_CHANIL:
			case ITEM_TYPE_BOISSON:
			case ITEM_TYPE_PIERRE_AME_PLEINE:
			case ITEM_TYPE_POPO_OUBLI_PERCEP:
			case ITEM_TYPE_PARCHO_RECHERCHE:
			case ITEM_TYPE_RUNES_MAGIQUE:
			case ITEM_TYPE_CADEAUX:
			case ITEM_TYPE_OBJET_ELEVAGE:
			case ITEM_TYPE_OBJET_UTILISABLE:
			case ITEM_TYPE_SAC_RESSOURCE:
			case ITEM_TYPE_PRISME:
			case ITEM_TYPE_DOCUMENT:
			case ITEM_TYPE_OEUF_FAMILIER:
			case ITEM_TYPE_OBJET_MISSION:
			case ITEM_TYPE_RP_BUFF:
			//case ITEM_TYPE_QUETES:
			//case ITEM_TYPE_RESSOURCE:
			case ITEM_TYPE_POTION_FAMILIER:
			case ITEM_TYPE_FRAGM_AME_SHUSHU:
				//Syn.d("CItems.isMiscellaneous return True");
				return true;
			default: 
				//Syn.d("CItems.isMiscellaneous return False");
				return false;
		}
	}
	
	/**
	 * Vérifie par le type de l'objet s'il est useable.
	 * <p>Seules exceptions à cette regle : les items 7920 ("Baguette du Tournoi (MJ)") et 8497 ("La recette de la filtounga") 
	 * @param typeID
	 * @param gitemID
	 * @return
	 */
	public static boolean isUseable(short typeID, int gitemID){
		switch(typeID){
			 case ITEM_TYPE_BAGUETTE: //"Baguette du Tournoi (MJ)"
				 //I.u[7920] = {p: 100, u: true, e: [5, 6, 1, 1, 50, 50, false, false], w: 1, fm: true, wd: false, l: 1, g: 8, ep: 1, d: "Cette modeste baguette permet aux Maîtres de Jeu de téléporter des aventuriers dans une zone réservée aux tournois.", t: 3, n: "Baguette du Tournoi (MJ)"};
			 	return gitemID == 7920;	
			 case ITEM_TYPE_QUETES: //"La recette de la filtounga"
				 //I.u[8497] = {p: 10, u: true, w: 0, fm: true, wd: true, l: 1, g: 95, ep: 16, d: "Ce livre renferme les secrets de la filtounga, le plat mythique imaginé par Mouss Bouff.", t: 24, n: "La recette de la filtounga"};
			 	return gitemID == 8497;
			 case ITEM_TYPE_RESSOURCE:
				 //I.u[8514] = {p: 10, u: true, w: 2, fm: true, wd: true, l: 20, g: 492, ep: 3, d: "Surchargée de globules frais en permanence, la cervelle d\'un vampire aspire vers lui toutes les globules rouges disponibles. C\'est ce qui donne  aux vampires un teint pâle. Chez les Iop, ce sont plutôt les pieds qui attirent leur sang, d\'où leur adresse à bondir au lieu de réfléchir...", t: 15, n: "Cervelle de vampire"};
				 return gitemID == 8514;
			 case ITEM_TYPE_BONBON:
			 case ITEM_TYPE_POTION:
			 case ITEM_TYPE_BIERE:
			 case ITEM_TYPE_PAIN:
			 case ITEM_TYPE_PARCHO_EXP:
			 case ITEM_TYPE_PARCHEMIN_CARAC:
			 case ITEM_TYPE_PARCHEMIN_SORT:
			 case ITEM_TYPE_MAITRISE:
			 case ITEM_TYPE_DOCUMENT:
			 case ITEM_TYPE_POTION_OUBLIE:
			 case ITEM_TYPE_OEUF_FAMILIER:
			 case ITEM_TYPE_POTION_METIER:
			 case ITEM_TYPE_POTION_SORT:
			 case ITEM_TYPE_COMESTI_POISSON:
			 case ITEM_TYPE_VIANDE_COMESTIBLE:
				 
			 case ITEM_TYPE_DONS://FIXME: Les itemType de Dons dans les isUseable
			 case ITEM_TYPE_OBJET_MISSION:
			 case ITEM_TYPE_RP_BUFF:
				 
			 case ITEM_TYPE_CADEAUX:
			 case ITEM_TYPE_PIERRE_AME_PLEINE:
			 case ITEM_TYPE_POPO_OUBLI_PERCEP:
			 case ITEM_TYPE_PARCHO_RECHERCHE:
			 case ITEM_TYPE_RUNES_MAGIQUE:
			 case ITEM_TYPE_OBJET_UTILISABLE:
			 case ITEM_TYPE_SAC_RESSOURCE:
			 case ITEM_TYPE_BOISSON:
			 case ITEM_TYPE_POTION_FAMILIER:
			 case ITEM_TYPE_PRISME:
			 case ITEM_TYPE_FRAGM_AME_SHUSHU:
				 return true;
			 default:
				 return false;
		}
	}
	
	public static boolean isTargetable(short typeID){
		switch(typeID){
			 case ITEM_TYPE_BONBON:
			 case ITEM_TYPE_POTION:
			 case ITEM_TYPE_BIERE:
			 case ITEM_TYPE_PAIN:
			 case ITEM_TYPE_DONS:
			 case ITEM_TYPE_COMESTI_POISSON:
			 case ITEM_TYPE_VIANDE_COMESTIBLE:
			 case ITEM_TYPE_OBJET_MISSION:
			 case ITEM_TYPE_FEE_ARTIFICE:
			 case ITEM_TYPE_PARCHO_RECHERCHE:
			 case ITEM_TYPE_OBJET_ELEVAGE:
			 case ITEM_TYPE_BOISSON:
			 case ITEM_TYPE_OBJET_UTILISABLE:
				 return true;
			 default:
				 return false;
		}
	}
	
	public static boolean isUseableAndTargetable(short typeID){
		switch(typeID){
			 case ITEM_TYPE_BONBON:
			 case ITEM_TYPE_POTION:
			 case ITEM_TYPE_BIERE:
			 case ITEM_TYPE_PAIN:
			 case ITEM_TYPE_COMESTI_POISSON:
			 case ITEM_TYPE_VIANDE_COMESTIBLE:
			 case ITEM_TYPE_PARCHO_RECHERCHE:
			 case ITEM_TYPE_DONS:
			 case ITEM_TYPE_BOISSON:
			 case ITEM_TYPE_OBJET_UTILISABLE:
				 return true;
			 default:
				 return false;
		}
	}
	
	/**Si c'est un objet vivant
	 * <p>Pareil à la method IItemTemplate.isLiving*/
	public static boolean isLiving(GItem item){
		return (item.getTemplate().getType() == ITEM_TYPE_OBJET_VIVANT);
	}
	
	
	public static String getZoneType(GItem item){
		switch(item.getTemplate().getType()){
			 case ITEM_TYPE_ARC:
			 case ITEM_TYPE_BAGUETTE:
			 case ITEM_TYPE_DAGUES:
			 case ITEM_TYPE_EPEE:
			 case ITEM_TYPE_PELLE:
			 case ITEM_TYPE_HACHE:
			 case ITEM_TYPE_OUTIL:
			 case ITEM_TYPE_PIOCHE:
			 case ITEM_TYPE_FAUX:
			 case ITEM_TYPE_ARME_MAGIQUE:
				 return "Pa";
			 case ITEM_TYPE_BATON:
				 return "Tb";
			 case ITEM_TYPE_ARBALETE:
				 return "Lc";
			 case ITEM_TYPE_MARTEAU:
				 return "Xb";
			 default:
				 return "";
		}
	}
	public static CharacteristicType getWeaponMaitriseType(GItem item){
		if(item == null){
			return null;
		}
		switch(item.getTemplate().getType()){
			 case ITEM_TYPE_ARC:
				 return CharacteristicType.XP_MAITRISE_ARC;
			 case ITEM_TYPE_BAGUETTE:
				 return CharacteristicType.XP_MAITRISE_BAGUETTE;
			 case ITEM_TYPE_DAGUES:
				 return CharacteristicType.XP_MAITRISE_DAGUES;
			 case ITEM_TYPE_EPEE:
				 return CharacteristicType.XP_MAITRISE_EPEE;
			 case ITEM_TYPE_PELLE:
				 return CharacteristicType.XP_MAITRISE_PELLE;
			 case ITEM_TYPE_HACHE:
				 return CharacteristicType.XP_MAITRISE_HACHE; 
			 case ITEM_TYPE_BATON:
				 return CharacteristicType.XP_MAITRISE_BATON;
			 case ITEM_TYPE_MARTEAU:
				 return CharacteristicType.XP_MAITRISE_MARTEAU;
				 
			//pas de maitrise associée pour ceux-là :
			//case ITEM_TYPE_OUTIL:  return CharacteristicType.XP_MAITRISE_OUTIL;
			//case ITEM_TYPE_PIOCHE:  return CharacteristicType.XP_MAITRISE_PIOCHE;
			//case ITEM_TYPE_FAUX:  return CharacteristicType.XP_MAITRISE_FAUX;
			//case ITEM_TYPE_ARME_MAGIQUE:
			//case ITEM_TYPE_ARBALETE:  return CharacteristicType.XP_MAITRISE_ARBALETE;
			 default:
				 return null;
		}
	}
	
	
	
}
