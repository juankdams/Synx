import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.apache.log4j.Logger;

public class ckD
{
  private static final Logger K = Logger.getLogger(ckD.class);
  private final ExecutorService SP;
  private final aXt hLV;

  public ckD(String paramString)
  {
    this(paramString, 25);
  }

  public ckD(String paramString, int paramInt) {
    this.SP = Executors.newFixedThreadPool(1, new chQ(this, paramString));

    this.hLV = new aXt(paramInt);
  }

  public void a(long paramLong, Runnable paramRunnable) {
    Future localFuture = this.SP.submit(new chU(this, paramRunnable, paramLong));

    this.hLV.c(paramLong, localFuture);
  }

  public final void hy(long paramLong) {
    Future localFuture = (Future)this.hLV.get(paramLong);
    if (localFuture == null) {
      return;
    }
    while (!localFuture.isDone())
      try {
        Thread.sleep(3L);
      } catch (InterruptedException localInterruptedException) {
        K.error("", localInterruptedException);
      }
  }

  public final void fD(long paramLong)
  {
    Future localFuture = (Future)this.hLV.remove(paramLong);
    if (localFuture != null)
      localFuture.cancel(true);
  }

  public final void clear() {
    for (int i = 0; i < this.hLV.size(); i++) {
      Future localFuture = (Future)this.hLV.hc(i);
      if (localFuture != null)
        localFuture.cancel(true);
    }
    this.hLV.clear();
  }
}