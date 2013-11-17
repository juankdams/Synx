class ban extends cGj
{
  public static final String cgO = "text";
  public static final String fic = "dungeonType";
  public static final String fid = "positionResult";
  public static final String dtM = "buffs";
  public static final String fie = "medalStyle";
  public final String[] bF = { "text", "dungeonType", "positionResult", "buffs", "medalStyle" };
  private final blX fif;
  private String hi;
  private short fig = -1;

  public ban(dJn paramdJn, blX paramblX) {
    this.fif = paramblX;
  }

  public void setText(String paramString) {
    this.hi = paramString;
    dLE.doY().a(this, new String[] { "text" });
  }

  public String getText() {
    return this.hi;
  }

  public String[] getFields() {
    return this.bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("text"))
      return this.hi;
    if (paramString.equals("dungeonType"))
      return Integer.valueOf(this.fif.ordinal());
    if (paramString.equals("positionResult"))
      return Short.valueOf(this.fig);
    if (paramString.equals("medalStyle")) {
      switch (this.fig) {
      case 0:
        return "GoldMedal";
      case 1:
        return "SilverMedal";
      case 2:
        return "BronzeMedal";
      }

      return "BronzeMedal";
    }if (paramString.equals("buffs")) {
      if (this.fig != 0) {
        return "";
      }
      return null;
    }
    return null;
  }

  public void bE(short paramShort) {
    this.fig = paramShort;
    dLE.doY().a(this, new String[] { "medalStyle", "positionResult", "buffs" });
  }
}