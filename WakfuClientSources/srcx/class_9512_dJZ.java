import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class dJZ extends aOv
{
  private static final byte lWw = 8;
  private final LinkedList lWx = new LinkedList();
  private final Object lWy = new Object();

  private final ArrayList aNE = new ArrayList(5);

  private final ArrayList lWz = new ArrayList(5);

  private cAZ lWA = null;

  private byte lWB = 8;

  public dJZ(String paramString) {
    super(paramString);
  }

  public dJZ(String paramString, byte paramByte) {
    super(paramString, paramByte);
  }

  public dJZ(String paramString, byte paramByte1, byte paramByte2) {
    super(paramString, paramByte1, paramByte2);
  }

  public Collection rZ()
  {
    return this.lWx;
  }

  public ZG a(blq paramblq, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, long paramLong)
  {
    ZG localZG = a(paramblq, -1L);

    if (localZG == null) {
      K.debug("Impossible d'initialiser une source audio : " + paramblq.getDescription());
      return null;
    }

    if (a(localZG, true, true, paramBoolean3)) {
      return localZG;
    }
    return null;
  }

  public void a(ZG paramZG)
  {
    a(paramZG, true, true, paramZG.akR());
  }

  private synchronized boolean a(ZG paramZG, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramZG == null) {
      K.error("On ne peut pas jouer une source nulle");
      return false;
    }
    paramZG.ai(alh());
    paramZG.setMute(bfl());
    paramZG.bE(paramBoolean3);
    if (this.euW != 0) {
      paramZG.hv(this.euW);
    }
    if (this.euX) {
      paramZG.bF(true);
      paramZG.hx(0);
    }

    synchronized (this.lWy)
    {
      if (this.lWx.size() > this.lWB) {
        bAw.e(paramZG);
        return false;
      }
      try
      {
        paramZG.play();
      } catch (Exception localException) {
        K.error("Erreur durant la lecture de la source", localException);
        bAw.e(paramZG);
        return false;
      }

      this.aNE.add(paramZG);
    }

    return true;
  }

  public void rY()
  {
    synchronized (this.lWy) {
      int i = 0; for (int j = this.aNE.size(); i < j; i++) {
        ZG localZG = (ZG)this.aNE.get(i);
        this.lWx.add(localZG);
      }
      this.aNE.clear();
    }
  }

  public void w(float paramFloat)
  {
    float f;
    synchronized (this.lWy) {
      f = alh();
      for (ZG localZG : this.lWx)
        localZG.ai(f);
    }
  }

  public void d(float paramFloat1, float paramFloat2)
  {
  }

  public void e(float paramFloat1, float paramFloat2)
  {
  }

  public void c(boolean paramBoolean1, boolean paramBoolean2)
  {
    synchronized (this.lWy) {
      for (ZG localZG : this.lWx)
        localZG.setMute(paramBoolean2);
    }
  }

  public synchronized void K(long paramLong)
  {
    super.K(paramLong);

    synchronized (this.lWy) {
      int i = 0;
      if (this.euU != null) {
        i = this.euU.ye();
      }
      int j = this.lWx.size();
      for (int k = 0; k < j; k++) {
        ZG localZG = (ZG)this.lWx.get(k);

        switch (localZG.cs(paramLong)) {
        case 1:
        case 3:
          this.lWz.add(localZG);
          bAw.e(localZG);
        }

      }

      k = this.lWz.size();
      for (int m = 0; m < k; m++) {
        this.lWx.remove(this.lWz.get(m));
      }
      if ((k > 0) && (this.lWx.size() == 0) && (this.lWA != null)) {
        this.lWA.nv();
      }
      this.lWz.clear();
    }
  }

  public void stop()
  {
    synchronized (this.lWy) {
      int i = this.lWx.size();
      for (int j = 0; j < i; j++) {
        bAw.e((ZG)this.lWx.get(j));
      }
      this.lWx.clear();
    }
  }

  public void b(ZG paramZG)
  {
    synchronized (this.lWy) {
      boolean bool = this.lWx.remove(paramZG);
      if (bool)
        bAw.e(paramZG);
    }
  }

  public synchronized boolean bk(int paramInt)
  {
    if (!super.bk(paramInt)) {
      return false;
    }
    int i = 0; for (int j = this.lWx.size(); i < j; i++) {
      ((ZG)this.lWx.get(i)).hv(paramInt);
    }
    i = 0; for (j = this.aNE.size(); i < j; i++) {
      ((ZG)this.aNE.get(i)).hv(paramInt);
    }

    return true;
  }

  public void a(cAZ paramcAZ) {
    this.lWA = paramcAZ;
  }

  public void dy(float paramFloat) {
    if (this.lWA != null)
      this.lWA.cB(paramFloat);
  }

  public void dz(float paramFloat)
  {
    if (this.lWA != null)
      this.lWA.cC(paramFloat);
  }

  public void bbc()
  {
    if (this.lWA != null) {
      this.lWA.cxy();
      this.lWA.cxz();
    }
  }
}