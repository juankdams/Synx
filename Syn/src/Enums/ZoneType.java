package Enums;

import Core.Exceptions;

public enum ZoneType {

	CIRCLE('C'),
	LINE('L'),
	CROSS('X'),
	POINT('P')
	//TODO Enums.ZoneType : UNKNOWN('T')
	;
	
	char zone = ' ';
	private ZoneType(char c){
		zone = c;
	}
	public char get(){
		return zone;
	}
	public static ZoneType valueOf(char zone){
		for(ZoneType zt : values()){
			if(zt.get() == zone){
				return zt;
			}
		}
		Exceptions.throwNullPointerException("ZoneType introuvable avec le zone delimiterChar = ("+(zone)+")");
		return null;
	}
	
}
