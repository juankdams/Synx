package Enums;

public enum CellType {

	WALKABLE(0),
	LINE_OF_SIGHT(1),
	//INTERACTIVE_OBJECT(2),//par sur vrm xd
	//DOOR ?
	//CHEMIN ?
	//
	
	;
	
	private byte type = 0;
	private CellType(int i){
		this.setType((byte)i);
	}
	public void setType(byte type) {
		this.type = type;
	}
	public byte get() {
		return type;
	}
	
	
}
