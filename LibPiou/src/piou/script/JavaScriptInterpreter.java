package piou.script;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

import javax.script.ScriptContext;
import javax.script.ScriptException;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;

import com.sun.script.javascript.RhinoScriptEngine;

public class JavaScriptInterpreter implements Interpreter {
    
    private RhinoScriptEngine engine = new RhinoScriptEngine();

    public JavaScriptInterpreter() {
		// engine.getContext().getScopes().add(ScriptContext.GLOBAL_SCOPE);
    }

    @Override
    public Object getEngine(){
    	return engine;
    }
    
    @Override
    public Object eval(String script) {
        try {
            return engine.eval(script);
        } catch (Throwable ex) {
            return ex;
        }
    }

    @Override
    public Object eval(File file) {
        try {
            return engine.eval(new FileReader(file));
        } catch (Throwable ex) {
            return ex;
        }
    }

	@Override
	public Object eval(Reader reader) {
		 try {
	         return engine.eval(reader);
	        } catch (Throwable ex) {
	            return ex;
	        }
	}
    
    @Override
    public Object get(String var) {
        try {
            return engine.get(var);
        } catch (Throwable ex) {
            return ex;
        }
    }

    @Override
    public Object set(String var, Object value) {
        try {
            engine.put(var, value);
            return true;
        } catch (Throwable ex) {
            return ex;
        }
    }

    @Override
    public Object unset(String var) {
        try {
            engine.put(var, null);
            return true;
        } catch (Throwable ex) {
            return ex;
        }
    }

	@Override
	public Object invoke(String functionName, Object... others) {
		try {
			return engine.invokeFunction(functionName, others);
		} catch (ScriptException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
	
    
}
