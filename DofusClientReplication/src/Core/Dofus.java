package Core;

import java.util.ArrayList;

import Game.GClient;
import Handlers.GHandler;
import Handlers.LHandler;
import Login.LClient;

public class Dofus {
	
	public static ArrayList<LClient> loginClients = new ArrayList<LClient>(Config.loginServerPort);
	public static ArrayList<GClient> gameClients = new ArrayList<GClient>(Config.loginServerPort);
	public static LHandler loginHandler = new LHandler();
	public static GHandler gameHandler = new GHandler();
	
	
	public static void main(final String[] args) throws Exception
	{ 
		
		for(int i = 0; i <= Config.loginServerPort-1; i++){
			LClient c = new LClient(i);
			c.setHandler(loginHandler);
			loginClients.add(c);
			c.on();
		}
		
	}

	
	
	
	
	public static void setExceptionHandler(){
		Thread.setDefaultUncaughtExceptionHandler( new Thread.UncaughtExceptionHandler(){
    		public void uncaughtException(Thread t, Throwable e) {
    			Dofus.w("UncaughtException");
    			e.printStackTrace(); // you can use e.printStackTrace ( printstream ps )
    			//UIFactory.newMessageBoxError("Exception", e.getMessage(), mainUI.frame);
    		}
    	});		
	}
	
	public static void w(String s){
		System.out.println(s);
	}
	

	
	
	
	
	
	
	
	
	
	
}
