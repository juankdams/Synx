package Events;

import GameObjects.GAction;
import GameObjects.Fights.GFight;

public class FightSpellEvent extends FightEvent {
	
	private GAction spellAction = null;

	public FightSpellEvent(GFight fight, GAction a) {
		super(fight, FightEventType.ON_FIGHT_SPELL_CAST);
		setSpellAction(a);
	}

	public void setSpellAction(GAction spellAction) {
		this.spellAction = spellAction;
	}

	public GAction getSpellAction() {
		return spellAction;
	}
	
	

}
