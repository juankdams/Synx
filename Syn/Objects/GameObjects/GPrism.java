package GameObjects;

import static Constants.Constants.prefixGM;
import Abstractions.AbstractCharacter;
import ConfigurationObjects.Classe;
import Enums.CharacterType;
import GlobalObjects.Map;
import Plugins.Managers.PluginsManager;

public class GPrism extends AbstractCharacter{

	@Override
	public CharacterType getCharacterType() {
		return CharacterType.PRISM;
	}

	@Override
	public String getSpritePacket(PluginsManager pm, String prefix) {
		return getSpritePacket(prefix);
	}
	@Override
	public String getSpritePacket(String prefix) {
		if(prefix.indexOf(prefixGM) == -1){
			return "";
		}
		// TODO Auto-generated method stub
		//StringBuilder sb = new StringBuilder(prefix)
		//.append blaablabla
		return "";
	}

	@Override
	public Classe getClasse() {
		// TODO Auto-generated method stub
		//todo: insérer un objet classe pour avoir les stats, sorts, lvl, maxpapm, etc
		//du coup on pourrait générer des monstres avec des stats aléatoires controllées par les paliers 
			//genre un bouftou pourrait avec 80vita et 10force et un autre bouftou du meme lvl pourrait avoir 50vita et 40force
			//(comme les familiers sur elite pvp)
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte getAlignementSpecialization() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getAccessoriesPacket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onAddedToMap(Map m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRemovedFromMap(Map m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void terminate() throws Throwable {
		// TODO Auto-generated method stub
		
	}


}
