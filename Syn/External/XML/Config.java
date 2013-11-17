package XML;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.stream.Location;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLReporter;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import GameClientStrategies.GameClientStrategies;
import GameClientStrategies.GameClientStrategy;
import Interfaces.IService;

public class Config implements IService {

	private static Element rootNode = null;
	private static Element clientStrategiesNode = null;
	private static Document document = null;

	//private static XMLStreamReader r = null;
	
	public static String wConfigName = "";
	public static String aConfigName = "";
	public static String i18nConfigName = "";
	
	public static String exceptionsLogFileName = "";
	public static String bugLogFileName = "";
	public static String debugLogFileName = "";
	public static String testLogFileName = "";
	
	public static String emulatorName = "";
	public static String emulatorCreatorName = "";
	
	public static String dataWorldName = "";//Dossier pour les dump des tables des bdd de world
	public static String dataSynName = "";//Dossier pour les dump des tables de la bdd login
	
	public static boolean debugMode = true;
	//public static boolean usePlugins = true;

	public static String synDBIP   = "";
	public static String synDBName = "";
	public static String synDBUser = "";
	public static String synDBPass = "";

	public static String zenDBIP = "";
	public static String zenDBName = "";
	public static String zenDBUser = "";
	public static String zenDBPass = "";
	
	

	@Override
	public void boot() throws Exception {
		//r = createReader("config.xml");
		build();
		read();
	}

	@Override
	public void reboot() throws Exception {
		read();
	}
	

	private void read(){
		dataWorldName = rootNode.getAttributeValue("DataWorldName");
		dataSynName = rootNode.getAttributeValue("DataSynName");

		wConfigName = rootNode.getAttributeValue("WConfigName");
		i18nConfigName = rootNode.getAttributeValue("i18nConfigName");
		
		exceptionsLogFileName = rootNode.getAttributeValue("ExceptionsLogName");
		bugLogFileName = rootNode.getAttributeValue("BugLogName");
		debugLogFileName = rootNode.getAttributeValue("DebugLogName");
		testLogFileName = rootNode.getAttributeValue("TestLogName");
		
		
		emulatorName = rootNode.getAttributeValue("emulatorName");
		emulatorCreatorName = rootNode.getAttributeValue("emulatorCreatorName");
		
		debugMode = rootNode.getAttributeValue("DEBUG").equals("TRUE");
		//usePlugins = rootNode.getAttributeValue("PLUGINS").equals("TRUE");

		synDBIP   = rootNode.getAttributeValue("synDBIP"  );
		synDBName = rootNode.getAttributeValue("synDBName");
		synDBUser = rootNode.getAttributeValue("synDBUser");
		synDBPass = rootNode.getAttributeValue("synDBPass");

		zenDBIP   = rootNode.getAttributeValue("zenDBIP"  );
		zenDBName = rootNode.getAttributeValue("zenDBName");
		zenDBUser = rootNode.getAttributeValue("zenDBUser");
		zenDBPass = rootNode.getAttributeValue("zenDBPass");
		
		for(Object e : clientStrategiesNode.getChildren()){
			if(e instanceof Element){
				Element strategy = (Element) e;
				GameClientStrategies.values();
				GameClientStrategy gcs = GameClientStrategies.get(strategy.getName());
				gcs.globalDBIP = strategy.getAttributeValue("globalDBIP");
				gcs.globalDBName = strategy.getAttributeValue("globalDBName");
				gcs.globalDBPass = strategy.getAttributeValue("globalDBPass");
				gcs.globalDBUser = strategy.getAttributeValue("globalDBUser");
			}
		}
	}
		
	/*
	private void read() throws FileNotFoundException, XMLStreamException{
		while(r.hasNext()) {
			if(r.getEventType() == XMLStreamConstants.ATTRIBUTE || r.getEventType() == XMLStreamConstants.START_ELEMENT){
				String name = r.getName().toString();
				if(name.equals("Config")){  //Element Config
					dataWorldName = r.getAttributeValue(null, "DataWorldName");
					dataSynName = r.getAttributeValue(null, "DataSynName");

					wConfigName = r.getAttributeValue(null, "WConfigName");
					i18nConfigName = r.getAttributeValue(null, "i18nConfigName");
					
					exceptionsLogFileName = r.getAttributeValue(null, "ExceptionsLogName");
					bugLogFileName = r.getAttributeValue(null, "BugLogName");
					debugLogFileName = r.getAttributeValue(null, "DebugLogName");
					testLogFileName = r.getAttributeValue(null, "TestLogName");
					
					
					emulatorName = r.getAttributeValue(null, "emulatorName");
					emulatorCreatorName = r.getAttributeValue(null, "emulatorCreatorName");
					
					debugMode = r.getAttributeValue(null, "DEBUG").equals("TRUE");
					//usePlugins = r.getAttributeValue(null, "PLUGINS").equals("TRUE");

					synDBIP   = r.getAttributeValue(null, "synDBIP"  );
					synDBName = r.getAttributeValue(null, "synDBName");
					synDBUser = r.getAttributeValue(null, "synDBUser");
					synDBPass = r.getAttributeValue(null, "synDBPass");

					zenDBIP   = r.getAttributeValue(null, "zenDBIP"  );
					zenDBName = r.getAttributeValue(null, "zenDBName");
					zenDBUser = r.getAttributeValue(null, "zenDBUser");
					zenDBPass = r.getAttributeValue(null, "zenDBPass");
					
					while(r.get){
						
						globalDBIP   = r.getAttributeValue(null, "globalDBIP"  );
						globalDBName = r.getAttributeValue(null, "globalDBName");
						globalDBUser = r.getAttributeValue(null, "globalDBUser");
						globalDBPass = r.getAttributeValue(null, "globalDBPass");
					}
				}
			}
			r.next();
		} 
		
		r.close();
	}
	*/
	
	private static void build(){
		//http://www.mkyong.com/java/how-to-read-xml-file-in-java-jdom-example/
		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File("Z:/Dropbox/Private/Synx/Syn/config.xml");
		try {
			document = (Document) builder.build(xmlFile);
			rootNode = document.getRootElement();
			clientStrategiesNode = rootNode.getChild("GameClientStrategies");
		} catch (IOException io) {
			System.out.println(io.getMessage());
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		}
	}
	
	
	public static XMLStreamReader createReader(String configName) throws FileNotFoundException, XMLStreamException{
		File file = new File(configName);
		FileReader fr = new FileReader(file);
		XMLInputFactory f = XMLInputFactory.newInstance();
		XMLStreamReader r = f.createXMLStreamReader(fr);
		f.setXMLReporter(new XMLReporter() {
			@Override
			public void report(String message, String typeErreur, Object relatedInformation, Location location)throws XMLStreamException {
				System.out.println("Erreur de type : " + typeErreur + ", message : " + message);
				
			}
	    });
		return r;
	}
	
	public static XMLStreamWriter createWriter(String configName) throws IOException, XMLStreamException{
		//OutputStream out = new FileOutputStream("data.xml");
		//XMLOutputFactory factory = XMLOutputFactory.newInstance();
		//XMLStreamWriter w = factory.createXMLStreamWriter(out);
		//TODO J'sais pas lequel des deux writers est le mieux, les deux marchent
		
		File file = new File(configName);
		FileWriter fw = new FileWriter(file);
		XMLOutputFactory f = XMLOutputFactory.newInstance();
		XMLStreamWriter r = f.createXMLStreamWriter(fw);
		return r;
	}
	
	
}
