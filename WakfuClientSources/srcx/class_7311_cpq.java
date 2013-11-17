import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

class cpq
  implements Runnable
{
  private cpq(cjO paramcjO)
  {
  }

  public void run()
  {
    btS.a("Worker", 1.0F, 0.0F, 0.0F);
    dka.cSF().cSJ();
    dka.cSF().update();

    while (!this.hYz.hJB.isEmpty()) {
      cWG localcWG = (cWG)this.hYz.hJB.poll();
      this.hYz.hJG.decrementAndGet();
      cjO.a(this.hYz, localcWG);
    }
    btS.end();
  }
}