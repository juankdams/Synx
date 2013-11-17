package GameObjects;

import static Constants.Constants.prefixGM;

import java.util.ArrayList;

import Abstractions.AbstractCharacter;
import ConfigurationObjects.Classe;
import Enums.CharacterType;
import Enums.SynActions;
import GlobalObjects.Map;
import Plugins.Abstractions.AbstractActionListener;
import Plugins.Managers.PluginsManager;

public class GNpc extends AbstractCharacter{


	private ArrayList<AbstractActionListener> actionsListeners = null;
	
	

	@Override
	public CharacterType getCharacterType() {
		return CharacterType.NPC;
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
	public void onAddedToMap(Map m) {
		SM.Game.GM_ADD(this, m);
	}

	@Override
	public void onRemovedFromMap(Map m) {
		SM.Game.GM_REMOVE(m, this);
	}
	

	@Override
	public Classe getClasse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAccessoriesPacket() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte getAlignementSpecialization() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public ArrayList<AbstractActionListener> getActionsListeners() {
		return actionsListeners;
	}
	public void setActionsListeners(ArrayList<AbstractActionListener> actionsListeners) {
		this.actionsListeners = actionsListeners;
	}
	/**
	 * Ajoute le listener à un container s'il y a déjà un listener du meme type.
	 * <p>Ajoute le listener directement à l'arrayList de listeners de la map sinon.
	 */
	public void addActionListener(AbstractActionListener aal){
		int index = getActionsListenerIndex(aal.getType());
		if(index != -1){
			actionsListeners.set(index, actionsListeners.get(index).addListener(aal));
		}else{
			actionsListeners.add(aal);
		}
	}
	
	public int getActionsListenerIndex(SynActions type){
		if(actionsListeners != null && actionsListeners.size() > 0){
			for(int i = actionsListeners.size()-1; i >= 0; i--){
				if(actionsListeners.get(i).getType() == type){
					return i;
				}
			}
		}
		return -1;
	}
	
	public AbstractActionListener getActionsListener(SynActions type){
		if(actionsListeners != null && actionsListeners.size() > 0){
			for(AbstractActionListener aal : actionsListeners){
				if(aal.getType() == type){
					return aal;
				}
			}
		}
		return null;
	}
	public AbstractActionListener getActionsListener(int ID){
		if(actionsListeners != null && actionsListeners.size() > 0){
			for(AbstractActionListener aal : actionsListeners){
				if(aal.getID() == ID){
					return aal;
				}
				if(aal.isContainer()){
					for(AbstractActionListener aall : aal.getListeners()){
						if(aall.getID() == ID){
							return aall;
						}
					}
				}
			}
		}
		return null;
	}
	
	
	@Override
	public void terminate() throws Throwable {
		// TODO Auto-generated method stub
		super.terminate();
		
	}
	

}
