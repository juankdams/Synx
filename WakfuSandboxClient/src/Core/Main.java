

import com.ankamagames.wakfu.client.WakfuClient;


public class Main {
	
	public static String ANSI_CLS = "\u001b[2J";
	public static String ANSI_HOME = "\u001b[H";
	public static String ANSI_BOLD = "\u001b[1m";
	public static String ANSI_AT55 = "\u001b[10;10H";
	public static String ANSI_REVERSEON = "\u001b[7m";
	public static String ANSI_NORMAL = "\u001b[0m";
	public static String ANSI_WHITEONBLUE = "\u001b[37;44m";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//djO pingPacket = new djO((byte) 0, 0);
		//aRY co = new aRY();
		//w("aRY Connect� � : "+co.getHost()+":"+co.getPort());
		
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
	public static void jw(String str, org.fusesource.jansi.Ansi.Color color){
		System.out.println("\n"+Ansi.ansi().fg(color).a(str).reset()+"\n");
	}

}
