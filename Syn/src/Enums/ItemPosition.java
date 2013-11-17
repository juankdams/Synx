package Enums;

import Core.Exceptions;

public enum ItemPosition {

	
	POS_notEquiped(-1),
	POS_amulette(0),
	POS_arme(1),
	POS_anneauGauche(2),
	POS_ceinture(3),
	POS_anneauDroite(4),
	POS_bottes(5),
	POS_coiffe(6),
	POS_cape(7),
	POS_pet(8),
	POS_dofus1(9),
	POS_dofus2(10),
	POS_dofus3(11),
	POS_dofus4(12),
	POS_dofus5(13),
	POS_dofus6(14),
	POS_BOUCLIER(15),
	POS_mount(16),
	
	POS_candyBar1(20),
	POS_candyBar2(21),
	POS_candyBar3(22),
	POS_candyBar4(23),
	POS_candyBar5(24),
	POS_candyBar6(25),
	POS_candyBar7(26),
	POS_candyBar8(27),
	
	POS_itemBar1(35),
	POS_itemBar2(36),
	POS_itemBar3(37),
	POS_itemBar4(38),
	POS_itemBar5(39),
	POS_itemBar6(40),
	POS_itemBar7(41),
	POS_itemBar8(42),
	POS_itemBar9(43),
	POS_itemBar10(44),
	POS_itemBar11(45),
	POS_itemBar12(46),
	POS_itemBar13(47),
	POS_itemBar14(48);
	//TODO : CItems.position des Bonbons, envoutements(?)...
	

	private byte value;
	private ItemPosition(int value) {
		this.value = (byte)value;
	}
	public byte get() {
		return value;
	}
	
	public static ItemPosition getItemPosition(byte position){
		for(ItemPosition ce : ItemPosition.values()){
			if(ce.value == position){
				return ce;
			}
		}
		Exceptions.throwNullPointerException("ItemPosition.getItemPosition(byte) : ItemPosition non trouvée : ItemPosition demandé: ("+position+") invalide.");
		return null;
	}
}
