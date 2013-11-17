import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

public class cAQ
{
  private static final wh aIk = wh.Fo();

  private static SAXParserFactory parserFactory = null;

  private static SAXParserFactory iqD = null;

  private static DocumentBuilderFactory iqE = null;

  public static synchronized SAXParserFactory getParserFactory()
  {
    if (parserFactory == null) {
      parserFactory = cxt();
    }
    return parserFactory;
  }

  public static synchronized SAXParserFactory cxs()
  {
    if (iqD == null) {
      iqD = cxt();
      iqD.setNamespaceAware(true);
    }
    return iqD;
  }

  public static SAXParserFactory cxt()
  {
    try
    {
      return SAXParserFactory.newInstance();
    } catch (FactoryConfigurationError localFactoryConfigurationError) {
      throw new cJ("XML parser factory has not been configured correctly: " + localFactoryConfigurationError.getMessage(), localFactoryConfigurationError);
    }
  }

  public static Parser getParser()
  {
    try
    {
      return a(getParserFactory()).getParser();
    } catch (SAXException localSAXException) {
      throw a(localSAXException);
    }
  }

  public static XMLReader getXMLReader()
  {
    try
    {
      return a(getParserFactory()).getXMLReader();
    } catch (SAXException localSAXException) {
      throw a(localSAXException);
    }
  }

  public static XMLReader cxu()
  {
    try
    {
      return a(cxs()).getXMLReader();
    } catch (SAXException localSAXException) {
      throw a(localSAXException);
    }
  }

  public static String T(File paramFile)
  {
    return aIk.aU(paramFile.getAbsolutePath());
  }

  public static DocumentBuilder cxv()
  {
    try
    {
      return cxw().newDocumentBuilder();
    } catch (ParserConfigurationException localParserConfigurationException) {
      throw new cJ(localParserConfigurationException);
    }
  }

  private static SAXParser a(SAXParserFactory paramSAXParserFactory)
  {
    try
    {
      return paramSAXParserFactory.newSAXParser();
    } catch (ParserConfigurationException localParserConfigurationException) {
      throw new cJ("Cannot create parser for the given configuration: " + localParserConfigurationException.getMessage(), localParserConfigurationException);
    }
    catch (SAXException localSAXException) {
      throw a(localSAXException);
    }
  }

  private static cJ a(SAXException paramSAXException)
  {
    Exception localException = paramSAXException.getException();
    if (localException != null) {
      return new cJ(localException);
    }
    return new cJ(paramSAXException);
  }

  private static synchronized DocumentBuilderFactory cxw()
  {
    if (iqE == null) {
      try {
        iqE = DocumentBuilderFactory.newInstance();
      } catch (FactoryConfigurationError localFactoryConfigurationError) {
        throw new cJ("Document builder factory has not been configured correctly: " + localFactoryConfigurationError.getMessage(), localFactoryConfigurationError);
      }

    }

    return iqE;
  }
}