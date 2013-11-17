public class dKz extends beJ
{
  public static final String lYr = "territoriesCount";
  public static final String lYs = "territoriesRatio";
  public static final String lYt = "territoriesRatioPerc";
  public static final String[] bF = { "territoriesCount", "territoriesRatio", "territoriesRatioPerc" };
  private int lYu;

  public dKz(int paramInt)
  {
    super(paramInt);
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("territoriesCount"))
      return Integer.valueOf(u());
    if (paramString.equals("territoriesRatio"))
      return Float.valueOf(djp());
    if (paramString.equals("territoriesRatioPerc")) {
      int i = this.lYu - u();
      float f = (i == 0 ? djq() / 2.0F : i + u() / 2.0F) / bPE.bWu().bWF() * 100.0F;

      return new cwC(f);
    }
    return super.getFieldValue(paramString);
  }

  private float djp() {
    return this.lYu / bPE.bWu().bWF();
  }

  public int u() {
    return bPE.bWu().tK(this.ie);
  }

  public void CN(int paramInt) {
    this.lYu = paramInt;
  }

  public int djq() {
    return this.lYu;
  }
}