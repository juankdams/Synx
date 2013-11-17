import org.apache.log4j.Logger;

public abstract class bpf extends Hr
{
  private static final int fIM = 10;
  public static final Logger K = Logger.getLogger(bpf.class);

  private int bPG = 1;
  private boolean fIN = false;

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    cVD();

    for (int i = 0; i < this.bPG; i++) {
      c((doA)paramaVc);
      if ((this.fIN) && 
        (QR() > 0))
        break;
    }
  }

  public final void a(aVc paramaVc) {
    super.a(paramaVc);
    this.bPG = Math.min(10, d(paramaVc));
    this.fIN = e(paramaVc);
  }
  protected abstract int d(aVc paramaVc);

  protected abstract boolean e(aVc paramaVc);

  public void bc() {
    super.bc();
    this.bPG = 1;
  }

  protected boolean QT() {
    return false;
  }
}