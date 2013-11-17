import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class dfN
  implements aRy
{
  private static final boolean lav = false;
  private static final int dnM = -1;
  private static final Logger K = Logger.getLogger(dfN.class);

  private final ArrayList law = new ArrayList(0);

  public abstract bWU p();

  public void aw(Object paramObject)
  {
    try
    {
      ((bWU)paramObject).aJ();
    } catch (Exception localException) {
      K.error("Exception on checkOut : ", localException);
    }
  }

  public void ax(Object paramObject)
  {
    try {
      ((bWU)paramObject).bc(); } catch (Exception localException) {
      localException = 
        localException;

      K.error("Exception on checkIn : ", localException);
      throw new RuntimeException(localException.toString());
    }
    finally
    {
    }
  }

  public void au(Object paramObject)
  {
  }

  public boolean av(Object paramObject)
  {
    return true;
  }

  private int bj(Object paramObject)
  {
    int i = 0; for (int j = this.law.size(); i < j; i++) {
      if (this.law.get(i) == paramObject) {
        return i;
      }
    }
    return -1;
  }
}