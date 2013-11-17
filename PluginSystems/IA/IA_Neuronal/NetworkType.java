package IA;

public enum NetworkType {

	Agressive,
	
	;
	
	
	public static NetworkType getType(byte ordinal){
		return NetworkType.values()[ordinal];
	}
	
	
}
