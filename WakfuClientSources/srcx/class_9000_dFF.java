import org.apache.log4j.Logger;

public class dFF
  implements cvW
{
  private static dFF lPP = new dFF();
  public static final int lPQ = 0;
  public static final int lPR = 1;
  public static final int lPS = 2;
  private static final Logger K = Logger.getLogger(dFF.class);
  private ayn dtQ;
  private bnm N;
  private bwe chg;

  public static dFF dgY()
  {
    return lPP;
  }

  public boolean a(cWG paramcWG) {
    paramcWG.getId();

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      byz localbyz = byv.bFN().bFO();

      this.chg = new DU(this);

      localbyz.aeL().a(this.chg);

      this.N = new DT(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("protectorViewMode", Integer.valueOf(0));

      aNL localaNL = cBQ.cxL().a("protectorViewDialog", VV.dJ("protectorViewDialog"), 32768L, (short)10000);

      cBQ.cxL().j("wakfu.protectorView", cPX.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      byv.bFN().bFO().aeL().b(this.chg);
      this.chg = null;
      dLE.doY().removeProperty("protectorViewMode");
      cBQ.cxL().mN("wakfu.protectorView");
      cBQ.cxL().b(this.N);
      cBQ.cxL().mW("protectorViewDialog");
    }
  }
}