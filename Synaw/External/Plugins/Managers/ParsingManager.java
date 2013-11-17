package Plugins.Managers;

import io.netty.buffer.ByteBuf;
import Game.WakfuGameClient;
import Login.WakfuLoginClient;

/**
 * Juste un modèle de ParsingManager pour montrer que cette method parse(wakfu)
 * est disponible pour Synaw.
 * Sans ça, Synaw se réfèrait au ParsingManager de Syn qui lui contient des référence à Synod
 * donc y'aurait fallu import Synod dans Synaw et vice-versa sans ce modèle.
 */
public class ParsingManager {
	public boolean parse(WakfuGameClient c, ByteBuf packet){
		return false;
	}
	public boolean parse(WakfuLoginClient c, ByteBuf packet){
		return false;
	}
}
