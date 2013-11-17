package piou.script;

import java.util.ArrayList;

import javax.script.ScriptException;

public class Scripts<E extends Script> extends ArrayList<E>{

	private static final long serialVersionUID = 1L;


	public void execute(String scriptName, String function, String arguments){
		for(Script s : this){
			if(s.getFile().equals(scriptName)){
				if(s.getCompiledScript() == null){
					 InterpreterFactory.getFactory().getScript(s.getFileName()).
					 invoke(s.getMain(), (Object)s.getMainArgs());
				}else{
					try {
						s.getCompiledScript().eval();
					} catch (ScriptException e) { e.printStackTrace(); }
				}
			}
		}
	}
	
	
	
}
