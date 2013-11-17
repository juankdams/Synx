import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.log4j.Logger;

public final class tq
{
  private static final Logger K = Logger.getLogger(tq.class);

  private static final tq bdy = new tq();
  private static final int bdz = 131072;
  private final aoL bdA;
  private final ArrayList bdB;
  private float bdC;
  private float bdD = 131072.0F;

  private final cDw bdE = new cDw();
  private final cjn bdF = new cjn();
  private final Lock bdG = new ReentrantLock();

  private tq() {
    this.bdA = new aoL(1024);
    this.bdB = new ArrayList(128);
  }

  public static tq Bg() {
    return bdy;
  }

  public uz a(bSr parambSr, long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    uz localuz = aw(paramLong);
    if (localuz == null) {
      localuz = parambSr.b(paramLong, paramString, paramBoolean1);
      localuz.ad(paramBoolean2);
      a(paramLong, localuz);
    }
    return localuz;
  }

  public uz a(bSr parambSr, long paramLong, String paramString, boolean paramBoolean) {
    return a(parambSr, paramLong, paramString, paramBoolean, true);
  }

  public uz a(bSr parambSr, long paramLong, crX paramcrX, boolean paramBoolean) {
    uz localuz = aw(paramLong);
    if (localuz == null) {
      localuz = parambSr.a(paramLong, paramcrX, paramBoolean);
      a(paramLong, localuz);
    }
    return localuz;
  }

  public uz b(bSr parambSr, long paramLong, crX paramcrX, boolean paramBoolean) {
    uz localuz = ax(paramLong);
    if (localuz != null) {
      return localuz;
    }

    return c(parambSr, paramLong, paramcrX, paramBoolean);
  }

  public uz b(bSr parambSr, long paramLong, String paramString, boolean paramBoolean) {
    uz localuz = ax(paramLong);
    if (localuz != null) {
      return localuz;
    }

    crX localcrX = new crX();
    if (localcrX.lV(paramString)) {
      localuz = c(parambSr, paramLong, localcrX, paramBoolean);
      localuz.SL = paramString;
    }

    localcrX.axl();
    return localuz;
  }

  public uz b(bSr parambSr, long paramLong, String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    if (!paramBoolean2) {
      return b(parambSr, paramLong, paramString, paramBoolean1);
    }

    uz localuz = ax(paramLong);
    if (localuz != null) {
      return localuz;
    }

    localuz = parambSr.b(paramLong, paramString, paramBoolean1);
    localuz.ht(true);
    localuz.ad(paramBoolean2);
    a(paramLong, localuz);

    return localuz;
  }

  private void a(long paramLong, uz paramuz) {
    if (paramuz == null) {
      K.error("Essaye d'insérer une texture null id=" + paramLong, new Exception());
      return;
    }
    this.bdG.lock();
    this.bdA.put(paramLong, paramuz);
    paramuz.bit = Qg.cpe;
    this.bdG.unlock();
  }

  public uz a(bSr parambSr, long paramLong, String paramString1, String paramString2, boolean paramBoolean) {
    uz localuz = ax(paramLong);
    if (localuz != null) {
      return localuz;
    }

    crX localcrX = new crX();
    if (localcrX.lV(paramString2 + paramString1)) {
      localuz = c(parambSr, paramLong, localcrX, paramBoolean);
    }

    localcrX.axl();
    return localuz;
  }

  public uz a(bSr parambSr, long paramLong, int paramInt1, int paramInt2, boolean paramBoolean) {
    return parambSr.a(paramLong, paramInt1, paramInt2, paramBoolean);
  }

  public int Bh() {
    return this.bdA.size();
  }

  public uz aw(long paramLong) {
    this.bdG.lock();
    uz localuz = (uz)this.bdA.get(paramLong);
    this.bdG.unlock();
    return localuz;
  }

  public int aE(String paramString)
  {
    if ((!bB) && (paramString == null)) throw new AssertionError();

    this.bdG.lock();

    int i = 0;
    try {
      i = 0;
      cHu localcHu = this.bdA.aBa();
      while (localcHu.hasNext()) {
        localcHu.fl();
        uz localuz = (uz)localcHu.value();
        if ((!localuz.gI()) && 
          (localuz.isEmpty()) && 
          (localuz.load(paramString)))
        {
          i++;
        }
      }
    } catch (Exception localException) { K.error("Exception raised while loading textures : ", localException);
    } finally {
      this.bdG.unlock();
    }
    return i;
  }

  public void b(bSr parambSr)
  {
    this.bdG.lock();
    try {
      this.bdE.u(parambSr);
      this.bdA.s(this.bdE);
      this.bdC += this.bdE.czs();
    } catch (Exception localException) {
      K.error("Exception raised while preparing textures : ", localException);
    } finally {
      this.bdG.unlock();
    }
  }

  public void Bi()
  {
    this.bdG.lock();
    cHu localcHu = this.bdA.aBa();
    while (localcHu.hasNext()) {
      localcHu.fl();
      uz localuz = (uz)localcHu.value();
      if (localuz != null)
      {
        if (localuz.bpu() == 0) {
          for (int i = localuz.gR(); i > 0; i--) {
            localuz.gS();
          }
          if ((!bB) && (localuz.gR() != 0)) throw new AssertionError(); 
        }
      }
    }
    this.bdG.unlock();

    float f = this.bdD;
    this.bdD = 0.0F;
    Bj();
    this.bdD = f;
  }

  public void Bj()
  {
    float f1 = this.bdC - this.bdD;
    if (f1 <= 0.0F) {
      return;
    }

    this.bdG.lock();
    try
    {
      this.bdF.reset();
      this.bdA.s(this.bdF);

      float f2 = this.bdF.a(this.bdB, f1);
      this.bdC -= f2;

      int i = 0; for (int j = this.bdB.size(); i < j; i++) {
        uz localuz = (uz)this.bdB.get(i);
        localuz.bit = Qg.cpg;
        this.bdA.remove(localuz.Dt());
        localuz.axl();
      }

      this.bdB.clear();
    } catch (Exception localException) {
      K.error("Exception raised while releasing textures : ", localException);
    } finally {
      this.bdG.unlock();
    }
  }

  public float Bk()
  {
    return this.bdC / 1024.0F;
  }

  public void J(float paramFloat)
  {
    this.bdD = Math.max(131072.0F, paramFloat);
  }

  private uz ax(long paramLong)
  {
    return aw(paramLong);
  }

  private uz c(bSr parambSr, long paramLong, crX paramcrX, boolean paramBoolean) {
    MD localMD = new MD(paramcrX.wo(0));

    paramcrX.cqx();

    uz localuz = a(parambSr, paramLong, paramcrX, paramBoolean);
    localuz.cqv().b(localMD);

    a(paramLong, localuz);
    return localuz;
  }
}