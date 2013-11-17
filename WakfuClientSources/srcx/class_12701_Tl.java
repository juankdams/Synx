class Tl extends cGj
{
  public static final String bC = "name";
  public static final String cvY = "anim";
  public static final String cvZ = "guildName";
  public static final String bsP = "level";
  public final String[] bF = { "name", "anim", "guildName", "level" };
  private dQa cwa;
  private cew cwb;

  public Tl(aeD paramaeD, dQa paramdQa)
  {
    this.cwa = paramdQa;
  }

  public String[] getFields() {
    return this.bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return this.cwa.getName();
    if (paramString.equals("anim")) {
      if (this.cwb == null) {
        this.cwb = xc.a(this.cwa);
      }
      return this.cwb;
    }if (paramString.equals("guildName"))
      return this.cwa.uo();
    if (paramString.equals("level")) {
      return "(" + bU.fH().getString("levelShort.custom", new Object[] { Short.valueOf(this.cwa.nU()) }) + ")";
    }

    return null;
  }

  public dQa agq() {
    return this.cwa;
  }
}