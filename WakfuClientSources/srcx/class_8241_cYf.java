public class cYf extends dgQ
{
  public static final String TAG = "gld";
  private aFG aWn = aFG.eck;
  private aFG kLz = aFG.eck;
  private boolean iju = false;
  private boolean dgA = true;

  public static final int drs = "align".hashCode();
  public static final int kLA = "initAlign".hashCode();
  public static final int ijA = "initValue".hashCode();

  public String getTag()
  {
    return "gld";
  }

  public aFG getAlign()
  {
    return this.aWn;
  }

  public void setAlign(aFG paramaFG)
  {
    this.aWn = paramaFG;
  }

  public aFG getInitAlign() {
    return this.kLz;
  }

  public void setInitAlign(aFG paramaFG) {
    this.kLz = paramaFG;
  }

  public boolean isInitValue() {
    return this.iju;
  }

  public void setInitValue(boolean paramBoolean) {
    this.iju = paramBoolean;
  }

  public boolean isUsable() {
    return (!this.iju) || (this.dgA) || (bsP.getInstance().isResized());
  }

  public void setUsable(boolean paramBoolean) {
    this.dgA = paramBoolean;
  }

  public void c(bdj parambdj)
  {
    super.c(parambdj);
    ((cYf)parambdj).setAlign(this.aWn);
    ((cYf)parambdj).setAlign(this.kLz);
    ((cYf)parambdj).setInitValue(this.iju);
  }

  public void bc()
  {
    super.bc();
    this.aWn = null;
    this.kLz = null;
  }

  public void aJ()
  {
    super.aJ();
    this.iju = false;
    this.dgA = true;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == drs)
      setAlign(aFG.gr(paramString));
    else if (paramInt == kLA)
      setInitAlign(aFG.gr(paramString));
    else if (paramInt == ijA)
      setInitValue(bUD.getBoolean(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }
    return true;
  }
}