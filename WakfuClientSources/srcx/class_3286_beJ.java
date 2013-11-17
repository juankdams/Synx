import org.apache.log4j.Logger;

public class beJ extends cGj
{
  private static final Logger K = Logger.getLogger(beJ.class);
  public static final String bC = "name";
  public static final String frV = "flagIconUrl";
  public static final String RI = "description";
  public static final String frW = "passportStampIconUrl";
  public static final String frX = "nationColor";
  public static final String frY = "isLocalNation";
  public static final String[] bF = { "isLocalNation", "name", "flagIconUrl", "description", "passportStampIconUrl", "nationColor" };
  protected final int ie;

  public beJ(int paramInt)
  {
    this.ie = paramInt;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("isLocalNation"))
      return Boolean.valueOf(bsp());
    if (paramString.equals("flagIconUrl"))
      return ay.bd().C(this.ie != 0 ? this.ie : -1);
    if (paramString.equals("description"))
      return getDescription();
    if (paramString.equals("passportStampIconUrl")) {
      if (this.ie != 0) {
        return ay.bd().a("passportStampIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(this.ie) });
      }
      return null;
    }
    if (paramString.equals("nationColor")) {
      return getColor() == null ? bNa.gRx : getColor();
    }
    return null;
  }

  public boolean bsp() {
    byz localbyz = byv.bFN().bFO();
    return (localbyz != null) && (this.ie == localbyz.cJf().bP());
  }

  private bNa getColor() {
    String str = bPE.bWu().tJ(this.ie);
    return (str == null) || (str.length() == 0) ? null : bNa.kd(str);
  }

  public String getDescription()
  {
    return bU.fH().b(56, this.ie, new Object[0]);
  }

  public String getName() {
    return bU.fH().b(39, this.ie, new Object[0]);
  }

  public int bP() {
    return this.ie;
  }
}