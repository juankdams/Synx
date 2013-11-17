package Enums;

import java.util.HashMap;

import Interfaces.IEffectType;


public enum ItemEffectType implements IEffectType{
	

	REGIVEN_PDVS_X(81,0),

	STEAL_X_PDV_WATER(91),
	STEAL_X_PDV_EARTH(92),
	STEAL_X_PDV_AIR(93),
	STEAL_X_PDV_FIRE(94),
	STEAL_X_PDV_NEUTRAL(95),
	
	DAMAGE_X_WATER(96),
	DAMAGE_X_EARTH(97),
	DAMAGE_X_AIR(98),
	DAMAGE_X_FIRE(99),
	DAMAGE_X_NEUTRAL(100),
	
	PA_LOST_ON_TARGET(101, 1, '/'),
	//Ya pas de 102,103,104 :P
	REGIVEN_PDVS_XX(108,0),//TODO: revoir la définition de REGIVEN_PDVS_XX et REGIVEN_PDVS_X (Enums.EffectType)
	PLUS_X_LIFE(110,0,'+'),
	PLUS_X_PA(111,1,'+'),
	PLUS_X_DAMAGE(112,16,'+'),
	//pas de 113 ici
	PLUS_X_CRITICAL_HITS(115,18,'+'),
	//pas de 114 ici
	MINUS_X_RANGE(116,19,'-'),
	PLUS_X_RANGE(117,19,'+'),
	PLUS_X_FORCE(118,10,'+'),
	PLUS_X_AGILITE(119,14,'+'),
	ADDPLUS_X_PA(120,'+'),
	ADD_X_DAMAGES(121,16,'+'),
	ADD_X_CRITICAL_FAILS(122,39,'-'),
	ADD_X_CHANCE(123,13,'+'),
	ADD_X_SAGESSE(124,12,'+'),
	ADD_X_VITALITE(125,11,'+'),
	ADD_X_INTELLIGENCE(126,15,'+'),
	
	PM_LOST_X(127,23,'-'),
	PLUS_X_PM(128,23,'+'),
	STEAL_X_KAMAS(130,-1),

	AUGMENTS_DAMAGE_XPERCENT(138,17,'+'),
	REGIVE_X_ENERGY(139,29,'+'),
	MINUS_DAMAGES(145,16),			//E[145] = {d: "-#1{~1~2 à }#2 aux dommages", c: 16, o: "-", j: true};
	CHANGE_LYRICS(146,38),			//E[146] = {d: "Change les paroles", c: 38, o: ""};
	//c
	MINUS_X_CHANCE(152,13,'-'),
	MINUS_X_VITALITY(153,11,'-'),
	MINUS_X_AGILITY(154,14,'-'),
	MINUS_X_INTELLIGENCE(155,15,'-'),
	MINUS_X_SAGESSE(156,12,'-'),
	MINUS_X_FORCE(157,10,'-'),
	AUGMENTS_PODS_X(158,'+'),
	REDUCE_PODS_X(159,'-'),

	PLUS_X_INITIATIVE(174,44,'+'),
	MINUS_X_INITIATIVE(175,44,'-'),
	PLUS_X_PROSPECTION(176,48,'+'),
	MINUS_X_PROSPECTION(177,48,'-'),
	PLUS_X_SOIN(178,49,'+'),
	MINUS_X_SOIN(179,49,'-'),
	
	RESISTANCE_XPERCENT_EARTH(210,33,'+'),
	RESISTANCE_XPERCENT_WATER(211,35,'+'),
	RESISTANCE_XPERCENT_AIR(212,36,'+'),
	RESISTANCE_XPERCENT_FIRE(213,34,'+'),
	RESISTANCE_XPERCENT_NEUTRAL(214,37,'+'),
	
	FAIBLESSE_XPERCENT_EARTH(215,33,'-'),
	FAIBLESSE_XPERCENT_WATER(216,35,'-'),
	FAIBLESSE_XPERCENT_AIR(217,36,'-'),
	FAIBLESSE_XPERCENT_FIRE(218,34,'-'),
	FAIBLESSE_XPERCENT_NEUTRAL(219,37,'-'),
	//E[220] = {d: "Renvoie #1 dommages", c: 50, o: "+"};
	
	
	/*
	 
	E[513] = {d: "Pose un prisme", c: 0, o: ""};
	E[600] = {d: "Téléporte au point de sauvegarde", c: 0, o: ""};
	E[601] = {d: "null", c: 0, o: "+"};
	E[602] = {d: "Enregistre sa position", c: 0, o: ""};
	E[603] = {d: "Apprend le métier #3", c: 0, o: ""};
	E[604] = {d: "Apprend le sort #3", c: 0, o: ""};
	E[605] = {d: "+#1{~1~2 à }#2 points d\' XP", c: 0, o: "+", j: true};  //Parchemins
	E[606] = {d: "+#1{~1~2 à }#2 en sagesse", c: 12, o: "+", j: true}; //Parchemins
	E[607] = {d: "+#1{~1~2 à }#2 en force", c: 10, o: "+", j: true}; //Parchemins
	E[608] = {d: "+#1{~1~2 à }#2 en chance", c: 13, o: "+", j: true}; //Parchemins
	E[609] = {d: "+#1{~1~2 à }#2 en agilité ", c: 14, o: "+", j: true}; //Parchemins
	E[610] = {d: "+#1{~1~2 à }#2 en vitalité ", c: 11, o: "+", j: true}; //Parchemins
	E[611] = {d: "+#1{~1~2 à }#2 en intelligence", c: 15, o: "+", j: true}; //Parchemins
	E[612] = {d: "+#1{~1~2 à }#2 points de caractéristique", c: 0, o: "+", j: true}; //Parchemins
	E[613] = {d: "+#1{~1~2 à }#2 points de sort", c: 0, o: "+", j: true}; //Parchemins
	 */

	/**(Armes Éthérées)*/
	DURABILITY(812),//  E[812] = {d: "Résistance : #2 / #3", c: 0, o: ""};
	
	;
	
	
	
	private static HashMap<Short, IEffectType> effects = new HashMap<Short, IEffectType>();
	
	static{
		for(IEffectType et : values()){
			effects.put(et.getID(), et);
		}
	}
	
	
	
	private short ID = 0;
	private CharacteristicType CT = null;
	private char operator = ' ';
	
	private ItemEffectType(int id, int characteristicTypeID, char operateur){
		ID = (short)id;
		CT = CharacteristicType.getCharacteristique((byte)characteristicTypeID);
		operator = operateur;
	}
	private ItemEffectType(int id, int characteristicTypeID){
		ID = (short)id;
		CT = CharacteristicType.getCharacteristique((byte)characteristicTypeID);
	}
	private ItemEffectType(int id, char operateur){
		ID = (short)id;
		operator = operateur;
	}
	private ItemEffectType(int id){
		ID = (short)id;
	}
	

	@Override
	public short getID(){
		return this.ID;
	}
	@Override
	public CharacteristicType getCharacType(){
		return this.CT;
	}
	@Override
	public char getOperator(){
		return this.operator;
	}
	public static IEffectType getEffect(short ID){
		return effects.get(ID);
	}
	public static IEffectType getEffectByHexStringID(String hexID) {
		try{
			return effects.get(Short.parseShort(hexID, 16));
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public boolean isPositive() {
		return (operator == '+');
	}
	@Override
	public boolean isNegative() {
		return (operator == '-');
	}
	
}
