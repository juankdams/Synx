package Constants;

import java.nio.charset.Charset;

public class CServers {


	protected static final int BOTH_IDLE_TIME = 300;	// en secondes
	protected static final int READ_BUFFER_SIZE = 9000;//512;	
	protected static final Charset CHARSET = Charset.forName("UTF-8");	
	protected static final String ENCODING_DELIMITER = String.valueOf((char)0);	
	protected static final String DECODING_DELIMITER = "\n" + ENCODING_DELIMITER;

	/*
	public static final short minimumIDinWorldMonstersTable = 5000;
	public static final short minimumIDinWorldSpellsTable = 5000;
	public static final short minimumIDinWorldItemSetsTable = 151;
	public static final short minimumIDinWorldItemTemplateTable = 15001;
	public static final short minimumIDinWorldMapTable = 15001;
	public static final short minimumIDinWorldIATable = 15001;
	public static final short minimumIDinWorldChallengeTable = 101;*/
	public static final short minimumWorldObjectID = 15001;
	
	
	/** direct quand on se co*/
//	public static  byte SCREEN_SERVERLIST = 0;
	/** ex: co et clique créer perso  direct */
//	public static  byte SCREEN_CHOOSENEWSERVER = 1;
	/** screen n1 + "Je Choisis mon serveur" */
//	public static  byte SCREEN_COMPLETESERVERLIST = 2;
	/** apres avoir choisi un serveur, "créer un personnage" <p>
	 * FAUX, CEST LE MEME SCREEN QUE CHARLIST, AUCUN PACKET NEST ENVOY� QUAND ON VA SUR LE PANEL DE CR�A A PARTIR DE LA CHARLIST*/ 
	//public static final byte SCREEN_CREATECHAR = 3;
	/** apres avoir choisi un serveur, liste des persos dessus */
//	public static  byte SCREEN_CHARLIST = 4;
	/** apres avoir choisi un perso */
//	public static  byte SCREEN_INGAME = 5;
	
	
	
}
