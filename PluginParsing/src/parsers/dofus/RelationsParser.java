package parsers.dofus;

import Game.DofusGameClient;
import Plugins.Abstractions.AbstractPacketParser;

public class RelationsParser extends AbstractPacketParser<DofusGameClient, String> {

	@Override
	public boolean parse(DofusGameClient c, String s){
		switch(s.charAt(1)){
			case 'L'://onList
				break;
			case 'A'://onAdd
				break;
			case 'R'://TODO RelationsParser.onRemove (Pas vérifé que ce packet existait vraiment, juste guessé)
				break;
			case 'O'://onConnexionWarn
				break;
		}
		return true;
	}
	
	public void parseOnFriendsList(){//recv: FL
		//p.getAccount.getFriends toString
	}
	
	public void parseOnEnnemiesList(){ //recv: iL
		//p.getAccount.getEnnemies toString	
	}
	
	public void parseOnAddFriend(){//recv  FA%nomDuPerso
		//if(nomPerso.length > maxCharacterCreationNameLength) -> nom trop long
		//if(nomPerso == thisPerso.getName) -> egocentric error
		//if(World.getPersoByName(nomPerso) == null) -> soit pas connecté, soit il existe pas
		//if(thisPerso.getAccount.getFriendsList.contains(nomPers)) -> déjà dans tes amis !
		//
	}
	
	public void parseOnAddEnnemy(){//recv  iA%nomDuPerso
		//if(nomPerso.length > maxCharacterCreationNameLength) -> nom trop long
		//if(nomPerso == thisPerso.getName) -> egocentric error
		//if(World.getPersoByName(nomPerso) == null) -> soit pas connecté, soit il existe pas
		//if(thisPerso.getAccount.getFriendsList.contains(nomPers)) -> déjà dans tes amis !
		//
	}
	
	public void parseOnConnexionWarn(){//recv:  FO+
		//if(charat == '+')  -> averti moi quand mes amis se connectent
		//if(charat == '-')  -> arrete de m'avertir quand mes amis se connectent
	}
	
	//public void parseOnIgnoredList(){  n'a pas..ca doietre le client qui gere toute ca
	//}
	
}
