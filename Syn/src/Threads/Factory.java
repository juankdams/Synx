package Threads;

import Misc.Tests.Perfs;
import SM.SchedulingBuffer;
import Enums.SynActions.UtilityThreadA;
import Game.GServer;
import GameObjects.GPersonnage;
import GameObjects.GWorld;
import static Enums.SynActions.UtilityThreadA.DAILY;
import static Enums.SynActions.UtilityThreadA.MOVE_MOBS;
import static Enums.SynActions.UtilityThreadA.MOVE_TROUPS;
import static Enums.SynActions.UtilityThreadA.SCHEDULED_BUFFER;
import static Enums.SynActions.UtilityThreadA.REGENERATE_LIFE;

public class Factory {
	
	//PARTIE OBJET ---------------------------------------------------------
	
	
	/*
	public static class FightThread extends ModalT{
		public Fight fight = null;
		public FightThread(String name, Fight fight) {
			super(name);
			this.setThread(this, name);
			this.fight = fight;
		}
		@Override
		public void executeAbstractTask() {
			if(fight != null){
				//Zen.debug("Tick. Temps écoulé :"+(System.currentTimeMillis() - fight.get_ticMyTimer_startTime()));
				//28500 = un chifffre arbitraire sous les 30s pour éliminer 
				//les problemes de concurrences causant du double-passage de tour
				//(donc ton tour passe tout seul avant que tu ai pu joué)
				if(System.currentTimeMillis() - fight.get_ticMyTimer_startTime() >= 28500){
					if(fight.get_state() == Constants.FIGHT_STATE_ACTIVE){
						//Zen.debug("THREAD TICK END TURN");
						fight.endTurn();
					}else if(fight.get_state() < Constants.FIGHT_STATE_ACTIVE){
						//Zen.debug("THREAD TICK START FIGHT");
						fight.startFight();
					}else{
						this.pause();
						fight = null;
					}
				}
			}else{
				Zen.debug("FT TICK PAUSED (fight null) !");
				this.pause();
			}
		}
	}
	
	
	public static class CraftThread extends ModalT{
		public Metier job = null;
		public Personnage perso = null;
		public CraftThread(String name, Personnage perso, Metier m) {
			super(name);
			this.setThread(this, name);
			this.job = m;
			this.perso = perso;
		}
		@Override
		public void executeAbstractTask() {
			//perso.getMetierByID(job.getId())..craft();
		}
	}
	
	public static class IAThread extends ModalT{
		public Fight fight = null;
		public Fighter f = null;
		public IAThread(String name, Fight fight, Fighter f) {
			super(name);
			this.setThread(this, name);
			this.fight = fight;
			this.f = f;
		}
		@Override
		public void executeAbstractTask() {
			this.pause();
			//IAkanido ia = new IAkanido(f, fight, false);
			//ia.startIA();
			//ia = null;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {e.printStackTrace();}
			new IAkanido(f, fight, false).startIA();
			Zen.debug("new IA Kanido done");
			this.f = null;
			this.fight = null;
			//Zen.debug("shizzles = null");
		}
	}
	
	public static class GTTThread extends ModalT{
		public game.GameThread client = null;
		public GTTThread(String name, game.GameThread client) {
			super(name);
			this.setThread(this, name);
			this.client = client;
			if(client != null){
				SM.Realm.HG(client.get_out());
			}
		}
		@Override
		public void executeAbstractTask() {
			String packet = "";
			char charCur[] = new char[1];
	    	try {
				while(client.get_in().read(charCur, 0, 1) != -1 && this.isRunning())
				{
					if (charCur[0] != '\u0000' && charCur[0] != '\n' && charCur[0] != '\r' )
					{
						//if(Zen.charIsOk(charCur[0])){
							packet += charCur[0];
						//}
					}else if(!packet.isEmpty())
					{
						packet = CryptManager.toUnicode(packet);
						GameServer.addToSockLog("Game: Recv << "+packet);
						client.parseTask();
						client.parsePacket(packet);
						packet = "";
					}
				}
			} catch (IOException e) {e.printStackTrace();}
			this.restart();
			this.tick();
		}
		public void setClient(game.GameThread client) {
			this.client = client;
			if(client != null){
				SM.Realm.HG(client.get_out());
			}
		}
		public game.GameThread getClient() {
			return client;
		}
	}
	
	
	
	*/
	
	public static class UtilityThread extends ModalT{
		//private Misc.Tests.Perfs p = new Misc.Tests.Perfs();
		public UtilityThreadA type = null;
		public Object obj = null;
		/**
		 * @param obj - Un GServer pour le type REGENERATE_LIFE. 
		 * <p> 			Un SchedulingBuffer pour le type SCHEDULED_BUFFER.
		 * <p>          Une City pour le type MOVE_TROUPS
		 * <p>          Un GServer pour les types DAILY
		 */
		public UtilityThread(String name, UtilityThreadA type, Object obj) {
			super(name);
			this.setThread(this, name);
			this.type = type;
			this.obj = obj;
		}
		@Override
		public void executeAbstractTask(){ 
			//p.restartTiming();
			/*if(type == REGENERATE_LIFE){
				//Perfs perf = new Perfs();
				//pour ceux qui sont assis/couchés
				((GServer)obj).lifeRegen.regenerate();
				
				//Pour tout le monde qui sont pas en combat
				for(GPersonnage p : ((GServer)obj).getWorld().getPersos().values()){
					if(p.getFight() == null){
						if(p.getStatistique().incrementPdv(1)){
							SM.Account.As(p.getClient().getSession(), p);
						}
					}
				}
				//perf.stopTiming("Régénérer la vie.");
			}else*/ if(type == SCHEDULED_BUFFER){
				((SchedulingBuffer)obj).executeSchedules();
			}else if(type == DAILY){
				/*if(Zen.DAILY_EVENTS){
					DailyEvents.changeEvent();
				}
				if(Zen.DAILY_CHALLENGES){
					DailyChallenge.timeFinished();
				}*/
			}else if(type == MOVE_MOBS){
				
			}else if(type == MOVE_TROUPS){
				/*for(City city : Heroes.getCities()){
					if(city != null){
						synchronized(city.getOutTroups()){
							for(Troup troup : city.getOutTroups()){
								troup.moveToNextMap();
							}
						}
					}
				}*/
			}
			//p.stopTiming("Factory.UT.executeAbstractTask ("+type.name()+")");
		}
		public void nullalize(){
			this.obj = null;
			this.type = null;
		}
		
	}
	
	
}

