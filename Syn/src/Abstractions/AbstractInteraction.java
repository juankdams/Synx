package Abstractions;

import Enums.SynActions;
import Interfaces.IInteractionType;
import Plugins.Abstractions.AbstractActionListener;

public abstract class AbstractInteraction {

	protected IInteractionType type = null;
	

	public abstract Object getIO();
	public abstract GExchangeBag getExchange();
	public abstract AbstractCharacter getCharacter();
	
	public AbstractInteraction setType(IInteractionType type){
		this.type = type;
		return this;
	}
	public IInteractionType getType(){
		return this.type;
	}
	public boolean isType(IInteractionType it){
		return this.getType() == it;
	}
	
	public AbstractActionListener getActionsListener(SynActions type){
		
		return null;
	}
	
	
}
