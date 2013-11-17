package NewThreads;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Stack;

import GameObjects.Fights.GFight;

public class FightTimerPoolManager {

	
	private static short timeBetweenFights = 100;//ms
	
	
	private ThreadsManager tm = null;
	private HashMap<Task<Object>, Stack<GFight>> threads;
	
	Stack<GFight> get(Task<?> task){
		return threads.get(task);
	}
	
	GFight pop(Task<?> task){
		GFight f = threads.get(task).firstElement();
		threads.get(task).remove(0);
		return f;
	}
	
	
	public boolean add(GFight f){
		boolean added = false;
		for(Entry<Task<Object>, Stack<GFight>> entry : threads.entrySet()){
			if(entry.getValue().peek().getEndTurnTime() + timeBetweenFights < f.getEndTurnTime()){
				entry.getValue().push(f);
				return added = true;
			}
		}
		if(added == false){
			Task<Object> t = tm.getTaskFactory().newFightTimerTask(f);
			tm.executeDirectTask(t);
			Stack<GFight> s = new Stack<GFight>();
			s.push(f);
			threads.put(t, s);
		}
		return added;
	}
	
	
	

}
