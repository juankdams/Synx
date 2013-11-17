import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.Logger;

public class cAo extends Thread
{
  private static final long iqi = 3L;
  private static final Logger K = Logger.getLogger(cAo.class);

  protected static cAo iqj = new cAo();
  protected boolean aKV;
  protected final cjX iqk = new cjX();
  protected final Queue iql = new ConcurrentLinkedQueue();

  protected final Lock hJC = new ReentrantLock();
  protected final Condition bQe = this.hJC.newCondition();

  protected long iqm = 0L;

  protected cAo()
  {
    super("MessageScheduler");
    this.aKV = false;
  }

  public static cAo cxf()
  {
    return iqj;
  }

  static void a(cAo paramcAo)
  {
    iqj = paramcAo;
  }

  private void Rg() {
    this.hJC.lock();

    this.bQe.signalAll();
    this.hJC.unlock();
  }

  public long a(dUd paramdUd, long paramLong, int paramInt)
  {
    return a(paramdUd, paramLong, paramInt, -1);
  }

  public long a(dUd paramdUd, long paramLong, int paramInt1, int paramInt2)
  {
    cDl localcDl = new cDl();
    localcDl.c(paramdUd);
    localcDl.ii(paramLong);
    localcDl.xv(paramInt1);
    localcDl.xw(paramInt2);
    localcDl.ij(System.currentTimeMillis());

    this.iqm += 1L;
    localcDl.ih(this.iqm);

    q localq = new q(null);
    localq.al = bUl.hgm;
    localq.am = localcDl;
    this.iql.offer(localq);

    Rg();

    return localcDl.czk();
  }

  public void ia(long paramLong)
  {
    q localq = new q(null);
    localq.al = bUl.hgi;
    localq.an = paramLong;
    this.iql.offer(localq);
    Rg();
  }

  public void cxg()
  {
    q localq = new q(null);
    localq.al = bUl.hgl;
    this.iql.offer(localq);
    Rg();

    Rg();
  }

  public void b(dUd paramdUd)
  {
    q localq = new q(null);
    localq.al = bUl.hgj;
    localq.ao = paramdUd;
    this.iql.offer(localq);
    Rg();
  }

  public void a(dUd paramdUd, int paramInt)
  {
    q localq = new q(null);
    localq.al = bUl.hgk;
    localq.ao = paramdUd;
    localq.ap = paramInt;
    this.iql.offer(localq);
    Rg();
  }

  public void start()
  {
    if (!this.aKV) {
      this.aKV = true;
      super.start();
    }
  }

  public boolean isRunning() {
    return this.aKV;
  }

  public void av(boolean paramBoolean) {
    this.aKV = paramBoolean;
    Rg();
  }

  private void a(cDl paramcDl)
  {
    int i = 0;
    long l = paramcDl.czn();

    for (cDl localcDl : this.iqk) {
      if (localcDl.czn() > l) {
        this.iqk.b(localcDl, paramcDl);
        i = 1;
        break;
      }
    }

    if (i == 0)
      this.iqk.e(paramcDl);
  }

  private void a(cDl paramcDl, long paramLong)
  {
    try {
      dKQ localdKQ = dKQ.djF();

      localdKQ.d(paramcDl.czp());
      localdKQ.ih(paramcDl.czk());
      localdKQ.xv(paramcDl.czj());
      localdKQ.setTimeStamp(paramLong);
      cjO.clE().j(localdKQ);
    } catch (Exception localException) {
      K.error("Unable to push ClockMessage, exception raised : " + localException.getMessage());
    }
  }

  private void cxh()
  {
    while (!this.iql.isEmpty()) {
      q localq = (q)this.iql.poll();
      Iterator localIterator;
      switch (cxW.imf[localq.al.ordinal()]) {
      case 1:
        a(localq.am);

        break;
      case 2:
        localIterator = this.iqk.iterator();
      case 3:
      case 4:
      case 5:
        while (localIterator.hasNext()) {
          cDl localcDl = (cDl)localIterator.next();
          if (localcDl.czk() == localq.an) {
            localcDl.czr();
            localIterator.remove();
            break;

            localIterator = this.iqk.iterator();
            while (localIterator.hasNext()) {
              localcDl = (cDl)localIterator.next();
              if (localcDl.czp() == localq.ao) {
                localIterator.remove(); continue;

                localIterator = this.iqk.iterator();
                while (localIterator.hasNext()) {
                  localcDl = (cDl)localIterator.next();
                  if ((localcDl.czp() == localq.ao) && (localcDl.czj() == localq.ap)) {
                    localIterator.remove(); continue;

                    this.iqk.clear();
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public void run() {
    ArrayList localArrayList = new ArrayList();

    K.info("MessageScheduler running");

    while (this.aKV) {
      try {
        try {
          if (!this.iqk.isEmpty()) {
            long l = System.currentTimeMillis();

            localArrayList.clear();

            Iterator localIterator1 = this.iqk.iterator();
            while (localIterator1.hasNext()) {
              cDl localcDl1 = (cDl)localIterator1.next();

              if (localcDl1.czn() <= l + 3L) {
                if (!localcDl1.czq()) {
                  a(localcDl1, l);
                  localcDl1.ij(l);
                  localIterator1.remove();
                  if (localcDl1.czo())
                    localArrayList.add(localcDl1);
                }
                else {
                  localIterator1.remove();
                }
              }
              else if (localArrayList.isEmpty()) {
                this.hJC.lock();
                this.bQe.await(Math.max(1L, localcDl1.czn() - l), TimeUnit.MILLISECONDS);
                this.bQe.signalAll();
                this.hJC.unlock();
              }

            }

            if (!localArrayList.isEmpty()) {
              for (cDl localcDl2 : localArrayList) {
                a(localcDl2);
              }
            }

            cxh();
          }
          else {
            if (this.hJC.tryLock()) {
              this.bQe.await();
              this.hJC.unlock();
            }
            cxh();
          }
        }
        catch (Exception localException1) {
          K.error("Exception levée : ", localException1);
        }
      } catch (Exception localException2) {
        K.error("Exception", localException2);
      }
    }

    K.info("Message Scheduler stopped");
  }

  public final String cxi()
  {
    long l = System.currentTimeMillis();
    Iterator localIterator = this.iqk.iterator();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Found ").append(this.iqk.size()).append(" clocks:\n");
    while (localIterator.hasNext()) {
      cDl localcDl = (cDl)localIterator.next();
      localStringBuilder.append(localcDl.czp().getClass().getSimpleName()).append(" : ").append(localcDl.czm()).append(" ms ");
      if (localcDl.czo()) {
        localStringBuilder.append("repeatable ").append(localcDl.czl()).append(" times ");
      }
      localStringBuilder.append("next tick in ").append(localcDl.czn() - l).append(" ms\n");
    }
    return localStringBuilder.toString();
  }
}