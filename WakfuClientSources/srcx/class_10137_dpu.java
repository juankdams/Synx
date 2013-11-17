import org.apache.log4j.Logger;

public class dpu extends dKf
{
  private static final Logger K = Logger.getLogger(dpu.class);
  private int lql;

  public dpu(int paramInt)
  {
    super(paramInt);
  }

  public void c(String[] paramArrayOfString) {
    this.lql = Integer.parseInt(paramArrayOfString[0]);
  }

  public boolean f(gA paramgA)
  {
    byv localbyv = byv.bFN();
    if (localbyv.c(abS.aob())) {
      K.error("Ouille on tente de lancer deux blind box en même temps !!!");
      return false;
    }
    abS.aob().a(this, paramgA);
    localbyv.a(abS.aob());
    return true;
  }

  public void clear() {
  }

  public void jS(long paramLong) {
    bZ(paramLong);
  }

  public int cXd() {
    return this.lql;
  }
}