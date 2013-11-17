import com.ankamagames.framework.kernel.stats.StatisticsCounter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.Logger;

public final class cjO
  implements bnu, Runnable
{
  static final boolean hJv = false;
  private static final boolean hJw = false;
  private static final boolean aRN = false;
  private static final boolean hJx = false;
  public static int hJy = 0;
  public static int hJz = 0;

  private static final Logger K = Logger.getLogger(cjO.class);

  protected static final cjO hJA = new cjO();

  protected final ConcurrentLinkedQueue hJB = new ConcurrentLinkedQueue();

  protected final Lock hJC = new ReentrantLock();
  protected final Condition bQe = this.hJC.newCondition();
  private final List hJD;
  private int hnz;
  private long hJE = 0L;
  private int hJF = 0;
  public AtomicInteger hJG = new AtomicInteger(0);

  public int hJH = 0;
  public int hJI;
  public int hnx;
  public int hJJ;
  public final HashMap hJK = new HashMap();
  public final ArrayList hJL;
  public long hJM;
  private dnJ hJN;
  private cpq hJO = new cpq(this, null);
  private bpl hJP;
  long hJQ = 0L;
  long hJR = 0L;
  StatisticsCounter[] hJS = null;

  int hJT = 0;

  private cjO()
  {
    this.hJD = Collections.synchronizedList(new ArrayList());
    this.hJL = new ArrayList();
  }

  public static cjO clE()
  {
    return hJA;
  }

  public void a(bpl parambpl) {
    this.hJP = parambpl;
  }

  public void join() {
    try {
      dnJ localdnJ = this.hJN;
      if (localdnJ != null)
        localdnJ.join();
    }
    catch (InterruptedException localInterruptedException) {
      K.error("Thread interrupted : ", localInterruptedException);
    }
  }

  public void start()
  {
    if (this.hJN == null) {
      cjO localcjO = this;

      this.hJN = new dmy(this, localcjO);

      this.hJN.setPriority(10);
      this.hJN.start();
    }
    else {
      K.warn("Le Worker est déjà en cours de fonctionnement.");
    }
  }

  public void clF() {
    if (this.hJN == null)
    {
      this.hJN = new dmw(this);

      this.hJN.start();
    } else {
      K.warn("Le Worker est déjà en cours de fonctionnement.");
    }
  }

  public void j(cWG paramcWG)
  {
    if (paramcWG != null) {
      paramcWG.jj(System.currentTimeMillis());

      this.hJB.offer(paramcWG);
      this.hJG.incrementAndGet();
      Rg();
    }
  }

  public void T(ArrayList paramArrayList) {
    if ((paramArrayList != null) && (!paramArrayList.isEmpty())) {
      int i = paramArrayList.size();
      long l = System.currentTimeMillis();
      for (int j = 0; j < i; j++) {
        cWG localcWG = (cWG)paramArrayList.get(j);
        localcWG.jj(l);

        this.hJB.offer(localcWG);
      }
      this.hJG.addAndGet(i);
      Rg();
    }
  }

  public int clG()
  {
    return this.hJG.get();
  }

  public int clH()
  {
    return 0;
  }

  public void clI()
  {
    this.hJH = 0;
    this.hJI = 0;
    this.hnx = 0;

    this.hJD.clear();
  }

  public int clJ()
  {
    return this.hJH;
  }

  public int clK()
  {
    return this.hJI;
  }

  public int clL()
  {
    return this.hnx;
  }

  public Object[] cdd()
  {
    synchronized (this.hJD) {
      return this.hJD.toArray();
    }
  }

  public boolean isRunning()
  {
    if (this.hJN != null) {
      return this.hJN.isRunning();
    }
    return false;
  }

  public void av(boolean paramBoolean)
  {
    if (this.hJN != null) {
      this.hJN.av(paramBoolean);
      Rg();
    }
  }

  public void kill()
  {
    K.warn("Worker killed by " + bBd.bJO());
    this.hJB.clear();
    av(false);
  }

  public void interrupt() {
    if (this.hJN != null) {
      this.hJN.interrupt();
      Rg();
    }
  }

  void Rg()
  {
    if (this.hJC.tryLock()) {
      this.bQe.signal();
      this.hJC.unlock();
    }
  }

  private void k(cWG paramcWG)
  {
    if (paramcWG != null)
    {
      String str = paramcWG.getClass().getSimpleName();
      aGF localaGF = aGF.w(str, true);
      try
      {
        if (paramcWG.cKy()) {
          long l = System.nanoTime();
          if (this.hJP != null)
            this.hJP.a(System.currentTimeMillis(), paramcWG);
          try
          {
            if ((hJy > 0) && (hJz > 0)) {
              try {
                int i = hJy + (int)(Math.random() * (hJz - hJy));

                Thread.sleep(i);
              } catch (InterruptedException localInterruptedException) {
                K.info("Inner latency generation interrupted");
              }
            }
            paramcWG.execute();
          } catch (Exception localException) {
            K.error("Exception levée lors de l'éxécution d'un message (id=" + paramcWG.getId() + "): ", localException);
          }
          int j = (int)((System.nanoTime() - l) / 1000000L);

          if (this.hJP != null) {
            this.hJP.byI();
          }

          localaGF.q(j, true);
          if ((paramcWG instanceof dKQ)) {
            aVd localaVd = aVd.a((dKQ)paramcWG, true);
            localaVd.q(j, true);
          }

          this.hJH += 1;
        } else {
          localObject1 = paramcWG.cKx();
          K.error("Destinataire invalide pour un message de type " + str + ", destinataire : " + (localObject1 != null ? localObject1.getClass().getSimpleName() : "null"));
        }
      }
      catch (Throwable localThrowable)
      {
        Object localObject1;
        h(localThrowable);
        K.error("Exception levée dans le worker : ", localThrowable);
        localaGF.q(0, false);
      }
      finally
      {
        aee localaee1;
        if (!paramcWG.cKz()) {
          aee localaee2 = paramcWG.aOr;
          if (localaee2 != null) {
            paramcWG.release();
            this.hJJ += 1;
          }
        }
      }
    }
  }

  void clM() {
    while (!this.hJB.isEmpty()) {
      cWG localcWG = (cWG)this.hJB.poll();
      this.hJG.decrementAndGet();
      k(localcWG);
    }
  }

  public void run()
  {
    clM();

    dka.cSF().cSJ();
    long l = dka.cSF().cSI();

    if (l > 0L) {
      if (this.hJC.tryLock())
        try {
          this.bQe.await(l, TimeUnit.MILLISECONDS);
          dka.cSF().update();
        } catch (InterruptedException localInterruptedException) {
          K.error("Worker interrupted", localInterruptedException);
        } finally {
          this.hJC.unlock();
        }
    }
    else
      dka.cSF().update();
  }

  private void h(Throwable paramThrowable)
  {
    if ((paramThrowable instanceof OutOfMemoryError)) {
      try {
        K.error("Out of memory levé dans le Worker ", paramThrowable);
        paramThrowable.printStackTrace();
      } catch (Exception localException) {
        K.error("Out of Memory !");
        localException.printStackTrace();
      }
      System.exit(1);
    }

    String str = bBd.g(paramThrowable);
    K.error("Exception catchée dans le Worker : " + str, paramThrowable);
    Throwable localThrowable = paramThrowable.getCause();
    if (localThrowable != null) {
      K.error("Caused by : ", localThrowable);
    }

    this.hnx += 1;
    synchronized (this.hJD) {
      if (this.hnx >= 10) {
        this.hJD.remove(0);
      }

      this.hJD.add(str.toString());
    }
  }

  public String bxB()
  {
    return "Worker";
  }

  public int bxC() {
    return this.hnz;
  }

  public void qr(int paramInt) {
    this.hnz = paramInt;
  }

  public HashMap clN() {
    return this.hJK;
  }

  public void clear() {
    this.hJB.clear();
    this.hJG.set(0);
  }

  public final String clO()
  {
    cYR localcYR = new cYR();
    dxQ localdxQ1 = new dxQ();
    dxQ localdxQ2 = new dxQ();
    dxQ localdxQ3 = new dxQ();
    Iterator localIterator = this.hJB.iterator();
    long l1 = System.currentTimeMillis();
    Object localObject;
    while (localIterator.hasNext()) {
      localObject = (cWG)localIterator.next();
      String str = localObject.getClass().getSimpleName();
      long l2 = l1 - ((cWG)localObject).cKB();

      localcYR.b(str, 1, 1);

      long l3 = localdxQ1.contains(str) ? localdxQ1.get(str) : l2;
      long l4 = localdxQ2.contains(str) ? localdxQ2.get(str) : l2;
      localdxQ1.c(str, Math.min(l3, l2));
      localdxQ2.c(str, Math.max(l4, l2));
      localdxQ3.a(str, l2, l2);
    }

    if (!localcYR.isEmpty()) {
      localObject = new StringBuilder();
      if (!localcYR.isEmpty()) {
        localcYR.a(new dmx(this, (StringBuilder)localObject, localdxQ1, localdxQ3, localdxQ2));
      }

      return ((StringBuilder)localObject).toString();
    }

    return "(empty)";
  }

  public static void main(String[] paramArrayOfString)
  {
    clE().clF();
    cGq localcGq = new cGq(null);

    int i = 0;
    while (true) {
      Thread.yield();
      aIx localaIx = new aIx(null);
      aIx.a(localaIx, i++);
      localaIx.iN(true);
      localaIx.d(localcGq);
      clE().j(localaIx);
    }
  }
}