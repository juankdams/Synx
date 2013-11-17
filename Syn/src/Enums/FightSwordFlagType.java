package Enums;

import Abstractions.CombativeCharacter;
import GameObjects.GPersonnage;
import GameObjects.GTaxCollector;

public enum FightSwordFlagType {
	
	NORMAL_ALIGNED(0),
	MONSTER_ALIGNED(1),
	NORMAL(2),//XXX à quoi sert le NORMAL en fait ??? pcq meme en pvm faut mettre NORMAL_ALIGNED sinon on peut pas rejoindre le combat ....
	TAX_COLLECTOR(3),

	//numéros des fichiers swf de chaque types d'épées :°
	SWF_NORMAL(0),
	SWF_ANGEL(1),
	SWF_DEMON(2),
	SWF_MONSTER(3),
	SWF_TAX_COLLECTOR(4),
	SWF_TAX_COLLECTOR_ATTACKERS(5)
	;
	
	
	private byte ID = 0;
	private FightSwordFlagType(int id){
		this.ID = (byte)id;
	}
	public byte get(){
		return this.ID;
	}
	
	/**
	 * Le vrai get qui fit avec la method de parsing du client (même si c'est vraiment con leur affaire)
	 * @return
	 */
	public static FightSwordFlagType get(CombativeCharacter fightStarter, FightType f){
		if(fightStarter instanceof GTaxCollector){
			return TAX_COLLECTOR;
		}
		if(fightStarter instanceof GPersonnage){
			if(f == FightType.PVM || f == FightType.Challenge){
				return NORMAL_ALIGNED;//return NORMAL; wtf is NORMAL ??
			}
			//if(fightStarter.getAlignementSpecialization() != AlignementSpecializationType.NEUTRAL.get()){
				return NORMAL_ALIGNED;
			//}
		}else
		{
			//if(fightStarter.getAlignementSpecialization() != AlignementSpecializationType.NEUTRAL.get()){
				return MONSTER_ALIGNED;
			//}
		}
	}
	
	@Deprecated 
	/** useless, that was my first test at programming this method. <br>
	 * the problem is it returns the swf file ID instead of the actual type ID that the dofus client wants.
	 * */
	public static FightSwordFlagType getSwf(CombativeCharacter fightStarter, FightType f){
		if(f == FightType.PVT){
			if(fightStarter instanceof GTaxCollector){
				//Si c'est le percepteur lui-même, c'est pcq la team est celle défendrice donc:
				return SWF_TAX_COLLECTOR;
			}else{
				//sinon c'est pcq c'est les attaquants donc :
				return SWF_TAX_COLLECTOR_ATTACKERS;
			}
		}
		//if(f == FightType.PVP || f == FightType.PVMA){
			if(fightStarter.getAlignementSpecialization() == AlignementSpecializationType.ANGEL.get()){
				return SWF_ANGEL;
			}
			if(fightStarter.getAlignementSpecialization() == AlignementSpecializationType.DEMON.get()){
				return SWF_DEMON;
			}
		//}
		if(f == FightType.PVM){
			if(fightStarter instanceof GPersonnage){
				//si c'est un perso, bah garde une épée normale.
				return SWF_NORMAL;
			}else{
				//sinon met une épée de monstre. J'rappelle qu'on a du MVM donc un pnj, un monstre, etc
				//   pourrait aggresser et combattre d'autres monstres, pnj etc. et tout ça va return MONSTER;
				return SWF_MONSTER;
			}
		}
		return null;
	}
	
	
	
	/*
	 		 switch (nType)
	        {
	            case 0:
	            {
	                if (nAlignment == 1)
	                {
	                    var _loc4 = dofus.Constants.CHALLENGE_CLIP_FILE_ANGEL;  1
	                }
	                else if (nAlignment == 2)
	                {
	                    _loc4 = dofus.Constants.CHALLENGE_CLIP_FILE_DEMON;		2
	                }
	                else
	                {
	                    _loc4 = dofus.Constants.CHALLENGE_CLIP_FILE_NORMAL;		0
	                } // end else if
	                break;
	            } 
	            case 1:
	            {
	                if (nAlignment == 1)
	                {
	                    _loc4 = dofus.Constants.CHALLENGE_CLIP_FILE_ANGEL;		1
	                }
	                else if (nAlignment == 2)
	                {
	                    _loc4 = dofus.Constants.CHALLENGE_CLIP_FILE_DEMON;		2
	                }
	                else
	                {
	                    _loc4 = dofus.Constants.CHALLENGE_CLIP_FILE_MONSTER;	3
	                } // end else if
	                break;
	            } 
	            case 2:
	            {
	                _loc4 = dofus.Constants.CHALLENGE_CLIP_FILE_NORMAL;			0
	                break;
	            } 
	            case 3:
	            {
	                _loc4 = dofus.Constants.CHALLENGE_CLIP_FILE_TAXCOLLECTOR;	4
	                break;
	            } 
	        } // End of switch
	        return (_loc4);
	        
	        
	 //-------------------------------------------------------------------------------------------    
	        
	(_global.dofus.Constants = function ()
    {
        super();
    }).CHALLENGE_CLIP_FILE_NORMAL = dofus.Constants.CLIPS_PERSOS_PATH + "0.swf";
    (_global.dofus.Constants = function ()
    {
        super();
    }).CHALLENGE_CLIP_FILE_ANGEL = dofus.Constants.CLIPS_PERSOS_PATH + "1.swf";
    (_global.dofus.Constants = function ()
    {
        super();
    }).CHALLENGE_CLIP_FILE_DEMON = dofus.Constants.CLIPS_PERSOS_PATH + "2.swf";
    (_global.dofus.Constants = function ()
    {
        super();
    }).CHALLENGE_CLIP_FILE_MONSTER = dofus.Constants.CLIPS_PERSOS_PATH + "3.swf";
    (_global.dofus.Constants = function ()
    {
        super();
    }).CHALLENGE_CLIP_FILE_TAXCOLLECTOR = dofus.Constants.CLIPS_PERSOS_PATH + "4.swf";
    (_global.dofus.Constants = function ()
    {
        super();
    }).CHALLENGE_CLIP_FILE_TAXCOLLECTOR_ATTACKERS = dofus.Constants.CLIPS_PERSOS_PATH + "5.swf";
	 */


}
