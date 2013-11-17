package NewThreads.FightSchedulingStrategies;

import GameObjects.Fights.GFight;

public interface FightSchedulingStrategy {

	
	/**
	 * Called to schedule a new fight turn or reschedule an old one.
	 */
	public boolean schedule(GFight e);
	/**
	 * Called when a player passes his turn.
	 */
	public boolean finish(GFight e);
	/**
	 * Called to cancel the fight turn scheduling.
	 */
	public boolean cancel(GFight e);
	
	
}
