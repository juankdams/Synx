package Misc;

import java.util.ArrayList;



public class Tests {

	public static class Perfs{
		private long time = 0;
		/**
		 * Start un timer de performance. */
		public Perfs(){
			this.time = System.currentTimeMillis();
		}
		/**
		 * Écrit le temps elapsed 
		 * @param nomTacheExecute
		 */
		public void stopTiming(String nomTacheExecute){
			System.out.println("Temps d'exécution de "+nomTacheExecute+": "+(System.currentTimeMillis()-this.time)+"ms");
		}
		/**
		 * Remet le timer à 0
		 */
		public void restartTiming(){
			this.time = System.currentTimeMillis();
		}
	}
	public static class MultiPerfs{
		private ArrayList<Long> times;
		
		/** 
		 * Start un nombre X de timers de performance. 
		 * Les temps demandés sont préinitialisés à System.currentTimeMillis() */
		public MultiPerfs(int X){
			this.times = new ArrayList<Long>(X);
			for(int i = X-1; i >= 0; i--){
				times.add(System.currentTimeMillis());
			}
		}
		/* *
		 * Écrit le temps elapsed 
		 * @param nomTacheExecute
		 */
		//public void stopTiming(String nomTacheExecute){
		//	System.out.println("Temps d'exécution de "+nomTacheExecute+": "+(System.currentTimeMillis()-this._time)+"ms");
		//}
		/**
		 * Remet les timers à 0 */
		public void restartTiming(){
			for(int i = times.size()-1; i >= 0; i--){
				times.set(i, System.currentTimeMillis());
			}
		}
		public ArrayList<Long> getTimes(){
			return times;
		}
		public long getMoyenne(){
			long moy = 0;
			for(long l : times){
				moy += l;
			}
			return moy / times.size();
		}
	}
	
	
	public static void testStringFormatVSStringBuilder(){
		long time = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++){
			String.format("Af%d|%d|%d|%d|%d", 1, 2, 3, 0, 22);
		}
		Utils.w("Temps d'exec avec le format:"+(System.currentTimeMillis()-time));
		time = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++){
			new StringBuilder().append("Af").append(1).append("|").append(2).append("|").append(3).append("|").append(0).append("|").append(22).toString();
		}
		Utils.w("Temps d'exec avec le StringBuilder:"+(System.currentTimeMillis()-time));
		//Résultats:
		//Temps d'exec avec le format:3094
		//Temps d'exec avec le StringBuilder:156
	}
	
	
	/**
	 * //Test les performances d'un cast (short)int
	 * <p> pour voir le temps cpu que ca prend grâce à un for d'un milliard
	 */
	 public static void testCastIntToShort() {
		 	short constant = 2345;
		 
	        short testVar = 0;
	        long start = System.nanoTime();
	        for (int i = 0, n = 1000000000; i < n; i++) {
	        	testVar = (short)(i+constant);
	        	testVar++;
	        }
	        long end = System.nanoTime();
	        long duration = end - start;
	        System.out.println("int to short (simple cast): " + duration);
	        
	        
	        
	        int testVar2 = 0;
	        long start2 = System.nanoTime();
	        for (int i = 0, n = 1000000000; i < n; i++) {
	        	testVar2 = i+constant;
	        	testVar2++;
	        }
	        long end2 = System.nanoTime();
	        long duration2 = end2 - start2;
	        System.out.println("int to int (no cast): " + duration2);
	        
	        //return duration;
	}
	
}
