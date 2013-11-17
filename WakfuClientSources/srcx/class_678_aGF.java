import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.log4j.Logger;

public class aGF
{
  private String edI;
  private final int[] edJ = new int[4];
  private final int[] edK = new int[4];
  private final int[] edL = new int[5];

  private static final akR edM = new akR();
  private static final Logger K = Logger.getLogger(dyC.class);
  private static final ReentrantReadWriteLock edN = new ReentrantReadWriteLock();
  private static final Lock edO = edN.readLock();
  private static final Lock edP = edN.writeLock();

  public aGF(String paramString)
  {
    reset();
    this.edI = paramString;
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

  public void mt(int paramInt) {
    if (paramInt < this.edK[0]) {
      this.edK[0] = paramInt;
    }
    if (paramInt > this.edK[1]) {
      this.edK[1] = paramInt;
    }

    this.edK[2] += paramInt;
    this.edK[3] += 1;
  }

  public void mu(int paramInt) {
    if (paramInt < this.edJ[0]) {
      this.edJ[0] = paramInt;
    }
    if (paramInt > this.edJ[1]) {
      this.edJ[1] = paramInt;
    }

    this.edJ[2] += paramInt;
    this.edJ[3] += 1;
  }

  public void reset() {
    Arrays.fill(this.edJ, 0);
    this.edJ[0] = 2147483647;
    Arrays.fill(this.edK, 0);
    this.edK[0] = 2147483647;
    Arrays.fill(this.edL, 0);
    this.edL[0] = 2147483647;
  }

  public String aSE() {
    return this.edI;
  }

  public int mv(int paramInt) {
    return this.edJ[paramInt];
  }

  public int mw(int paramInt) {
    return this.edK[paramInt];
  }

  public int mx(int paramInt) {
    return this.edL[paramInt];
  }

  public static ArrayList aSF()
  {
    ArrayList localArrayList = new ArrayList();
    edO.lock();
    try {
      if (!edM.isEmpty()) {
        edM.r(new dVc(localArrayList));
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

  public static aGF w(String paramString, boolean paramBoolean) {
    edO.lock();
    aGF localaGF = null;
    try {
      localaGF = (aGF)edM.get(paramString);
    } catch (Exception localException1) {
      K.error("Exception", localException1);
    } finally {
      edO.unlock();
    }

    if ((localaGF == null) && (paramBoolean)) {
      localaGF = new aGF(paramString);
      edP.lock();
      try {
        edM.put(paramString, localaGF);
      } catch (Exception localException2) {
        K.error("Exception", localException2);
      } finally {
        edP.unlock();
      }
    }
    return localaGF;
  }
}