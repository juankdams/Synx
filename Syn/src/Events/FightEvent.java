package Events;

import GameObjects.Fights.GFight;

public class FightEvent implements IEvent {
	
	private GFight f = null;
	private FightEventType fet = null;
	
	public FightEvent(GFight fight, FightEventType eventType) {
		this.f = fight;
		this.fet = eventType;
	}

	public GFight getFight(){
		return f;
	}
	
	@Override
	public FightEventType getType() {
		return fet;
	}

}
