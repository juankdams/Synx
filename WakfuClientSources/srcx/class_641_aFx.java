import org.apache.log4j.Logger;

public class aFx
  implements cvW
{
  protected static final Logger K = Logger.getLogger(aFx.class);

  private static aFx ebC = new aFx();
  private cGm ebD;
  private ckG ebE;
  private dli ebF = new dli();
  private auP O;
  private bnm N;

  public static aFx aRI()
  {
    return ebC;
  }

  public boolean a(cWG paramcWG)
  {
    Object localObject;
    switch (paramcWG.getId()) {
    case 19344:
      localObject = new bjA(this.ebE.getId());
      for (bnP localbnP = this.ebF.cTd(); localbnP.hasNext(); ) {
        localbnP.fl();
        ((bjA)localObject).f(localbnP.bic(), localbnP.Lb());
      }
      byv.bFN().aJK().d((cWG)localObject);
      this.ebF.clear();
      byv.bFN().b(this);
      return false;
    case 19342:
      localObject = (czW)paramcWG;
      long l = ((czW)localObject).ah();
      byz localbyz = byv.bFN().bFO();
      bMD localbMD = localbyz.bGP();

      gA localgA = ((czW)localObject).getItem() == null ? localbMD.iS(l) : ((czW)localObject).getItem();
      if (localgA == null) {
        return false;
      }
      if (!G(localgA)) {
        return false;
      }
      short s1 = ((czW)localObject).nP();
      short s2 = s1;
      if (this.ebD != null) {
        if (this.ebD.ok() != localgA.ok()) {
          String str = bU.fH().getString("seedSpreader.notEmptyError");
          CM.LV().f(str, 3);
          return false;
        }
        s2 = (short)Math.min(this.ebD.nR(), this.ebD.nP() + s1);
      }

      n(localgA.ok(), s2);
      this.ebF.r(localgA.oj(), s1);
      dLE.doY().t("seedSpreaderDirty", Boolean.valueOf(true));
      return false;
    case 19343:
      localObject = new Jp(this.ebE.getId());
      byv.bFN().aJK().d((cWG)localObject);

      this.ebD = null;
      this.ebF.clear();
      dLE.doY().t("seedSpreaderItem", null);
      dLE.doY().t("seedSpreaderDirty", Boolean.valueOf(false));
      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      if (this.ebE == null) {
        return;
      }
      dLE.doY().t("seedSpreaderItem", this.ebD);
      dLE.doY().t("seedSpreaderDirty", Boolean.valueOf(false));

      this.O = new cDd(this);

      bBq.bKG().a(this.O);

      this.N = new cDb(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("seedSpreaderDialog", VV.dJ("seedSpreaderDialog"), 1L, (short)10000);

      cBQ.cxL().j("wakfu.seedSpreader", bSy.class);

      dGW.dhM().dhN();
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      bSy.setDraggedItem(null);
      this.ebD = null;
      this.ebF.clear();
      byv.bFN().b(this.ebE.cmu());
      dGW.dhM().dhP();

      dLE.doY().removeProperty("seedSpreaderItem");
      dLE.doY().removeProperty("seedSpreaderDirty");

      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("seedSpreaderDialog");

      cBQ.cxL().mN("wakfu.seedSpreader");
    }
  }

  public void a(ckG paramckG)
  {
    this.ebE = paramckG;
  }

  public cGm aRJ() {
    return this.ebD;
  }

  public void n(int paramInt, short paramShort) {
    if (paramInt <= 0)
      return;
    bBn localbBn = Hh.QM().dh(paramInt);
    if (localbBn == null) {
      K.error("Impossible de retrouver l'item d'id=" + paramInt);
      return;
    }
    if (this.ebD == null) {
      this.ebD = new cGm(localbBn);
    }
    this.ebD.l(paramShort);
    dLE.doY().t("seedSpreaderItem", this.ebD);
  }

  public boolean G(gA paramgA) {
    adx localadx = paramgA.oi().bKr();
    if (!(localadx instanceof alo))
      return false;
    alo localalo = (alo)localadx;
    int i = localalo.axY();

    dxy localdxy = (dxy)fj.mh().hH(i);
    if (localdxy == null) {
      return false;
    }

    return localdxy instanceof ceV;
  }

  public void H(gA paramgA) {
    if (!byv.bFN().c(aRI())) {
      return;
    }
    cpa localcpa = cBQ.cxL().coO().nf("seedSpreaderDialog");
    boolean bool = G(paramgA);
    dRq localdRq = (dRq)localcpa.fi("seedSlot");
    bNa localbNa = bool ? new bNa(clP.hPd.get()) : bNa.gRz;
    a(localdRq, localbNa);
  }

  private void a(dRq paramdRq, bNa parambNa) {
    Jg localJg = paramdRq.getAppearance();

    bNa localbNa = new bNa(bNa.gRx.get());

    localJg.J(gm.class);
    localJg.setModulationColor(localbNa);
    gm localgm = new gm(localbNa, parambNa, localJg, 0, 300, -1, ddp.kWG);
    localJg.a(localgm);
  }

  public void aRK() {
    if (!byv.bFN().c(aRI())) {
      return;
    }
    cpa localcpa = cBQ.cxL().coO().nf("seedSpreaderDialog");
    dRq localdRq = (dRq)localcpa.fi("seedSlot");
    localdRq.getAppearance().J(gm.class);
  }

  public boolean aRL() {
    return !this.ebF.isEmpty();
  }

  public boolean dR(long paramLong) {
    return this.ebF.N(paramLong);
  }
}