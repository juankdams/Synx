import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.log4j.Logger;

public class aVd
{
  private String eXl;
  private final int[] edL = new int[5];

  private static final akR eXm = new akR();
  private static final Logger K = Logger.getLogger(aVd.class);
  private static final ReentrantReadWriteLock edN = new ReentrantReadWriteLock();
  private static final Lock edO = edN.readLock();
  private static final Lock edP = edN.writeLock();

  public aVd(String paramString)
  {
    reset();
    this.eXl = paramString;
  }

  public void q(int paramInt, boolean paramBoolean) {
    if (paramBoolean)
      this.edL[3] += 1;
    else {
      this.edL[4] += 1;
    }

    if (paramInt < this.edL[0]) {
      this.edL[0] = paramInt;
    }
    if (paramInt > this.edL[1]) {
      this.edL[1] = paramInt;
    }

    this.edL[2] += paramInt;
  }

  public void reset() {
    Arrays.fill(this.edL, 0);
    this.edL[0] = 2147483647;
  }

  public String bkX() {
    return this.eXl;
  }

  public int mx(int paramInt) {
    return this.edL[paramInt];
  }

  public static ArrayList bkY()
  {
    ArrayList localArrayList = new ArrayList();
    edO.lock();
    try {
      if (!eXm.isEmpty()) {
        eXm.r(new boV(localArrayList));
      }

    }
    catch (Exception localException)
    {
      K.error("Exception", localException);
    } finally {
      edO.unlock();
    }
    return localArrayList;
  }

  public static aVd a(dKQ paramdKQ, boolean paramBoolean) {
    dUd localdUd = paramdKQ.cKx();
    String str;
    if (localdUd == null)
      str = "null";
    else {
      str = localdUd.getClass().getSimpleName();
    }
    return z(str, paramBoolean);
  }

  public static aVd z(String paramString, boolean paramBoolean) {
    edO.lock();
    aVd localaVd = null;
    try {
      localaVd = (aVd)eXm.get(paramString);
    } catch (Exception localException1) {
      K.error("Exception", localException1);
    } finally {
      edO.unlock();
    }

    if ((localaVd == null) && (paramBoolean)) {
      localaVd = new aVd(paramString);
      edP.lock();
      try {
        eXm.put(paramString, localaVd);
      } catch (Exception localException2) {
        K.error("Exception", localException2);
      } finally {
        edP.unlock();
      }
    }
    return localaVd;
  }
}