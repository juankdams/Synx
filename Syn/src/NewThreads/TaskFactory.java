package NewThreads;

import piou.scripts.ExecutableScript;
import Abstractions.CombativeCharacter;
import ConfigurationObjects.SimpleIA;
import Enums.SynActions.SchedulingA;
import Game.DofusGameClient;
import Game.GameServer;
import GameObjects.Fights.GFight;
import Login.DofusLoginClient;

public class TaskFactory {
	
	
	public Task<Object> newFightTimerTask(GFight f){
		return new Task<Object>(SchedulingA.FIGHT_TIMER, f);
	}
	/** Le genre de petit scripting BS. Les Scripts d'IA sont exécutés par le thread qui exécute l'IA. */
	public Task<Object> newScriptingTask(ExecutableScript script, Object... o){
		return new Task<Object>(SchedulingA.EXE_SCRIPT, script, o);
	}
	public Task<Object> newTerminateClientTask(DofusGameClient gClient) {
		return new Task<Object>(SchedulingA.TERMINATE_CLIENT, gClient);
	}
	public Task<Object> newRemoveWaitingAccount(DofusLoginClient c, GameServer serv){
		return new Task<Object>(SchedulingA.REMOVE_WAITING_ACCOUNT, c, serv.queue);
	}
	public Task<Object> newEvaluateTask(String str){
		return new Task<Object>(Enums.SynActions.SchedulingA.EVALUATE, str);
	}
	public Task<Object> newFightIATask(SimpleIA ia, GameServer server, GFight gFight, CombativeCharacter currentFighter) {
		return new Task<Object>(Enums.SynActions.SchedulingA.IA, ia, server, gFight, currentFighter);
	}
	
	
}
