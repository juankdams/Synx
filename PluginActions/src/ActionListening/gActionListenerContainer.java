package ActionListening;

import java.util.ArrayList;

import Enums.ActionListenerType;
import GameObjects.GAction;
import GameObjects.GEffect;
import GameObjects.GPersonnage;
import GameObjects.GWorld;
import Interfaces.IObject;
import Misc.ParameterHolder;
import Plugins.Abstractions.AbstractActionListener;

public class gActionListenerContainer extends gActionListener{
	
	private ArrayList<AbstractActionListener> listeners = null;

	
	public gActionListenerContainer(int id, ActionListenerType type, String conditions, GWorld w, ArrayList<GAction> actions, ArrayList<GEffect> effects, ArrayList<AbstractActionListener> listenersList){
		super(id, type, conditions, w, "");
		this.actions = actions;
		this.effects = effects;
		this.listeners = new ArrayList<AbstractActionListener>();
		if(listenersList != null){
			this.listeners = listenersList;
		}
	}
	
	
	@Override
	public void actionPerformed(GPersonnage p, ParameterHolder o) {
		super.actionPerformed(p, o);//actionne les actions+effets propres à ce ListenerContainer
		if(listeners != null && listeners.size() != 0 && (isCompleted(p, (IObject) (o == null ? null : o.condition)))){//perform tous les listeners contenus
			for(AbstractActionListener gal : listeners){
				gal.actionPerformed(p, o);
			}
		}
		/*
		 Container 
		   | - Actions
		   | - Listeners
		   		| - Actions
		 */
	}

	@Override
	public boolean isContainer() {
		return true;
	}

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
	
	
	
	
}
