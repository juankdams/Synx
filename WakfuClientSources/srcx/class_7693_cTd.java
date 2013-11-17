import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public abstract class cTd extends aUG
{
  protected static Logger K = Logger.getLogger(cIX.class);
  private boolean kFM;

  protected abstract List kM();

  public boolean sc()
  {
    return false;
  }

  public void bfq()
  {
    this.kFM = (!this.kFM);
  }

  public long n(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4) {
    if (this.kFM) {
      return -1L;
    }
    return 1L;
  }

  public byte u(ArrayList paramArrayList)
  {
    return vw.a(getClass().getName(), kM(), paramArrayList);
  }
}