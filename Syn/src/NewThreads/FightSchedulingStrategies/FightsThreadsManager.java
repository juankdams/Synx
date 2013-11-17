package NewThreads;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import Enums.SynActions.SchedulingA;

public class FightsThreadsManager {

	

	private LinkedBlockingQueue<Runnable> lbq = null;
	private RejectedTaskHandler rejecthandler = null;
	private ThreadPoolExecutor fightsTpe = null;
	private int numberOfFightsInWorld = 0;
	
	
	
	public FightsThreadsManager(){
		lbq = new LinkedBlockingQueue<Runnable>();
		rejecthandler = new RejectedTaskHandler();
		
		fightsTpe = new ThreadPoolExecutor(1, Integer.MAX_VALUE, 10, TimeUnit.MINUTES, lbq, Executors.defaultThreadFactory(), rejecthandler);
	}

	public void updateFightTimingPool(int add){
		if(numberOfFightsInWorld / fightsTpe.getPoolSize() > Constants.Constants.numberOfFightsByTimingThread){
			fightsTpe.submit(new Task<Object>(SchedulingA.FIGHT_TIMER).getCallable());
		}else{
			fightsTpe.purge();
			//pas besoin de rien faire, 
			//le ThreadPoolExecutor remet son nombre de thread directement au nombre de coreThreadNumber (oupresque)
			//dès que le délai est achevé en enlevant seulement les task qui sont terminées
			/*while(numberOfFightsInWorld / fightsTpe.getPoolSize() < Constants.Constants.numberOfFightsByTimingThread){
				if(fightsTpe.getQueue().size() > fightsTpe.getCorePoolSize()){
					try {
						fightsTpe.getQueue().take();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}*/
		}
	}
	
	
	
	
	
	
	
}
