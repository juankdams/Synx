public class PV
  implements dBv
{
  public static final String ciu = "iconUrl";
  public static final String civ = "dayDescription";
  public static final String ciw = "actualMinTemperature";
  public static final String cix = "actualMaxTemperature";
  public static final String ciy = "minTemperature";
  public static final String ciz = "maxTemperature";
  public static final String ciA = "minTemperatureWithMods";
  public static final String ciB = "maxTemperatureWithMods";
  public static final String ciC = "currentTemperature";
  public static final String ciD = "seasonDescription";
  public static final String ciE = "windForceIconUrl";
  public static final String ciF = "windStrength";
  public static final String ciG = "rainStrength";
  public static final String ciH = "windStrengthDescription";
  public static final String ciI = "rainStrengthDescription";
  private clK ciJ = clK.hND;
  private cIB ciK;
  private int ciL;

  public PV()
  {
    this.ciK = new cIB();
  }

  public cIB abJ() {
    return this.ciK;
  }

  public void a(clK paramclK) {
    this.ciJ = paramclK;
  }

  public clK abK() {
    return this.ciJ;
  }

  public int abL() {
    return this.ciL;
  }

  public void gl(int paramInt) {
    this.ciL = paramInt;
  }

  public void b(cIB paramcIB) {
    this.ciK = paramcIB;
    this.ciJ = (paramcIB == null ? null : clK.N(dDE.dft().VN()));
    dLE.doY().a(this, new String[] { "currentTemperature", "actualMinTemperature", "actualMaxTemperature", "minTemperature", "maxTemperature", "minTemperatureWithMods", "maxTemperatureWithMods", "iconUrl", "dayDescription", "windStrength", "windStrengthDescription", "rainStrength", "rainStrengthDescription", "windForceIconUrl", "seasonDescription" });
  }

  public String[] getFields()
  {
    return null;
  }

  public static String a(bzM parambzM) {
    return ay.bd().a("weatherIconsPath", "defaultIconPath", new Object[] { parambzM.name().toLowerCase() });
  }

  public Object getFieldValue(String paramString) {
    if (this.ciK == null)
      return null;
    if (paramString.equals("iconUrl"))
      return a(this.ciK.cCD());
    if (paramString.equals("dayDescription"))
      return bU.fH().getString("day." + this.ciL);
    String str;
    if (paramString.equals("actualMinTemperature")) {
      str = String.format("%.0f", new Object[] { Float.valueOf(this.ciK.cCy()) });
      return bU.fH().getString("weather.info.minTemperature", new Object[] { str });
    }if (paramString.equals("actualMaxTemperature")) {
      str = String.format("%.0f", new Object[] { Float.valueOf(this.ciK.cCz()) });
      return bU.fH().getString("weather.info.maxTemperature", new Object[] { str });
    }if (paramString.equals("minTemperature")) {
      str = String.format("%.0f", new Object[] { Float.valueOf(this.ciK.cCw()) });
      return bU.fH().getString("weather.info.minTemperature", new Object[] { str });
    }if (paramString.equals("maxTemperature")) {
      str = String.format("%.0f", new Object[] { Float.valueOf(this.ciK.cCx()) });
      return bU.fH().getString("weather.info.maxTemperature", new Object[] { str });
    }if (paramString.equals("minTemperatureWithMods")) {
      str = String.format("%.0f", new Object[] { Float.valueOf(Math.min(this.ciK.cCz(), Math.max(this.ciK.cCw() + this.ciK.cCA(), this.ciK.cCy()))) });

      return str + "°";
    }if (paramString.equals("maxTemperatureWithMods")) {
      str = String.format("%.0f", new Object[] { Float.valueOf(Math.max(this.ciK.cCy(), Math.min(this.ciK.cCx() + this.ciK.cCA(), this.ciK.cCz()))) });

      return str + "°";
    }if (paramString.equals("currentTemperature")) {
      str = String.format("%.0f", new Object[] { Float.valueOf(this.ciK.aIQ()) });
      return str + "°";
    }if (paramString.equals("rainStrength"))
      return Float.valueOf(this.ciK.cCB());
    if (paramString.equals("windStrength"))
      return Float.valueOf(this.ciK.oz());
    int i;
    if (paramString.equals("rainStrengthDescription")) {
      i = (int)(this.ciK.cCB() * 100.0F);
      return bU.fH().getString("weather.info.rainIntensityValue", new Object[] { Integer.valueOf(i) });
    }if (paramString.equals("windStrengthDescription")) {
      i = (int)(this.ciK.oz() * 100.0F);
      return bU.fH().getString("weather.info.windForceValue", new Object[] { Integer.valueOf(i) });
    }if (paramString.equals("seasonDescription"))
      return bU.fH().getString("season." + this.ciJ.name().toLowerCase());
    if (paramString.equals("windForceIconUrl")) {
      return this.ciK.cCE().fJ();
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