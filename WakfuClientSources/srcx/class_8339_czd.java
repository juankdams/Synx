import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class czd
{
  public static final czd inP = new czd();
  protected static final Logger K = Logger.getLogger(czd.class);

  private final Object aNy = new Object();
  private final cSR inQ = new cSR();

  public void a(bDv parambDv)
  {
    if (parambDv == null)
      return;
    synchronized (this.aNy) {
      int i = parambDv.getId();
      dSl localdSl = (dSl)this.inQ.get(i);
      if (localdSl == null) {
        localdSl = new dSl(i);
        this.inQ.put(i, localdSl);
      } else {
        localdSl.aHm += 1;
      }
    }
  }

  public void b(bDv parambDv) {
    if (parambDv == null) {
      return;
    }
    synchronized (this.aNy) {
      int i = parambDv.getId();
      dSl localdSl = (dSl)this.inQ.get(i);
      if (localdSl != null) {
        ArrayList localArrayList = localdSl.dsR();
        if (localdSl.aHm <= 0) {
          this.inQ.remove(i);
          Y(localArrayList);
          X(localArrayList);
        } else {
          localdSl.aHm -= 1;
        }
      }
    }
  }

  private void X(ArrayList paramArrayList) { if (paramArrayList.isEmpty()) {
      return;
    }
    int i = 0; for (int j = paramArrayList.size(); i < j; i++) {
      Runnable localRunnable = (Runnable)paramArrayList.get(i);
      if (localRunnable != null)
        dka.cSF().i(localRunnable);
    } }

  private void Y(ArrayList paramArrayList)
  {
    if (!this.inQ.isEmpty())
      this.inQ.a(new dbl(this, paramArrayList));
  }

  public void a(Runnable paramRunnable, bDv[] paramArrayOfbDv)
  {
    if (paramArrayOfbDv == null)
      return;
    if (paramRunnable == null) {
      return;
    }
    int i = 0;
    for (bDv localbDv : paramArrayOfbDv) {
      int m = localbDv.getId();
      dSl localdSl = (dSl)this.inQ.get(m);
      if (localdSl != null) {
        i = 1;
        localdSl.l(paramRunnable);
      }
    }

    if (i == 0)
      paramRunnable.run();
  }
}