package Tests;


import java.util.concurrent.Callable;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import Tests.DelayingFights.Fight;



public class DelayingFights<V> extends DelayQueue<Fight> implements Callable<V> {


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
			W.w("GetDelay = "+(endTurnTime - System.nanoTime()));
			return (endTurnTime - System.nanoTime());
		}
		public void endTurn(){
			//W.w("Ended Fight ("+ID+") turn");
		}
	}
	
	// ----------------------------------------------------------------------------------------
	
	
	public static int iterations = 1;
	public static void go() throws InterruptedException{
		DelayingFights<Fight> fights = new DelayingFights<Fight>();
		for(int i = iterations-1; i >= 0; i--){
			fights.add( new Fight(System.nanoTime() + Fight.timePerTurnNS) );
		}
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.submit(fights);
		
		Thread.sleep(1300);
		
		W.w("done sleeping");
		
		for(int i = iterations-1; i >= 0; i--){  //Concurrently adding fights to the DelayQueue
			fights.add( new Fight(System.nanoTime() + Fight.timePerTurnNS) );
		}
		for(int i = iterations-1; i >= 0; i--){  //Concurrently adding fights to the DelayQueue
			fights.add( new Fight(System.nanoTime() + Fight.timePerTurnNS) );
		}
		
		synchronized(fights){
			W.w("notifying");
			fights.notifyAll();
		}
	}
	
	// ----------------------------------------------------------------------------------------
	
	
	
	public DelayingFights(){}
	public DelayingFights(long keepAliveTime){
		this.keepAliveTime = keepAliveTime;
	}
	private long keepAliveTime = 1000;
	
	@Override
	public V call() throws Exception {
		//long start = System.nanoTime() + Fight.timePerTurnNS + Fight.timePerTurnNS ;
		int count = 0;
		while(this.isEmpty() == false){
			Fight f = this.take();
			f.endTurn();
			count++;
			if(this.isEmpty()){
				W.w("waiting");
				long w =  System.nanoTime();
				synchronized(this){
					this.wait(keepAliveTime);
				}
				//long ms = (System.nanoTime() - w) / 1000000;
				//start += (ms * 1000000);
				W.w("unblocked waiting after "+(System.nanoTime() - w)+" ns");
			}
		}
		W.w("All done."+count);
		//W.w("time = "+(System.nanoTime() - start)+"  unic = "+((System.nanoTime() - start)/iterations));
		return null;
	}

	
	
	
}
