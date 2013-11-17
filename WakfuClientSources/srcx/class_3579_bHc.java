import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.log4j.Logger;

public class bHc
  implements DL, cOT, diW
{
  private static final HashMap gEl = new HashMap();

  protected static final Logger K = Logger.getLogger(dkn.class);
  public final cMD gEm;
  public DL gEn;
  public diW gEo;
  public cOT gEp;
  public aee gEq;
  private int bvv = 500;
  private int bvu = 2147483647;

  private final Object gEr = new Object();
  private final ArrayList gEs = new ArrayList();

  private final ArrayList gEt = new ArrayList();

  public static void a(String paramString, bHc parambHc)
  {
    gEl.put(paramString, parambHc);
  }

  public static bHc jL(String paramString) {
    return (bHc)gEl.get(paramString);
  }

  public static int bOL() {
    return gEl.size();
  }

  public static Iterable bOM() {
    return gEl.keySet();
  }

  public bHc(String paramString)
  {
    this.gEm = new cMD(this);
    a(paramString, this);
  }

  public boolean isRunning() {
    return this.gEm != null;
  }

  public void initialize()
  {
    if (this.gEp == null) {
      throw new Exception("Le dÃ©codeur de messages n'a pas Ã©tÃ© spÃ©cifiÃ©");
    }

    if (this.gEq == null) {
      throw new Exception("Le pool de ConnectionUser+MessageUser n'a pas Ã©tÃ© spÃ©cifiÃ©");
    }

    this.gEm.cFA();
  }

  public void ak(byte[] paramArrayOfByte)
  {
    this.gEm.G(true);
    this.gEm.dS(this.bvv);
    this.gEm.dR(this.bvu);
    this.gEm.start();

    if (paramArrayOfByte != null)
      dka.cSF().a(new boc(this, paramArrayOfByte), 10000L, -1);
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
    this.gEq = new bOO(paramdfN);
  }

  public boolean a(bXH parambXH)
  {
    if (this.gEn != null) {
      return this.gEn.a(parambXH);
    }
    K.warn("onConnectionHandlerCreationError non forwardÃ© : pas de handler dÃ©fini");

    return false;
  }

  public boolean b(bXH parambXH) {
    if (this.gEn != null) {
      return this.gEn.b(parambXH);
    }
    K.warn("onConnectionHandlerInitializationError non forwardÃ© : pas de handler dÃ©fini");

    return false;
  }

  public boolean c(bXH parambXH) {
    if (this.gEn != null) {
      return this.gEn.c(parambXH);
    }
    K.warn("onConnectionHandlerInLoopError non forwardÃ© : pas de handler dÃ©fini");

    return false;
  }

  public synchronized boolean a(bXH parambXH, bcT parambcT)
  {
    boolean bool = true;
    try
    {
      ts localts = (ts)this.gEq.Mm();

      if (localts == null) {
        return false;
      }

      localts.a(this.gEq);
      localts.a(parambcT);
      parambcT.p(localts);
      localts.Bl();

      synchronized (this.gEr) {
        this.gEs.add(parambcT);
      }

      if (this.gEn != null)
        bool = this.gEn.a(parambXH, parambcT);
      else
        K.warn("onNewConnection non forwardÃ© : pas de handler dÃ©fini");
    }
    catch (Exception localException)
    {
      parambXH.h(localException);
      return false;
    }

    return bool;
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

      if (!localArrayList.isEmpty()) {
        cjO.clE().T(localArrayList);
      }
    }
    else
    {
      return false;
    }

    return true;
  }

  public synchronized boolean d(bXH parambXH, bcT parambcT)
  {
    if (this.gEn != null) {
      return this.gEn.d(parambXH, parambcT);
    }
    K.warn("onConnectionError non forwardÃ© : pas de handler dÃ©fini");

    return true;
  }

  public synchronized boolean c(bXH parambXH, bcT parambcT) {
    try {
      synchronized (this.gEr) {
        this.gEs.remove(parambcT);
      }

      ??? = (ts)parambcT.bqU();
      if (??? != null)
        ((ts)???).Bn();
    }
    catch (Exception localException)
    {
      parambXH.h(localException);
      return false;
    }

    if (this.gEn != null) {
      return this.gEn.c(parambXH, parambcT);
    }
    K.warn("onConnectionClose non forwardÃ© : pas de handler dÃ©fini");

    return true;
  }

  public synchronized boolean e(bXH parambXH, bcT parambcT)
  {
    if (parambcT != null) {
      ts localts = (ts)parambcT.bqU();
      if (localts != null) {
        localts.Bp();

        if (this.gEn != null) {
          return this.gEn.e(parambXH, parambcT);
        }
        K.warn("onConnectionRecovered non forwardÃ© : pas de handler dÃ©fini");
      }

    }

    return true;
  }

  public synchronized void f(bXH parambXH, bcT parambcT)
  {
    ts localts = (ts)parambcT.bqU();
    if (localts != null) {
      localts.Bo();
    }

    if (this.gEn != null)
      this.gEn.f(parambXH, parambcT);
    else
      K.warn("onReconnectionScheduled non forwardÃ© : pas de handler dÃ©fini");
  }

  public cWG aA(ByteBuffer paramByteBuffer)
  {
    if (this.gEp != null) {
      return this.gEp.aA(paramByteBuffer);
    }
    return null;
  }

  public bXH bqV()
  {
    return this.gEm;
  }

  public bcT z(String paramString, int paramInt)
  {
    try
    {
      if (this.gEm != null) {
        this.gEm.dR(this.bvu);
        this.gEm.dS(this.bvv);
        return this.gEm.J(paramString, paramInt);
      }
    } catch (Exception localException) {
      K.error("openConnection exception");
    }

    return null;
  }

  public bcT a(String paramString, int paramInt1, int paramInt2, int paramInt3) {
    if (this.gEm == null)
      return null;
    try
    {
      this.gEm.dR(this.bvu);
      this.gEm.dS(this.bvv);

      Ac localAc = this.gEm.J(paramString, paramInt1);
      if (localAc.isConnected()) {
        return localAc;
      }

      for (int i = 0; i < paramInt3; i++) {
        if (localAc.isConnected()) {
          return localAc;
        }
        K.info("Blocking connection pending ... (" + paramString + ":" + paramInt1 + ")");
        Thread.sleep(paramInt2);
      }
      K.error("Blocking connection timed out (" + paramString + ":" + paramInt1 + ")");

      localAc.Jj();
      return null;
    } catch (Exception localException) {
      K.error("blockingOpenConnection exception (" + paramString + ":" + paramInt1 + ")");
    }

    return null;
  }

  public void a(cpU paramcpU) {
  }

  public boolean a(cWG paramcWG) {
    return false;
  }

  public long getId()
  {
    if (this.gEm != null) {
      return this.gEm.getId();
    }
    K.warn("getId() retourne -1 : pas de handler dÃ©fini");

    return -1L;
  }

  public void a(long paramLong)
  {
  }

  public void dS(int paramInt)
  {
    this.bvv = paramInt;
  }

  public void dR(int paramInt) {
    this.bvu = paramInt;
  }

  public int bON() {
    synchronized (this.gEr) {
      return this.gEs.size();
    }
  }

  public Iterable bOO() {
    synchronized (this.gEr) {
      return this.gEs;
    }
  }
}