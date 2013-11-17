package Core;

import Tests.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		testExceptions();
		//Redis.go();
		//Quartz.go();
		//QuartzScheduler.goTest();
		
		//DelayingFights.go();
		
		//HelloWorld hello = new HelloWorld(); //C shared memory segments
		//hello.displayMessage();
		
		//Xuggling.go();
		//FlashTransform.go();
		
		//Observing.go();
		//Scripting.go();
		
		//ArrayListRam.go();
		
		EhCache.go();
	}
	
	
	public static void testExceptions(){
		Thread.setDefaultUncaughtExceptionHandler( new Thread.UncaughtExceptionHandler(){
    		public void uncaughtException(Thread t, Throwable e) {
    			e.printStackTrace(); // you can use e.printStackTrace ( printstream ps )
    		}
    	});		
    	//System.out.println( 2/0 );  // Throw the Exception 
    	//String a = null;
    	//a.equals("");
	}
	
	private static void w(String str){
		System.out.println(str);
	}
	
	
}
