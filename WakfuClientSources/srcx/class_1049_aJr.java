public class aJr extends cGj
  implements bTT
{
  public static final String bC = "name";
  public static final String bsS = "quantity";
  public static final String bsP = "level";
  public static final String ejD = "soldQuantitiesText";
  public static final String ejE = "unsoldQuantitiesText";
  public static final String aQL = "totalPrice";
  public static final String bsR = "rarity";
  public static final String ejF = "stackSize";
  public static final String RH = "iconUrl";
  public static final String bsT = "packType";
  public static final String ejG = "hasUnsold";
  public static String[] bF = { "name", "quantity", "totalPrice", "level", "soldQuantitiesText", "unsoldQuantitiesText", "rarity", "stackSize", "iconUrl", "packType", "hasUnsold" };
  private short aFe;
  private short ejH;
  private bCe bsX = bCe.gwo;
  private int bsY;
  private bVw bsZ;
  private long aTz;

  public aJr(aVw paramaVw)
  {
    this.aTz = paramaVw.getId();
    this.bsZ = ((bVw)Hh.QM().dh(paramaVw.aFY()));
    this.bsX = paramaVw.Hy();
    this.bsY = paramaVw.bdJ();
    this.ejH = paramaVw.bdI();
  }

  public aJr(dhL paramdhL) {
    this.aTz = paramdhL.getId();
    this.bsZ = ((bVw)Hh.QM().dh(paramdhL.aFY()));
    this.bsX = paramdhL.Hy();
    this.bsY = paramdhL.bdJ();
    this.aFe = paramdhL.cRs();
  }

  public String[] getFields() {
    return bF;
  }

  public bVw Hu() {
    return this.bsZ;
  }

  public dnm Hz() {
    return aXq.fcu.bQ(dIi.lTc.ewr);
  }

  public int Hv() {
    return this.bsY;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return this.bsZ.getName();
    if (paramString.equals("totalPrice"))
      return Integer.valueOf(this.bsY * this.aFe);
    if (paramString.equals("quantity")) {
      int i = this.aFe;
      return i > 1 ? String.valueOf(i) : null;
    }if (paramString.equals("level"))
      return Short.valueOf(this.bsZ.nU());
    if (paramString.equals("packType"))
      return aPU.c(this.bsX);
    if (paramString.equals("soldQuantitiesText"))
      return this.aFe > 0 ? bU.fH().getString("soldQuantities", new Object[] { Short.valueOf(this.aFe) }) : null;
    if (paramString.equals("unsoldQuantitiesText"))
      return this.ejH > 0 ? bU.fH().getString("unsoldQuantities", new Object[] { Short.valueOf(this.ejH) }) : null;
    if (paramString.equals("rarity")) {
      cxg localcxg = this.bsZ.bKs();
      lZ locallZ = new lZ();
      locallZ.a(bU.fH().getString("item.rarity." + localcxg.name()));
      return locallZ.tP();
    }if (paramString.equals("hasUnsold"))
      return Boolean.valueOf(this.ejH > 0);
    if (paramString.equals("iconUrl")) {
      return ay.bd().v(this.bsZ.oc());
    }
    return this.bsZ.getFieldValue(paramString);
  }

  public bCe Hy() {
    return this.bsX;
  }

  public long getId() {
    return this.aTz;
  }

  public void bh(short paramShort) {
    this.ejH = paramShort;
  }
}