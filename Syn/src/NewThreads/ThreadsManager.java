package NewThreads;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import Enums.SynActions.SchedulingA;
import Interfaces.IService;

public class ThreadsManager implements IService{

	private TaskFactory taskFactory = null;
	//private FightTimerPoolManager fightsTimersPool = null;
	
	private LinkedBlockingQueue<Runnable> lbq = null;
	private ThreadPoolExecutor tpe = null;
	private ScheduledThreadPoolExecutor stpe = null;
	private RejectedTaskHandler rejecthandler = null;
	
	public ThreadsManager(){
		
	}
	
	@Override
	public void boot() throws Exception {
		taskFactory = new TaskFactory();
		//setFightsTimersPool(new FightTimerPoolManager());
		lbq = new LinkedBlockingQueue<Runnable>();
		rejecthandler = new RejectedTaskHandler();

		tpe = new ThreadPoolExecutor(1, Integer.MAX_VALUE, 10, TimeUnit.MINUTES, lbq, Executors.defaultThreadFactory(), rejecthandler);
		//Future<?> f = newDirectTask(null, null); 
			// ^ -> pour faire l'action directement, sans delay/attente.
				// (Exemple le bouton "Fusionner une fois" dans la forgemagie ;) mais utilise pas le pool juste pour ça là ! XD)
		
		//TODO tpe.getThreadFactory().newThread(null).pause/restart.
		
		stpe = new ScheduledThreadPoolExecutor(1, Executors.defaultThreadFactory(), rejecthandler);
		//stpe.schedule(callable, delay, unit)  
			//  ^ -> pour exécuter un callable à un certain moment dans le temps
		
		//stpe.scheduleAtFixedRate(command, initialDelay, period, unit)
		//		^ -> pour exécuter une action Runnable à chaque X temps à partir d'un certain moment
		//		^ -> utile pour les métier: tu mets ca, ça tick, ca tick et dès que le joueur veut arreter ou que ses recettes sont finies, on cancel le Future
	}

	@Override
	public void reboot() throws Exception {
		purgeCancelledThreads();
		off();
		boot();
	}
	
	public ScheduledFuture<?> executeScheduledRepeatedTask(Task<Object> task, long initialDelay, long delay, TimeUnit units){
		return stpe.scheduleWithFixedDelay(task.getRunnable(), initialDelay, delay, units);
	}
	public ScheduledFuture<?> executeScheduledRepeatedTask(SchedulingA action, long initialDelay, long delay, TimeUnit units, Object... params){
		return stpe.scheduleWithFixedDelay(new Task<Object>(action, params).getRunnable(), initialDelay, delay, units);
	}

	public ScheduledFuture<Object> executeScheduledTask(Task<Object> task, long delay, TimeUnit units){
		return stpe.schedule(task.getCallable(), delay, units);
	}
	
	public ScheduledFuture<Object> executeScheduledTask(SchedulingA action, long delay, TimeUnit units, Object... params){
		return stpe.schedule(new Task<Object>(action, params).getCallable(), delay, units);
	}
	
	public Future<Object> executeDirectTask(Task<Object> task){
		return tpe.submit(task.getCallable());
	}
	
	public Future<Object> executeDirectTask(SchedulingA action, Object... params){
		return tpe.submit(new Task<Object>(action, params).getCallable());
	}

	/**
	 * tpe/step.purge: Tries to remove from the work queue all Future tasks that have been cancelled.  
	 */
	public void purgeCancelledThreads(){
		tpe.purge();
		stpe.purge();
	}
	
	/**
	 * Attend que toutes les tasks soient finies et ensuite ferme tous Threads et les ThreadPools.
	 */
	public void waitAndOff() {
		tpe.shutdown();
		stpe.shutdown();
	}
	
	/**
	 *Ferme tous Threads de Taks et les ThreadPools sans attendre que les Tasks soient finies.
	 */
	public void off() {
		tpe.shutdownNow();
		stpe.shutdownNow();
	}

	public void setTaskFactory(TaskFactory taskFactory) {
		this.taskFactory = taskFactory;
	}
	public TaskFactory getTaskFactory() {
		return taskFactory;
	}

	//public void setFightsTimersPool(FightTimerPoolManager fightsTimersPool) {
	//	this.fightsTimersPool = fightsTimersPool;
	//}
	//public FightTimerPoolManager getFightsTimersPool() {
	//	return fightsTimersPool;
	//}


	
	
	
}
