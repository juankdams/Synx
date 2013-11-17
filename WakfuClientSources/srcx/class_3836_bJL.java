import org.apache.log4j.Logger;

public class bJL
  implements cvW
{
  private static bJL gLB = new bJL();
  private static final Logger K = Logger.getLogger(bJL.class);
  private bnm N;

  public static bJL bRp()
  {
    return gLB;
  }

  public boolean a(cWG paramcWG) {
    paramcWG.getId();

    return true;
  }

  public void tf(int paramInt) {
    cpa localcpa = cBQ.cxL().coO().nf("jailInfoDialog");
    if (localcpa == null) {
      return;
    }
    czv localczv = (czv)localcpa.fi("timerImage");
    if (localczv == null) {
      return;
    }
    int i = 250;
    int j = paramInt / 250;
    if (j % 2 != 0) {
      j++;
    }
    Jg localJg = localczv.getAppearance();
    localJg.a(new gm(bNa.gRx, bNa.gRE, localJg, 0, 250, j, true, ddp.kWG));
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.N = new bPn(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("jailInfoDialog", VV.dJ("jailInfoDialog"), 8193L, (short)10000);

      cBQ.cxL().j("wakfu.jailInfo", cLn.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().mN("wakfu.jailInfo");
      cBQ.cxL().mW("jailInfoDialog");
    }
  }
}