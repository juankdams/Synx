public class cOU
  implements dBv
{
  public static final String kxO = "templateLayoutId";
  public static final String aGn = "imageUrl";
  public static final String kxP = "text1";
  public static final String kxQ = "text2";
  public static final String[] bF = { "templateLayoutId", "imageUrl", "text1", "text2" };
  private final int aw;
  private final short aXf;
  private final int aSg;
  private final short aXg;
  private final String kxR;
  private final String kxS;

  public cOU(int paramInt1, short paramShort1, int paramInt2, short paramShort2)
  {
    this.aw = paramInt1;
    this.aXf = paramShort1;
    this.aSg = paramInt2;
    this.aXg = paramShort2;
    String str = bU.fH().b(67, paramInt1, new Object[0]);
    String[] arrayOfString = str.split("\\#{2,}");
    this.kxR = arrayOfString[0];
    this.kxS = (arrayOfString.length > 1 ? arrayOfString[1] : "");
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("templateLayoutId"))
      return Short.valueOf(this.aXg);
    if (paramString.equals("imageUrl"))
      return ay.bd().L(this.aSg);
    if (paramString.equals("text1"))
    {
      return this.kxR;
    }if (paramString.equals("text2")) {
      return this.kxS;
    }
    return null;
  }

  public void a(String paramString, Object paramObject) {
  }

  public void b(String paramString, Object paramObject) {
  }

  public void c(String paramString, Object paramObject) {
  }

  public boolean l(String paramString) {
    return false;
  }
}