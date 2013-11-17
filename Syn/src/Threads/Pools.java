package Threads;

import java.util.ArrayList;

import Enums.SynActions.UtilityThreadA;
import Threads.Factory.UtilityThread;


public class Pools {

	//PARTIE STATIQUE
	//public static ArrayList<FightThread> fightTurnsThreads = new ArrayList<FightThread>();
	//public static ArrayList<CraftThread> craftingThreads = new ArrayList<CraftThread>();
	//public static ArrayList<IAThread> iaThreads = new ArrayList<IAThread>();
	//public static ArrayList<GTTThread> gttThreads = new ArrayList<GTTThread>();
	public static ArrayList<UtilityThread> utilThreads = new ArrayList<UtilityThread>();
	
	
	
	
	
	/**
	 * En créé un nouveau et le start s'il n'y e na pas éיja de dispo dans l'array.
	 * @return Le FightThread pour pouvoir le pauser/restarter
	 */
/*	public static FightThread startFightTurnsThread(Fight fight){
		synchronized(fightTurnsThreads){
			for(FightThread ft : fightTurnsThreads){
				if(ft.fight == null){
					ft.fight = fight;
					ft.Start();
					return ft;
				}
			}
			FightThread ft = new FightThread("FightT  n"+fightTurnsThreads.size()+1, fight);
			ft.Start();
			fightTurnsThreads.add(ft);
			return ft;
		}
	}
	
	/**
	 * En crיי un nouveau et le start s'il n'y en a pas dיja de dispo dans l'array.
	 * @return L'IA Thread pour pouvoir le pauser/restarter
	 */
/*	public static IAThread startIAThread(Fight fight, Fighter f){
		synchronized(iaThreads){
			for(IAThread iaT : iaThreads){
				if(iaT.fight == null){
					iaT.fight = fight;
					iaT.f = f;
					iaT.Start();
					//try {
					//	Thread.sleep(50);
					//} catch (InterruptedException e) {e.printStackTrace();}
					iaT.tick();
					return iaT;
				}
			}
			IAThread iaT = new IAThread("IaT  n"+iaThreads.size()+1, fight, f);
			iaT.Start();
			iaThreads.add(iaT);
			//try {
			//	Thread.sleep(50);
			//} catch (InterruptedException e) {e.printStackTrace();}
			iaT.tick();
			return iaT;
		}
	}
	
	/**
	 * En crיי un nouveau et le start s'il n'y en a pas dיja de dispo dans l'array.
	 * @return Le CraftingThread pour pouvoir le pauser/restarter
	 */
/*	public static CraftThread startCraftThread(Personnage perso, Metier job){
		synchronized(craftingThreads){
			for(CraftThread ct : craftingThreads){
				if(ct.perso == null){
					ct.perso = perso;
					ct.job = job;
					ct.Start();
					return ct;
				}
			}
			CraftThread ct = new CraftThread("JobT", perso, job);
			ct.Start();
			craftingThreads.add(ct);
			return ct;
		}
	}
	
	/**
	 * En crיי un nouveau et le start s'il n'y en a pas dיja de dispo dans l'array.
	 * @return Le GTT Thread pour pouvoir le pauser/restarter
	 */
/*	public static GTTThread startGTThread(GameThread game){
		synchronized(gttThreads){
			for(GTTThread gt : gttThreads){
				if(gt.getClient() == null){
					gt.setClient(game);
					gt.Start();
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {e.printStackTrace();}
					gt.tick();
					return gt;
				}
			}
			GTTThread gt = new GTTThread("GT n°"+common.Zen.NBR_GAME_THREADS, game);
			gt.Start();
			gttThreads.add(gt);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {e.printStackTrace();}
			gt.tick();
			return gt;
		}
	}
	*/
	
	/**
	 * En créé un nouveau et le start s'il n'y en a pas dיja de dispo dans l'array.
	 * @param obj - Un GServer pour le type REGENERATE_LIFE. (Y'en faut au moin un par serv pour de bonnes perfs)
	 * <p> 			Un SchedulingBuffer pour le type SCHEDULED_BUFFER.
	 * <p>          Une City pour le type MOVE_TROUPS
	 * <p>          Un GServer pour les types DAILY 
	 * @return Le UtilityThread pour pouvoir le pauser/restarter
	 */
	public static UtilityThread startUtilityThread(UtilityThreadA type, Object obj){
		synchronized(utilThreads){
			for(UtilityThread ut : utilThreads){
				if(ut.type == null && ut.obj == null){
					ut.type = type;
					ut.Start();
					return ut;
				}
			}
			UtilityThread ut = new UtilityThread("UT-"+type.name(), type, obj);
			ut.Start();
			utilThreads.add(ut);
			return ut;
		}
	}
	
	
	
	
	
	
	
}