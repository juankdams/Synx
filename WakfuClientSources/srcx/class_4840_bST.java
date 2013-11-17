public class bST extends cGj
{
  public static final String bkd = "state";
  public static final String aNY = "value";
  private short aGz;
  private int cxl;

  public bST(short paramShort, int paramInt)
  {
    this.aGz = paramShort;
    this.cxl = paramInt;
  }

  public void setValue(int paramInt) {
    this.cxl = paramInt;
    dLE.doY().a(this, new String[] { "value" });
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("state"))
      return cNO.cFX().yF(this.aGz);
    if (paramString.equals("value")) {
      StringBuilder localStringBuilder = new StringBuilder();
      if (this.cxl >= 0) {
        localStringBuilder.append("+");
      }
      localStringBuilder.append(this.cxl).append("%");
      return localStringBuilder.toString();
    }

    return null;
  }
}