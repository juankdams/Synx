public class rF extends cGj
{
  public static final String aZH = "turn";
  private int aZI;

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("timelineElementType"))
      return Integer.valueOf(2);
    if (paramString.equals("turn")) {
      return Integer.valueOf(this.aZI);
    }
    return null;
  }

  public int yj() {
    return this.aZI;
  }

  public void cD(int paramInt) {
    this.aZI = paramInt;
    dLE.doY().a(this, new String[] { "turn" });
  }
}