package Events;

import GameObjects.GPersonnage;
import GameObjects.Fights.GFight;

public class FightReconnectionEvent extends FightEvent {
	
	private GPersonnage perso = null;

	public FightReconnectionEvent(GFight fight, GPersonnage perso) {
		super(fight, FightEventType.ON_FIGHT_RECONNECTED);
		this.perso = perso;
	}

	public void setPerso(GPersonnage perso) {
		this.perso = perso;
	}

	public GPersonnage getPerso() {
		return perso;
	}

}
