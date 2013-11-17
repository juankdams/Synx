import org.apache.log4j.Logger;

public class aaE extends bxE
{
  private static Logger K = Logger.getLogger(aaE.class);
  public static final String TAG = "Item";
  private String cer = null;
  private String ces = null;
  private int cOX = 0;
  private fu cev = null;

  public static final int cey = "attribute".hashCode();
  public static final int cez = "field".hashCode();

  public void a(aNL paramaNL)
  {
    if ((paramaNL instanceof fu)) {
      this.cev = ((fu)paramaNL);
    }
    super.a(paramaNL);
  }

  public String getTag() {
    return "Item";
  }

  public String getField()
  {
    return this.cer;
  }

  public void setField(String paramString)
  {
    this.cer = paramString;
  }

  public int getAttributeHash() {
    return this.cOX;
  }

  public String getAttribute()
  {
    return this.ces;
  }

  public void setAttribute(String paramString)
  {
    this.ces = paramString;
    this.cOX = (this.ces != null ? this.ces.hashCode() : 0);
  }

  public fu getResultProvider()
  {
    return this.cev;
  }

  public void setCondition(fu paramfu)
  {
    this.cev = paramfu;
  }

  public void bc()
  {
    super.bc();
    this.cer = null;
    this.ces = null;
    this.cev = null;
  }

  public void aJ()
  {
    super.aJ();

    this.cOX = 0;
  }

  public void c(bdj parambdj)
  {
    aaE localaaE = (aaE)parambdj;
    super.c(localaaE);
    localaaE.ces = this.ces;
    localaaE.cOX = this.cOX;
    localaaE.cer = this.cer;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == cey)
      setAttribute(paramaKN.gL(paramString));
    else if (paramInt == cez)
      setField(paramaKN.gL(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == cey)
      setAttribute(String.valueOf(paramObject));
    else if (paramInt == cez)
      setField(String.valueOf(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}