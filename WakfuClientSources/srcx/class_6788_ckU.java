import org.apache.log4j.Logger;

public class ckU extends wL
{
  private static final Logger K = Logger.getLogger(ckU.class);

  private static ckU hMv = new ckU();

  private boolean aYY = false;

  public static ckU cmE()
  {
    return hMv;
  }

  protected bOK FP()
  {
    return new Rm();
  }

  protected void a(bOK parambOK)
  {
    if (!this.aYY) {
      this.aYY = true;
      cBQ.cxL().a("progressDialog", VV.dJ("progressDialog"), 8448L, (short)19500);

      aWc.blo().blB();
    }
  }

  protected void b(bOK parambOK)
  {
    if (this.aYY) {
      this.aYY = false;
      cBQ.cxL().mW("progressDialog");
      aWc.blo().stopLoading();
    }
  }

  public boolean isRunning() {
    return this.aYY;
  }
}