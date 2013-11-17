import org.xml.sax.AttributeList;
import org.xml.sax.DocumentHandler;
import org.xml.sax.HandlerBase;
import org.xml.sax.Parser;
import org.xml.sax.SAXParseException;

class cIT extends HandlerBase
{
  protected DocumentHandler iGU;
  si iGV;

  public cIT(si paramsi, DocumentHandler paramDocumentHandler)
  {
    this.iGU = paramDocumentHandler;
    this.iGV = paramsi;

    si.a(paramsi).setDocumentHandler(this);
  }

  public void startElement(String paramString, AttributeList paramAttributeList)
  {
    throw new SAXParseException("Unexpected element \"" + paramString + "\"", si.b(this.iGV));
  }

  public void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    String str = new String(paramArrayOfChar, paramInt1, paramInt2).trim();

    if (str.length() > 0)
      throw new SAXParseException("Unexpected text \"" + str + "\"", si.b(this.iGV));
  }

  public void endElement(String paramString)
  {
    si.a(this.iGV).setDocumentHandler(this.iGU);
  }
}