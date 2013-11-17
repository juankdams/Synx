import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public class aRG
{
  private final ctQ cJS;

  public aRG(ctQ paramctQ)
  {
    this.cJS = paramctQ;
  }

  public boolean bhV()
  {
    aHA.debug("play()", new Object[0]);

    if (!this.cJS.isPlaying()) {
      CountDownLatch localCountDownLatch = new CountDownLatch(1);
      TP localTP = new TP(localCountDownLatch, null);
      this.cJS.b(localTP);
      this.cJS.play();
      try {
        aHA.debug("Waiting for media playing or error...", new Object[0]);
        localCountDownLatch.await();
        aHA.debug("Finished waiting.", new Object[0]);
        boolean bool1 = TP.a(localTP).get();
        aHA.debug("started={}", new Object[] { Boolean.valueOf(bool1) });
        return bool1;
      }
      catch (InterruptedException localInterruptedException)
      {
        boolean bool2;
        aHA.b("Interrupted while waiting for media player", localInterruptedException, new Object[0]);
        return false;
      }
      finally {
        this.cJS.c(localTP);
      }
    }

    return true;
  }
}