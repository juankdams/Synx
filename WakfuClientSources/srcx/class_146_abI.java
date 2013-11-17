import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

public class abI
{
  public static final Logger K = Logger.getLogger(abI.class);
  private final ExecutorService cQh;

  public abI()
  {
    this(-1);
  }

  public abI(int paramInt)
  {
    if (paramInt < 1)
      this.cQh = Executors.newCachedThreadPool();
    else if (paramInt == 1)
      this.cQh = Executors.newSingleThreadExecutor();
    else
      this.cQh = Executors.newFixedThreadPool(paramInt);
  }

  public boolean cq(long paramLong)
  {
    try {
      return this.cQh.awaitTermination(paramLong, TimeUnit.MILLISECONDS); } catch (InterruptedException localInterruptedException) {
    }
    return true;
  }

  public void shutdown()
  {
    this.cQh.shutdown();
  }

  public void anZ() {
    this.cQh.shutdownNow();
  }

  public Future a(bTp parambTp)
  {
    return this.cQh.submit(new aby(parambTp));
  }

  public Future a(bTp parambTp, crE paramcrE)
  {
    parambTp.a(paramcrE);
    return a(parambTp);
  }
}