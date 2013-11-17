import org.apache.log4j.Logger;

public class dyQ
  implements cvW
{
  protected static final Logger K = Logger.getLogger(dyQ.class);

  private static dyQ lFq = new dyQ();
  private static final int bDF = 20000;
  private bzb lFr;
  private dOc bJM;
  private Runnable bJN;
  private auP bJO;
  private bnm N;

  public static dyQ dcP()
  {
    return lFq;
  }

  public void a(bzb parambzb)
  {
    this.lFr = parambzb;
    if (!byv.bFN().c(this))
      byv.bFN().a(this);
    else
      dLE.doY().a("infoView", this.lFr, "infoDialog");
  }

  public void Nx()
  {
    if (this.bJN != null) {
      dka.cSF().j(this.bJN);
      this.bJN = null;
    }
    this.bJM.J(dHx.class);
    this.bJM.a(new dHx(this.bJM.getX(), this.bJM.getY(), this.bJM.getX(), bsP.getInstance().getHeight(), this.bJM, 0, 1000, ddp.kWG));
    dka.cSF().a(new cEU(this), 1000L, 1);
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
      this.N = new cEV(this);

      cBQ.cxL().a(this.N);

      this.bJO = new cEW(this);

      bBq.bKG().a(this.bJO);

      this.bJM = ((dOc)cBQ.cxL().a("infoDialog", VV.dJ("infoDialog"), 1L, (short)10000));

      this.bJM.setVisible(false);
      this.bJM.setY(bsP.getInstance().getHeight());

      dLE.doY().a("infoView", this.lFr, "infoDialog");

      dka.cSF().a(new cEX(this), 1000L, 1);

      this.bJN = new cET(this);

      dka.cSF().a(this.bJN, 20000L, 1);

      cBQ.cxL().j("wakfu.info", dc.class);
    }
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!paramBoolean) {
      cBQ.cxL().b(this.N);
      bBq.bKG().b(this.bJO);

      cBQ.cxL().mW("infoDialog");

      cBQ.cxL().mN("wakfu.info");

      if (this.bJN != null) {
        dka.cSF().j(this.bJN);
        this.bJN = null;
      }
    }
  }
}