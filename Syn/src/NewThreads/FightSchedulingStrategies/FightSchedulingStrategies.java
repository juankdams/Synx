package NewThreads.FightSchedulingStrategies;

import java.util.ArrayList;

import GameObjects.Fights.GFight;

public class FightSchedulingStrategies {
	
	private static int chosenStrategy = 1;
	
	/**
	 * Remember : a policy = a strategy.
	 */
	private static ArrayList<FightSchedulingStrategy> policies = new ArrayList<FightSchedulingStrategy>();

	
	static{
		policies.add(new DelayingFights<GFight>().start());
		policies.add(new FightScheduler());
	}
	
	/**
	 * @return - The currently adopted strategy
	 */
	public static FightSchedulingStrategy getStrategy(){
		return policies.get(chosenStrategy);
	}
	
	
	
	
	
	
}
