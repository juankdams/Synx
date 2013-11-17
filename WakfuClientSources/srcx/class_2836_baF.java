import java.awt.Cursor;
import org.apache.log4j.Logger;

public class baF
  implements Xu, Runnable
{
  private static Logger K = Logger.getLogger(baF.class);
  private Cursor[] fiO;
  private int aGf;
  private int TR;

  public baF(Cursor[] paramArrayOfCursor, int paramInt)
  {
    if ((!bB) && (paramInt <= 0)) throw new AssertionError("delay <= 0 !");
    if ((!bB) && ((paramArrayOfCursor == null) || (paramArrayOfCursor.length <= 0))) throw new AssertionError("Invalid cursor array !");
    this.fiO = paramArrayOfCursor;
    this.aGf = paramInt;
    this.TR = 0;
  }

  public long getId() {
    return 1L;
  }

  public void a(long paramLong)
  {
  }

  public void show()
  {
    this.TR = 0;
    run();
    dka.cSF().a(this, this.aGf, -1);
  }

  public void hide() {
    dka.cSF().j(this);
  }

  public void run() {
    cBQ.cxL().aww().setCursor(this.fiO[this.TR]);
    this.TR = ((this.TR + 1) % this.fiO.length);
  }
}