import java.io.PrintStream;
import org.apache.log4j.Logger;

class cGq
  implements dUd
{
  int iBx = 0;

  public long getId() {
    return 1L;
  }

  public void a(long paramLong) {
  }

  public boolean a(cWG paramcWG) {
    aIx localaIx = (aIx)paramcWG;
    if (aIx.a(localaIx) - this.iBx != 1) {
      System.err.println("msg.pos(" + aIx.a(localaIx) + ") / lastpos(" + this.iBx + ") / delta(" + (aIx.a(localaIx) - this.iBx) + ")");
    }
    if (aIx.a(localaIx) % 100000 == 0) {
      System.out.println("checkpoint(" + aIx.a(localaIx) + ")");
    }
    this.iBx = aIx.a(localaIx);
    try
    {
      Thread.sleep(10 + (int)(Math.random() * 50.0D));
    } catch (InterruptedException localInterruptedException) {
      cjO.Re().error("Exception", localInterruptedException);
    }

    return false;
  }
}