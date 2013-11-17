package piou.script;

import java.io.File;
import java.io.Reader;

public interface Interpreter {
    

    /**
     * 
     * @param script
     * @return Object of the Engine used to eval the code. (Ex: RhinoScriptEngine pour Javascript)
     */
    public Object getEngine();

    /**
     * 
     * @param script
     * @return Object or Exception
     */
    public Object eval(Reader reader);
	
    /**
     * 
     * @param script
     * @return Object or Exception
     */
    public Object eval(String script);
    
    /**
     * 
     * @param file 
     * @return Object or Exception
     */
    public Object eval(File file);
    
    /**
     * 
     * @param var
     * @return Object or Exception
     */
    public Object get(String var);
    
    /**
     * 
     * @param var
     * @param value
     * @return true or Exception
     */
    public Object set(String var, Object value);
    
    /**
     * 
     * @param var
     * @return true or Exception
     */
    public Object unset(String var);
    
    /**
     * Pour caller une method dans un script.
     * @param functionName - Nom de la method à caller
     * @param others - Paramètres de la method
     * @return - Objet retourné par la method
     */
    public Object invoke(String functionName, Object... others);
}
