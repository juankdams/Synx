package Enums;

public enum FightState {

	//UNKNOWN,
    INIT,
    PLACE,
    ACTIVE,
    FINISHED;

    
    public static FightState getFightState(int id) {
        return FightState.values()[id];
    }
    public byte get(){
    	return (byte) (this.ordinal() + 1);
    }
	
}
