import org.apache.log4j.Logger;

public class acy
  implements dBv
{
  private static final String cSs = "name";
  private static final String cSt = "familyIconUrl";
  private static final String cSu = "familyIconStyle";
  private static final String cSv = "gaugeColor";
  private static final String cSw = "currentValue";
  private static final String cSx = "currentValuePerc";
  private static final String cSy = "currentValueText";
  private static final String cSz = "isOnOverflow";
  private static final String cSA = "protectorInterval";
  private static final String cSB = "isProtector";
  private static final String cSC = "maxValueText";
  private static final String cSD = "wakfuGaugeStyle";
  private static final String cSE = "numberInZoneText";
  private static final String cSF = "intervalText";
  private static final String[] bF = { "name", "gaugeColor", "currentValue", "familyIconUrl", "currentValueText", "protectorInterval", "maxValueText", "isProtector", "wakfuGaugeStyle", "numberInZoneText", "intervalText" };

  protected static final Logger K = Logger.getLogger(acy.class);
  private bIg cSG;
  private int aDH;
  private int crh;
  private int cri;
  private caa cSH;
  private boolean cSI = false;

  public acy(bIg parambIg, int paramInt1, aCc paramaCc, int paramInt2, int paramInt3) {
    this.cSG = parambIg;
    this.aDH = paramInt1;
    this.crh = paramInt2;
    this.cri = paramInt3;
    if ((paramaCc == null) && (KP.bXy.CB() != -1)) {
      paramaCc = KP.bXy.fF(paramInt1);
    }
    this.cSH = (paramaCc == null ? null : new caa(paramaCc, this.cri));
  }

  public String[] getFields() {
    return bF;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return getName();
    if (paramString.equals("protectorInterval"))
      return this.cSH;
    if (paramString.equals("currentValue"))
      return Float.valueOf(aoS());
    if (paramString.equals("currentValuePerc"))
      return new cwC(aoS() * 100.0F);
    if (paramString.equals("currentValueText"))
      return Integer.valueOf(this.crh > 100 ? crt.wj(this.crh) : this.crh);
    if (paramString.equals("maxValueText"))
      return Integer.valueOf(this.cri);
    if (paramString.equals("isOnOverflow"))
      return Boolean.valueOf(this.crh > this.cri);
    if (paramString.equals("familyIconStyle")) {
      if (this.cSG.fM())
        return null;
      switch (this.aDH) {
      case 10:
        return "PlantsIcon";
      case 1:
        return "TreesIcon";
      case 2:
        return "FarmingIcon";
      }

      return "";
    }
    if (paramString.equals("familyIconUrl")) {
      if (!this.cSG.fM())
        return null;
      try {
        return String.format(ay.bd().getString("monstersFamily"), new Object[] { Integer.valueOf(this.aDH) });
      } catch (bdh localbdh) {
        K.error("Exception", localbdh);
      }
    } else { if (paramString.equals("isProtector"))
        return Boolean.valueOf(aoU());
      if (paramString.equals("wakfuGaugeStyle")) {
        float f = aoS();
        if (f > 0.65D)
          return "CurrentWakfuBig";
        if (f > 0.35D) {
          return "CurrentStasisBig";
        }
        return "CurrentStasisBig";
      }if (paramString.equals("numberInZoneText"))
        return bU.fH().getString("wakfu.currentResourceValueInZone", new Object[] { getName() });
      if (paramString.equals("intervalText")) {
        if (this.cSH == null)
          return null;
        return bU.fH().getString("wakfu.protectorInterval", new Object[] { getName(), Integer.valueOf(this.cSH.cev()), Integer.valueOf(this.cSH.cew()) });
      }
    }
    return null;
  }

  public float aoS() {
    return Math.min(this.crh, this.cri) / this.cri;
  }

  public String getName()
  {
    String str;
    if (this.cSG.fM())
      str = bU.fH().b(38, this.aDH, new Object[0]);
    else {
      str = bU.fH().b(37, this.aDH, new Object[0]);
    }
    if ((str != null) && (!str.equals(""))) {
      return str;
    }
    return "Famille inconnue";
  }

  public boolean aoT() {
    return this.cSH != null;
  }

  public void a(aCc paramaCc) {
    this.cSH = new caa(paramaCc, this.cri);
    dLE.doY().a(this, bF);
  }

  public boolean aoU() {
    return (this.cSH != null) && (this.cSH.ur(this.crh));
  }

  public int aoV() {
    return this.cSH == null ? -1 : this.crh - this.cSH.cew();
  }

  public bIg aoW() {
    return this.cSG;
  }

  public int nn() {
    return this.aDH;
  }

  public void bN(boolean paramBoolean) {
    this.cSI = paramBoolean;
  }

  public boolean aoX() {
    return this.cSI;
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

  public int getCurrentValue() {
    return this.crh;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("(");
    localStringBuilder.append("familyId=").append(this.aDH).append(", ");
    localStringBuilder.append("currentValue=").append(this.crh);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}