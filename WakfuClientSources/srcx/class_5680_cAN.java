final class cAN
{
  private static final int iqB = 3000;
  private final dwv iqC;
  private Runnable cGC;
  private boolean aYY;

  cAN(dwv paramdwv)
  {
    this.iqC = paramdwv;
  }

  public void cxq() {
    this.aYY = true;
    this.cGC = new aLC(this);

    dka.cSF().a(this.cGC, 3000L);
  }

  public void cxr() {
    dka.cSF().j(this.cGC);
    this.aYY = false;
  }

  public boolean isRunning() {
    return this.aYY;
  }
}