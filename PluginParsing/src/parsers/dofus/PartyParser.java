package parsers.dofus;

import Game.DofusGameClient;
import Plugins.Abstractions.AbstractPacketParser;

public class PartyParser extends AbstractPacketParser<DofusGameClient, String> {

	@Override
	public boolean parse(DofusGameClient c, String packet) {
		return false;
	}
}
