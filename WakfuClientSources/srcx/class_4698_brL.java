import org.apache.log4j.Logger;

public class brL
  implements cvW
{
  protected static final Logger K = Logger.getLogger(brL.class);

  private static brL fNE = new brL();
  private cQj fNF;
  private bnm N;

  public static brL bzT()
  {
    return fNE;
  }

  public boolean a(cWG paramcWG)
  {
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
      if ((!dLE.doY().getBooleanProperty("isInExterior")) || (bWW.ccf().Vn())) {
        return;
      }
      this.N = new afW(this);

      sS.Al().Ap();
      byv.bFN().aJK().d(new cy());

      cBQ.cxL().a(this.N);

      dLE.doY().t("weather.manager", sS.Al());

      cBQ.cxL().a("weatherInfoDialog", VV.dJ("weatherInfoDialog"), 32769L, (short)10000);

      cBQ.cxL().j("wakfu.weatherInformation", dhV.class);

      if (this.fNF != null)
        this.fNF.b(dJO.lVZ, byv.bFN().bFO());
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("weatherInfoDialog");

      cBQ.cxL().mN("wakfu.weatherInformation");
    }

    this.fNF = null;
  }

  public void a(cQj paramcQj) {
    this.fNF = paramcQj;
  }
}