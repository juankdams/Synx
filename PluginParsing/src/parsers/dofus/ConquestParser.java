package parsers.dofus;

import Game.DofusGameClient;
import Plugins.Abstractions.AbstractPacketParser;

public class ConquestParser extends AbstractPacketParser<DofusGameClient, String> {

	@Override
	public boolean parse(DofusGameClient c, String packet){
		switch(packet.charAt(1)){
			case 'b':
				return true;
			case 'B':
				return true;
		}
		return false;
	}

	
}
