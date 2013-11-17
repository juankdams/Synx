import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public abstract class cUo extends dCb
{
  protected static final Logger K = Logger.getLogger(cUo.class);

  protected final ArrayList kGJ = new ArrayList();
  private cUo kGK;
  private cUo kGL;
  private ArrayList kGM;
  private cUo kGN;
  private boolean kGO;
  private boolean kGP;
  private boolean kGQ;
  private byte dGH;
  public static final byte kGR = 0;
  public static final byte kGS = 1;
  public static final byte kGT = 2;
  private static final int kGU = 500;
  private static final int kGV = 1;
  private static final int kGW = 1;
  private int bdj = -1;

  public cUo(long paramLong)
  {
    super(paramLong);
  }

  public cUo(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    super(paramLong, paramFloat1, paramFloat2, paramFloat3);
  }

  public cUo(long paramLong, float paramFloat1, float paramFloat2)
  {
    super(paramLong, paramFloat1, paramFloat2);
  }

  public boolean cJz() {
    return this.kGQ;
  }

  public void c(CG paramCG)
  {
    if (paramCG == null) {
      K.error("Unable to set a Direction8 to null", new Exception());
      return;
    }

    if (this.ax == paramCG) {
      return;
    }

    int i = paramCG.m_index - this.ax.m_index;
    this.ax = paramCG;
    this.dHg = true;

    if (this.kGM != null) {
      int j = 0; for (int k = this.kGM.size(); j < k; j++) {
        cUo localcUo = (cUo)this.kGM.get(j);
        if (localcUo.kGP)
          localcUo.c(this.ax);
      }
    }
  }

  public void k(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    int i = fa();
    int j = fb();

    super.k(paramFloat1, paramFloat2, paramFloat3);

    int k = fa();
    int m = fb();

    if ((k != i) || (m != j)) {
      M(new int[] { fa(), fb(), Math.round(getAltitude()) });
    }

    if (this.kGK != null) {
      this.kGK.k(paramFloat1, paramFloat2, paramFloat3 + BC());
    }
    if (this.kGM != null) {
      int n = 0; for (int i1 = this.kGM.size(); n < i1; n++)
        ((cUo)this.kGM.get(n)).k(paramFloat1, paramFloat2, paramFloat3 + BC());
    }
  }

  protected void k(cUo paramcUo)
  {
    this.kGK = paramcUo;
  }

  public cUo cJA()
  {
    return this.kGK;
  }

  protected void l(cUo paramcUo)
  {
    this.kGL = paramcUo;
  }

  public cUo cJB()
  {
    return this.kGL;
  }

  public boolean Vj()
  {
    return this.kGL != null;
  }

  public boolean cJC()
  {
    return this.kGK != null;
  }

  public void m(cUo paramcUo)
  {
    if ((paramcUo == this) || (paramcUo == null)) {
      return;
    }
    paramcUo.l(this);
    k(paramcUo);
    paramcUo.asZ();
  }

  public boolean eq(String paramString)
  {
    boolean bool = super.eq(paramString);
    if ((bool) && 
      (this.kGM != null)) {
      int i = 0; for (int j = this.kGM.size(); i < j; i++) {
        cUo localcUo = (cUo)this.kGM.get(i);
        if (localcUo.kGO) {
          localcUo.eq(paramString);
        }
      }

    }

    return bool;
  }

  public boolean a(cXf paramcXf)
  {
    if (!super.a(paramcXf))
      return false;
    Matrix44 localMatrix44;
    if (this.kGL != null) {
      localMatrix44 = this.kGL.aty().hY();
      if (localMatrix44 == null) {
        return false;
      }

      a(paramcXf, localMatrix44, this.kGL);
      getEntity().mnP = (this.kGL.getEntity().mnP + 1L);
      j(this.kGL.OV(), this.kGL.OW());
    } else if ((this.kGN != null) && (this.kGN.aty() != null)) {
      localMatrix44 = this.kGN.aty().hZ();
      a(paramcXf, localMatrix44, this.kGN);
    }

    return true;
  }

  public cUo cJD()
  {
    if (this.kGK != null) {
      er(null);

      this.kGK.l(null);

      cUo localcUo = this.kGK;
      k(null);
      localcUo.asZ();

      return localcUo;
    }
    return null;
  }

  public cUo a(boolean paramBoolean, cYk paramcYk) {
    if (this.kGK != null) {
      if (paramBoolean) {
        er(null);
        X(paramcYk);
      }

      this.kGK.l(null);

      cUo localcUo = this.kGK;
      k(null);
      if (paramBoolean) {
        localcUo.asZ();
      }

      return localcUo;
    }
    return null;
  }

  private void X(cYk paramcYk) {
    bvC localbvC = new bvC(this.kGK);
    localbvC.c(new cEi(paramcYk.getX(), paramcYk.getY(), paramcYk.IB()));
    localbvC.a(new cEi(this.kGK.fa(), this.kGK.fb(), this.kGK.fc() + BC()));

    localbvC.cE(500L);
    localbvC.b(new cEi(0.0F, 0.0F, 1.0F));
    localbvC.d(new cEi(0.0F, 0.0F, 1.0F));

    cnj.cnO().b(localbvC);
  }

  public void n(cUo paramcUo) {
    a(paramcUo, false, false, true);
  }

  public void a(cUo paramcUo, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    if ((!bB) && (this.kGN != null)) throw new AssertionError("A mobile is already linked to this mobile");
    if ((!bB) && (paramcUo == null)) throw new AssertionError("You can't link a null mobile");

    if (this.kGM == null) {
      this.kGM = new ArrayList();
    }

    this.kGM.add(paramcUo);
    paramcUo.kGN = this;
    paramcUo.kGO = paramBoolean1;
    paramcUo.kGQ = paramBoolean2;
    paramcUo.kGP = paramBoolean3;

    asZ();
    paramcUo.asZ();

    paramcUo.cJI();
  }

  public final void cJE() {
    if (this.kGM == null) {
      return;
    }

    int i = 0; for (int j = this.kGM.size(); i < j; i++) {
      cUo localcUo = (cUo)this.kGM.get(i);
      localcUo.kGN = null;
      localcUo.asZ();
    }

    this.kGM.clear();
    this.kGM = null;
  }

  public final void o(cUo paramcUo) {
    if (this.kGM == null) {
      return;
    }

    this.kGM.remove(paramcUo);
    paramcUo.kGN = null;
    paramcUo.asZ();
  }

  public ArrayList cJF() {
    return this.kGM;
  }

  public cUo cJG() {
    return this.kGN;
  }

  public final void a(Qh paramQh)
  {
    if ((paramQh != null) && (!this.kGJ.contains(paramQh)))
      this.kGJ.add(paramQh);
  }

  public final void b(Qh paramQh)
  {
    if (paramQh != null)
      this.kGJ.remove(paramQh);
  }

  public final void cJH()
  {
    this.kGJ.clear();
  }

  protected void M(int[] paramArrayOfInt)
  {
    if (this.kGJ != null) {
      Qh[] arrayOfQh1 = (Qh[])this.kGJ.toArray(new Qh[this.kGJ.size()]);
      for (Qh localQh : arrayOfQh1) {
        localQh.a(this, paramArrayOfInt[0], paramArrayOfInt[1], (short)paramArrayOfInt[2]);
      }
    }

    if (cJA() != null)
      cJA().M(paramArrayOfInt);
  }

  public void setStatus(byte paramByte)
  {
    this.dGH = paramByte;
  }

  public byte aGC()
  {
    return this.dGH;
  }

  public void cS(int paramInt) {
    this.bdj = paramInt;
  }

  public int aeR()
  {
    return this.bdj;
  }

  private void a(cXf paramcXf, Matrix44 paramMatrix44, cUo paramcUo) {
    aue localaue = new aue();
    Matrix44 localMatrix44 = localaue.aGp();
    localMatrix44.a(paramMatrix44);
    localMatrix44.e(paramcUo.d(paramcXf));

    float f = paramcUo.aty().getScale();
    float[] arrayOfFloat = localMatrix44.Fj();
    arrayOfFloat[0] /= f;
    arrayOfFloat[5] /= f;

    BatchTransformer localBatchTransformer = getEntity().dsE();
    localBatchTransformer.b(0, localaue);
    localMatrix44.axl();
  }

  public void d(float[] paramArrayOfFloat)
  {
    if (this.kGN != null) {
      cJI();
    } else {
      super.d(paramArrayOfFloat);
      if (this.kGM != null) {
        int i = 0; for (int j = this.kGM.size(); i < j; i++)
          ((cUo)this.kGM.get(i)).cJI();
      }
    }
  }

  protected void cJI()
  {
    if (this.kGN == null) {
      return;
    }

    Material localMaterial = this.kGN.asf();
    this.UZ.V(localMaterial.dvD());
    asP().d(this.UZ);
  }

  public void p(cUo paramcUo) {
    dR localdR1 = aty();
    if (localdR1 == null) {
      return;
    }
    dR localdR2 = paramcUo.aty();
    if (localdR2 == null) {
      return;
    }
    localdR1.a(localdR2);
  }

  public void cgW()
  {
  }

  public void cgX()
  {
  }
}