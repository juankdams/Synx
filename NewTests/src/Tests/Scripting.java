package Tests;

import piou.script.Interpreter;
import piou.script.InterpreterFactory;
import piou.scripts.ExecutableScript;

public class Scripting {
	
	
	public static void go(){
		ExecutableScript s = new ExecutableScript(0, "scripts/", "test.js", "test", "go", new String[]{"allo"}, "0.0.1", "description", false, null);
		s.apply(null);
		s.apply(null);
		s.apply(null);
		//Interpreter interpreter = InterpreterFactory.getFactory().getScript(s.getExtension());
		//interpreter.eval(s.getFile());
		//interpreter.invoke(s.getMain(), (Object)s.getMainArgs());
		//interpreter.invoke(s.getMain(), (Object)s.getMainArgs());
	
	}
	

}
