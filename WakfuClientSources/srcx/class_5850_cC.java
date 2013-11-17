public abstract class cC extends cGj
{
  public static final String RH = "iconUrl";
  public static final String RI = "description";
  public static final String RJ = "isKnown";
  public static final String[] bF = { "iconUrl", "description", "isKnown" };
  protected final int aw;
  protected final String RK;
  private boolean RL;

  protected cC(int paramInt, String paramString)
  {
    this.aw = paramInt;
    this.RK = paramString;
  }

  public int getId() {
    return this.aw;
  }

  public String getName() {
    return null;
  }

  public String gp() {
    return this.RK;
  }

  public String getDescription() {
    lZ locallZ = new lZ();
    return locallZ.tz().a(getName()).tA().a(" (" + gp() + ")").tP();
  }

  public abstract String fJ();

  public void j(boolean paramBoolean) {
    this.RL = paramBoolean;
  }

  public boolean gq() {
    return this.RL;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("iconUrl"))
      return fJ();
    if (paramString.equals("description"))
      return getDescription();
    if (paramString.equals("isKnown")) {
      return Boolean.valueOf(this.RL);
    }
    return null;
  }
}