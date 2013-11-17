package Plugins.Abstractions;

import java.util.ArrayList;

import Enums.SynActions;
import GameObjects.GAction;
import GameObjects.GEffect;
import GameObjects.GPersonnage;
import Interfaces.IObject;
import Misc.ParameterHolder;

public abstract class AbstractActionListener {

	//public ArrayList<GAction> actions = null;
	//public ArrayList<GEffect> effects = null;
	//public ArrayList<AbstractActionListener> listeners = null;
	

	/*
	public class a{
		public ArrayList<AbstractActionListener> listeners = null;
	}
	
	
	public class AbstractActionListenerContainer extends AbstractActionListener {
		public ArrayList<AbstractActionListener> listeners = null;
		@Override
		public AbstractActionListener addListener(AbstractActionListener listener) {
			listeners.add(listener);
			return this;
		}
		@Override
		public AbstractActionListener setListeners(ArrayList<AbstractActionListener> listeners) {
			this.listeners = listeners;
			return this;
		}
		@Override
		public ArrayList<AbstractActionListener> getListeners() {
			return listeners;
		}
		@Override
		public int getID() {
			// TODO Auto-generated method stub
			return 0;
		}
		@Override
		public void setID(int id) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void actionPerformed(GPersonnage p, IObject o) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public boolean isCompleted(GPersonnage p, IObject o) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean isContainer() {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public SynActions getType() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<GAction> getActions() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<GAction> setActions(ArrayList<GAction> a) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<GAction> addAction(GAction a) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<GEffect> getEffects() {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<GEffect> setEffects(ArrayList<GEffect> e) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public ArrayList<GEffect> addEffect(GEffect e) {
			// TODO Auto-generated method stub
			return null;
		}
	}
	*/

	public abstract int getID();
	public abstract void setID(int id);

	public abstract void actionPerformed(GPersonnage p, ParameterHolder o);
	public abstract boolean isCompleted(GPersonnage p, IObject o);
	public abstract boolean isContainer();
	public abstract SynActions getType();
	
	public abstract ArrayList<GAction> getActions();
	public abstract ArrayList<GAction> setActions(ArrayList<GAction> a);
	public abstract ArrayList<GAction> addAction(GAction a);
	public abstract ArrayList<GEffect> getEffects();
	public abstract ArrayList<GEffect> setEffects(ArrayList<GEffect> e);
	public abstract ArrayList<GEffect> addEffect(GEffect e);
	
	
	/**
	 * Si l'AbstractActionListener n'est pas un Container: 
	 * <br>Créé une copie du AbstractActionListener en forme de container, set la liste de listeners et retourne le nouvel objet ActionListenerContainer
	 * <p>
	 * Si l'AbstractActionListener est déjà un Container: 
	 * <br>Fais juste setter la liste de listeners et return this;
	 * 
	 * @param listeners - La liste de listeners à setter au Container
	 * @return - Le ActionListenerContainer contenant l'ArrayList de listeners
	 */
	public abstract AbstractActionListener setListeners(ArrayList<AbstractActionListener> listeners);
	/**
	 * Si l'AbstractActionListener n'est pas un Container: 
	 * <br>Créé une copie du AbstractActionListener en forme de container, ajoute le listener à sa liste et retourne le nouvel objet ActionListenerContainer
	 * <p>
	 * Si l'AbstractActionListener est déjà un Container: 
	 * <br>Fais juste ajouter le listener à sa liste et return this;
	 * 
	 * @param listener - Le AbstractActionListener à ajouter 
	 * @return - Le ActionListenerContainer contenant l'ArrayList de listeners
	 */
	public abstract AbstractActionListener addListener(AbstractActionListener listener);
	/**
	 * @return null si l'AbstractActionListener n'est pas un Container
	 */
	public abstract ArrayList<AbstractActionListener> getListeners();
	
	
	
}
