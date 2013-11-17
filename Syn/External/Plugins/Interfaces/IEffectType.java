package Plugins.Interfaces;

import Enums.CharacteristicType;

public interface IEffectType {

	
	public short getID();
	public String name();
	public CharacteristicType getCharacType();
	public char getOperator();
	public boolean isPositive();
	public boolean isNegative();
	public boolean hasDice();
	public IEffectType getOppositeEffect();
	/** return (this == STEAL_X_PDV_NEUTRAL || this == DAMAGE_X_NEUTRAL) */
	public boolean isNeutralAttack();
	
	//public boolean isDamageEffectType();
	
}
