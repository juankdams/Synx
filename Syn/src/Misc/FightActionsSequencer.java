package Misc;

import GameObjects.GAction;

public class FightActionsSequencer extends Sequencer<Object> {
	private static final long serialVersionUID = 1L;

	public FightActionsSequencer() {
		super(GAction.class);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void flush(){
		for(Object o : this){
			ParameterHolder ph = null;
			GAction a = (GAction) o;
			//EffectsManager.appl
			ActionsManager.ap
		}
	}
	

}
