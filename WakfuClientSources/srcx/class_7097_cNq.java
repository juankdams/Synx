public class cNq extends bIf
{
  public static final String ksL = "dmgPercent";
  public static final String ksM = "resPercent";
  public static final String fla = "xpValue";
  public static final String fkZ = "xpText";
  static final String[] bwe = { "dmgPercent", "resPercent", "xpValue", "xpText" };

  static final String[] bwd = new String[bwe.length + bIf.bF.length];
  private final air ksN;

  public String[] getFields()
  {
    return bwd;
  }

  public cNq(bTI parambTI) {
    super(parambTI);
    this.ksN = new air();
    bBO localbBO1 = new bBO(this.ksN, this.cpW.bZS(), 1.0F, 0);
    bBO localbBO2 = new bBO(this.ksN, this.cpW.bZT(), 1.0F, 0);
    eu localeu = this.cpW.bZR();
    if (localeu != null) {
      Rx localRx = this.ksN.d(localeu);
      localRx.a(localbBO1);
      localRx.a(localbBO2);
    }
  }

  public Object getFieldValue(String paramString)
  {
    int i;
    if (paramString.equals("dmgPercent")) {
      i = (int)(cFR() * 1.0F);
      return d(this.cpW.bZS(), i);
    }
    if (paramString.equals("resPercent")) {
      if (this.cpW.bZR() == eu.aAp)
        return d(this.cpW.bZT(), 0);
      i = (int)(cFR() * 1.0F);
      return d(this.cpW.bZT(), i);
    }
    cjE localcjE;
    if (paramString.equals("xpValue")) {
      localcjE = acp.cRI.aoI();
      long l = localcjE.f(this.cpW);
      if (l == 0L)
        return Float.valueOf(0.0F);
      return Float.valueOf((float)localcjE.g(this.cpW) / (float)l);
    }
    if (paramString.equals("xpText")) {
      localcjE = acp.cRI.aoI();
      return bU.fH().getString("xp.remaining", new Object[] { Long.valueOf(localcjE.g(this.cpW)) });
    }

    return super.getFieldValue(paramString);
  }

  public int cFR() {
    byz localbyz = byv.bFN().bFO();
    Iterable localIterable = acp.cRI.aoJ().m(this.cpW);
    bHu localbHu = new bHu();
    for (apX localapX : localIterable) {
      if (localapX.nU() > 0)
        localbHu.add(localapX.nU());
    }
    return localbyz.aii().afK().a(localbHu, this.cpW.bZR());
  }

  public String d(eu parameu, int paramInt) {
    int i = this.ksN.f(parameu);
    return bPe.f(paramInt, i, true);
  }

  static
  {
    System.arraycopy(bwe, 0, bwd, 0, bwe.length);
    System.arraycopy(bIf.bF, 0, bwd, bwe.length, bIf.bF.length);
  }
}