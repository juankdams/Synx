import java.util.List;
import org.apache.log4j.Logger;

public abstract class cIX extends aOw
{
  protected static final Logger K = Logger.getLogger(cIX.class);
  private boolean iBQ;

  protected abstract List kM();

  public boolean sc()
  {
    return false;
  }

  public void bfq()
  {
    this.iBQ = (!this.iBQ);
  }

  public long cDu() {
    return this.iBQ ? -1L : 1L;
  }

  public byte J(List paramList)
  {
    return vw.a(getClass().getName(), kM(), paramList);
  }
}