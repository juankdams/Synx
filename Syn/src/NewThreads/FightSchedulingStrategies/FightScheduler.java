package NewThreads.FightSchedulingStrategies;

import java.util.HashMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import GameObjects.Fights.GFight;
import NewThreads.Task;

public class FightScheduler implements FightSchedulingStrategy {

    private transient final ReentrantLock lock = new ReentrantLock();
    private HashMap<GFight, ScheduledFuture<Object>> fightFutures = new HashMap<GFight, ScheduledFuture<Object>>();

    
	@Override
	/**
	 * Calls schedule(e, true);
	 */
	public boolean schedule(GFight e) {
		return schedule(e, true);
	}
	/**
	 * Schedules a ScheduledFuture  FightTimerTask for this fight and maps it into the HashMap.
	 * @param reScheduleIfPresent - Will cancelWoLock() and than schedule the fight if this fight was already scheduled and reScheduleIfPresent is true. Returns false if this fight was already scheduled and reScheduleIfPresent is false. 
	 */
	public boolean schedule(GFight e, boolean reScheduleIfPresent){
        lock.lock();
        try {
			if(fightFutures.get(e) != null){
				if(!reScheduleIfPresent){
					return false;
				}
				cancelWoLock(e);
			}
    		Task<Object> t = e.getServer().threadsManager.getTaskFactory().newFightTimerTask(e);
    		ScheduledFuture<Object> sf = e.getServer().threadsManager.executeScheduledTask(t, e.getServer().getConfig().getFightTurnTimerTime(), TimeUnit.MILLISECONDS);
    		fightFutures.put(e, sf);
    		return true;
        } finally {
            lock.unlock();
        }
	}

	@Override
	/**
	 * Similar to cancel, removes the mapping from the HashMap, stops the task scheduling and executes it right away in a direct task.
	 */
	public boolean finish(GFight e) {
        lock.lock();
        try {
    		ScheduledFuture<Object> sf = fightFutures.remove(e);
    		if(sf == null){
    			return false;
    		}
    		sf.cancel(true);
    		Task<Object> t2 = e.getServer().threadsManager.getTaskFactory().newFightTimerTask(e);
    		Future<Object> sf2 = e.getServer().threadsManager.executeDirectTask(t2);
        } finally {
            lock.unlock();
        }
		return false;
	}
	
	
	/**
	 * Same as cancel() but without locking
	 */
	public boolean cancelWoLock(GFight e){
		ScheduledFuture<Object> sf = fightFutures.remove(e);
		if(sf == null){
			return false;
		}
		return sf.cancel(true);
	}
	/**
	 * Cancels (and removes the mapping from the HashMap) the ScheduledFuture of the fight if it was effectively scheduled and returns the cancellation's result. Returns false otherwise.
	 */
	public boolean cancel(GFight e){
        lock.lock();
        try {
			ScheduledFuture<Object> sf = fightFutures.remove(e);
			if(sf == null){
				return false;
			}
			return sf.cancel(true);
        } finally {
            lock.unlock();
        }
	}
	
	public void remove(GFight e) {
		fightFutures.remove(e);
	}
	
	
	

}
