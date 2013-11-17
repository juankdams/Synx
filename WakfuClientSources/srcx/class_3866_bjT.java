import java.util.concurrent.CopyOnWriteArrayList;

final class bjT
  implements Runnable
{
  private final bOD fAm;

  private bjT(cOS paramcOS, bOD parambOD)
  {
    this.fAm = parambOD;
  }

  public void run()
  {
    aHA.trace("run()", new Object[0]);
    for (int i = cOS.g(this.dJW).size() - 1; i >= 0; i--) {
      bjk localbjk = (bjk)cOS.g(this.dJW).get(i);
      try {
        this.fAm.a(localbjk);
      }
      catch (Exception localException) {
        aHA.d("Event listener {} threw an exception", localException, new Object[] { localbjk });
      }
    }

    aHA.trace("runnable exits", new Object[0]);
  }
}