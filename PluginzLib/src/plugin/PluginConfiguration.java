package plugin;

import fr.inewemu.utils.exception.ConfigurationNotFoundException;
import fr.inewemu.utils.xml.XMLReader;
//import fr.inewemu.utils.xml.XMLReader;
import java.io.File;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public final class PluginConfiguration {

    private final PluginInformation information;
    private final XMLReader xmlReader;

    PluginConfiguration(PluginInformation information, String configName) {
        this.information = information;
        SAXBuilder builder = new SAXBuilder();
        if (configName == null || configName.isEmpty()) {
            xmlReader = new XMLReader(new Element("null"));
            return;
        }
        File config = new File(configName);
        if (!config.exists()) {
            throw new ConfigurationNotFoundException(configName);
        }
        Document document = null;
        try {
            document = builder.build(config);
        } catch (JDOMException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        Element element = document.getRootElement();
        if (element == null) {
            xmlReader = new XMLReader(new Element("null"));
            return;
        }
        xmlReader = new XMLReader(element);
    }

    public PluginInformation getInformation() {
        return information;
    }

    public XMLReader getXmlReader() {
        return xmlReader;
    }

    public Element getRootElement() {
        return xmlReader.getRoot();
    }

}
