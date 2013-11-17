import java.util.concurrent.Semaphore;

final class buy
  implements bXM
{
  private buy(Mx paramMx)
  {
  }

  public axA a(axA paramaxA, cJv paramcJv)
  {
    aHA.trace("lock", new Object[0]);

    aHA.trace("acquire", new Object[0]);
    Mx.d(this.cgZ).acquireUninterruptibly();
    aHA.trace("acquired", new Object[0]);

    paramcJv.sF().b(0L, Mx.c(this.cgZ), 0, Mx.c(this.cgZ).length);
    aHA.trace("lock finished", new Object[0]);
    return null;
  }
}