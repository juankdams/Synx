package piou.script;

import com.sun.script.jruby.JRubyScriptEngine;
import java.io.File;
import java.io.FileReader;

public class RubyInterpreter implements Interpreter {
    
        
    private JRubyScriptEngine engine = new JRubyScriptEngine();

    public RubyInterpreter() {
        
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
