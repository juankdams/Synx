package piou.script;

import java.io.File;
import java.io.FileReader;
import org.luaj.vm2.script.LuaScriptEngine;

public class LuaInterpreter implements Interpreter{
 
    private LuaScriptEngine engine = new LuaScriptEngine();

    public LuaInterpreter() {
        
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
    
}
