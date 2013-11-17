import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

final class bnI
  implements Runnable
{
  bnI(Runnable paramRunnable, AtomicReference paramAtomicReference, AtomicBoolean paramAtomicBoolean)
  {
  }

  public void run()
  {
    try
    {
      this.fGK.run();
    } catch (Throwable ) {
      this.fGL.set(???);
    } finally {
      synchronized (this.fGM) {
        this.fGM.set(true);
        this.fGM.notify();
      }
    }
  }
}