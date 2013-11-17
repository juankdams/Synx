import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.log4j.Logger;

public class dka
{
  protected static final Logger K = Logger.getLogger(dka.class);
  private static final dka lhc = new dka();

  private AtomicInteger lhd = new AtomicInteger(0);
  private AtomicInteger lhe = new AtomicInteger(0);

  private long lhf = 0L;

  private final aee ffU = new dyu(new cOa(this), 100);
  private cdt lhg;
  private final ConcurrentLinkedQueue lhh = new ConcurrentLinkedQueue();
  private final ArrayList lhi = new ArrayList();
  private final ArrayList lhj = new ArrayList();

  public static dka cSF()
  {
    return lhc;
  }

  void a(cdt paramcdt)
  {
    this.lhg = paramcdt;
  }

  private long currentTimeMillis() {
    if (this.lhg == null) {
      return System.currentTimeMillis();
    }
    return this.lhg.bMO();
  }

  public void i(Runnable paramRunnable)
  {
    a(paramRunnable, 1L, 1);
  }

  public void a(Runnable paramRunnable, long paramLong)
  {
    a(paramRunnable, paramLong, -1);
  }

  private LW cSG() {
    try {
      return (LW)this.ffU.Mm();
    } catch (Exception localException) {
      K.error("Exception levée lors d'un checkOut d'opération", localException);
    }
    return null;
  }

  private void a(LW paramLW) {
    try {
      this.ffU.y(paramLW);
    } catch (Exception localException) {
      K.error("Exception levée lors du retour au pool d'un process", localException);
    }
  }

  public void a(Runnable paramRunnable, dmr paramdmr, long paramLong, int paramInt)
  {
    if (paramRunnable == null) {
      K.error("Tentative d'insertion d'un Runnable null");
      return;
    }

    if (paramInt == 0) {
      K.warn("On schedule un process pour être executé 0 fois, WTF ? (Gros blaireau)");
      return;
    }

    diS localdiS = diS.a(paramdmr, paramLong);
    localdiS.g(paramRunnable);
    localdiS.vm(paramInt);

    a(localdiS);
  }

  public void a(Runnable paramRunnable, long paramLong, int paramInt)
  {
    if (paramRunnable == null) {
      K.error("Tentative d'insertion d'un Runnable null");
      return;
    }

    if (paramInt == 0) {
      K.warn("On schedule un process pour être executé 0 fois, WTF ? (Gros blaireau)");
      return;
    }

    Yq localYq = Yq.cl(paramLong);
    localYq.g(paramRunnable);
    localYq.vm(paramInt);

    a(localYq);
  }

  public void b(Runnable paramRunnable, long paramLong)
  {
    i(paramRunnable);
    a(paramRunnable, paramLong);
  }

  private void a(cho paramcho) {
    LW localLW = cSG();
    localLW.bYX = dhG.lcK;
    localLW.bYY = paramcho;
    this.lhh.offer(localLW);

    this.lhe.incrementAndGet();

    cjO.clE().Rg();
  }

  public void j(Runnable paramRunnable) {
    LW localLW = cSG();
    localLW.bYX = dhG.lcL;
    localLW.runnable = paramRunnable;
    this.lhh.offer(localLW);
    this.lhe.incrementAndGet();
  }

  public void cSH() {
    this.lhi.clear();
    this.lhh.clear();
    this.lhe.set(0);
    this.lhd.set(0);
  }

  private void a(cho paramcho, long paramLong) {
    int i = 0;
    long l = paramcho.ck(paramLong);

    for (int j = 0; j < this.lhi.size(); j++) {
      cho localcho = (cho)this.lhi.get(j);
      if (l < localcho.cjt()) {
        this.lhi.add(j, paramcho);
        i = 1;
        break;
      }
    }

    if (i == 0)
      this.lhi.add(paramcho);
  }

  long cSI()
  {
    if (this.lhi.isEmpty()) {
      return 30L;
    }
    long l = ((cho)this.lhi.get(0)).cjt() - currentTimeMillis();
    return Math.max(0L, l);
  }

  long cSJ() {
    if ((this.lhi.isEmpty()) && (this.lhh.peek() == null)) {
      return cSI();
    }
    cdf();

    return cSI();
  }

  private void cdf()
  {
    long l = currentTimeMillis();
    LW localLW;
    while ((localLW = (LW)this.lhh.poll()) != null) {
      switch (cNW.ktN[localLW.bYX.ordinal()]) {
      case 1:
        Iterator localIterator = this.lhi.iterator();
        while (localIterator.hasNext()) {
          cho localcho = (cho)localIterator.next();
          if (localcho.cju() == localLW.runnable) {
            this.lhd.decrementAndGet();
            localIterator.remove();
            localcho.release();
            break;
          }
        }

        break;
      case 2:
        this.lhd.incrementAndGet();
        a(localLW.bYY, l);
        break;
      default:
        K.error("Undefined operation ! : " + localLW);
      }

      this.lhe.decrementAndGet();
      a(localLW);
    }
  }

  void update()
  {
    if ((this.lhi.isEmpty()) && (this.lhh.peek() == null)) {
      return;
    }
    long l1 = currentTimeMillis();

    cdf();

    Iterator localIterator = this.lhi.iterator();
    while (localIterator.hasNext()) {
      cho localcho = (cho)localIterator.next();

      long l2 = l1 - localcho.cjt();

      if (l2 >= 0L) {
        localIterator.remove();
        this.lhd.decrementAndGet();

        int k = localcho.cjv();
        if (k != 0)
        {
          if (k > 0)
            k--;
          localcho.vm(k);

          long l3 = System.nanoTime();
          Runnable localRunnable = null;
          try {
            localRunnable = localcho.cju();
            if (localRunnable != null) {
              if ((cjO.hJy > 0) && (cjO.hJz > 0)) {
                try {
                  int m = cjO.hJy + (int)(Math.random() * (cjO.hJz - cjO.hJy));

                  Thread.sleep(m);
                } catch (InterruptedException localInterruptedException) {
                  K.info("Inner latency generation interrupted");
                }
              }
              localRunnable.run();
            } else {
              K.error("(Paranoia) Process null ?!");
            }
          } catch (Throwable localThrowable) {
            if (localRunnable != null)
              K.error("ProcessScheduler exception (" + localRunnable.getClass().getName() + "): ", localThrowable);
            else {
              K.error("ProcessScheduler exception (null process): ", localThrowable);
            }

          }

          if (k != 0)
            this.lhj.add(localcho);
          else {
            localcho.release();
          }
        }
      }
    }

    if (!this.lhj.isEmpty()) {
      l1 = currentTimeMillis();
      int i = 0; for (int j = this.lhj.size(); i < j; i++)
        a((cho)this.lhj.get(i), l1);
      this.lhj.clear();
    }

    cdf();
  }
}