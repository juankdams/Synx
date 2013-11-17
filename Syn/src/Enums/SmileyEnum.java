package Enums;

import Core.Exceptions;

public enum SmileyEnum{


	
	/**Bonhomme sourire :)*/
	HAPPY(1),
	/**Bonhomme baboune :(*/
	SAD(2),
	/**Bonhomme qui a mal*/
	HURT(3),
	/**Bonhomme qui sort la langue :P*/
	TONGUE(4),
	/**Bonhomme ninja/medecine*/
	NINJA(5),
	/**Bonhomme \o/ :hehe: */
	HEHE(6),
	/**Bonhomme  'Oh no! D:' 'Please, PITY, dont kill me D:'*/
	PITY(7),
	/**Shit -.- ( ou ' >.< ' )*/
	SHIT(8),
	/**Bonhomme mort. Tete de mort*/
	SKULL(9),
	/**Bonhomme surpris :O*/
	SURPRISE(10),
	/**Bonhomme yeux en coeurs (L)*/
	LOVE(11),
	/**Bonhomme qui pleure :'(*/
	CRY(12),
	/**Bonhomme décu/concentré/-.- */
	DISAPOINT(13),
	/**Bonhomme X_X XD lol*/
	LOL(14),
	/**Bonhomme :D fier hehe */
	PROUD(15);

	
	
	private int value = 0;
	SmileyEnum(int val){
		value = val;
	}
	public int getValue(){
		return value;
	}
	public static SmileyEnum getSmiley(int value){
		for(SmileyEnum SE : SmileyEnum.values()){
			if(SE.value == value){
				return SE;
			}
		}
		Exceptions.throwNullPointerException("SmileyEnum.getSmiley(int) : SmileyEnum non trouvée : id de smiley demandé invalide.");
		return null;
	}
	
}
