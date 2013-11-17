import java.util.List;

final class abk
  implements Runnable
{
  private final JG cPG;

  private abk(aGC paramaGC, JG paramJG)
  {
    this.cPG = paramJG;
  }

  public void run()
  {
    aHA.trace("run()", new Object[0]);
    for (int i = aGC.a(this.btB).size() - 1; i >= 0; i--) {
      dgH localdgH = (dgH)aGC.a(this.btB).get(i);
      try {
        this.cPG.a(localdgH);
      }
      catch (Exception localException) {
        aHA.d("Event listener {} threw an exception", localException, new Object[] { localdgH });
      }
    }

    aHA.trace("runnable exits", new Object[0]);
  }
}