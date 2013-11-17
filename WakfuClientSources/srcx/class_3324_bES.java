import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class bES
  implements cvW
{
  private static Logger K = Logger.getLogger(bES.class);

  protected final List gzQ = new ArrayList();

  public boolean a(cWG paramcWG) {
    int i = paramcWG.getId();
    for (bWH localbWH : this.gzQ) {
      if (i == localbWH.azS())
        try {
          boolean bool = localbWH.a(paramcWG);
          if (!bool)
          {
            return bool;
          }
        } catch (Exception localException) { K.error("Exception levee", localException); }

    }
    return true;
  }

  public void a(bWH parambWH) {
    if (!this.gzQ.contains(parambWH))
      this.gzQ.add(parambWH);
  }

  public boolean b(bWH parambWH) {
    return this.gzQ.remove(parambWH);
  }

  boolean c(bWH parambWH) {
    return this.gzQ.contains(parambWH);
  }

  public void e(ckT paramckT) {
    for (bWH localbWH : this.gzQ)
      localbWH.b(paramckT);
  }

  public long getId()
  {
    return 0L;
  }

  public void a(long paramLong)
  {
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
  }

  public void b(aqv paramaqv, boolean paramBoolean)
  {
  }
}