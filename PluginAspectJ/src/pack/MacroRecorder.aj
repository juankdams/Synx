package pack;

import java.util.HashMap;

import Core.Syn;
import Game.GClient;
import Plugins.Managers.ParsingManager;

public aspect MacroRecorder {

	public HashMap<GClient, Recorder> recorders;

	pointcut packetReceiver() : 
        execution (* ParsingManager.parse(..));
	
		//after()returning: packetReceiver(){
	    Object around(): packetReceiver(){
	    	Syn.w("[DEBUG] In Aspect MacroRecorder");
	    	Object[] args = thisJoinPoint.getArgs();
	    	for(Object arg : args){
	    		Class<?> cls = arg.getClass();  
	    		if(recorders.get(arg) != null){
	    			
	    		}
	    		Syn.w(("The type of the object is: " + cls.getName()));  
	    	}
			return proceed();
	    }  
	
	    
	   
	
	
}
