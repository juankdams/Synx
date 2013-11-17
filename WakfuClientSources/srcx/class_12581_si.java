import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import org.xml.sax.AttributeList;
import org.xml.sax.DTDHandler;
import org.xml.sax.DocumentHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.XMLReaderAdapter;

public class si extends dhB
{
  private static final wh aIk = wh.Fo();
  private Parser bao;
  private FF aIn;
  private File bap;
  private File baq;
  private Locator locator;
  private wZ bar = new wZ();

  public si()
  {
    this.bar.setName("");
  }

  public void a(FF paramFF, Object paramObject)
  {
    if (!(paramObject instanceof File)) {
      throw new cJ("Only File source supported by default plugin");
    }

    File localFile = (File)paramObject;
    FileInputStream localFileInputStream = null;
    InputSource localInputSource = null;

    this.aIn = paramFF;
    this.bap = new File(localFile.getAbsolutePath());
    this.baq = new File(this.bap.getParent());
    try
    {
      try {
        this.bao = cAQ.getParser();
      } catch (cJ localcJ1) {
        this.bao = new XMLReaderAdapter(cAQ.getXMLReader());
      }
      String str = aIk.aU(localFile.getAbsolutePath());
      localFileInputStream = new FileInputStream(localFile);
      localInputSource = new InputSource(localFileInputStream);
      localInputSource.setSystemId(str);
      paramFF.d("parsing buildfile " + localFile + " with URI = " + str, 3);
      localObject1 = new dUZ(this);
      this.bao.setDocumentHandler((DocumentHandler)localObject1);
      this.bao.setEntityResolver((EntityResolver)localObject1);
      this.bao.setErrorHandler((ErrorHandler)localObject1);
      this.bao.setDTDHandler((DTDHandler)localObject1);
      this.bao.parse(localInputSource);
    } catch (SAXParseException localSAXParseException) {
      localObject1 = new aaA(localSAXParseException.getSystemId(), localSAXParseException.getLineNumber(), localSAXParseException.getColumnNumber());

      Exception localException = localSAXParseException.getException();
      if ((localException instanceof cJ)) {
        cJ localcJ2 = (cJ)localException;
        if (localcJ2.gu() == aaA.cOW) {
          localcJ2.a((aaA)localObject1);
        }
        throw localcJ2;
      }
      throw new cJ(localSAXParseException.getMessage(), localException, (aaA)localObject1);
    } catch (SAXException localSAXException) {
      Object localObject1 = localSAXException.getException();
      if ((localObject1 instanceof cJ)) {
        throw ((cJ)localObject1);
      }
      throw new cJ(localSAXException.getMessage(), (Throwable)localObject1);
    } catch (FileNotFoundException localFileNotFoundException) {
      throw new cJ(localFileNotFoundException);
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      throw new cJ("Encoding of project file is invalid.", localUnsupportedEncodingException);
    } catch (IOException localIOException) {
      throw new cJ("Error reading project file: " + localIOException.getMessage(), localIOException);
    } finally {
      wh.c(localFileInputStream);
    }
  }

  private static void a(si paramsi, DocumentHandler paramDocumentHandler, wZ paramwZ, String paramString, AttributeList paramAttributeList)
  {
    if (paramString.equals("description"))
      new dSi(paramsi, paramDocumentHandler);
    else if (paramsi.aIn.PL().get(paramString) != null)
      new cHe(paramsi, paramDocumentHandler, paramwZ).a(paramString, paramAttributeList);
    else
      new kT(paramsi, paramDocumentHandler, paramwZ, null, paramwZ).a(paramString, paramAttributeList);
  }

  private void a(Object paramObject, AttributeList paramAttributeList)
  {
    String str = paramAttributeList.getValue("id");
    if (str != null)
      this.aIn.g(str, paramObject);
  }
}