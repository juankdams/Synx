package XML;

import java.io.File;
import java.io.IOException;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;


public class LangConfig {

	
	
	public static void read(){
		//http://www.mkyong.com/java/how-to-read-xml-file-in-java-jdom-example/
		SAXBuilder builder = new SAXBuilder();
		File xmlFile = new File(Config.i18nConfigName);
		try {
	 
			Document document = (Document) builder.build(xmlFile);
			Element rootNode = document.getRootElement();
			Element frenchNode = rootNode.getChild(rootNode.getAttributeValue("FRANCAIS"));
			Element englishNode = rootNode.getChild(rootNode.getAttributeValue("ENGLISH"));
			
			for(Enums.i18n l : Enums.i18n.values()){
				if(frenchNode.getAttribute(l.toString()) != null
					&& englishNode.getAttribute(l.toString()) != null
				){
					//Syn.d("Les deux non-nulls");
					l.setValue(
							frenchNode.getAttributeValue(l.toString()), 
							englishNode.getAttributeValue(l.toString())
							);
				}else if(frenchNode.getAttribute(l.toString()) != null){
					//Syn.d("Francais non-null");
					l.setValue(
							frenchNode.getAttributeValue(l.toString()), 
							frenchNode.getAttributeValue(l.toString())
							);
				}else if(englishNode.getAttribute(l.toString()) != null){
					//Syn.d("Anglais non-null");
					l.setValue(
							englishNode.getAttributeValue(l.toString()), 
							englishNode.getAttributeValue(l.toString())
							);
				}
			}
			
		} catch (IOException io) {
			System.out.println(io.getMessage());
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		}
		
	}
	
	
	
	
	
	
}
