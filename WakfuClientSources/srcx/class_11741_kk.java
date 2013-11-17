import java.util.ArrayList;
import java.util.Collection;
import org.apache.log4j.Logger;

public class kk extends aOv
{
  protected static final Logger K = Logger.getLogger(kk.class);

  private final ArrayList aND = new ArrayList();
  private final ArrayList aNE = new ArrayList();

  private static final int[][] aNF = { { -1, -1 }, { 0, -1 }, { 1, -1 }, { -1, 0 }, { 0, 0 }, { 1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 } };

  private final cSi aNG = new cSi();

  private float aNH = 1.0F;

  private boolean aNI = true;

  public kk(String paramString)
  {
    super(paramString);
  }

  public kk(String paramString, byte paramByte) {
    super(paramString, paramByte);
  }

  public kk(String paramString, byte paramByte1, byte paramByte2) {
    super(paramString, paramByte1, paramByte2);
  }

  public ZG a(blq paramblq, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, long paramLong)
  {
    return null;
  }

  public void a(ZG paramZG)
  {
  }

  public synchronized caQ a(blq paramblq, float paramFloat1, cbI paramcbI, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, float paramFloat5, long paramLong)
  {
    ZG localZG = a(paramblq, paramLong);
    if (localZG == null) {
      K.debug("le son " + paramblq.getDescription() + " ne peut pas être préparé");
      return null;
    }

    localZG.bE((paramBoolean1) && (paramInt2 == 0));

    localZG.aj(paramFloat2);
    localZG.ak(paramFloat3);
    localZG.al(paramFloat4 != 0.0F ? paramFloat4 : 1.0F);

    localZG.ag(paramFloat1);
    localZG.ai(alh());
    localZG.setMute(bfl());

    if (this.euW != 0) {
      localZG.hv(this.euW);
    }
    if (this.euX) {
      localZG.bF(true);
    }

    localZG.akU();

    caQ localcaQ = caQ.a(localZG, paramcbI, paramFloat3 + 5.0F, paramBoolean2, paramBoolean3, paramFloat5);
    if ((paramBoolean1) && (paramInt2 > 0)) {
      localcaQ.jdMethod_do(paramInt1, paramInt2);
    }

    synchronized (this.aND) {
      this.aNE.add(localcaQ);
    }

    return localcaQ;
  }

  public void rY()
  {
    synchronized (this.aND) {
      int i = 0; for (int j = this.aNE.size(); i < j; i++) {
        caQ localcaQ = (caQ)this.aNE.get(i);
        this.aND.add(localcaQ);
      }
      this.aNE.clear();
    }
  }

  public void z(boolean paramBoolean) {
    this.aNI = paramBoolean;
  }

  public void w(float paramFloat)
  {
    float f;
    synchronized (this.aND) {
      f = alh();
      for (caQ localcaQ : this.aND)
        localcaQ.ai(f);
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
    synchronized (this.aND) {
      for (caQ localcaQ : this.aND)
        localcaQ.gL(paramBoolean2);
    }
  }

  public synchronized void K(long paramLong)
  {
    super.K(paramLong);
    cEi localcEi = this.euU != null ? this.euU.yc() : cEi.ixN;
    float f = this.euU != null ? this.euU.yd() : 1.0F;
    int i = this.euU != null ? this.euU.ye() : 0;
    this.aNH = f;

    synchronized (this.aND)
    {
      int j = 0; for (int k = this.aND.size(); j < k; j++) {
        caQ localcaQ = (caQ)this.aND.get(j);
        localcaQ.a(paramLong, localcEi, f, this.aNI, i);
        if (localcaQ.ceR()) {
          this.aNG.add(j);
          bAw.e(localcaQ.ceQ());
        }
      }

      j = this.aNG.size();
      if (j > 0)
      {
        for (k = j - 1; k >= 0; k--) {
          this.aND.remove(this.aNG.wm(k));
        }
        this.aNG.rH();
      }
    }
  }

  public void stop()
  {
    synchronized (this.aND) {
      for (caQ localcaQ : this.aND) {
        bAw.e(localcaQ.ceQ());
      }

      this.aND.clear();
    }
  }

  public void b(ZG paramZG) {
    synchronized (this.aND) {
      for (int i = this.aND.size() - 1; i >= 0; i--) {
        caQ localcaQ = (caQ)this.aND.get(i);
        if (localcaQ.ceQ() == paramZG) {
          this.aND.remove(i);
          bAw.e(paramZG);
        }
      }
    }
  }

  public synchronized boolean bk(int paramInt)
  {
    if (!super.bk(paramInt)) {
      return false;
    }
    int i = 0; for (int j = this.aND.size(); i < j; i++) {
      ((caQ)this.aND.get(i)).ceQ().hv(paramInt);
    }
    i = 0; for (j = this.aNE.size(); i < j; i++) {
      ((caQ)this.aNE.get(i)).ceQ().hv(paramInt);
    }

    return true;
  }

  public Collection rZ() {
    throw new UnsupportedOperationException("Pas d'accès direct à la liste des sources du FieldSourceGroup");
  }

  public int sa() {
    return this.aND.size();
  }

  public String sb() {
    StringBuffer localStringBuffer = new StringBuffer();
    for (caQ localcaQ : this.aND) {
      localStringBuffer.append(localcaQ.ceQ().getDescription()).append("\n");
    }
    return localStringBuffer.toString();
  }

  public String toString() {
    return "[FieldSourceGroup-" + getName() + "] " + this.aND.size() + " + " + this.aNE.size() + " sources en cours de lecture.";
  }
}