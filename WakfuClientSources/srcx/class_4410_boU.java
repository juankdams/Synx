public class boU extends cGj
  implements nc
{
  public static final String dQQ = "remainingTime";
  public static final String fIz = "constructionDate";
  public static final String fIA = "customItem";
  public static final String fIB = "isDeco";
  public static final String fIC = "canBeEvolved";
  private final aLw fID;
  private final long aFa;
  private final dxL fIE;
  private gA fIF;

  private boU(aLw paramaLw, long paramLong, gA paramgA, dxL paramdxL)
  {
    this.fID = paramaLw;
    this.aFa = paramLong;
    this.fIE = paramdxL;
    R(paramgA);
  }

  public static boU a(aLw paramaLw, long paramLong, int paramInt, dxL paramdxL)
  {
    gA localgA = null;
    if (paramInt != 0) {
      localgA = Hh.QM().eO(paramInt);
    }
    return new boU(paramaLw, paramLong, localgA, paramdxL);
  }

  public String[] getFields() {
    return null;
  }

  public Object getFieldValue(String paramString)
  {
    if (paramString.equals("remainingTime"))
      return eZ(true);
    if (paramString.equals("constructionDate"))
      return bU.fH().c(this.fIE);
    if (paramString.equals("customItem"))
      return this.fIF;
    if (paramString.equals("isDeco")) {
      return Boolean.valueOf(this.fID.bdb().aTC());
    }
    if (paramString.equals("canBeEvolved")) {
      cUh localcUh1 = this.fID.bdb();
      if (localcUh1 == null) {
        return Boolean.valueOf(false);
      }
      dAi localdAi = ars.dzL.aN(localcUh1.nc());
      if (localdAi == null) {
        return Boolean.valueOf(false);
      }
      cUh localcUh2 = ars.dzL.aM(localdAi.ddx());
      if (localcUh2 == null) {
        return Boolean.valueOf(false);
      }

      return Boolean.valueOf(localcUh1.bVJ() != localcUh2.bVJ());
    }

    return this.fID.getFieldValue(paramString);
  }

  private boolean byz() {
    return this.aFa > 0L;
  }

  public dxL byA() {
    dAi localdAi = ars.dzL.aN(this.fID.bdb().nc());
    if (localdAi == null) {
      return null;
    }

    return dGu.a(dfX.laF.cPy(), localdAi, this.fIE.rP());
  }

  public String eZ(boolean paramBoolean) {
    if (!byz()) {
      return null;
    }

    dxL localdxL = byA();
    if (localdxL == null) {
      return null;
    }

    kb localkb = dDE.dft().VN().V(localdxL);
    if (!localkb.rN()) {
      return null;
    }
    if (localkb.c(cds.hwO)) {
      return paramBoolean ? bXW.m(cds.hwO) : bXW.l(cds.hwO);
    }

    return paramBoolean ? bXW.m(localkb) : bXW.l(localkb);
  }

  public String getName() {
    return this.fID.getName();
  }

  public bZw ri() {
    return dfX.laF.eb(this.fID.bdb().bVJ());
  }

  public long oj() {
    return this.aFa;
  }

  public void byB() {
    cds localcds = this.fID.bcX();
    if (!localcds.rN()) {
      return;
    }

    bXT.hnW.a(this);
  }

  public void byC() {
    bXT.hnW.b(this);
  }

  public void uD() {
    dLE.doY().a(this, new String[] { "remainingTime" });
  }

  public aLw byD()
  {
    return this.fID;
  }

  public void R(gA paramgA) {
    this.fIF = paramgA;
    dLE.doY().a(this, new String[] { "customItem" });
  }
}