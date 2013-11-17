import java.util.Locale;
import org.xml.sax.AttributeList;
import org.xml.sax.DocumentHandler;
import org.xml.sax.SAXParseException;

class aUv extends cIT
{
  private Object dTF;
  private Object eVk;
  private bTW aOO;
  private bTW eVl = null;
  private wZ aOL;

  public aUv(si paramsi, DocumentHandler paramDocumentHandler, Object paramObject, bTW parambTW, wZ paramwZ)
  {
    super(paramsi, paramDocumentHandler);

    if ((paramObject instanceof bew))
      this.dTF = ((bew)paramObject).bsm();
    else {
      this.dTF = paramObject;
    }
    this.aOO = parambTW;
    this.aOL = paramwZ;
  }

  public void a(String paramString, AttributeList paramAttributeList)
  {
    Class localClass = this.dTF.getClass();
    wE localwE = wE.a(si.c(this.iGV), localClass);
    try
    {
      String str = paramString.toLowerCase(Locale.ENGLISH);
      if ((this.dTF instanceof aQS)) {
        aQS localaQS = new aQS(str);
        localaQS.b(si.c(this.iGV));
        ((aQS)this.dTF).a(localaQS);
        this.eVk = localaQS;
      } else {
        this.eVk = localwE.c(si.c(this.iGV), this.dTF, str);
      }
      si.a(this.iGV, this.eVk, paramAttributeList);

      this.eVl = new bTW(this.eVk, paramString);
      this.eVl.a(paramAttributeList);
      this.aOO.c(this.eVl);
    } catch (cJ localcJ) {
      throw new SAXParseException(localcJ.getMessage(), si.b(this.iGV), localcJ);
    }
  }

  public void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.eVl.b(paramArrayOfChar, paramInt1, paramInt2);
  }

  public void startElement(String paramString, AttributeList paramAttributeList)
  {
    if ((this.eVk instanceof aFO))
    {
      new kT(this.iGV, this, (aFO)this.eVk, this.eVl, this.aOL).a(paramString, paramAttributeList);
    }
    else
      new aUv(this.iGV, this, this.eVk, this.eVl, this.aOL).a(paramString, paramAttributeList);
  }
}