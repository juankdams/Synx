public class bUy extends cGj
{
  public static final String hgu = "score";
  public static final String hgv = "rankDescription";
  public static final String hgw = "rankLongDescription";
  public static final String eok = "color";
  private int ie;
  private int fui;

  public bUy(int paramInt)
  {
    this.ie = paramInt;
  }

  public int bP() {
    return this.ie;
  }

  public int bsZ() {
    return this.fui;
  }

  public void ue(int paramInt) {
    this.fui = paramInt;
    dLE.doY().a(this, new String[] { "score", "rankDescription", "rankLongDescription", "color" });
  }

  public String[] getFields()
  {
    return null;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("score"))
      try {
        return new lZ().bw(this.fui).a(" ").tI().a(dfn.eT((byte)9), -1, -1, null).tP();
      } catch (bdh localbdh) {
        return Integer.valueOf(this.fui);
      }
    if (paramString.equals("rankLongDescription")) {
      if (this.ie == 0) {
        return bU.fH().getString("map.territories.noNation");
      }
      lZ locallZ = new lZ();
      locallZ.tz().a(bU.fH().getString("citizen.score")).tA().bw(this.fui).tH();
      locallZ.tz().a(caA()).tA();
      return locallZ.tP();
    }
    if (paramString.equals("rankDescription")) {
      if (this.ie == 0) {
        return bU.fH().getString("map.territories.noNation");
      }
      return caA();
    }
    if (paramString.equals("color")) {
      float f1 = cay();
      float f2 = Math.abs(f1);
      dkI localdkI1 = caz();
      bNa localbNa1 = bNa.kd(localdkI1.getColor());
      dkI localdkI2 = f1 > 0.0F ? dwC.dbQ().b(localdkI1) : dwC.dbQ().a(localdkI1);
      if (localdkI2 == null)
        localdkI2 = localdkI1;
      bNa localbNa2 = bNa.kd(localdkI2.getColor());
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(bCO.s(localbNa1.QC(), localbNa2.QC(), f2)).append(",");
      localStringBuilder.append(bCO.s(localbNa1.QD(), localbNa2.QD(), f2)).append(",");
      localStringBuilder.append(bCO.s(localbNa1.QE(), localbNa2.QE(), f2));
      return localStringBuilder.toString();
    }

    return null;
  }

  private float cay() {
    int i = bsZ();
    float f = 0.0F;
    dkI localdkI1 = caz();
    if (i > 0) {
      f = i / localdkI1.agg();
    } else if (i < 0) {
      dkI localdkI2 = dwC.dbQ().a(localdkI1);
      f = -(i / (localdkI2 == null ? localdkI1.agg() : localdkI2.agg()));
    }
    return f;
  }

  private dkI caz() {
    return dwC.dbQ().BQ(bsZ());
  }

  private String caA() {
    return bU.fH().getString(dwC.dbQ().BQ(this.fui).agf());
  }
}