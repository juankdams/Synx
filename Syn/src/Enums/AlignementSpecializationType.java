package Enums;

public enum AlignementSpecializationType {
	
	//0=neutre, 1=bonta, 2=brakmar, 3=mercenaire.
	
	
	NEUTRAL(0),
	ANGEL(1),
	DEMON(2),
	MERCENARY(3);
	
	
	private byte value = -1;
	private AlignementSpecializationType(int value){
		this.value = (byte) value;
	}
	public byte get(){
		return value;
	}
	

}
