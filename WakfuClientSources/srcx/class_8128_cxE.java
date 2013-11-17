public class cxE extends Sj
  implements caS
{
  public static final String TAG = "propertyExists";
  private boolean ilB;
  private String m_name;
  private boolean cet;
  public static final int cew = "local".hashCode();
  public static final int cex = "name".hashCode();

  public String getTag()
  {
    return "propertyExists";
  }

  public String getName()
  {
    return this.m_name;
  }

  public boolean getLocal()
  {
    return this.cet;
  }

  public void setName(String paramString)
  {
    if (((this.m_name != null) && (!this.m_name.equalsIgnoreCase(paramString))) || ((paramString != null) && (!paramString.equalsIgnoreCase(this.m_name))))
    {
      this.m_name = paramString;
      setNeedsToPreProcess();
    }
  }

  public void setLocal(boolean paramBoolean)
  {
    if (this.cet != paramBoolean) {
      this.cet = paramBoolean;
      setNeedsToPreProcess();
    }
  }

  public boolean isValid(Object paramObject)
  {
    if (this.crU) {
      paramObject = this.crT;
    }

    return this.ilB;
  }

  public boolean bb(int paramInt) {
    boolean bool1 = super.bb(paramInt);

    boolean bool2 = this.ilB;
    bbo localbbo = dLE.doY().l(this.m_name, this.cet ? getElementMap() : null);
    this.ilB = ((localbbo != null) && (localbbo.bpA()));

    if (bool2 != this.ilB) {
      bm(true);
    }

    return bool1;
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);

    cxE localcxE = (cxE)parambdj;
    localcxE.m_name = this.m_name;
    localcxE.cet = this.cet;
  }

  public void a(baJ parambaJ)
  {
    bbo localbbo = parambaJ.getProperty();
    if ((localbbo != null) && (localbbo.getName().equalsIgnoreCase(this.m_name)) && ((!this.cet) || (localbbo.getElementMap() == this.cUY)))
      switch (afq.cYj[parambaJ.bpk().ordinal()]) {
      case 1:
        this.ilB = true;
        bm(true);
        break;
      case 2:
        this.ilB = false;
        bm(true);
        break;
      }
  }

  public void aJ()
  {
    super.aJ();
    this.ilB = false;
    this.cet = false;
    dLE.doY().a(this);
  }

  public void bc()
  {
    super.bc();
    dLE.doY().b(this);
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == cew)
      setLocal(bUD.getBoolean(paramString));
    else if (paramInt == cex)
      setName(paramaKN.gL(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if (paramInt == cew)
      setLocal(bUD.getBoolean(paramObject));
    else if (paramInt == cex)
      setName(String.valueOf(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}