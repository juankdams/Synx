import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

final class TP extends dKU
{
  private final CountDownLatch cxc;
  private final AtomicBoolean cxd = new AtomicBoolean();

  private TP(CountDownLatch paramCountDownLatch)
  {
    this.cxc = paramCountDownLatch;
  }

  public void a(ctQ paramctQ)
  {
    this.cxd.set(true);
    this.cxc.countDown();
  }

  public void b(ctQ paramctQ)
  {
    this.cxd.set(false);
    this.cxc.countDown();
  }
}