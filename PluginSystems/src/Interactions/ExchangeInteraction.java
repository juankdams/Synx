package Interactions;

import Abstractions.AbstractCharacter;
import Abstractions.AbstractInteraction;
import Abstractions.GExchangeBag;
import Enums.ExchangeType;
import Interfaces.IInteractionType;

public class ExchangeInteraction extends AbstractInteraction{

	/*
	 
	 Échanges entre joueurs, setup de mode marchant,
	 vente/achat sur HDV ou pnj
	 échange avec pnj
	 craft, craft à 2
	 fm, fm à 2
	 banque
	 poubelles
	 monture dragodinde
	 coffres (maisons, maisons de guildes..)
	 
	 
	 */
	
	
	private GExchangeBag bag = null;
	
	@Override
	public IInteractionType getType(){
		return ExchangeType.getExchangeType(bag.getType());
	}

	public void setBag(GExchangeBag bag) {
		this.bag = bag;
	}

	
	@Override
	public GExchangeBag getExchange() {
		return bag;
	}
	@Override
	public AbstractCharacter getCharacter() {
		return null;
	}
	@Override
	public Object getIO() {
		return null;
	}
	
	
}
