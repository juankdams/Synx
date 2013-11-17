package GameClientStrategies;

import Core.Exceptions;

public enum GameClientStrategies {

	DofusClientStrategy(new DofusClientStrategy()),
	WakfuClientStrategy(new WakfuClientStrategy());
	
	
	private GameClientStrategy policy;
	private GameClientStrategies(GameClientStrategy s){
		set(s);
		s.set(this);
	}
	
	public void set(GameClientStrategy policy){
		this.policy = policy;
	}
	public GameClientStrategy get(){
		return this.policy;
	}
	
	
	public static GameClientStrategy get(String name){
		GameClientStrategies s = GameClientStrategies.valueOf(name);
		if(s != null){
			return s.get();
		}
		Exceptions.throwIllegalArgumentException("Cant find this GameClientStrategy ("+name+") in the enum");
		return null;
	}
	
	/*
	private static int chosenStrategy = 1;
	
	/**
	 * Remember : a policy = a strategy.
	 * /
	private static ArrayList<GameClientStrategy> policies = new ArrayList<GameClientStrategy>();

	
	static{
		policies.add(new DofusClientStrategy());
		policies.add(new WakfuClientStrategy());
	}
	
	/**
	 * @return - The currently adopted strategy
	 * /
	public static GameClientStrategy getStrategy(){
		return policies.get(chosenStrategy);
	}
	
	*/
	
	
}