import org.xml.sax.AttributeList;
import org.xml.sax.DocumentHandler;
import org.xml.sax.SAXParseException;

class cHe extends cIT
{
  private wZ aOL;
  private Object iCi;
  private bTW aOP = null;

  public cHe(si paramsi, DocumentHandler paramDocumentHandler, wZ paramwZ)
  {
    super(paramsi, paramDocumentHandler);
    this.aOL = paramwZ;
  }

  public void a(String paramString, AttributeList paramAttributeList)
  {
    try
    {
      this.iCi = si.c(this.iGV).bM(paramString);
      if (this.iCi == null) {
        throw new cJ("Unknown data type " + paramString);
      }
      this.aOP = new bTW(this.iCi, paramString);
      this.aOP.a(paramAttributeList);
      this.aOL.a(this.aOP);
    } catch (cJ localcJ) {
      throw new SAXParseException(localcJ.getMessage(), si.b(this.iGV), localcJ);
    }
  }

  public void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.aOP.b(paramArrayOfChar, paramInt1, paramInt2);
  }

  public void startElement(String paramString, AttributeList paramAttributeList)
  {
    new aUv(this.iGV, this, this.iCi, this.aOP, this.aOL).a(paramString, paramAttributeList);
  }
}