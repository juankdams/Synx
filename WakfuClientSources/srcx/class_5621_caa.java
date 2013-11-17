public class caa
  implements dBv
{
  private static final String hqF = "valueMin";
  private static final String hqG = "valueMax";
  private static final String cSF = "intervalText";
  private final int hqH;
  private final int hqI;
  private final int hqJ;
  private final String[] bF = { "valueMin", "valueMax", "intervalText" };

  public caa(aCc paramaCc, int paramInt) {
    this.hqH = paramaCc.getMin();
    this.hqI = paramaCc.getMax();
    this.hqJ = paramInt;
  }

  public String[] getFields() {
    return this.bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("valueMin"))
      return Float.valueOf(this.hqH / this.hqJ);
    if (paramString.equals("valueMax"))
      return Float.valueOf(this.hqI / this.hqJ);
    if (paramString.equals("intervalText")) {
      if ((this.hqH > 100) && (this.hqI > 100)) {
        return crt.wj(this.hqH) + " - " + crt.wj(this.hqI);
      }
      return this.hqH + " - " + this.hqI;
    }

    return null;
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public boolean l(String paramString) {
    return false;
  }

  public int cev() {
    return this.hqH;
  }

  public int cew() {
    return this.hqI;
  }

  public boolean ur(int paramInt) {
    return (paramInt <= this.hqI) && (paramInt >= this.hqH);
  }

  public String toString() {
    return "interval : " + this.hqH + "-" + this.hqI;
  }
}