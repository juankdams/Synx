public class bfv extends bSR
{
  private final Runnable cdh;

  public bfv(Runnable paramRunnable)
  {
    super(0, 0, 0);
    this.cdh = paramRunnable;
  }

  public void run() {
    this.cdh.run();
    bZw();
  }

  protected void kO()
  {
  }
}