import org.apache.log4j.Logger;

public class cUs
  implements cvW
{
  private static final cUs kGZ = new cUs();
  private static final Logger K = Logger.getLogger(cUs.class);

  private static final Runnable kHa = new AD();
  private bnm N;

  public static cUs cJJ()
  {
    return kGZ;
  }

  public boolean a(cWG paramcWG)
  {
    bzu localbzu;
    switch (paramcWG.getId()) {
    case 17720:
      byv.bFN().b(this);
      return false;
    case 17722:
      localbzu = (bzu)paramcWG;
      return false;
    case 17723:
      localbzu = (bzu)paramcWG;

      bWP.cbM().cbO();
      bxe localbxe = (bxe)localbzu;

      if (localbxe.bEC())
      {
        dka.cSF().a(kHa, 10000L, 1);
      }

      return false;
    case 17721:
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
      dLE.doY().t("statistics", bWP.cbM());

      this.N = new AF(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("adminMonitorDialog", VV.dJ("adminMonitorDialog"), 1L, (short)10000);

      cBQ.cxL().j("wakfu.adminMonitor", dlF.class);

      dAJ.def().clear();
      bWP.cbM().clear();

      if (!byv.bFN().c(nw.uJ())) {
        byv.bFN().a(nw.uJ());
      }

      bWP.cbM().cbQ();
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      dka.cSF().j(kHa);

      dLE.doY().removeProperty("statistics");

      cBQ.cxL().mW("adminMonitorDialog");
      cBQ.cxL().b(this.N);

      cBQ.cxL().mN("wakfu.adminMonitor");

      dAJ.def().clear();
      bWP.cbM().clear();
    }
  }
}