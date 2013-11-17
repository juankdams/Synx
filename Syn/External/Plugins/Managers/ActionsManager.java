package Plugins.Managers;

import Abstractions.AbstractWorld;
import Enums.SynActions;
import GameObjects.GAction;
import GameObjects.GPersonnage;
import Misc.ParameterHolder;
import Plugins.Abstractions.AbstractActionListener;
import Plugins.Abstractions.AbstractActionPluginListener;
import Plugins.Interfaces.IActionFactory;


public class ActionsManager {

	private IActionFactory af = null;
	
	private AbstractActionPluginListener aapl = null;
	
	public boolean apply(GPersonnage p, short targetSprite, short targetCell, GAction a){
		return aapl.apply(p, targetSprite, targetCell, a);
	}
	public boolean applyOnDone(GPersonnage p, GAction a){
		return aapl.applyOnDone(p, a);
	}
	public boolean applyOnCancel(GPersonnage p, GAction a, short param) {
		return aapl.applyOnCancel(p, a, param);
	}
	
	public boolean actionTypeExists(short actionTypeID){
		return aapl.actionTypeExists(actionTypeID);
	}
	public boolean isMovementAction(short actionTypeID){
		return aapl.isMovementAction(actionTypeID);
	}
	public short getMovementActionID(){
		return aapl.getMovementActionID();
	}
	/**
	 * Type d'end action pour le packet GAF à envoyer à la fin d'un mouvement.
	 * @return - 0
	 */
	public byte getMovementEndActionID(){
		return aapl.getMovementEndActionID();
	}
	/**
	 * Type d'end action pour le packet GAF à envoyer à la fin du lancement d'un sort.
	 * @return - 2
	 */
	public byte getSpellEndActionID(){
		return aapl.getSpellEndActionID();
	}
	public boolean endGameActionExists(char id){
		return aapl.endActionTypeExists(Byte.parseByte(""+id));
	}
	public boolean endGameActionExists(byte id){
		return aapl.endActionTypeExists(id);
	}
	
	
	public SynActions getActionListenerType(String type){
		return aapl.getActionListenerType(type);
	}
	
	public void notifyListeners(String type, GPersonnage p, ParameterHolder o, boolean alias){
		aapl.notifyListeners(type, p, o, alias);
	}
	
	public void notifyListeners(SynActions type, GPersonnage p, ParameterHolder o){
		aapl.notifyListeners(type, p, o);
	}
	
	public AbstractActionListener createListener(int id, String type, String conditions, AbstractWorld w, String effectsActions){
		return aapl.createListener(id, type, conditions, w, effectsActions);
	}
	
	public boolean putActionListenerAlias(String alias, String actionListenerType){
		return aapl.putActionListenerAlias(alias, actionListenerType);
	}
	public void clearActionListenersAlias(){
		aapl.clearActionListenersAlias();
	}

	
	public void setAapl(AbstractActionPluginListener agpl) {
		aapl = agpl;
	}

	public AbstractActionPluginListener getAapl() {
		return aapl;
	}
	public void unload() {
		aapl = null;
	}
	public void setFactory(IActionFactory aaf) {
		af = aaf;
	}
	public IActionFactory getFactory() {
		return af;
	}
	
	
}