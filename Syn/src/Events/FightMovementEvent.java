package Events;

import GameObjects.GAction;
import GameObjects.Fights.GFight;

public class FightMovementEvent extends FightEvent {
	
	private GAction movementAction = null;

	public FightMovementEvent(GFight fight, GAction a) {
		super(fight, FightEventType.ON_FIGHT_MOVE);
		setMovementAction(a);
	}

	public void setMovementAction(GAction movementAction) {
		this.movementAction = movementAction;
	}

	public GAction getMovementAction() {
		return movementAction;
	}

}
