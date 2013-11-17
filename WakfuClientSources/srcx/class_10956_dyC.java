import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.log4j.Logger;

public class dyC
{
  private String edI;
  private final int[] edJ = new int[4];
  private final int[] lFe = new int[4];
  private final int[] lFf = new int[4];
  private int lFg;
  private int lFh;
  private static final akR lFi = new akR();
  private static final Logger K = Logger.getLogger(dyC.class);
  private static final ReentrantReadWriteLock edN = new ReentrantReadWriteLock();
  private static final Lock edO = edN.readLock();
  private static final Lock edP = edN.writeLock();

  public dyC(String paramString)
  {
    reset();
    this.edI = paramString;
  }

  public void BV(int paramInt) {
    if (paramInt < this.lFf[0]) {
      this.lFf[0] = paramInt;
    }
    if (paramInt > this.lFf[1]) {
      this.lFf[1] = paramInt;
    }

    this.lFf[2] += paramInt;
    this.lFf[3] += 1;
  }

  public void BW(int paramInt) {
    if (paramInt < this.lFe[0]) {
      this.lFe[0] = paramInt;
    }
    if (paramInt > this.lFe[1]) {
      this.lFe[1] = paramInt;
    }

    this.lFe[2] += paramInt;
    this.lFe[3] += 1;
  }

  public void kN(boolean paramBoolean) {
    if (paramBoolean)
      this.lFg += 1;
    else
      this.lFh += 1;
  }

  public void mu(int paramInt)
  {
    if (paramInt < this.edJ[0]) {
      this.edJ[0] = paramInt;
    }
    if (paramInt > this.edJ[1]) {
      this.edJ[1] = paramInt;
    }

    this.edJ[2] += paramInt;
    this.edJ[3] += 1;
  }

  void reset() {
    this.edJ[0] = 2147483647;
    this.edJ[1] = 0;
    this.lFe[0] = 2147483647;
    this.lFe[1] = 0;
    this.lFf[0] = 2147483647;
    this.lFf[1] = 0;
  }

  public String aSE() {
    return this.edI;
  }

  public int mv(int paramInt) {
    return this.edJ[paramInt];
  }

  public int BX(int paramInt) {
    return this.lFe[paramInt];
  }

  public int BY(int paramInt) {
    return this.lFf[paramInt];
  }

  public int dcM() {
    return this.lFg;
  }

  public int dcN() {
    return this.lFh;
  }

  public static ArrayList aSF()
  {
    ArrayList localArrayList = new ArrayList();
    edO.lock();
    try {
      if (!lFi.isEmpty()) {
        lFi.r(new arB(localArrayList));
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

  public static dyC S(String paramString, boolean paramBoolean) {
    dyC localdyC = null;
    edO.lock();
    try {
      localdyC = (dyC)lFi.get(paramString);
    } catch (Exception localException1) {
      K.error("Exception", localException1);
    } finally {
      edO.unlock();
    }

    if ((localdyC == null) && (paramBoolean)) {
      localdyC = new dyC(paramString);
      edP.lock();
      try {
        lFi.put(paramString, localdyC);
      } catch (Exception localException2) {
        K.error("Exception", localException2);
      } finally {
        edP.unlock();
      }
    }
    return localdyC;
  }
}