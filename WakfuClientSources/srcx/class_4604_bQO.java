import org.apache.log4j.Logger;

public class bQO
  implements cvW
{
  private static final bQO gZn = new bQO();
  protected static final Logger K = Logger.getLogger(bQO.class);
  private bnm N;

  public static bQO bXN()
  {
    return gZn;
  }

  public boolean a(cWG paramcWG)
  {
    return true;
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      this.N = new ui(this);

      dLE.doY().t("almanach", dBW.lJB);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("almanachDialog", VV.dJ("almanachDialog"), 32768L, (short)10000);

      dBW.lJB.Y(dDE.dft().VN());

      cpa localcpa = cBQ.cxL().coO().nf("almanachDialog");
      bWa localbWa = (bWa)localcpa.fi("calendar");
      localbWa.setCalendar(dDE.dft());

      cBQ.cxL().j("wakfu.almanach", aZg.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("almanachDialog");

      cBQ.cxL().mN("wakfu.almanach");

      dLE.doY().removeProperty("almanach");
    }
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong)
  {
  }
}