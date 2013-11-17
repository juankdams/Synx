package Enums;

import static Constants.Constants.EIGHT_MIN_BYTE;
import static Constants.Constants.FIVE_MIN_BYTE;
import static Constants.Constants.FOUR_MIN_BYTE;
import static Constants.Constants.NINE_MIN_BYTE;
import static Constants.Constants.ONE_BYTE;
import static Constants.Constants.ONE_MIN_BYTE;
import static Constants.Constants.SEVEN_MIN_BYTE;
import static Constants.Constants.SIX_MIN_BYTE;
import static Constants.Constants.TEN_MIN_BYTE;
import static Constants.Constants.THREE_MIN_BYTE;
import static Constants.Constants.TWO_MIN_BYTE;
import Constants.CPerso;
import Core.Exceptions;
import Interfaces.Injectable;


public enum CharacterType implements Injectable{

	
	CREATURE(  			ONE_MIN_BYTE),//-1
	MONSTER(   			TWO_MIN_BYTE),//-2
	MONSTER_GROUP(		THREE_MIN_BYTE),//-3
	NPC(				FOUR_MIN_BYTE),//-4
	OFFLINE_CHARACTER(	FIVE_MIN_BYTE),//-5
	TAX_COLLECTOR(		SIX_MIN_BYTE),//-6
	MUTANT(				SEVEN_MIN_BYTE),//-7
	MUTANT2(			EIGHT_MIN_BYTE),//-8
	PARKED_MOUNT(		NINE_MIN_BYTE),//-9
	PRISM(				TEN_MIN_BYTE),//-10
	/**PLAYER = default.
	   <p>Faut que ca soit l'ID de la classe du perso quand on l'envoie dans le GM packet.
	   <p>Retourner 1 (Sa valeur dans l'enum) serait donc invalide, une erreur.*/
	PLAYER(ONE_BYTE);//ClassID: 1 à 12 (ou à 13,14,15etc si on en rajoute) 
	

	private static final CharacterType staticInstance = CharacterType.values()[0];
	
	private byte type = 0;
	private CharacterType(byte val){
		type = val;
	}
	public byte getType(){
		return type;
	}
	@Override
	public void set(Object o) {
		this.type = (Byte)o;
	}
	
	public static CharacterType getCharacterType(byte id){
		if(CPerso.classesIDs.contains("")){
			return PLAYER;
		}
		for(CharacterType EE : CharacterType.values()){
			if(EE.type == id){
				return EE;
			}
		}
		Exceptions.throwNullPointerException("CharacterType.getCharacter(byte) : CharacterType non trouvé : id de type de sprite demandé invalide.");
		return null;
	}
	
	@Override
	public void set(int ordinal, Object o) {
		values()[ordinal].set(o);
	}
	@Override
	public void set(String name, Object o) {
		valueOf(name).set(o);
	}
	public static Injectable getInstance(){
		return staticInstance;
	}
	
	
}
