import java.util.List;

final class ajC
  implements Runnable
{
  private final bky diT;

  private ajC(cTy paramcTy, bky parambky)
  {
    this.diT = parambky;
  }

  public void run()
  {
    aHA.trace("run()", new Object[0]);
    for (int i = cTy.a(this.diU).size() - 1; i >= 0; i--) {
      on localon = (on)cTy.a(this.diU).get(i);
      try {
        this.diT.a(localon);
      }
      catch (Exception localException) {
        aHA.d("Event listener {} threw an exception", localException, new Object[] { localon });
      }
    }

    aHA.trace("runnable exits", new Object[0]);
  }
}