import org.apache.log4j.Logger;

public class akm
  implements cvW
{
  protected static final Logger K = Logger.getLogger(akm.class);

  private static final akm dkY = new akm();
  gA dkZ;
  private cPW dla;
  private aUl dlb;
  private bnm N;

  public static akm axz()
  {
    return dkY;
  }

  public void p(gA paramgA)
  {
    this.dkZ = paramgA;
    dLE.doY().a("itemDetail", paramgA, "gemItemDialog");
  }

  public long axA() {
    return this.dkZ != null ? this.dkZ.oj() : -1L;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.N = new ke(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("gemItemDialog", VV.dJ("gemItemDialog"), 17L, (short)10000);

      dLE.doY().a("itemDetail", this.dkZ, "gemItemDialog");

      cBQ.cxL().j("wakfu.gemItems", cAL.class);

      this.dla = new cPW();
      byA.addListener(this.dla);

      this.dlb = new aUl();
      byv.bFN().bFO().ayJ().d(this.dlb);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      cBQ.cxL().mN("wakfu.gemItems");

      cBQ.cxL().b(this.N);

      if (cBQ.cxL().mZ("gemItemDialog")) {
        cBQ.cxL().mW("gemItemDialog");
      }

      byA.removeListener(this.dla);
      byz localbyz = byv.bFN().bFO();
      if (localbyz != null) {
        localbyz.ayJ().c(this.dlb);
      }

      this.dla = null;
      this.dlb = null;
      this.dkZ = null;
    }
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 16870:
      bRA localbRA = (bRA)paramcWG;
      gA localgA1 = localbRA.bYK();
      gA localgA2 = (gA)localbRA.aoo();

      if (this.dkZ == null) {
        return false;
      }

      if (this.dkZ.nP() != 1) {
        CM.LV().f(bU.fH().getString("error.cantSocketGemOnStackedItem"), 3);
        return false;
      }

      if (!this.dkZ.nM()) {
        return false;
      }

      cdI localcdI = this.dkZ.nO();

      if (localgA1.nU() < this.dkZ.nU()) {
        CM.LV().f(bU.fH().getString("error.gemIsTooLowLevel"), 3);
        return false;
      }

      if (!localcdI.d(localgA1.oi())) {
        CM.LV().f(bU.fH().getString("error.cantSocketGem"), 3);
        return false;
      }

      String str = bU.fH().getString("question.socketGem.emptySlot");

      cKX localcKX = cBQ.cxL().a(str, Cn.et(0), 2073L, 102, 1);

      localcKX.a(new kh(this, localgA1));

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
}