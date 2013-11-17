package XML;

import java.io.FileNotFoundException;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import Constants.CWorld;

public class WorldsConfig {

	

	public static void read() throws FileNotFoundException, XMLStreamException{
		XMLStreamReader r = Config.createReader(Config.wConfigName);
		
		while(r.hasNext()) {
			if(r.getEventType() == XMLStreamConstants.ATTRIBUTE || r.getEventType() == XMLStreamConstants.START_ELEMENT){
				String name = r.getName().toString();
				/*if(name.equals("World")){  //Elements Worlds
					CWorld.worlds.add(new CWorld(
							r.getAttributeValue(null, "n"),
							Short.parseShort(r.getAttributeValue(null, "ID")),
							r.getAttributeValue(null, "d"),
							r.getAttributeValue(null, "l"),
							Byte.parseByte(r.getAttributeValue(null, "p")),
							Byte.parseByte(r.getAttributeValue(null, "t")),
							Byte.parseByte(r.getAttributeValue(null, "c")),
							r.getAttributeValue(null, "date"),
							r.getAttributeValue(null, "rlng").split("-")
							));
				}
				*/
				if(name.equals("Community")){  //Elements Communities
					CWorld.communities.add(new CWorld.Community(
							r.getAttributeValue(null, "n"),
							Byte.parseByte(r.getAttributeValue(null, "i")),
							r.getAttributeValue(null, "d").equals("true"),
							r.getAttributeValue(null, "c").split("-")
							));
				}
			}
			r.next();
		} 
		
		r.close();
		r = null;
	}
	
	
	
}