import org.apache.log4j.Logger;

public class dME
  implements cvW
{
  protected static final Logger K = Logger.getLogger(dME.class);

  private static dME mcO = new dME();

  public boolean a(cWG paramcWG) {
    switch (paramcWG.getId()) {
    case 5240:
      bvQ localbvQ = (bvQ)paramcWG;
      byv.bFN().bFO().bHb().fO().BC(localbvQ.bDx());

      return false;
    }

    return true;
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong) {
  }

  public void a(aqv paramaqv, boolean paramBoolean) {
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
  }

  public static dME dpt() {
    return mcO;
  }
}