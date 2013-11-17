package XML;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import Core.Syn;
import GameObjects.GPersonnage;
import LoginObjects.LAccount;

public class AccountsConfig {

	public static ArrayList<LAccount> accounts = new ArrayList<LAccount>();
	
	public static void read() throws FileNotFoundException, XMLStreamException{
		XMLStreamReader r = Config.createReader(Config.aConfigName);
		while(r.hasNext()) {
			if(r.getEventType() == XMLStreamConstants.ATTRIBUTE || r.getEventType() == XMLStreamConstants.START_ELEMENT){
				String name = r.getName().toString();
				if(name.equals("Account")){  //Element Account
					accounts.add(new LAccount(
						Syn.Services.serversService.getLoginServer(Integer.parseInt(r.getAttributeValue(null, "loginServerID"))), 
						Integer.parseInt(r.getAttributeValue(null, "ID")), 
						r.getAttributeValue(null, "username"), 
						r.getAttributeValue(null, "password"), 
						r.getAttributeValue(null, "pseudo"), 
						r.getAttributeValue(null, "secretquestion"), 
						r.getAttributeValue(null, "secretanswer"),
						Byte.parseByte(r.getAttributeValue(null, "gmlvl")), 
						Byte.parseByte(r.getAttributeValue(null, "community")),  
						r.getAttributeValue(null, "curIP"), 
						r.getAttributeValue(null, "isBanned").equals("1"),
						Long.parseLong(r.getAttributeValue(null, "premiumTime")), 
						Integer.parseInt(r.getAttributeValue(null, "giftID")),
						new GPersonnage[1], 
						r.getAttributeValue(null, "banks"),
						new String[1],
						new String[1],
						new String[1]
					));
				}
			}
			r.next();
		} 
		r.close();
		r = null;
	}
	
}
