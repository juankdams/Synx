public abstract class fm
{
  public static final String aCj = "text";
  protected int aCk;
  private final boolean aCl;
  protected final String aCm;
  protected final short aCn;
  protected final cMS aCo;
  private final dUd aCp = new doq(this);

  protected fm(cMS paramcMS, boolean paramBoolean, String paramString, short paramShort)
  {
    this.aCl = paramBoolean;
    this.aCm = paramString;
    this.aCn = paramShort;
    this.aCo = paramcMS;
  }

  public void a(coS paramcoS)
  {
    cAo.cxf().b(KO.Vm());
    cAo.cxf().b(this.aCp);

    this.aCk = paramcoS.coI();

    boolean bool = cBQ.cxL().mZ(this.aCm);
    if (!bool) {
      cBQ.cxL().a(this.aCm, VV.dJ(this.aCm), 8212L, this.aCn);
    }

    if (paramcoS.getDuration() != 2147483647) {
      cAo.cxf().a(KO.Vm(), paramcoS.getDuration(), 0, 1);
    }

    cpa localcpa = cBQ.cxL().coO().nf(this.aCm);
    if (localcpa == null) {
      return;
    }

    a(true, this.aCm);

    duS localduS = (duS)localcpa.fi("text");
    if (localduS != null)
      localduS.setText(paramcoS.getMessage());
  }

  public void m(boolean paramBoolean)
  {
    if (cBQ.cxL().mZ(this.aCm)) {
      cAo.cxf().b(this.aCp);

      if (paramBoolean) {
        a(false, this.aCm);
      }
      if (paramBoolean)
        cAo.cxf().a(this.aCp, this.aCk, 0, 1);
      else
        O(this.aCm);
    }
  }

  protected abstract void a(boolean paramBoolean, String paramString);

  protected abstract void O(String paramString);

  protected void a(dOc paramdOc, String paramString)
  {
    if (paramdOc == null)
      return;
    cag localcag = new cag();
    localcag.aJ();
    localcag.setFile(paramString);
    localcag.setAlignment(aFG.eck);
    paramdOc.getAppearance().a(localcag);
  }

  protected void a(dOc paramdOc) {
    if (paramdOc == null)
      return;
    paramdOc.getAppearance().SV();
  }

  protected void a(dOc paramdOc, boolean paramBoolean) {
    if (paramdOc == null) {
      return;
    }
    Jg localJg = paramdOc.getAppearance();
    localJg.J(gm.class);

    bNa localbNa1 = new bNa();
    bNa localbNa2 = new bNa();

    if (!paramBoolean) {
      localbNa1.set(bNa.gRx.get());
      localbNa2.set(bNa.gRu.get());
    } else {
      localbNa1.set(bNa.gRu.get());
      localbNa2.set(bNa.gRx.get());
    }
    localJg.a(new gm(localbNa1, localbNa2, (dKW)localJg, 0, this.aCk, 1, false, ddp.kWG));
  }

  public boolean isBlocking() {
    return this.aCl;
  }

  public cMS mn() {
    return this.aCo;
  }

  protected static void a(auC paramauC) {
    if (paramauC == null) {
      return;
    }

    paramauC.getAnimatedElement().asZ();
    dR localdR = paramauC.getAnimatedElement().aty();
    if (localdR != null)
      localdR.ie();
    paramauC.J(gm.class);
  }
}