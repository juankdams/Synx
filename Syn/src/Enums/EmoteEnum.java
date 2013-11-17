package Enums;

import Core.Exceptions;

public enum EmoteEnum {

	/**Se lever debout après avoir été assis/allongé/coucher*/
	STAND_UP(0),
	/**S'asseoir*/
	SIT(1),
	/**Faire un signe de la main*/
	BYE(2),
	/**Applaudir*/
	APPLAUDE(3),
	/**Se mettre en colere*/
	MAD(4),
	/**Avoir peur; se cacher*/
	FEAR(5),
	/**Montrer son arme*/
	WEAPON(6),
	/**Jouer de la flûte*/
	PIPO(7),
	/**Peter*/
	GAZ(8),
	/**Se prosterner; se pencher pour saluer*/
	HI(9),
	/**Faire un bisou (Envoyer un coeur)*/
	KISS(10),
	/**Jeu Pierre-Feuille-Ciseaux*/
	ROCK(11),
	/**Jeu Pierre-Feuille-Ciseaux*/
	LEAF(12),
	/**Jeu Pierre-Feuille-Ciseaux*/
	SCISSORS(13),
	/**Croiser les bras*/
	ARMCROSS(14),
	/**Pointer du doigt*/
	POINT(15),
	/**Faire passer un corbeau..*/
	CROW(16),
	/**Manger du pain*/
	EAT_BREAD(17),
	/**Boire de la bière*/
	DRINK_BEER(18),
	/**S'allonger/coucher*/
	REST(19),
	/**S'asseoir sur une chaise*/
	SIT_CHAIR(20),
	/**Lever le trophé de champion*/
	CHAMPION(21),
	/**Faire l'aura de base. Niveau 100 ou 200*/
	AURA(22),
	/**Faire l'aura de vampire (bat)*/
	AURA_VAMPIRE(23);
	
	
	
	private byte value = 0;
	EmoteEnum(int val){
		value = (byte)val;
	}
	public byte getValue(){
		return value;
	}
	public static EmoteEnum getEmote(int value){
		for(EmoteEnum EE : EmoteEnum.values()){
			if(EE.value == value){
				return EE;
			}
		}
		Exceptions.throwNullPointerException("EmoteEnum.getEmote(int) : EmoteEnum non trouvée : id d'emote demandé invalide.");
		return null;
	}
	
}
