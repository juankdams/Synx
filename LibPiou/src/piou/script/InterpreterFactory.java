package piou.script;

import java.io.File;

public class InterpreterFactory {

    private static InterpreterFactory factory = new InterpreterFactory();
    
    private InterpreterFactory() {
        
    }

    public static InterpreterFactory getFactory() {
        return factory;
    }

    public static void setFactory(InterpreterFactory factory) {
        InterpreterFactory.factory = factory;
    }
    
    public Interpreter getScript(String lang) {
   /*     if (lang.equalsIgnoreCase("java") || lang.equalsIgnoreCase("jar") || lang.equalsIgnoreCase("bsh") || lang.equalsIgnoreCase("beanshell")) {
            return new JavaInterpreter();
        } else*/ if (lang.equalsIgnoreCase("javascript") || lang.equalsIgnoreCase("js")) {
            return new JavaScriptInterpreter();
        }/* else if (lang.equalsIgnoreCase("groovy")) {
            return new GroovyInterpreter();
        } else if (lang.equalsIgnoreCase("ruby") || lang.equalsIgnoreCase("jruby") || lang.equalsIgnoreCase("rb")) {
            return new RubyInterpreter();
        } else if (lang.equalsIgnoreCase("python") || lang.equalsIgnoreCase("py") || lang.equalsIgnoreCase("jython")) {
            return new PythonInterpreter();
        } else if (lang.equalsIgnoreCase("lua")) {
            return new LuaInterpreter();
        }*/
        return null;
    }

    public Interpreter getScript(File file) {
        String[] s = file.getPath().split("\\.");
        return getScript(s[s.length - 1]);
    }
}
