import org.apache.log4j.Logger;

public class Ex
  implements cvW
{
  protected static final Logger K = Logger.getLogger(Ex.class);

  private static Ex bJK = new Ex();
  private static final int bDF = 20000;
  private jt bJL;
  private dOc bJM;
  private Runnable bJN;
  private auP bJO;
  private bnm N;

  public static Ex Nw()
  {
    return bJK;
  }

  public void a(jt paramjt)
  {
    this.bJL = paramjt;
    if (!byv.bFN().c(this))
      byv.bFN().a(this);
    else
      dLE.doY().a("shukruteReward", this.bJL, "shukruteRewardDialog");
  }

  public void a(aKo paramaKo)
  {
    this.bJL.a(paramaKo);
  }

  public void Nx() {
    if (this.bJN != null) {
      dka.cSF().j(this.bJN);
      this.bJN = null;
    }
    this.bJM.J(dHx.class);
    this.bJM.a(new dHx(this.bJM.getX(), this.bJM.getY(), this.bJM.getX(), bsP.getInstance().getHeight(), this.bJM, 0, 1000, ddp.kWG));
    dka.cSF().a(new bce(this), 1000L, 1);
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
      this.N = new bcd(this);

      cBQ.cxL().a(this.N);

      this.bJO = new bcc(this);

      bBq.bKG().a(this.bJO);

      this.bJM = ((dOc)cBQ.cxL().a("shukruteRewardDialog", VV.dJ("shukruteRewardDialog"), 1L, (short)10000));

      this.bJM.setVisible(false);
      this.bJM.setY(bsP.getInstance().getHeight());

      dLE.doY().a("shukruteReward", this.bJL, "shukruteRewardDialog");

      dka.cSF().a(new bcb(this), 1000L, 1);

      this.bJN = new bcf(this);

      dka.cSF().a(this.bJN, 20000L, 1);

      cBQ.cxL().j("wakfu.shukrute", dgN.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);
      bBq.bKG().b(this.bJO);

      cBQ.cxL().mW("shukruteRewardDialog");

      cBQ.cxL().mN("wakfu.shukrute");

      if (this.bJN != null) {
        dka.cSF().j(this.bJN);
        this.bJN = null;
      }
    }
  }
}