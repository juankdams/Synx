package XML;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;
import ConfigurationObjects.Config;

public class GConfigWriter {

	/**
	 * Delete cette config du gconfig.xml et l'enleve de l'array
	 * @param servName - Nom du serveur à supprimer
	 */
	public static void deleteGConfig(String servName){
		Config copy[] = new Config[GConfig.configs.length-1];
		Config toRem = null;
		int indexCopy = 0;
		for(Config gso : GConfig.configs){
			if(gso.getServerName().equalsIgnoreCase(servName)){//Nom du server à enlever 
				copy[indexCopy] = gso;
			}else{
				toRem = gso;
				indexCopy--;
			}
			indexCopy++;
		}
		GConfig.configs = copy;
		copy = null;
	//	toRem.terminate();
		toRem = null;
		
		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File(XML.Config.gConfigName);
		try {
			Document doc = (Document) builder.build(xmlFile);
			Element rootNode = doc.getRootElement();
	 
			List<?> list = rootNode.getChildren("GServ");
			for (int i = 0; i < list.size(); i++) {
				Element node = (Element) list.get(i);
				if(node.getAttributeValue("ServerName").equalsIgnoreCase(servName)){
					//node.removeContent();
					rootNode.removeContent(i);
				}
			}
			
			/*
			// update staff id attribute
			Element staff = rootNode.getChild("staff");
			staff.getAttribute("id").setValue("2");
	 
			// add new age element
			Element age = new Element("age").setText("28");
			staff.addContent(age);
	 
			// update salary value
			staff.getChild("salary").setText("7000");
	 
			// remove firstname element
			staff.removeChild("firstname");
			 */
			
			XMLOutputter xmlOutput = new XMLOutputter();
	 
			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter(XML.Config.gConfigName));
	 
			//xmlOutput.output(doc, System.out);
	 
			System.out.println("File updated!");
		  } catch (IOException io) {
			io.printStackTrace();
		  } catch (JDOMException e) {
			e.printStackTrace();
		  }
	}
	
	public static GConfig writeNewGConfig(String newServerName, String newWorldID){
		GConfig gc = new GConfig();
		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File(XML.Config.gConfigName);//Va prendre le fichier
		try {
			Document doc = (Document) builder.build(xmlFile);
			Element rootNode = doc.getRootElement();//Prend le rootElement (GConfig)
			Element g = new Element("GServ");//Fait un nouvel élément "GServ"
			//Ajoute des attributes au nouvel élément
			g.setAttribute("ServerName", newServerName);
			g.setAttribute("Port", "5555");
			g.setAttribute("IP", "127.0.0.1");
			g.setAttribute("IsOpened", "FALSE");
			g.setAttribute("worldID", newWorldID);
			g.setAttribute("DBName", "synworld0");
			g.setAttribute("DBUser", "root");
			g.setAttribute("DBPass", "");
			//Ajoute l'élément GServ au rootElement GConfig
			rootNode.addContent(g);
			//List<?> list = rootNode.getChildren("GServ");
			
			XMLOutputter xmlOutput = new XMLOutputter();
			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter(XML.Config.gConfigName));
		 } catch (IOException io) {
			io.printStackTrace();
		 } catch (JDOMException e) {
			e.printStackTrace();
		 }
		 return gc;
	}
	
	/**
	 * Modifie un attribut dans une des Gconfigs des GServers et update la variable aussi dans l'Instance GConfig.
	 * @param serverName
	 * @param attribute
	 * @param newValue
	 */
	public static void modifyGConfig(String serverName, String attribute, String newValue){
		// http://www.mkyong.com/java/how-to-modify-xml-file-in-java-jdom/
		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File(XML.Config.gConfigName);
		try {
			Document doc = (Document) builder.build(xmlFile);
			Element rootNode = doc.getRootElement();
	 
			List<?> list = rootNode.getChildren("GServ");
			for (int i = 0; i < list.size(); i++) {
				Element node = (Element) list.get(i);
				if(node.getAttributeValue("ServerName").equals(serverName)){
					node.setAttribute(attribute, newValue);
					for(Config g : GConfig.configs){
						if(g.getServerName().equals(serverName)){
							//Fait relire la config pour modifier la variable ds l'emu à la bonne valeur
							GConfig.readOneConfig(g, node);
							break;
						}
					}
					break;
				}
			}
			
			
			XMLOutputter xmlOutput = new XMLOutputter();
			// display nice nice
			xmlOutput.setFormat(Format.getPrettyFormat());
			xmlOutput.output(doc, new FileWriter(XML.Config.gConfigName));
	 
			// xmlOutput.output(doc, System.out);
	 
			System.out.println("File updated!");
		  } catch (IOException io) {
			io.printStackTrace();
		  } catch (JDOMException e) {
			e.printStackTrace();
		  }
	}
	
	
	
	
	
	
	
	
}