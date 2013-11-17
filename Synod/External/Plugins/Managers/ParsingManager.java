package Plugins.Managers;

import Game.DofusGameClient;

/**
 * Juste un modèle de ParsingManager pour montrer que cette method parse(dofus)
 * est disponible pour Synod.
 * Sans ça, Synod se réfèrait au ParsingManager de Syn qui lui contient des référence à Synaw
 * donc y'aurait fallu import Synaw dans Synod et vice-versa sans ce modèle.
 */
public class ParsingManager {
	public boolean parse(DofusGameClient c, String packet){
		return false;
	}
}
