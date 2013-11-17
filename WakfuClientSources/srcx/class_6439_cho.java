import org.apache.log4j.Logger;

public abstract class cho
  implements bWU
{
  protected static final Logger K = Logger.getLogger(Yq.class);
  protected long hFE;
  protected int hFF;
  protected boolean gkh;
  Runnable cGC;

  public abstract long ck(long paramLong);

  public long cjt()
  {
    return this.hFE;
  }

  public Runnable cju() {
    return this.cGC;
  }

  public void g(Runnable paramRunnable) {
    this.cGC = paramRunnable;
  }

  public int cjv() {
    return this.hFF;
  }

  public void vm(int paramInt) {
    this.hFF = paramInt;
  }

  public void aJ()
  {
    this.hFE = -1L;
    this.cGC = null;
    this.hFF = 0;
  }

  public void bc()
  {
    this.hFE = -1L;
    this.cGC = null;
    this.hFF = 0;
  }

  protected abstract aee Bq();

  void release() {
    try {
      if (this.gkh)
        Bq().y(this);
    } catch (Exception localException) {
      K.error("Exception", localException);
    }
  }
}