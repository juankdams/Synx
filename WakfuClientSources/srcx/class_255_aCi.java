public abstract class aCi extends pv
{
  private static final int cPR = 0;
  private static final int cPT = 1;
  private int cPV = 0;

  public boolean pZ()
  {
    if (!(this.dvI instanceof aEq)) {
      return false;
    }
    this.cPV = 0;

    byz localbyz = byv.bFN().bFO();

    boolean bool = bGP.gDv.a(new aGH[] { localbyz });
    if (!bool) {
      this.cPV = 1;
    }

    return true;
  }

  public boolean isEnabled()
  {
    boolean bool = bGP.gDv.a(new aGH[] { byv.bFN().bFO() });
    return bool;
  }

  public String getLabel()
  {
    if (!(this.dvI instanceof aEq)) {
      return qa();
    }

    lZ locallZ = new lZ();
    locallZ.a(super.getLabel());

    if (this.cPV != 0) {
      switch (this.cPV) {
      case 1:
        locallZ.tH().am(ict);
        locallZ.a(bU.fH().getString("error.playerNotSubscribed"));
        break;
      }

    }

    return locallZ.tP();
  }

  public String qa()
  {
    return "manageBookcase";
  }

  protected void wR()
  {
    cuj.csG().b((aEq)this.dvI);
  }

  protected int qc()
  {
    return coH.hWi.aw;
  }
}