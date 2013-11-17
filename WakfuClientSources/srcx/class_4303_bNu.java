import org.apache.log4j.Logger;

public class bNu
  implements cvW
{
  private static bNu gSp = new bNu();
  private static final Logger K = Logger.getLogger(bNu.class);
  private bnm N;

  public static bNu bVe()
  {
    return gSp;
  }

  public boolean a(cWG paramcWG)
  {
    switch (paramcWG.getId()) {
    case 17684:
      bzu localbzu = (bzu)paramcWG;
      int i = byv.bFN().bFO().bSl();
      short s = localbzu.ag();
      if (i != s) {
        byv.bFN().bFO().bA(s);

        aYz localaYz = new aYz();
        localaYz.bA(s);
        byv.bFN().aJK().d(localaYz);
      }
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
      this.N = new bfy(this);

      cBQ.cxL().a(this.N);

      dLE.doY().t("passportViewMode", Integer.valueOf(0));

      cBQ.cxL().a("passportDialog", VV.dJ("passportDialog"), 4097L, (short)10000);

      cBQ.cxL().j("wakfu.passport", dNJ.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().mW("passportDialog");
      cBQ.cxL().b(this.N);

      cBQ.cxL().mN("wakfu.passport");
    }
  }
}