import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.Logger;

class HQ extends Thread
{
  protected static final Logger K = Logger.getLogger(HQ.class);
  protected boolean aKV;
  protected final Lock bQd = new ReentrantLock();
  protected final Condition bQe = this.bQd.newCondition();

  private final List bQf = new ArrayList(64);

  private final Queue bQg = new ConcurrentLinkedQueue();

  public HQ()
  {
    super.setName("ConnectionWriter");
  }

  public void start() {
    if (!this.aKV) {
      this.aKV = true;
      super.start();
    }
  }

  public boolean isRunning() {
    return this.aKV;
  }

  public void Rg() {
    this.bQd.lock();
    this.bQe.signal();
    this.bQd.unlock();
  }

  public void av(boolean paramBoolean) {
    this.aKV = paramBoolean;
    Rg();
  }

  public void b(bcT parambcT) {
    if (parambcT != null)
    {
      this.bQg.remove(parambcT);
    }
  }

  public void c(bcT parambcT)
  {
    if (parambcT != null)
    {
      this.bQg.offer(parambcT);
    }

    Rg();
  }

  public void g(List paramList)
  {
    int i = paramList.size();
    if (i > 0) {
      for (int j = 0; j < i; j++) {
        bcT localbcT = (bcT)paramList.get(j);
        if (localbcT != null) {
          this.bQg.offer(localbcT);
        }
      }
      Rg();
    }
  }

  void d(bcT parambcT) {
    this.bQf.add(parambcT);
  }

  void Rh() {
    g(this.bQf);
    this.bQf.clear();
  }

  public void run()
  {
    K.info("ConnectionWriter running");

    while (this.aKV)
    {
      while (!this.bQg.isEmpty()) {
        bcT localbcT = (bcT)this.bQg.poll();
        try
        {
          if (!localbcT.brf())
            K.warn("Des données n'ont pas pues être envoyées au destinataire : on abandonne.");
        } catch (Exception localException) {
          K.error("Exception levée lors de l'écriture des données", localException);
        }

      }

      if (this.bQd.tryLock()) {
        try {
          this.bQe.await();
        } catch (InterruptedException localInterruptedException) {
          K.warn("Interrupted");
        } finally {
          this.bQd.unlock();
        }
      }
    }

    K.info("ConnectionWriter stopped");
  }
}