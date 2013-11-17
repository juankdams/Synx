package com.sun.script.fantom;

import java.io.InputStream;

public class FantomScriptEngine { //extends AbstractScriptEngine {
	
	//%FANTOM_HOME%
	//C:/Program Files (x86)
	public String fanExe = "C:/Users/Robyn/Desktop/fantom-1.0.65/bin/fan.exe";
	
	/**
	 * @param script - The script file location and name. <br>
	 * Exemple : C:/Program Files/myscript.fan
	 */
	public void run(String script){
		//if(script.endsWith(".fan") == false){
		//	script += ".fan";
		//}
		exec(fanExe+" "+script);
	}
	

	//passage par argument de la commande à lancer 
	private int exec(String command) { 
		try { 
			//creation du processus 
			Process p = Runtime.getRuntime().exec(command); 
			getRealtimeStream(p);
			//System.out.println("Exit value : "+p.exitValue());
			return p.exitValue();
		} catch (Exception e) { 
			e.printStackTrace();
			return 0;
		} 
	} 
	
	private void getRealtimeStream(Process p){
		try { 
			InputStream in = p.getInputStream(); 
			
			//on récupère le flux de sortie du programme 
		
			StringBuilder build = new StringBuilder(); 
			char c = (char) in.read(); 
		
			while (c != (char) -1) { 
				build.append(c); 
				c = (char) in.read(); 
				if(c == '\n'){
					System.out.println(build.toString());
					build.delete(0, build.length());
					c = (char) in.read(); 
				}
			} 
		} catch (Exception e) { 
			e.printStackTrace();
		} 
	}
	
	private StringBuilder getStream(Process p){
		try { 
			InputStream in = p.getInputStream(); 
			
			//on récupère le flux de sortie du programme 
		
			StringBuilder build = new StringBuilder(); 
			char c = (char) in.read(); 
		
			while (c != (char) -1) { 
				build.append(c); 
				c = (char) in.read(); 
			} 
			return build;
		} catch (Exception e) { 
			e.printStackTrace();
		} 
		return null;
	}

	
	/*

	@Override
	public Bindings createBindings() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object eval(String arg0, ScriptContext arg1) throws ScriptException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object eval(Reader arg0, ScriptContext arg1) throws ScriptException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ScriptEngineFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	
	*/
	

}
