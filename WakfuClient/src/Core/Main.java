package Core;

import com.ankamagames.wakfu.client.WakfuClient;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//djO pingPacket = new djO((byte) 0, 0);
		//aRY co = new aRY();
		//w("aRY Connecté à : "+co.getHost()+":"+co.getPort());
		
		//System.setProperty("java.library.path", System.getProperty("java.library.path")+";C:\\Program Files (x86)\\Wakfu\\");
		//String path = System.getProperty("java.library.path");
		//System.out.println(path);
		//for(String str : path.split(";")){
		//	System.out.println(str+";");
		//}

		// args:
		// "-c" : définie la config à charger Ex: -cMACONFIG.xml
		// "-P" : 
		// "-T" :
		// "-R" : 
		// "-M" :
		// "-p" :   fp.arz = true;
		// "-t" :
		// "-L" :   System.setProperty("wakfu.language", localObject2.substring(2));
		// "-C" :   System.setProperty("wakfu.community", localObject2.substring(2));
		
		WakfuClient.main(args);
		//*/
	}
	
	public static void w(String str){
		System.out.println(str);
	}

}
