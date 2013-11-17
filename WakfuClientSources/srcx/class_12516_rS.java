import org.apache.log4j.Logger;

public class rS
  implements cvW
{
  private static rS aZU = new rS();
  private static final Logger K = Logger.getLogger(rS.class);

  public static rS ys() {
    return aZU;
  }

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId())
    {
    case 16400:
      byv.bFN().a(aoT.aBl());

      return false;
    case 16427:
      if (!byv.bFN().c(yZ.HB())) {
        byv.bFN().a(yZ.HB());
      }
      yZ.HE();

      cKX localcKX = cBQ.cxL().a(bU.fH().getString("question.generateDebugInformation"), Cn.et(0), 2073L, 102, 1);

      localcKX.a(new aQk(this));

      return false;
    case 17721:
      if (!byv.bFN().c(cUs.cJJ())) {
        byv.bFN().a(cUs.cJJ());
      }

      return false;
    case 17724:
      if (!byv.bFN().c(vQ.Fa())) {
        byv.bFN().a(vQ.Fa());
      }

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
    if (!paramBoolean)
    {
      cBQ.cxL().a("systemBarDialog", VV.dJ("systemBarDialog"), 12288L, (short)10000);

      cBQ.cxL().a("menuBarDialog", VV.dJ("menuBarDialog"), 12288L, (short)10000);

      cBQ.cxL().a("reportBugDialog", VV.dJ("reportBugDialog"), 143360L, (short)10000);

      dLE.doY().t("reportBug", Boolean.valueOf(ay.bd().getBoolean("bugReportActivate", false)));
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean)
    {
      cBQ.cxL().mW("systemBarDialog");

      cBQ.cxL().mW("reportBugDialog");

      cBQ.cxL().mW("menuBarDialog");
    }
  }
}