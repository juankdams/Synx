import org.apache.log4j.Logger;

public class UB extends dte
  implements dUd
{
  protected static final Logger K = Logger.getLogger(UB.class);

  private static int cxZ = 0;
  private static boolean cya = false;
  private static long cyb;
  private boolean cyc;
  private boolean cyd;

  public UB()
  {
    this.cyc = true;
  }

  public UB(boolean paramBoolean) {
    this.cyc = false;
    this.cyd = paramBoolean;
  }

  public boolean isValid()
  {
    return true;
  }

  public void execute()
  {
    if (this.cyc) {
      ahD();
    }
    else if (cya)
      ahC();
    else
      ahB();
  }

  private void ahB()
  {
    if (!cya) {
      cyb = cAo.cxf().a(this, 1000L, 1);
      cya = true;
    }
  }

  private void ahC() {
    if (cya) {
      cAo.cxf().ia(cyb);
      cya = false;
      cyb = 0L;
    }
  }

  private boolean ahD() {
    cyx localcyx = byv.bFN().aJK();
    if (localcyx != null) {
      try {
        cxZ += 1;
        localcyx.d(new dIm((byte)0, cxZ));
        localcyx.d(new dIm((byte)2, cxZ));
        localcyx.d(new dIm((byte)3, cxZ));
        localcyx.d(new dIm((byte)1, cxZ));
        localcyx.d(new dIm((byte)4, cxZ));
      } catch (Exception localException) {
        K.error("[PING COMMAND] exception levée", localException);
        return false;
      }
    } else {
      cth.cqP().err("Pour accéder à ces commandes il faut être connecté !");
      return false;
    }
    return true;
  }

  public boolean a(cWG paramcWG)
  {
    if (paramcWG.getId() == -2147483648) {
      if (!ahD()) {
        ahC();
      }
      return false;
    }
    return true;
  }

  public long getId()
  {
    return 1L;
  }

  public void a(long paramLong)
  {
  }
}