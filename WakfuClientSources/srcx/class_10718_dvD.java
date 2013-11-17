import org.apache.log4j.Logger;

public class dvD extends dKc
  implements diG
{
  protected static final Logger K = Logger.getLogger(dvD.class);
  private final dwN lAS;
  private final long lAT;
  private final XQ bIe;

  public XQ MF()
  {
    return this.bIe;
  }

  public dvD(dwN paramdwN, XQ paramXQ)
  {
    this.lAS = paramdwN;
    this.lAT = paramXQ.aiQ();
    this.bIe = paramXQ;
  }

  public dwN daY() {
    return this.lAS;
  }

  public long daZ() {
    return this.lAT;
  }

  public short fU() {
    return 5;
  }

  public boolean fV() {
    return true;
  }

  public void begin() {
    K.info("Lancement de l'occupation BROWSE_FLEA");

    this.bSY.q(false, true);

    dKd.d(this.lAS);

    if (byv.bFN().c(rX.yA())) {
      rX.yA().clean();
      rX.yA().init();
    } else {
      byv.bFN().a(rX.yA());
    }

    aQn localaQn = new aQn();
    dwN localdwN = dKd.dji();
    localaQn.eA(localdwN.sN());
    localaQn.eB(this.lAT);
    localaQn.dP(true);
    byv.bFN().aJK().d(localaQn);

    this.bSY.a(this);
  }

  public boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    K.info("On arrête l'occupation BROWSE_FLEA (fromServer=" + paramBoolean1 + ", sendMessage=" + paramBoolean2 + ")");

    byv.bFN().b(rX.yA());

    if (paramBoolean2) {
      aQn localaQn = new aQn();
      localaQn.eA(dKd.dji().sN());
      localaQn.eB(this.lAT);
      localaQn.dP(false);
      byv.bFN().aJK().d(localaQn);
    }

    dKd.d(null);

    return fW();
  }

  public boolean fW() {
    return true;
  }
}