public class OR extends bYT
{
  public static final String cfU = "temperatureIconUrl";
  public static final String cfV = "rainIconUrl";
  public static final String cfW = "windIconUrl";
  private final int cfX;
  private final String m_name;
  private final String aLm;
  private int[] cfY;

  public OR(ld paramld, int paramInt)
  {
    super(paramld);

    this.cfX = paramInt;

    bnn localbnn = but.gdO.qW(this.cfX);
    if (localbnn != null) {
      this.m_name = bU.fH().b(52, this.cfX, new Object[0]);
      this.aLm = bU.fH().b(53, this.cfX, new Object[0]);
      this.cfY = new int[3];
      if (localbnn.aIQ() > 0.0F)
        this.cfY[0] = 0;
      else if (localbnn.aIQ() < 0.0F)
        this.cfY[0] = 1;
      else {
        this.cfY[0] = -1;
      }
      if (localbnn.oy() > 0.0F)
        this.cfY[1] = 2;
      else if (localbnn.oy() < 0.0F)
        this.cfY[1] = 3;
      else {
        this.cfY[1] = -1;
      }
      if (localbnn.bxz() > 0.0F)
        this.cfY[2] = 4;
      else if (localbnn.bxz() < 0.0F)
        this.cfY[2] = 5;
      else
        this.cfY[2] = -1;
    } else {
      this.m_name = "";
      this.aLm = "";
    }
  }

  public String getName() {
    return this.m_name;
  }

  public bmt aaN() {
    return bmt.fDV;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("description"))
      return this.aLm;
    if (paramString.equals("name"))
      return this.m_name;
    if (paramString.equals("nameWithRemainingTime")) {
      Object localObject = cdx();
      if (localObject == null) {
        return getName();
      }
      return new StringBuilder(this.m_name).append(" (").append(localObject).append(")");
    }if (paramString.equals("nameWithDuration"))
      return new StringBuilder(this.m_name).append(" (").append(cdy()).append(")");
    if (paramString.equals("iconUrl"))
      return null;
    if (paramString.equals("temperatureIconUrl")) {
      if (this.cfY[0] == -1) {
        return null;
      }
      return ay.bd().a("climateBonusIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(this.cfY[0]) });
    }if (paramString.equals("rainIconUrl")) {
      if (this.cfY[1] == -1) {
        return null;
      }
      return ay.bd().a("climateBonusIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(this.cfY[1]) });
    }if (paramString.equals("windIconUrl")) {
      if (this.cfY[2] == -1) {
        return null;
      }
      return ay.bd().a("climateBonusIconsPath", "defaultIconPath", new Object[] { Integer.valueOf(this.cfY[2]) });
    }

    return super.getFieldValue(paramString);
  }

  public int aaO() {
    return this.cfX;
  }
}