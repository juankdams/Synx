public abstract class aoe extends UX
  implements cUd
{
  protected String aKM = null;

  public static final int dsD = "label".hashCode();
  public static final int bSV = "state".hashCode();

  public void setLabel(String paramString)
  {
    this.aKM = paramString;
  }

  public void setState(String paramString)
  {
    setLabel(paramString);
  }

  public String getLabel()
  {
    return this.aKM;
  }

  public String getState()
  {
    return getLabel();
  }

  public void bc()
  {
    super.bc();
    this.aKM = null;
  }

  public void c(bdj parambdj)
  {
    aoe localaoe = (aoe)parambdj;
    super.c(localaoe);
    localaoe.aKM = this.aKM;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if ((paramInt == dsD) || (paramInt == bSV))
      setLabel(paramaKN.gL(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    if ((paramInt == dsD) || (paramInt == bSV))
      setLabel(String.valueOf(paramObject));
    else {
      return super.setPropertyAttribute(paramInt, paramObject);
    }

    return true;
  }
}