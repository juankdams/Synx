public class dmO
  implements Runnable
{
  public static final dmO lli = new dmO();
  public static final int llj = 250;
  private bzu llk;
  private boolean aKV;
  private long bYL;
  private boolean lll = false;
  private static final int llm = 225;
  private static final int lln = 350;
  private static final int llo = 3500;
  private biy llp;
  private final doN cGQ = new buC(this);

  public void a(bzu parambzu, biy parambiy)
  {
    this.bYL = System.currentTimeMillis();
    this.lll = false;
    this.llk = parambzu;
    this.llp = parambiy;
    dka.cSF().a(this, 250L);
    bsP.getInstance().a(CH.bGv, this.cGQ, true);

    this.aKV = true;
    run();
  }

  public void run()
  {
    if (!this.aKV) {
      if (!this.lll)
        sendMessage();
      dka.cSF().j(this);
      return;
    }

    long l = System.currentTimeMillis() - this.bYL;
    if (l < 350L) {
      return;
    }
    sendMessage();

    int i = (int)((float)l / 3500.0F * 225.0F);
    if ((i > 0) && (i <= 225)) {
      dka.cSF().j(this);
      dka.cSF().a(this, 250 - i);
    }
  }

  private void sendMessage() {
    cjO.clE().j(this.llk);
    this.lll = true;
  }

  public boolean isRunning() {
    return this.aKV;
  }

  public void stop() {
    if (!this.lll) {
      sendMessage();
    }
    this.aKV = false;
  }

  public final void cUo()
  {
    this.llp.getAppearance().exit();
    dka.cSF().j(this);
    stop();
    bsP.getInstance().b(CH.bGv, this.cGQ, true);
  }
}