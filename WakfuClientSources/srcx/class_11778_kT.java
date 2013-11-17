import org.xml.sax.AttributeList;
import org.xml.sax.DocumentHandler;

class kT extends cIT
{
  private wZ aOL;
  private aFO aOM;
  private aGK aON;
  private bTW aOO;
  private bTW aOP = null;

  public kT(si paramsi, DocumentHandler paramDocumentHandler, aFO paramaFO, bTW parambTW, wZ paramwZ)
  {
    super(paramsi, paramDocumentHandler);
    this.aOM = paramaFO;
    this.aOO = parambTW;
    this.aOL = paramwZ;
  }

  public void a(String paramString, AttributeList paramAttributeList)
  {
    try
    {
      this.aON = si.c(this.iGV).bL(paramString);
    }
    catch (cJ localcJ)
    {
    }
    if (this.aON == null) {
      this.aON = new aQS(paramString);
      this.aON.b(si.c(this.iGV));

      this.aON.dt(paramString);
    }
    this.aON.a(new aaA(si.b(this.iGV)));
    si.a(this.iGV, this.aON, paramAttributeList);

    this.aON.d(this.aOL);
    this.aOM.a(this.aON);
    this.aON.init();
    this.aOP = this.aON.aSJ();
    this.aOP.a(paramAttributeList);
    if (this.aOO != null)
      this.aOO.c(this.aOP);
  }

  public void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    this.aOP.b(paramArrayOfChar, paramInt1, paramInt2);
  }

  public void startElement(String paramString, AttributeList paramAttributeList)
  {
    if ((this.aON instanceof aFO))
    {
      new kT(this.iGV, this, (aFO)this.aON, this.aOP, this.aOL).a(paramString, paramAttributeList);
    }
    else
      new aUv(this.iGV, this, this.aON, this.aOP, this.aOL).a(paramString, paramAttributeList);
  }
}