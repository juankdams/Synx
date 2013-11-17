import org.apache.log4j.Logger;

public class ciO
  implements cvW
{
  private static ciO hIi = new ciO();
  protected static Logger K = Logger.getLogger(ciO.class);
  private bnm N;

  public static ciO ckK()
  {
    return hIi;
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 16880:
      afk localafk = (afk)paramcWG;
      int i = localafk.getIntValue();
      cFD.iAd.xG(i);

      Hv localHv = Hv.QV();
      localHv.e(i, false);
      byv.bFN().a(localHv);

      return false;
    }

    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.N = new cRv(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("gazetteDialog", VV.dJ("gazetteDialog"), 0L, (short)30000);

      cBQ.cxL().j("wakfu.gazette", dUr.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("gazetteDialog");

      cBQ.cxL().mN("wakfu.gazette");
    }
  }
}