public class dpm extends dgQ
{
  public static final String TAG = "rld";
  private aFG aWn = aFG.eck;

  public static final int drs = "align".hashCode();
  public static final int egM = "vgap".hashCode();
  public static final int ct = "horizontal".hashCode();

  public String getTag()
  {
    return "rld";
  }

  public aFG getAlign()
  {
    return this.aWn;
  }

  public void setAlign(aFG paramaFG)
  {
    this.aWn = paramaFG;
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);
    ((dpm)parambdj).setAlign(this.aWn);
  }

  public void bc()
  {
    super.bc();
    this.aWn = null;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == drs)
      setAlign(aFG.gr(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }

  public boolean setPropertyAttribute(int paramInt, Object paramObject) {
    return super.setPropertyAttribute(paramInt, paramObject);
  }
}