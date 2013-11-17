package NewThreads;

import static Enums.SynActions.SchedulingA.EVALUATE;
import static Enums.SynActions.SchedulingA.EXE_SCRIPT;
import static Enums.SynActions.SchedulingA.FIGHT_TIMER;
import static Enums.SynActions.SchedulingA.IA;
import static Enums.SynActions.SchedulingA.INVOKE;
import static Enums.SynActions.SchedulingA.REMOVE_FLOODER;
import static Enums.SynActions.SchedulingA.REMOVE_WAITING_ACCOUNT;
import static Enums.SynActions.SchedulingA.SEND_CLIENT_PACKET;
import static Enums.SynActions.SchedulingA.SERVER_PUB;
import static Enums.SynActions.SchedulingA.TERMINATE_CLIENT;

import java.lang.reflect.Method;
import java.util.concurrent.Callable;

import org.apache.mina.core.session.IoSession;

import piou.scripts.ExecutableScript;
import ConfigurationObjects.SimpleIA;
import Core.Syn;
import Enums.ChannelEnum;
import Enums.FightState;
import Enums.SynActions.ChatBufferA;
import Enums.SynActions.CommonAction;
import Enums.SynActions.SchedulingA;
import Game.DofusGameClient;
import Game.DofusGameServer;
import Game.Queue;
import GameObjects.GPersonnage;
import GameObjects.Fights.GFight;
import Login.DofusLoginClient;
import Misc.CodeInput;
import Misc.Utils;
import NewThreads.FightSchedulingStrategies.FightScheduler;
import NewThreads.FightSchedulingStrategies.FightSchedulingStrategies;
import XML.Config;

public class Task<V> implements Callable<V>, Runnable{

	private Object param[] = null;
	private SchedulingA action = null;
	

	public Task(SchedulingA action, Object... params){
		this.action = action;
		this.param = params;
	}

	@Override
	public void run() {
		try {
			call();
		} catch (Exception e) {e.printStackTrace();}
	}
	
	
	@Override
	public V call() throws Exception {
		try{
			if(action == IA){
				SimpleIA ia = (SimpleIA) param[0];
				Object[] copy = (Object[]) Utils.removeElementFromArray(param, ia);
				ia.apply(copy);
			}else
			//Syn.d("Task in execution. SchedulingA action = "+action.name());
			if(action == FIGHT_TIMER){
				GFight f = (GFight) param[0];
				if(FightSchedulingStrategies.getStrategy() instanceof FightScheduler){
					FightScheduler fs = (FightScheduler)FightSchedulingStrategies.getStrategy();
					fs.remove(f);
				}
				if(f.getState() == FightState.FINISHED.get()){
					f.endFight();
				}else
				if(f.getState() == FightState.ACTIVE.get()){
					f.endTurn();
				}else 
				if(f.getState() == FightState.PLACE.get()){
					f.startFight();
				}
				
				/*
				int n = 0;
				MultiPerfs mp = new MultiPerfs(0);
				while(true){
					//synchronized(param[0]){//lock la liste de combats
						GServer s = (GServer) param[0];
						Stack<GFight> fights = s.threadsManager.getFightsTimersPool().get(this);
						while(fights.isEmpty() == false){
							n = 0;
							for(GFight f : fights){
								long timeToWait = f.getEndTurnTime()-System.currentTimeMillis();
								mp.getTimes().add(timeToWait);
								if(timeToWait > 0){
									Thread.sleep(timeToWait);
								}
								if(f.getState() == FightState.ACTIVE.get()){
									Syn.d("In Task.Fight_Timer : going to endTurn of fight # "+f.getID()+"  after waited "+timeToWait+"ms");
									f.endTurn();
								}else if(f.getState() == FightState.PLACE.get()){
									Syn.d("In Task.Fight_Timer : going to startFight of fight # "+f.getID()+"  after waited "+timeToWait+"ms");
									f.startFight();
								}
							}
							//fights.clear();
						}
						Syn.d("In Task.Fight_Timer : Moyenne des temps de timeToWait before .endTurn() = "+mp.getMoyenne());
					//}
					if(n == 10){
						mp.getTimes().clear();
						mp = null;
						param = null;
						return null;//stop après 10 itérations sans aucun combats à faire .endTurn();
					}
					n++;
					Thread.sleep(500);
				}
				*/
			}else
			if(action == INVOKE){
				Method m = (Method) param[0];
				Object o = param[1];
				//param doesn't get modified here v as the method argument is final.
				Object[] copy = (Object[]) Utils.removeElementFromArray(param, m);
						 copy = (Object[]) Utils.removeElementFromArray(copy, o);
				m.invoke(o, copy);
			}else
			if(action == EXE_SCRIPT){
				ExecutableScript script = (ExecutableScript) param[0];
				Object[] copy = (Object[]) Utils.removeElementFromArray(param, script);
				//Syn.w("Main : "+script.getMain());
				//Syn.w("File : "+script.getFile());
				//ExecutableScript s = new ExecutableScript(0, "Syn_scripts/js/", "pub.js", "test", "go", new String[]{"allo"}, "0.0.1", "description", false, null);
				//s.apply(null);
				//Syn.w("other");
				//Interpreter interpreter = InterpreterFactory.getFactory().getScript(script.getExtension());
				//interpreter.eval(script.getFile());
				//interpreter.invoke("go");//script.getMain());//, (Object)script.getMainArgs());
				try{
				//	Syn.w("other");
					if(Config.debugMode){ 
						script.reEval();
					}
					script.apply(copy);//copy);
				}catch(Exception e){}
				/*
				 
importClass(Packages.SM.Messages);
importClass(Packages.Game.GServer);
importClass(Packages.Core.Syn);
importClass(Packages.Management.Services);
importClass(Packages.Management.Servers);
importClass(Packages.Login.LServer);


function go(){
	Syn.w("Going to go :(");
}

				 */
			}else
			if(action == EVALUATE){
				try{
					CodeInput.callMethod((String) param[0]);
				}catch(Exception e){
					Syn.log.error("Misc.CodeInput.callMethod(null,(String) param[0]);  -> "+((String) param[0]));
					e.printStackTrace();
				}
				//CodeInput.evaluate(null, (String) param[0], ((Object[])param[1]), ((String[])param[2]));
			}else
			if(action == SERVER_PUB){
				SM.Messages.MA(((String)param[1]), ((String)param[2]), ((DofusGameServer)param[0]).getWorld());
			}else
			if(action == TERMINATE_CLIENT){//param[0] = GClient.  param.length = 1;
				DofusGameClient c = (DofusGameClient)param[0];
				try {
					c.terminate();
				} catch (Throwable e) { e.printStackTrace(); }
				c = null;
				//Syn.d("Dans Task : Fini de terminater les persos et l'account");
			}else
			if(action == REMOVE_WAITING_ACCOUNT){
				//Syn.d("ScheduledTask.execute REMOVE_WAITING_ACCOUNT");
				Object removed = ((Queue)param[1]).updateQueuedAccounts(CommonAction.REMOVE, ((DofusLoginClient)param[0]).getAccount(), 0);
				if(removed != null){
					//Kick d'inactivité 1min apres avoir choisi son serveur,
					//le gars est pas encore à l'écran de sélection du perso. genre
					((DofusLoginClient)param[0]).kick();
				}
			}else
			if(action == REMOVE_FLOODER){
				//Syn.d("ScheduledTask.execute REMOVE_FLOODER. ChannelPrefix : -"+(param[0])+"-");
				((GPersonnage)param[1]).getWorld().modifyFloodLists(ChannelEnum.getChannel((Character) param[0]), ChatBufferA.REMOVE_FLOODER, ((GPersonnage)param[1]), null);
			}else 
			if(action == SEND_CLIENT_PACKET){
				for(String p : (String[])param[0]){//Envoie chaque packet
					for(IoSession s : (IoSession[])param[1]){//À chaque Session
						SM.Sender.send(s, p);
					}
				}
			}
			//Syn.d("Task done! SchedulingA action = "+action.name());
		}catch(Exception e){   //Pour m'aider à débugger en trouvant les erreurs 
			e.printStackTrace();   //dans les exceptions lancées 
		}
		return null;
	}
	
	
	

	/**
	 * Ne devrait pas être utilisé. L'action est supposée être settée dans le constructeur.
	 * @param action
	 */
	public void setAction(SchedulingA action){
		this.action = action;
	}
	
	public SchedulingA getActionID() {
		return action;
	}

	public Runnable getRunnable(){
		return this;
	}

	public Callable<V> getCallable(){
		return this;
	}
}
