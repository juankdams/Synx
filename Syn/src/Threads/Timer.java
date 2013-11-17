package Threads;

import static Threads.Pools.startUtilityThread;
import static Threads.Pools.utilThreads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Core.Syn;
import Enums.SynActions.UtilityThreadA;
import Game.GServer;
import SM.SchedulingBuffer;
import XML.GConfig;


public class Timer implements Runnable {
	public static Logger log = LoggerFactory.getLogger(Timer.class);
	
	
	public static long oneDay = 86400000;
	public static long oneHour = 3600000;
	public static long oneMinute = 60000;
	
	//PARTIE OBJET -------------------------------
	private Thread t = null;
	private GServer gs = null;
	private long timeToSleep = 1000;
	private long timeElapsed = 0;
	
	public Timer(long timeToSleep){
		this.timeToSleep = timeToSleep;
		this.t = new Thread(this);
		this.t.setName("Global Timer Thread");
	}
	
	public void start(GServer gs){
		this.gs = gs;
	/*	for(int i = 30; i>=0; i--){
			if(Zen.BIGTIMER[1]){
				fightTurnsThreads.add(new FightThread("FightT n"+i, null));
			}
			if(Zen.BIGTIMER[2]){
				craftingThreads.  add(new CraftThread("JobT n"+i, null, null));
			}
			if(Zen.BIGTIMER[3]){
				iaThreads.	 	  add(new IAThread   ("IaT n"+i, null, null));
			}
			if(Zen.BIGTIMER[4]){
				gttThreads.	 	  add(new GTTThread  ("GT n"+i, null));
			}
		}
		if(Zen.DAILY_CHALLENGES || Zen.DAILY_EVENTS){
			startUtilityThread(UtilityThread.DAILY);
		}
		if(Zen.HEROES){
			startUtilityThread(UtilityThread.MOVE_TROUPS);
		}
	*/
		for(SchedulingBuffer buffer : SchedulingBuffer.buffers){
			buffer.setUtilityThread(
					startUtilityThread(UtilityThreadA.SCHEDULED_BUFFER, buffer)
					);
		}
		//for(GServer gs : Syn.gameServers){
			//if(gs.getConfig().isOpened()){
			//	startUtilityThread(UtilityThreadA.REGENERATE_LIFE, gs);
			//}
		//}
		t.start();
	}
	
	@Override
	public void run() {
		int n = 0;
		try {
			while(Syn.isRunning){
				//while(Syn.gameServer.isInternlyRebooting){
	    		//	Thread.sleep(1000);
	    		//}
				Thread.sleep(timeToSleep);
		//		accountsToRemoveIfUnused.clear();
				
				//tick chaque seconde pour passer le tour
			/*	synchronized(fightTurnsThreads){
					n = fightTurnsThreads.size()-1;
					while(n >= 0){
						if(fightTurnsThreads.get(n).fight != null){
							fightTurnsThreads.get(n).tick();
						}else if(timeElapsed >= oneDay){//Vidage à chaque jour
							fightTurnsThreads.remove(n).terminate();
						}
						n--;
					}
				}
				/*n = craftingThreads.size()-1;
				synchronized(craftingThreads){
					while(n >= 0){
						if(craftingThreads.get(n).perso != null){
							craftingThreads.get(n).tick();
						}else if(timeElapsed >= oneDay){//Vidage à chaque jour
							craftingThreads.remove(n).terminate();
						}
						n--;
					}
				}*/
			/*	if(Zen.HEROES){
					if(timeElapsed % (15*oneMinute) == 0){//Tick chaque 15 min 
						n = utilThreads.size()-1;
						synchronized(utilThreads){
							while(n >= 0){
								if(utilThreads.get(n).type == UtilityThread.MOVE_TROUPS){//tick!
									utilThreads.get(n).tick();
								}
								n--;
							}
						}
					}
				}
				*/
				//Syn.d("Timer.while. timeElapsed = "+timeElapsed);
				n = utilThreads.size()-1;
				synchronized(utilThreads){
					while(n >= 0){
						if(utilThreads.get(n).type == UtilityThreadA.SCHEDULED_BUFFER){//tick!
							if(timeElapsed % ((SchedulingBuffer)utilThreads.get(n).obj).getTickInterval() == 0){
								utilThreads.get(n).tick();
							}
						}//else if(utilThreads.get(n).type == UtilityThreadA.REGENERATE_LIFE){
						//	if(timeElapsed % 1000 == 0){//Regen chaque 1seconde
						//		utilThreads.get(n).tick();
						//	}
						//}
						n--;
					}
				}
				
				if(GConfig.ConnexionQueue){
					if(timeElapsed % 5000 == 0){//Chaque 5 seconde
						gs.connexionQueue.tick(gs, null);
					}
				}
				
				
				timeElapsed += timeToSleep;
				timeElapsed = timeElapsed/timeToSleep*timeToSleep;//pour enlever les chiffres batards à fin
				
				if(timeElapsed >= oneDay){
					log.info("Go pour CLEAN THREADS timeElapsed était ="+timeElapsed);
				/*	n = iaThreads.size()-1;
					synchronized(iaThreads){
						while(n >= 0){
							if(iaThreads.get(n).f == null){//Vidage à chaque jour
								iaThreads.remove(n).terminate();
							}
							n--;
						}
					}
					n = utilThreads.size()-1;
					synchronized(utilThreads){
						while(n >= 0){
							if(utilThreads.get(n).type == UtilityThread.DAILY){//tick!
								utilThreads.get(n).tick();
							}
							n--;
						}
					}
					*/
					timeElapsed -= oneDay;
				}
			}
		} catch (InterruptedException e) {e.printStackTrace();}
		
	}
	
	
	public void setTimeToSleep(long timeToSleep) {
		this.timeToSleep = timeToSleep;
	}

	public long getTimeToSleep() {
		return timeToSleep;
	}

	public long getTimeElapsed() {
		return timeElapsed;
	}

	public void setTimeElapsed(long timeElapsed) {
		this.timeElapsed = timeElapsed;
	}

	public void stop() {
		this.t.interrupt();
		synchronized(Threads.Pools.utilThreads){
			Threads.Pools.utilThreads.clear();
		}
	}
	
/*
	tick each seconds
	|- remove accounts from LWorld.accounts if theyre unused. 
	|-
	
	
*/	
	
	
	
	
	
}