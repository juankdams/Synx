import org.apache.log4j.Logger;

public class cvr extends dqt
{
  private static final Logger K = Logger.getLogger(cvr.class);
  private arl cUs;
  private long ign;
  private int baA;

  public cvr(int paramInt1, int paramInt2, int paramInt3, arl paramarl, long paramLong, int paramInt4)
  {
    super(paramInt1, paramInt2, paramInt3);
    this.cUs = paramarl;
    this.ign = paramLong;
    this.baA = paramInt4;
  }

  protected long mC() {
    eB localeB = this.cUs.aDp().bPN();
    localeB.y(this.ign);
    localeB.b(this.ign, this.baA);
    localeB.z(this.ign);
    cmT.cnA().y(this.baA, false);
    if (byv.bFN().bFO().getId() == this.ign)
      return 0L;
    return 1500L;
  }

  protected void kO() {
  }

  public arl cth() {
    return this.cUs;
  }

  public void j(arl paramarl) {
    this.cUs = paramarl;
  }
}