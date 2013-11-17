package piou.scripts;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import javax.script.ScriptException;

import piou.script.Interpreter;
import piou.script.InterpreterFactory;
import piou.script.Script;
import Interfaces.IExecutable;

public class ExecutableScript extends Script implements IExecutable{
	
	private int ID = 0;
	Interpreter interpreter;
	Future<?> future;

	public ExecutableScript(int ID, String url, String fileName, String name, String main, String[] mainArgs, String version, String description, boolean precompile, Future<?> future) {
		super(url, fileName, name, main, mainArgs, version, description, precompile);
		this.ID = ID;
		setFuture(future);
		interpreter = InterpreterFactory.getFactory().getScript(this.getExtension());
		interpreter.eval(this.getFile());
	}

	public void reEval(){
		interpreter.eval(this.getFile());
	}
	
	/**
	 * @param objects - Pour GEffets : { AbstractCharacterCaster, AbstractCharacterTarget, ParameterHolder };
	 * @param objects - Pour GActions : { GPersonnageCaster, targetSprite, targetCell };
	 * @param objects - Pour Network : { ElectricalFlow };
	 * @param objects - Pour ExecutableScript : { On donne souvent le GServer, mais ce sont les arguments qu'on veut donner au script sans compter les MainArgs qui sont des strings loadées en bdd };
	 */ 
	@Override 
	public void apply(Object[] param) {
		if(this.getCompiledScript() != null){
			try {
				this.getCompiledScript().eval();
			} catch (ScriptException e) {
				e.printStackTrace();
			}
		}else{
			//interpreter = InterpreterFactory.getFactory().getScript(this.getExtension());
			//interpreter.eval(this.getFile());
			interpreter.invoke(this.getMain(), param, this.getMainArgs());
			//interpreter = null;
		}
	}

	public void setFuture(Future<?> future) {
		this.future = future;
	}
	public Future<?> getFuture() {
		return future;
	}
	
	/**
	 * Concernant l'utilisation dans l'émulateur Syn, 
	 * en fait, il est plus que conseillé d'avoir son propre ThreadsManager avec ses ExecutorPools, etc.
	 * (C'est le même principe pour les autres methods d'exécution threadée/schédulée). 
	 * Cette method serait utilisable par contre lors de l'exécution d'un script ou IA, 
	 * ou autre endroit ou les ressources sont limités (Pas d'accès à un réel ThreadsManager);
	 * donc en dernier recours. <br>
	 * Tu devrais donc utiliser qqc comme ceci à la place de applySimpleThreading :
	 * <br><br>
	 * <pre>{@code
	 * Task<Object> task = server.threadsManager.getTaskFactory().newScriptingTask(script, s);
	 * Future<Object> = server.threadsManager.executeDirectTask(task);
	 * }</pre>
	 * <br><br>
	 * Ou sinon avec le ThreadManager par défaut : 
	 * <br><br>
	 * <pre>{@code
	 * Task<Object> task = Syn.Services.threadsManager.getTaskFactory().newScriptingTask(script, null);
	 * Future<Object> = Syn.Services.threadsManager.executeDirectTask(task);
	 * }</pre>
	 * <br><br>
	 * @param param - Les paramètres qui seront passés à la main method appelée dans le script.
	 */ @Deprecated
	public void applySimpleThreading(Object[] param){
		this.future = Executors.newSingleThreadExecutor().submit(new ScriptExecutionTask(this, param).asCallable());
	}
	/**
	 * Voir la javadoc de applySimpleThreading, cette method ne devrait pas être utilisée.
	 */ @Deprecated
	public void applySimpleDelayedScheduling(Object[] param, TimeUnit units, long delay){
		this.future = Executors.newSingleThreadScheduledExecutor().schedule(new ScriptExecutionTask(this, param).asCallable(), delay, units);
	}
	/**
	 * Voir la javadoc de applySimpleThreading, cette method ne devrait pas être utilisée.
	 */ @Deprecated
	public void applySimpleDelayedSchedulingAtFixedRate(Object[] param, TimeUnit units, long delay, long interval){
		this.future = Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new ScriptExecutionTask(this, param), delay, interval, units);
	}
	
	public void setID(int iD) {
		ID = iD;
	}


	public int getID() {
		return ID;
	}

	@Deprecated
	private static class ScriptExecutionTask implements Callable<ExecutableScript>, Runnable{
		ExecutableScript es;
		Object[] params;
		public ScriptExecutionTask(ExecutableScript es, Object[] params){
			this.es = es;
			this.params = params;
		}
		@Override
		public ExecutableScript call() throws Exception {
			this.es.apply(params);
			return es;
		}
		@Override
		public void run() {
			try {
				call();
			} catch (Exception e) { e.printStackTrace(); }
		}
		public Callable<ExecutableScript> asCallable(){
			return this;
		}
	}
	
	
	
	

}
