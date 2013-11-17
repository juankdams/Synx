import org.apache.log4j.Logger;

public class dyy
{
  protected static final Logger K = Logger.getLogger(dyy.class);
  protected ctb lFd;
  protected long cfv;

  public dyy()
  {
    reset();
  }

  public void b(ctb paramctb)
  {
    this.lFd = paramctb;
    if (paramctb != null)
      this.cfv = paramctb.getId();
    else
      this.cfv = 0L;
  }

  public void reset()
  {
    this.lFd = null;
    this.cfv = 0L;
  }

  public boolean dcJ()
  {
    if (this.lFd == null)
      return false;
    if (this.cfv == 0L) {
      return false;
    }

    return this.lFd.getId() == this.cfv;
  }

  public ctb dcK()
  {
    return this.lFd;
  }

  public long anE()
  {
    return this.cfv;
  }
}