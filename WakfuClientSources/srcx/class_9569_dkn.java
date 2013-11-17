import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.log4j.Logger;

public class dkn
  implements DL, cOT, diW
{
  private static final HashMap lhs = new HashMap();

  protected static final Logger K = Logger.getLogger(dkn.class);
  public final dAK lht;
  public DL gEn;
  public diW gEo;
  public cOT gEp;
  public bOO lhu;
  private boolean lhv = true;

  private final Object gEr = new Object();
  private final ArrayList gEs = new ArrayList();

  public static void a(String paramString, dkn paramdkn)
  {
    lhs.put(paramString, paramdkn);
  }

  public static dkn pq(String paramString) {
    return (dkn)lhs.get(paramString);
  }

  public static int cSP() {
    return lhs.size();
  }

  public static Iterable cSQ() {
    return lhs.keySet();
  }

  public dkn(String paramString)
  {
    this.lht = new dAK(this);
    a(paramString, this);
  }

  public boolean isRunning()
  {
    if (this.lht != null)
      return this.lht.isRunning();
    return false;
  }

  public void cdc() {
    if (this.lht != null)
      this.lht.cdc();
  }

  public void jw(boolean paramBoolean)
  {
    this.lhv = paramBoolean;
  }

  public void V(String paramString, int paramInt)
  {
    if (this.gEp == null) {
      throw new Exception("Le décodeur de messages n'a pas été spécifié");
    }
    if (this.lhu == null) {
      throw new Exception("Le pool de ConnectionUser+MessageUser n'a pas été spécifié");
    }
    this.lht.Z(paramString, paramInt);
  }

  public void start()
  {
    this.lht.G(true);
    this.lht.start();
  }

  public void d(DL paramDL)
  {
    this.gEn = paramDL;
  }

  public void a(diW paramdiW)
  {
    this.gEo = paramdiW;
  }

  public void b(cOT paramcOT)
  {
    this.gEp = paramcOT;
  }

  public void c(dfN paramdfN)
  {
    this.lhu = new akg(paramdfN);
  }

  public boolean a(bXH parambXH)
  {
    if (this.gEn != null)
      return this.gEn.a(parambXH);
    return false;
  }

  public boolean b(bXH parambXH) {
    if (this.gEn != null)
      return this.gEn.b(parambXH);
    return false;
  }

  public boolean c(bXH parambXH) {
    if (this.gEn != null)
      return this.gEn.c(parambXH);
    return false;
  }

  public synchronized boolean a(bXH parambXH, bcT parambcT)
  {
    try
    {
      ts localts = (ts)this.lhu.Mm();

      if (localts == null) {
        return false;
      }
      localts.a(this.lhu);
      localts.a(parambcT);
      parambcT.p(localts);
      localts.Bl();

      synchronized (this.gEr) {
        this.gEs.add(parambcT);
      }

      if (this.gEn != null)
        return this.gEn.a(parambXH, parambcT);
    }
    catch (Throwable localThrowable) {
      K.error("ServerInstance exception : ", localThrowable);
      return false;
    }

    return true;
  }

  public synchronized boolean b(bXH parambXH, bcT parambcT)
  {
    ByteBuffer localByteBuffer = parambcT.bre();

    if (localByteBuffer != null)
    {
      ArrayList localArrayList = new ArrayList();
      cWG localcWG;
      do {
        localcWG = this.gEp.aA(localByteBuffer);
        if (localcWG != null) {
          if (localcWG.cKx() == null) {
            localcWG.d((dUd)parambcT.bqU());
          }
          localArrayList.add(localcWG);
        }
      }
      while (localcWG != null);

      localByteBuffer.compact();

      if ((!localArrayList.isEmpty()) && (!parambcT.brd()) && (parambcT.bqU() != null)) {
        cjO.clE().T(localArrayList);
      }
      return true;
    }
    return false;
  }

  public synchronized boolean d(bXH parambXH, bcT parambcT)
  {
    boolean bool = true;
    try
    {
      if (this.gEn != null)
        bool = this.gEn.d(parambXH, parambcT);
    }
    catch (Exception localException) {
      K.error(bBd.g(localException));
    }

    return bool;
  }

  public synchronized boolean c(bXH parambXH, bcT parambcT)
  {
    boolean bool = true;
    try
    {
      synchronized (this.gEr) {
        this.gEs.remove(parambcT);
      }

      if (this.gEn != null) {
        bool = this.gEn.c(parambXH, parambcT);
      }

      if (this.lhv) {
        ??? = (ts)parambcT.bqU();
        if (??? != null) {
          ((ts)???).release();
        }
      }
    }
    catch (Exception localException)
    {
      K.error(bBd.g(localException));
      return false;
    }

    return bool;
  }

  public synchronized boolean e(bXH parambXH, bcT parambcT)
  {
    ts localts = (ts)parambcT.bqU();
    if (localts != null) {
      localts.Bo();
    }
    if (this.gEn != null) {
      return this.gEn.e(parambXH, parambcT);
    }
    return true;
  }

  public synchronized void f(bXH parambXH, bcT parambcT)
  {
    if (this.gEn != null)
      this.gEn.f(parambXH, parambcT);
  }

  public cWG aA(ByteBuffer paramByteBuffer)
  {
    if (this.gEp != null)
      return this.gEp.aA(paramByteBuffer);
    return null;
  }

  public bXH bqV()
  {
    return this.lht;
  }

  public void a(cpU paramcpU)
  {
  }

  public int bON() {
    synchronized (this.gEr) {
      return this.gEs.size();
    }
  }

  public ArrayList cSR() {
    synchronized (this.gEr) {
      return this.gEs;
    }
  }
}