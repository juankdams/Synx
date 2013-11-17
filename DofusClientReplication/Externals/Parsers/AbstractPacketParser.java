package Parsers;

import Game.GClient;
import Login.LClient;

public abstract class AbstractPacketParser {

	
	public boolean parse(GClient c, String packet){
		return false;
	}
	public boolean parse(LClient c, String packet){
		return false;
	}
	
	
}
