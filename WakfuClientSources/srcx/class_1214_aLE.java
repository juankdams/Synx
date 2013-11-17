public class aLE extends cGj
{
  public static final String NAME = "name";
  public static final String ciu = "iconUrl";
  public static final String eqw = "extendedMinTemperature";
  public static final String eqx = "extendedMaxTemperature";
  public static final String eqy = "idealMinTemperature";
  public static final String eqz = "idealMaxTemperature";
  public static final String eqA = "idealRainIconUrl";
  private final dxy eqB;
  private final int aQF;

  public aLE(dxy paramdxy, int paramInt)
  {
    this.eqB = paramdxy;
    this.aQF = paramInt;
  }

  public dxy bdk() {
    return this.eqB;
  }

  public int getLevel() {
    return this.aQF;
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return this.eqB.dcv();
    if (paramString.equals("iconUrl"))
      return ay.bd().v(this.eqB.BD());
    if (paramString.equals("extendedMinTemperature"))
      return this.eqB.bqx() + "°";
    if (paramString.equals("extendedMaxTemperature"))
      return this.eqB.bqy() + "°";
    if (paramString.equals("idealMinTemperature"))
      return this.eqB.Bu() + "°";
    if (paramString.equals("idealMaxTemperature"))
      return this.eqB.Bv() + "°";
    if (paramString.equals("idealRainIconUrl")) {
      float f = this.eqB.bqv() + (this.eqB.bqw() - this.eqB.bqv()) / 2.0F;
      bzM localbzM = bzM.by(f);
      return PV.a(localbzM);
    }
    return null;
  }
}