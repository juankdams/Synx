package piou.script;

import java.io.File;
import java.io.FileReader;

public class JavaInterpreter implements Interpreter {
    
    private bsh.Interpreter interpreter = new bsh.Interpreter();

    public JavaInterpreter() {
        
        
    }
    
    @Override
    public Object eval(String script) {
        try {
            return interpreter.eval(script);
        } catch (Throwable ex) {
            return ex;
        }
    }
    
    @Override
    public Object eval(File file) {
        try {
            return interpreter.eval(new FileReader(file));
        } catch (Throwable ex) {
            return ex;
        }
    }
    
    @Override
    public Object get(String var) {
        try {
            return interpreter.get(var);
        } catch (Throwable ex) {
            return ex;
        }
    }
    
    @Override
    public Object set(String var, Object value) {
        try {
            interpreter.set(var, value);
            return true;
        } catch (Throwable ex) {
            return ex;
        }
    }
    
    @Override
    public Object unset(String var) {
        try {
            interpreter.unset(var);
            return true;
        } catch (Throwable ex) {
            return ex;
        }
    }
    
}
