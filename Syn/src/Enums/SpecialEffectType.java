package Enums;

import java.util.HashMap;

import Interfaces.IEffectType;

public enum SpecialEffectType implements IEffectType{
	
	CHANGE_LYRICS(146,38),			//E[146] = {d: "Change les paroles", c: 38, o: ""};
	
	
	EXCHANGEABLE_FROM_DATE_X(983,0,'/'),
	
	MODIFIED_BY_X(985,0,'/'),
	
	BELONGS_TO_X(987,0,'/'),
	MADE_BY_X(988,0,'/'),
	RESEARCH_X(989,0,'/')
	
	
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
	
	private SpecialEffectType(int id, int characteristicTypeID, char operateur){
		ID = (short)id;
		CT = CharacteristicType.getCharacteristique((byte)characteristicTypeID);
		operator = operateur;
	}
	private SpecialEffectType(int id, int characteristicTypeID){
		ID = (short)id;
		CT = CharacteristicType.getCharacteristique((byte)characteristicTypeID);
	}
	private SpecialEffectType(int id, char operateur){
		ID = (short)id;
		operator = operateur;
	}
	private SpecialEffectType(int id){
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
		/*for(EffectType et : values()){
			if(et.ID == ID){
				return et;
			}
		}
		Exceptions.throwNullPointerException("");
		return null;*/
	}
	public static IEffectType getEffectByHexStringID(String hexID) {
		try{
			return effects.get(Short.parseShort(hexID, 16));
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		/*for(EffectType et : values()){
			if(Integer.toHexString(et.ID).equals(hexID)){
				return et;
			}
		}
		return null;*/
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
