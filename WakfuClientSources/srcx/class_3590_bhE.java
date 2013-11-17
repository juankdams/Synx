class bhE
  implements dBv
{
  private aKG fwu;
  private final afi fwv;
  public static final String fww = "currentColor";
  public static final String fwx = "red";
  public static final String fwy = "green";
  public static final String fwz = "blue";
  public static final String fwA = "red255";
  public static final String fwB = "green255";
  public static final String fwC = "blue255";
  public static final String bC = "name";
  public static final String fwD = "floatString";
  public static final String[] bF = { "currentColor", "red", "green", "blue", "red255", "green255", "blue255", "name", "floatString" };

  public bhE(aKG paramaKG, afi paramafi)
  {
    this.fwu = paramaKG;
    this.fwv = paramafi;
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("currentColor"))
      return this.fwu;
    if (paramString.equals("red"))
      return Float.valueOf(this.fwu.QC());
    if (paramString.equals("green"))
      return Float.valueOf(this.fwu.QD());
    if (paramString.equals("blue"))
      return Float.valueOf(this.fwu.QE());
    if (paramString.equals("red255"))
      return Integer.valueOf((int)(this.fwu.QC() * 255.0F));
    if (paramString.equals("green255"))
      return Integer.valueOf((int)(this.fwu.QD() * 255.0F));
    if (paramString.equals("blue255"))
      return Integer.valueOf((int)(this.fwu.QE() * 255.0F));
    if (paramString.equals("name"))
      return this.fwv.name();
    if (paramString.equals("floatString")) {
      return bCO.h(this.fwu.QC(), 2) + "f, " + bCO.h(this.fwu.QD(), 2) + "f, " + bCO.h(this.fwu.QE(), 2) + "f";
    }

    return null;
  }

  public void a(String paramString, Object paramObject)
  {
  }

  public void b(String paramString, Object paramObject)
  {
  }

  public void c(String paramString, Object paramObject)
  {
  }

  public boolean l(String paramString) {
    return false;
  }

  public void bg(float paramFloat) {
    this.fwu = new aKG(-1, paramFloat, this.fwu.QD(), this.fwu.QE());
    dLE.doY().a(this, bF);
  }

  public void bh(float paramFloat) {
    this.fwu = new aKG(-1, this.fwu.QC(), paramFloat, this.fwu.QE());
    dLE.doY().a(this, bF);
  }

  public void bi(float paramFloat) {
    this.fwu = new aKG(-1, this.fwu.QC(), this.fwu.QD(), paramFloat);
    dLE.doY().a(this, bF);
  }

  public void b(auC paramauC) {
    byz localbyz = byv.bFN().bFO();
    cew localcew = localbyz.aeL();
    aKG.a(this.fwu, localcew, this.fwv.aqP());
    localcew.cf(true);
    dLE.doY().a(localbyz, localbyz.getFields());
  }
}