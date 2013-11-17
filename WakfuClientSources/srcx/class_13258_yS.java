public class yS extends cGj
  implements bTT
{
  public static final String bC = "name";
  public static final String bsO = "sellerName";
  public static final String bsP = "level";
  public static final String bsQ = "price";
  public static final String bsR = "rarity";
  public static final String bsS = "quantity";
  public static final String RH = "iconUrl";
  public static final String bsT = "packType";
  public static final String bsU = "remainingDuration";
  public static String[] bF = { "name", "sellerName", "level", "price", "rarity", "quantity", "iconUrl", "packType", "remainingDuration" };

  private int bsV = -1;
  private String bsW;
  private bCe bsX = bCe.gwo;
  private int bsY;
  private short aFe;
  private bVw bsZ;
  private long aTz;
  private bAp bta;
  private dxL btb;
  private dnm btc;
  private OW btd;

  public yS(aVw paramaVw)
  {
    this.aTz = paramaVw.getId();
    this.bsZ = ((bVw)Hh.QM().dh(paramaVw.aFY()));
    this.aFe = paramaVw.bdI();
    this.bsX = paramaVw.Hy();
    this.bsY = paramaVw.bdJ();
    this.bsW = paramaVw.bdH();
    this.bta = paramaVw.bdK();
    this.btb = cYq.jq(paramaVw.bdL());
    this.btc = paramaVw.bdM();
  }

  public String[] getFields() {
    return bF;
  }

  public String Ht() {
    return this.bsW;
  }

  public bVw Hu() {
    return this.bsZ;
  }

  public int Hv() {
    return this.bsY;
  }

  public Object getFieldValue(String paramString) {
    if (paramString.equals("name"))
      return this.bsZ.getName();
    if (paramString.equals("sellerName"))
      return Ht();
    Object localObject1;
    Object localObject2;
    if (paramString.equals("level")) {
      localObject1 = dIi.fK(this.btc.xH());
      switch (AW.bwM[localObject1.ordinal()]) {
      case 1:
        localObject2 = cxD.ilA.a(((qV)this.btc).xI());
        return Short.valueOf(((cUb)localObject2).nU());
      case 2:
        localObject2 = bPC.a(((buM)this.btc).bCE());
        return Short.valueOf(((dHJ)localObject2).nU());
      }

      return Short.valueOf(this.bsZ.nU());
    }
    if (paramString.equals("packType"))
      return aPU.c(this.bsX);
    if (paramString.equals("price")) {
      return bU.fH().getString("bigNumberWithSeparator", new Object[] { Integer.valueOf(Hv()) });
    }

    if (paramString.equals("rarity")) {
      localObject1 = this.bsZ.bKs();
      localObject2 = new lZ();
      ((lZ)localObject2).a(bU.fH().getString("item.rarity." + ((cxg)localObject1).name()));
      return ((lZ)localObject2).tP();
    }if (paramString.equals("quantity"))
      return this.aFe > 1 ? bU.fH().iK(this.aFe) : null;
    if (paramString.equals("remainingDuration"))
    {
      localObject2 = dDE.dft().VN();

      if (this.bta.gph.b(this.btb.V((dxL)localObject2))) {
        localObject1 = new kb(this.bta.gph);
        ((kb)localObject1).f(this.btb.V((dxL)localObject2));
      } else {
        localObject1 = new kb(this.btb.V((dxL)localObject2));
        ((kb)localObject1).f(this.bta.gph);
      }

      if ((((kb)localObject1).getDays() > 0) || (((kb)localObject1).getHours() > 0)) {
        return bU.fH().getString("remainingDurationHours", new Object[] { Integer.valueOf(((kb)localObject1).getDays() * 24 + ((kb)localObject1).getHours()) });
      }
      if (((kb)localObject1).getMinutes() > 0) {
        return bU.fH().getString("remainingDurationMinutes", new Object[] { Integer.valueOf(((kb)localObject1).getMinutes()) });
      }
      return null;
    }if (paramString.equals("iconUrl"))
      return ay.bd().v(this.bsZ.oc());
    if (paramString.equals("gems")) {
      return Hw();
    }
    return this.bsZ.getFieldValue(paramString);
  }

  private OW Hw() {
    if (this.btd == null) {
      if (this.btc.xH() == dIi.lTf.ewr) {
        ceB localceB = (ceB)this.btc;
        cdI localcdI = new cdI(this.bsZ);
        localcdI.b(localceB.chD());

        this.btd = new OW(null, localcdI);
      } else {
        this.btd = new OW(null, new cdI(this.bsZ));
      }
    }

    return this.btd;
  }

  public boolean Hx() {
    dxL localdxL = dDE.dft().VN();
    return this.bta.gph.c(this.btb.V(localdxL));
  }

  public bCe Hy() {
    return this.bsX;
  }

  public long getId() {
    return this.aTz;
  }

  public short nP() {
    return this.aFe;
  }

  public dnm Hz() {
    return this.btc;
  }
}