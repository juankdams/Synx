import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.apache.log4j.Logger;

public class dQV
{
  private final bXH fnm;
  private final AtomicLong mlI = new AtomicLong(0L);
  private final AtomicLong mlJ = new AtomicLong(0L);
  private final AtomicInteger mlK = new AtomicInteger(0);

  private static final akR mlL = new akR();
  private static final ReentrantReadWriteLock edN = new ReentrantReadWriteLock();
  private static final Lock edO = edN.readLock();
  private static final Lock edP = edN.writeLock();
  private static final Logger K = Logger.getLogger(dQV.class);

  dQV(bXH parambXH)
  {
    this.fnm = parambXH;
  }

  public bXH bqV() {
    return this.fnm;
  }

  public long drT() {
    return this.mlJ.get();
  }

  public void DH(int paramInt) {
    this.mlJ.addAndGet(paramInt);
  }

  public long drU() {
    return this.mlI.get();
  }

  public void un(int paramInt) {
    this.mlI.addAndGet(paramInt);
  }

  public int bON() {
    return this.mlK.get();
  }

  public void cda() {
    this.mlK.incrementAndGet();
  }

  public void cdb() {
    this.mlK.decrementAndGet();
  }

  public static dQV e(bXH parambXH)
  {
    dQV localdQV = f(parambXH);
    if (localdQV == null) {
      localdQV = new dQV(parambXH);
      edP.lock();
      mlL.put(parambXH, localdQV);
      edP.unlock();
    }
    return localdQV;
  }

  public static dQV f(bXH parambXH)
  {
    edO.lock();
    dQV localdQV = null;
    try {
      localdQV = (dQV)mlL.get(parambXH);
    } catch (Exception localException) {
      K.error("Exception", localException);
    } finally {
      edO.unlock();
    }
    return localdQV;
  }

  public static ArrayList drV()
  {
    ArrayList localArrayList = new ArrayList(20);
    edO.lock();
    try {
      if (!mlL.isEmpty()) {
        mlL.s(new arX(localArrayList));
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

  public static ArrayList drW() {
    ArrayList localArrayList = new ArrayList(20);
    edO.lock();
    try {
      if (!mlL.isEmpty()) {
        mlL.s(new arT(localArrayList));
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
}