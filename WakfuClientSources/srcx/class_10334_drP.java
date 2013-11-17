import org.apache.log4j.Logger;

public class drP
  implements Runnable, sL
{
  private static Logger K = Logger.getLogger(drP.class);
  protected final aTl luf;
  private final long bYL = dDE.dft().bcy();
  private long lug = dDE.dft().bcy();
  private int luh;

  public drP(aTl paramaTl)
  {
    this.luf = paramaTl;
    this.luh = paramaTl.HM();
  }

  public long getStartTime() {
    return this.bYL;
  }

  public long zW() {
    run();
    long l = cRL.yW(this.luh);

    int i = this.luf.HN();
    if ((l > 0L) && (i == -1)) {
      K.error("Attention un cooldown de purgation tourne sur une nation vide");
    }
    return l;
  }

  protected long Bp(int paramInt) {
    return cRL.yW(paramInt) - (dDE.dft().bcy() - this.lug);
  }

  public long getRemainingTime() {
    return Bp(this.luf.HM());
  }

  public void aHU() {
  }

  public boolean zX() {
    this.luf.HV();
    return false;
  }

  public void aHT() {
  }

  public void Z(long paramLong) {
  }

  public void run() {
    int i = this.luf.HM();
    int j = cRL.A(this.luh, dDE.dft().bcy() - this.bYL);

    if (i != j) {
      this.lug = dDE.dft().bcy();
    }
    this.luf.dM(j - i);
  }

  public void bq(int paramInt1, int paramInt2) {
    this.luh += paramInt1;
  }

  public void reset() {
    this.luh = 0;
    this.lug = 0L;
  }
}