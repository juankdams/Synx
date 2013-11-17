import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.Logger;

public abstract class aZl extends Thread
{
  private static final boolean aRN = false;
  protected static final Logger K = Logger.getLogger(Vm.class);
  protected final ArrayList ffN;
  private final Queue ffO;
  private volatile boolean aKV;
  private int ffP;
  private final Lock ffQ;
  private final Condition ffR;
  protected static final String ffS = "id";
  protected static final int ffT = "id".hashCode();
  private final aee ffU;

  public aZl()
  {
    this.ffN = new ArrayList();
    this.ffO = new ConcurrentLinkedQueue();

    this.ffQ = new ReentrantLock();
    this.ffR = this.ffQ.newCondition();

    this.ffU = new cjv(new cHs(this));
  }

  private cRy boj()
  {
    try
    {
      return (cRy)this.ffU.Mm();
    } catch (Exception localException) {
      K.error("Exception levée lors d'un checkOut d'opération", localException);
    }
    return null;
  }

  private void a(cRy paramcRy) {
    try {
      this.ffU.y(paramcRy);
    } catch (Exception localException) {
      K.error("Exception levée lors du retour au pool d'un process", localException);
    }
  }

  public void a(aSn paramaSn)
  {
    if (!this.ffN.contains(paramaSn))
      this.ffN.add(paramaSn);
  }

  public void b(aSn paramaSn) {
    this.ffN.remove(paramaSn);
  }

  public synchronized void start()
  {
    if (!this.aKV) {
      this.aKV = true;
      super.start();
    }
  }

  public void shutdown()
  {
    a(anm.dqV, null);
  }

  public boolean isRunning() {
    return this.aKV;
  }

  public void av(boolean paramBoolean) {
    this.aKV = paramBoolean;
    Rg();
  }

  private void Rg() {
    this.ffQ.lock();
    this.ffR.signal();
    this.ffQ.unlock();
  }

  public void a(anm paramanm, Object paramObject)
  {
    cRy localcRy = boj();
    if (localcRy != null) {
      localcRy.kDL = paramanm;
      localcRy.kDM = paramObject;
      this.ffO.offer(localcRy);
      Rg();
    }
  }

  public int bok() {
    return this.ffO.size();
  }

  public int bol() {
    return this.ffP;
  }

  public void oy(int paramInt) {
    this.ffP = paramInt;
  }

  public abstract gR a(int paramInt, gR paramgR);

  public abstract gR[] d(gR paramgR);

  public abstract gR[] a(String paramString, Object paramObject, gR paramgR);

  protected abstract boolean aiu();

  protected abstract void c(gR paramgR);

  protected abstract void a(gR paramgR);

  protected abstract String ait();

  protected abstract void aiw();

  public void run() {
    K.info("BinaryStorage started " + this);

    int i = 0;
    int j = 0;
    int k = 0;

    this.aKV = true;

    while (this.aKV)
    {
      cRy localcRy;
      while ((localcRy = (cRy)this.ffO.poll()) != null)
      {
        anm localanm = localcRy.kDL;
        Object localObject1;
        Object localObject2;
        aSn localaSn;
        switch (cHo.iCo[localanm.ordinal()]) {
        case 1:
          k++;
          localObject1 = (gR)localcRy.kDM;
          c((gR)localObject1);
          for (localObject2 = this.ffN.iterator(); ((Iterator)localObject2).hasNext(); ) { localaSn = (aSn)((Iterator)localObject2).next();
            localaSn.b(this, (gR)localObject1);
          }

          break;
        case 2:
          j++;
          localObject1 = (gR)localcRy.kDM;
          a((gR)localObject1);
          for (localObject2 = this.ffN.iterator(); ((Iterator)localObject2).hasNext(); ) { localaSn = (aSn)((Iterator)localObject2).next();
            localaSn.a(this, (gR)localObject1);
          }

          break;
        case 3:
          av(false);
          for (localObject1 = this.ffN.iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (aSn)((Iterator)localObject1).next();
            ((aSn)localObject2).c(this);
          }

        }

        i++;

        a(localcRy);
      }

      if ((this.aKV) && (this.ffQ.tryLock())) {
        try {
          this.ffR.await();
        } catch (InterruptedException localInterruptedException) {
          K.warn("Interrupt", localInterruptedException);
        } finally {
          this.ffQ.unlock();
        }
      }
    }

    K.info("BinaryStorage stopped : " + i + " operations, " + j + " saved, " + k + " destroyed");
  }
}