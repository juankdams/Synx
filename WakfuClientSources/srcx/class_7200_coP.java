import org.apache.log4j.Logger;

public class coP
  implements cvW
{
  protected static final Logger K = Logger.getLogger(coP.class);

  private static final coP hXL = new coP();
  private ahT hXM;
  private bnm N;

  public static coP coG()
  {
    return hXL;
  }

  public boolean a(cWG paramcWG)
  {
    return true;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void d(amY paramamY) {
    this.hXM = new ahT(paramamY.azt());
    this.hXM.chL();
    bot();
  }

  private void bot() {
    dLE.doY().a("displayedAchievement", this.hXM, "challengeResultDialog");
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      this.N = new dFE(this);

      cBQ.cxL().a(this.N);

      cBQ.cxL().a("challengeResultDialog", VV.dJ("challengeResultDialog"), 1L, (short)10000);

      bot();
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);

      cBQ.cxL().mW("challengeResultDialog");
      this.hXM = null;
    }
  }
}