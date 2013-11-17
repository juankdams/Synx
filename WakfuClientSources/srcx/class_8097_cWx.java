public class cWx extends bSR
{
  private final int aPh;
  private final long crb;

  public cWx(int paramInt, long paramLong)
  {
    super(0, bzo.gnk.getId(), 0);
    this.aPh = paramInt;
    this.crb = paramLong;
  }

  public void run()
  {
    asf.c(this.aPh, this.crb);
    bZw();
  }

  protected void kO()
  {
  }
}