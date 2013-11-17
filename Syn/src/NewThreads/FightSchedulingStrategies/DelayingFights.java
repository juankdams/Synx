package NewThreads.FightSchedulingStrategies;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import Core.Syn;
import Enums.FightState;
import GameObjects.Fights.GFight;


public class DelayingFights<V extends Delayed> extends DelayingQueue2<GFight> implements FightSchedulingStrategy, Callable<V> {

	/*
	public static class Fight implements Delayed {
		private static short timePerTurn = 1000;
		public static long timePerTurnNS = timePerTurn * 1000L * 1000L;
		private static int nextID = 0;
		
		private int ID = 0;
		private long endTurnTime = 0;
		public Fight(long endTurnTime){
			this.endTurnTime = endTurnTime;
			this.ID = nextID++;
		}
		@Override
		public int compareTo(Delayed arg0) {
			return this == arg0 ? 0 : 1;
		}
		@Override
		public long getDelay(TimeUnit arg0) {
			//Returns delay in nanoseconds
			return (endTurnTime - System.nanoTime());
		}
		public void endTurn(){
			//Main.w("Ended Fight ("+ID+") turn");
		}
	}
	
	// ----------------------------------------------------------------------------------------
	
	
	public static int iterations = 20000;
	public static void go() throws InterruptedException{
		DelayingFights<Fight> fights = new DelayingFights<Fight>();
		for(int i = iterations-1; i >= 0; i--){
			fights.add( new Fight(System.nanoTime() + Fight.timePerTurnNS) );
		}
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.submit(fights);
		
		Thread.sleep(1300);
		
		Main.w("done sleeping");
		
		for(int i = iterations-1; i >= 0; i--){  //Concurrently adding fights to the DelayQueue
			fights.add( new Fight(System.nanoTime() + Fight.timePerTurnNS) );
		}
		for(int i = iterations-1; i >= 0; i--){  //Concurrently adding fights to the DelayQueue
			fights.add( new Fight(System.nanoTime() + Fight.timePerTurnNS) );
		}
		
		synchronized(fights){
			Main.w("notifying");
			fights.notifyAll();
		}
	}
	*/
	// ----------------------------------------------------------------------------------------
	
	
	//public DelayingFights(){ }
	public DelayingFights(){//long keepAliveTime){
		//this.keepAliveTime = keepAliveTime;
	}
	public DelayingFights<V> start(){
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.submit(this);
		return this;
	}
	//private long keepAliveTime = 1000;
	
	/**
	 * Sets the fight delay and adds the fight to the queue
     */
    public boolean schedule(GFight e) {
		Syn.w("DelayingFights added fight "+e);
		//boolean b = offer(e);
		//synchronized(this){
		//	this.notify();
		//}
        //return b;
		e.setDelay(e.getServer().getConfig().getFightTurnTimerTime());
		return offer(e);
    }
	/**
	 * Removes the fight from the queue.
	 */
	public boolean cancel(GFight e){
		return this.remove(e);
	}
	
	//public void remove(GFight e){
	//	Syn.w("DelayingFights removed fight "+e);
		
	//}
	
	@Override
	public V call() throws Exception {
		Syn.w("DelayingFights Starting");
		//long start = System.nanoTime() + Fight.timePerTurnNS + Fight.timePerTurnNS ;
		//int count = 0;
		while(true){//this.isEmpty() == false){
			GFight f = this.poll(300, TimeUnit.MILLISECONDS);//blocks & waits for 300ms.  
			if(f == null){
				//Syn.w("polled nulldfgdsfg fight");
			}else
			if(f.getState() == FightState.FINISHED.get()){
				f.endFight();
			}else 
			if(f.getState() == FightState.ACTIVE.get()){
				f.endTurn();
			}else 
			if(f.getState() == FightState.PLACE.get()){
				f.startFight();
			}
			/*count++;
			if(this.isEmpty()){
				Syn.w("DelayingFights waiting");
				long w =  System.nanoTime();
				synchronized(this){
					if(keepAliveTime > 0){
						this.wait(keepAliveTime);
					}else{
						this.wait();
					}
				}
				//long ms = (System.nanoTime() - w) / 1000000;
				//start += (ms * 1000000);
				Syn.w("DelayingFights unblocked waiting after "+(System.nanoTime() - w)+" ns");
			}*/
		}
		//Syn.w("DelayingFights All done. "+count);
		//Main.w("time = "+(System.nanoTime() - start)+"  unic = "+((System.nanoTime() - start)/iterations));
		//return null;
	}
	
	@Override
	/**
	 * Sets the fight's delay to 0 so it will expire and execute right away.
	 */
	public boolean finish(GFight e) {
		e.setDelay(0L);
		return true;
	}

	
	
	
}
