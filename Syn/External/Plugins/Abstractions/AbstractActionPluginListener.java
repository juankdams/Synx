package Plugins.Abstractions;

import plugin.event.PluginListener;
import Abstractions.AbstractWorld;
import Enums.SynActions;
import GameObjects.GAction;
import GameObjects.GPersonnage;
import Misc.ParameterHolder;


public abstract class AbstractActionPluginListener implements PluginListener{

	public abstract boolean apply(GPersonnage p, short targetSprite, short targetCell, GAction a);
	public abstract boolean applyOnDone(GPersonnage p, GAction a);
	public abstract boolean applyOnCancel(GPersonnage p, GAction a, short param);
	

	public abstract boolean actionTypeExists(short actionTypeID);
	public abstract boolean endActionTypeExists(byte parseByte);
	
	public abstract boolean isMovementAction(short actionTypeID);
	public abstract short getMovementActionID();
	
	public abstract byte getMovementEndActionID();
	public abstract byte getSpellEndActionID();


	public abstract void notifyListeners(String a, GPersonnage p, ParameterHolder o, boolean alias);
	public abstract void notifyListeners(SynActions a, GPersonnage p, ParameterHolder o);
	public abstract AbstractActionListener createListener(int id, String type, String conditions, AbstractWorld w, String effectsActions);
	public abstract SynActions getActionListenerType(String type);
	public abstract boolean putActionListenerAlias(String alias, String actionListenerType);
	public abstract void clearActionListenersAlias();
	
	
	
}
