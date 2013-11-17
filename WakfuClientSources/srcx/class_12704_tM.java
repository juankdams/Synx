import org.apache.log4j.Logger;

public abstract class tM extends cGj
  implements caY
{
  private static final Logger K = Logger.getLogger(tM.class);
  public static final String NAME = "name";
  public static final String beC = "shortName";
  public static final String aLh = "description";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String beD = "iconStyle";
  public static final String beE = "value";
  public static final String beF = "max";
  public static final String beG = "minMax";
  public static final String beH = "percent";
  public static final String beI = "valueDescription";
  public static final String beJ = "formattedValueDescription";
  public static final String beK = "percentDescription";
  public static final String beL = "formattedPercentDescription";
  public static final String beM = "colorFloat";
  public static final String beN = "highlighted";
  public static final String[] beO = { "max", "minMax", "percent", "percentDescription", "value", "valueDescription", "formattedValueDescription", "formattedPercentDescription" };
  protected Rx beP;
  protected byte beQ;
  protected cdz beR;
  private boolean beS;

  public tM(Rx paramRx, byte paramByte, cdz paramcdz)
  {
    this.beP = paramRx;
    this.beQ = paramByte;
    this.beR = paramcdz;
  }

  public String[] getFields() {
    return beO;
  }

  void setHighlighted(boolean paramBoolean) {
    this.beS = paramBoolean;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return Ck();
    if (paramString.equals("shortName"))
      return Cl();
    if (paramString.equals("description"))
      return Cj();
    if (paramString.equals("shortDescription"))
      return Ch();
    if (paramString.equals("iconStyle"))
      return Cg();
    if (paramString.equals("value"))
      return Integer.valueOf(Cc());
    if (paramString.equals("max"))
      return Integer.valueOf(Cd());
    if (paramString.equals("minMax"))
      return Cq();
    if (paramString.equals("formattedValueDescription"))
      return Ci();
    if (paramString.equals("valueDescription"))
      return Cp();
    if (paramString.equals("percent"))
      return Cm();
    if (paramString.equals("formattedPercentDescription"))
      return Cn();
    if (paramString.equals("percentDescription"))
      return Co();
    if (paramString.equals("colorFloat"))
      return Cf();
    if (paramString.equals("highlighted")) {
      return Boolean.valueOf(this.beS);
    }
    return null;
  }

  protected abstract int Cc();

  protected abstract int Cd();

  public eu Ce() {
    return this.beP.Ce();
  }

  protected bNa getColor() {
    switch (fL.aCX[this.beP.Ce().ordinal()]) {
    case 1:
      return clP.hPj;
    case 2:
      return clP.hPk;
    case 3:
      return clP.hPl;
    case 4:
      return clP.hPm;
    }
    return bNa.gRx;
  }

  protected String Cf()
  {
    bNa localbNa = getColor();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localbNa.QC()).append(",");
    localStringBuilder.append(localbNa.QD()).append(",");
    localStringBuilder.append(localbNa.QE()).append(",");
    localStringBuilder.append(localbNa.getAlpha());
    return localStringBuilder.toString();
  }

  protected Object Cg() {
    return "icon" + this.beP.Ce().name();
  }

  protected Object Ch() {
    String str = this.beP.Ce().name() + "ShortDesc";
    return bU.fH().getString(str);
  }

  protected String Ci() {
    return bPe.tI(Cc());
  }

  protected Object Cj() {
    String str = this.beP.Ce().name() + "Description";
    return bU.fH().getString(str);
  }

  protected Object Ck() {
    return bU.fH().getString(this.beP.Ce().name());
  }

  protected Object Cl() {
    String str = this.beP.Ce().name() + "Short";
    return bU.fH().getString(str);
  }

  protected Object Cm() {
    float f = Cd();
    if (f == 0.0F)
      return Integer.valueOf(0);
    return Float.valueOf(Cc() / f);
  }

  protected Object Cn() {
    return bPe.f(Cc(), Cd(), true);
  }

  protected Object Co() {
    return bPe.f(Cc(), Cd(), false);
  }

  public String Cp() {
    if (this.beQ != -1) {
      lZ locallZ = new lZ();
      try {
        locallZ.a(dfn.eT(this.beQ), 16, 16, null).a(" ");
      } catch (bdh localbdh) {
        K.warn(localbdh.getMessage());
        locallZ.q(Cl()).a(" : ");
      }
      locallZ.a(Cq());
      return locallZ.tP();
    }
    return Cq();
  }

  protected String Cq()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(Cc()).append('/').append(Cd());
    return localStringBuilder.toString();
  }

  public void As() {
    dLE.doY().a(this, beO);
  }

  public void a(cqm paramcqm) {
    As();
    this.beR.a(paramcqm);
  }
}