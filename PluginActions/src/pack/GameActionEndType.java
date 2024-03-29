package pack;

public enum GameActionEndType {
	
	SPELL(0),
	MOVEMENT(2);
	
	private byte value = 0;
	private GameActionEndType(int val){
		this.value = (byte) val;
	}
	public byte get(){
		return value;
	}
	public static GameActionEndType get(byte arg0) {
		for(GameActionEndType action : values()){
			if(action.get() == arg0){
				return action;
			}
		}
		return null;
	}
	

}
