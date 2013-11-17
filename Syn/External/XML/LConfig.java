package XML;


import java.io.FileNotFoundException;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import Login.LServer;


public class LConfig{

	public static String LOGIN_IP = "127.0.0.1";
	public static short LOGIN_PORT = 670;
	//   SQL---
	public static String DB_HOSTIP = "127.0.0.1";
	public static short DB_PORT = 3306;
	public static String DB_NAME = "syn";
	public static String DB_USERNAME = "root";
	public static String DB_PASSWORD = "";
	//Else
	public static byte MAX_CO_PER_IP = 0;
	
	//(Une db contenant les comptes pour le login serv 
	// 		et une db contenant le reste pour chaque world
	
	public static void read() throws FileNotFoundException, XMLStreamException{
		XMLStreamReader r = Config.createReader(Config.lConfigName);
		
		while(r.hasNext()) {
			if(r.getEventType() == XMLStreamConstants.ATTRIBUTE || r.getEventType() == XMLStreamConstants.START_ELEMENT){
				String name = r.getName().toString();
				if(name.equals("LConfig")){  //Element LConfig
					LOGIN_IP = r.getAttributeValue(null, "LoginIP");
					LOGIN_PORT = Short.parseShort(r.getAttributeValue(null, "LoginPort"));
					MAX_CO_PER_IP = Byte.parseByte(r.getAttributeValue(null, "MAX_CO_PER_IP"));
				}else if(name.equals("SQL")){  //Element SQL
					DB_HOSTIP = r.getAttributeValue(null, "HostIP");
					DB_PORT = Short.parseShort(r.getAttributeValue(null, "Port"));
					DB_USERNAME = r.getAttributeValue(null, "Username");
					DB_PASSWORD = r.getAttributeValue(null, "Password");
					DB_NAME = r.getAttributeValue(null, "dbName");
				}
			}
			r.next();
		} 
		
		LServer.setPort(LConfig.LOGIN_PORT);
		LServer.setIp(LConfig.LOGIN_IP);
		
		r.close();
		r = null;
		
	}
}