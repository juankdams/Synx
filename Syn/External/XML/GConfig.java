package XML;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;
import java.util.Stack;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import Constants.CWorld;
import Core.*;

import ConfigurationObjects.Config;

public class GConfig {
	public static Logger log = LoggerFactory.getLogger(GConfig.class);
	
	//Overall
/*	public static boolean debug = false;
	public static boolean ConnexionQueue = false;
	public static byte numberOfWorldsToOpen = 1;
	public static short maxCoPerServer = 500;
	/** TODO maxPersoPerAccount 5+1 pour héroique* /
	public static byte maxPersoPerAccount = 5;
	public static Config[] configs = null;
*/	
	
	//ByServer
//	protected boolean isOpened = false;
//	protected String DBName = "";
//	protected String DBUser = "";
//	protected String DBPass = "";
	
	
	
/*	public static void read() throws XMLStreamException, FileNotFoundException{
		XMLStreamReader r = XML.Config.createReader(XML.Config.gConfigName);
		int i = 0;
		Stack<Config> s = new Stack<Config>();
		while(r.hasNext()) {
			if( r.getEventType() == XMLStreamConstants.START_ELEMENT){
				String name = r.getName().toString();
				if(name.equals("GConfig")){
					debug = r.getAttributeValue(null, "DEBUG").equalsIgnoreCase("TRUE");
					maxCoPerServer = Short.parseShort(r.getAttributeValue(null, "maxCoPerServer"));
					maxPersoPerAccount = Byte.parseByte(r.getAttributeValue(null, "maxPersoPerAccount"));
					ConnexionQueue = r.getAttributeValue(null, "ConnexionQueue").equalsIgnoreCase("TRUE");
				}else
				if(name.equals("GServ")){  //Element LConfig
					Config c = new Config();
					c.isOpened = r.getAttributeValue(null, "IsOpened").equalsIgnoreCase("TRUE");
					c.DBName  = r.getAttributeValue(null, "DBName");
					c.DBUser  = r.getAttributeValue(null, "DBUser");
					c.DBPass  = r.getAttributeValue(null, "DBPass");
					s.push(c);
					i++;
				}
			}
			r.next();
		} 
		configs = new Config[s.size()];
		while(i-- > 0){
			//Syn.d("i="+i);
			configs[i] = s.pop();
		}
		//Syn.d("size="+configs.length);

	}
*/
/*	
	public static void readOneConfig(Config c, Element node){
		c.isOpened = node.getAttributeValue("IsOpened").equalsIgnoreCase("TRUE");
		c.DBName  = node.getAttributeValue("DBName");
		c.DBUser  = node.getAttributeValue("DBUser");
		c.DBPass  = node.getAttributeValue("DBPass");
	}
*/	
	
	/* *
	 * Pour lire une config, mais en utilisant son nom de serveur et son worldID
	 * <p> Utilisé dans la commande console pour recharger une config d'un serveur déjà existant (load gconf)
	 */
/*	public static GConfig readConfig(String servName, String worldID){
		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File(XML.Config.gConfigName);
		try {
	 
			Document document = (Document) builder.build(xmlFile);
			List<?> list = document.getRootElement().getChildren("GServ");
			
			for (int i = 0; i < list.size(); i++) {
				Element node = (Element) list.get(i);
				if(node.getAttributeValue("ServerName").equalsIgnoreCase(servName) 
						&& node.getAttributeValue("worldID").equals(worldID)){
					//boolean can = configs[i].readOneConfig(node);
					//boolean can = 
						readOneConfig(configs[i], node);
					/*if(can == false){
						//XXX Config invalide: CWorldID invalide 
						log.error("GConfig invalide: CWorldID = "+node.getAttributeValue("worldID")+", ServerName = "+servName);
						//ERREUR ERREUR ERREUR
						return null;
					}* /
					Syn.d("Done !");
					break;
				}
			}
	 
		} catch (IOException io) {
			System.out.println(io.getMessage());
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		}
		return null;
	}
*/	 
	
	/**
	 * Pour quand on off un serveur :)
	 * <p>Delete cette config du gconfig.xml, la gconfig n'existera donc plus sur l'emu par après qu'on ai fait un GConfig.read();
	 */
	public void deleteConfigXML(){
		
	}
	
	
	
	
	

	
	//------------------------------------------------
	
	
	
}
