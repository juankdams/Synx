package Enums;

public enum FightTeamType {
	
	NORMAL_ALIGNMENT(0),
	MONSTER(1),
	NORMAL(2),
	TAX_COLLECTOR(3),
	;

	private byte value = 0;
	private FightTeamType(int value){
		this.value = (byte)value;
	}
	public byte get(){
		return value;
	}
	public static byte get(CharacterType ct){
		switch(ct){
		case PLAYER:
			return NORMAL_ALIGNMENT.get();
		case MONSTER:
			return MONSTER.get();
		case TAX_COLLECTOR:
			return TAX_COLLECTOR.get();
			
		}
		return NORMAL.get();
	}
	/*
	(_global.dofus.Constants = function ()
    {
        super();
    }).getTeamFileFromType = function (nType, nAlignment)
    {
        switch (nType)
        {
            case 0:
            {
                if (nAlignment == 1)
                {
                    var _loc4 = dofus.Constants.CHALLENGE_CLIP_FILE_ANGEL;
                }
                else if (nAlignment == 2)
                {
                    _loc4 = dofus.Constants.CHALLENGE_CLIP_FILE_DEMON;
                }
                else
                {
                    _loc4 = dofus.Constants.CHALLENGE_CLIP_FILE_NORMAL;
                } // end else if
                break;
            } 
            case 1:
            {
                if (nAlignment == 1)
                {
                    _loc4 = dofus.Constants.CHALLENGE_CLIP_FILE_ANGEL;
                }
                else if (nAlignment == 2)
                {
                    _loc4 = dofus.Constants.CHALLENGE_CLIP_FILE_DEMON;
                }
                else
                {
                    _loc4 = dofus.Constants.CHALLENGE_CLIP_FILE_MONSTER;
                } // end else if
                break;
            } 
            case 2:
            {
                _loc4 = dofus.Constants.CHALLENGE_CLIP_FILE_NORMAL;
                break;
            } 
            case 3:
            {
                _loc4 = dofus.Constants.CHALLENGE_CLIP_FILE_TAXCOLLECTOR;
                break;
            } 
        } // End of switch
        return (_loc4);
    };
	 */
	
}
