import com.ankamagames.framework.graphics.engine.material.Material;
import com.ankamagames.framework.kernel.core.maths.Matrix44;
import com.ankamagames.framework.kernel.core.maths.Matrix44.ObjectFactory;
import javax.media.opengl.GL;

public final class dsZ
{
  private static final dsZ lvj = new dsZ();
  private final int[] lvk;
  private final short[] lvl;
  private final float[] lvm;
  private final boolean[] lvn;
  private final int[] lvo;
  private final short[] lvp;
  private final float[] lvq;
  private final boolean[] lvr;
  private cdg fFR;
  private final Fi bIu = new Fi(0, 0, 0, 0);

  private final Matrix44[] lvs = new Matrix44[aLv.values().length];
  private boolean bve;
  private final float[] lvt = { (0.0F / 0.0F), (0.0F / 0.0F), (0.0F / 0.0F), (0.0F / 0.0F) };
  private final float[] lvu = { (0.0F / 0.0F), (0.0F / 0.0F), (0.0F / 0.0F), (0.0F / 0.0F) };

  private dsZ() {
    wj[] arrayOfwj1 = wj.values();

    int i = arrayOfwj1.length;
    this.lvo = new int[i];
    this.lvq = new float[i];
    this.lvp = new short[i];
    this.lvr = new boolean[i];

    this.lvk = new int[i];
    this.lvm = new float[i];
    this.lvl = new short[i];
    this.lvn = new boolean[i];

    for (wj localwj : arrayOfwj1) {
      this.lvo[localwj.ordinal()] = 0;
      this.lvq[localwj.ordinal()] = 0.0F;
      this.lvp[localwj.ordinal()] = 0;
      this.lvr[localwj.ordinal()] = false;
    }

    for (int j = 0; j < this.lvs.length; j++) {
      this.lvs[j] = ((Matrix44)Matrix44.bFc.bQx());
    }

    this.bve = false;
  }

  public static dsZ cZe() {
    return lvj;
  }

  public void cZf()
  {
    kp(true);
    a(cnQ.hUU, cnQ.hUT);

    dk(1.0F);

    kq(false);
    dl(1.0F);

    kr(false);
    setLineWidth(1.0F);

    BF(1);
    er((short)0);

    kt(false);
    I(0, 0, 0, 0);

    ks(true);
    b(axZ.dNy);

    kv(false);
  }

  private void G(int paramInt, boolean paramBoolean) {
    eU(paramInt, paramBoolean ? 1 : 0);
  }

  private void eU(int paramInt1, int paramInt2) {
    if (this.lvo[paramInt1] == paramInt2) {
      return;
    }
    if (this.bve) {
      this.lvn[paramInt1] = (paramInt2 == this.lvk[paramInt1] ? 1 : false);
    }

    this.lvo[paramInt1] = paramInt2;
    this.lvr[paramInt1] = false;
  }

  private void G(int paramInt, short paramShort) {
    if (this.lvp[paramInt] == paramShort) {
      return;
    }
    if (this.bve) {
      this.lvn[paramInt] = (paramShort == this.lvl[paramInt] ? 1 : false);
    }

    this.lvp[paramInt] = paramShort;
    this.lvr[paramInt] = false;
  }

  private void p(int paramInt, float paramFloat) {
    if (this.lvq[paramInt] == paramFloat) {
      return;
    }
    if (this.bve) {
      this.lvn[paramInt] = (paramFloat == this.lvm[paramInt] ? 1 : false);
    }

    this.lvq[paramInt] = paramFloat;
    this.lvr[paramInt] = false;
  }

  public void kp(boolean paramBoolean) {
    G(wj.blz.ordinal(), paramBoolean);
  }

  public void a(cnQ paramcnQ1, cnQ paramcnQ2) {
    eU(wj.blA.ordinal(), paramcnQ1.dNC);
    eU(wj.blB.ordinal(), paramcnQ2.dNC);
  }

  public void kq(boolean paramBoolean) {
    G(wj.blD.ordinal(), paramBoolean);
  }

  public void kr(boolean paramBoolean) {
    G(wj.blG.ordinal(), paramBoolean);
  }

  public void b(axZ paramaxZ) {
    eU(wj.blQ.ordinal(), paramaxZ.dNC);
  }

  public void ks(boolean paramBoolean) {
    a(paramBoolean, null);
  }

  private void a(boolean paramBoolean, cdg paramcdg) {
    eU(wj.blR.ordinal(), paramBoolean ? 1 : 0);
    this.fFR = paramcdg;
  }

  public void kt(boolean paramBoolean) {
    G(wj.blL.ordinal(), paramBoolean);
  }

  public void ku(boolean paramBoolean)
  {
    G(wj.blH.ordinal(), paramBoolean);
  }

  public void kv(boolean paramBoolean) {
    G(wj.blS.ordinal(), paramBoolean);
  }

  public void kw(boolean paramBoolean) {
    G(wj.blT.ordinal(), paramBoolean);
  }

  public void I(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    eU(wj.blM.ordinal(), paramInt1);
    eU(wj.blN.ordinal(), paramInt2);
    eU(wj.blO.ordinal(), paramInt3);
    eU(wj.blP.ordinal(), paramInt4);
  }

  public void dk(float paramFloat) {
    p(wj.blC.ordinal(), paramFloat);
  }

  public void dl(float paramFloat) {
    p(wj.blE.ordinal(), paramFloat);
  }

  public void setLineWidth(float paramFloat) {
    p(wj.blF.ordinal(), paramFloat);
  }

  public void BF(int paramInt) {
    eU(wj.blI.ordinal(), paramInt);
  }

  public void er(short paramShort) {
    G(wj.blJ.ordinal(), paramShort);
  }

  public void x(bSr parambSr) {
    ayc localayc = (ayc)parambSr;
    GL localGL = (GL)localayc.bZk();

    int i = wj.blR.ordinal();
    if (this.lvr[i] == 0) {
      this.lvr[i] = true;
      if (this.lvo[i] == 1)
        localGL.glEnable(3553);
      else {
        localGL.glDisable(3553);
      }
    }

    int j = wj.blQ.ordinal();
    if (this.lvr[j] == 0) {
      this.lvr[j] = true;
      localGL.glTexEnvi(8960, 8704, this.lvo[j]);
    }

    int k = wj.blz.ordinal();
    if (this.lvr[k] == 0) {
      this.lvr[k] = true;
      if (this.lvo[k] == 1)
        localGL.glEnable(3042);
      else {
        localGL.glDisable(3042);
      }
    }
    int m = wj.blA.ordinal();
    int n = wj.blB.ordinal();
    if ((this.lvr[m] == 0) || (this.lvr[n] == 0)) {
      this.lvr[m] = true;
      this.lvr[n] = true;
      localGL.glBlendFunc(this.lvo[m], this.lvo[n]);
    }

    int i1 = wj.blD.ordinal();
    if (this.lvr[i1] == 0) {
      this.lvr[i1] = true;
      if (this.lvo[i1] == 1)
        localGL.glEnable(2832);
      else {
        localGL.glDisable(2832);
      }
    }

    int i2 = wj.blG.ordinal();
    if (this.lvr[i2] == 0) {
      this.lvr[i2] = true;
      if (this.lvo[i2] == 1)
        localGL.glEnable(2848);
      else {
        localGL.glDisable(2848);
      }
    }

    int i3 = wj.blC.ordinal();
    if (this.lvr[i3] == 0) {
      this.lvr[i3] = true;
      b(localGL, 0);
      localGL.glTexEnvf(8960, 8704, 34160.0F);
      localGL.glTexEnvf(8960, 34161, 8448.0F);
      localGL.glTexEnvf(8960, 34176, 5890.0F);
      localGL.glTexEnvf(8960, 34163, this.lvq[i3]);
    }

    int i4 = wj.blE.ordinal();
    if (this.lvr[i4] == 0) {
      this.lvr[i4] = true;
      localGL.glPointSize(this.lvq[i4]);
    }

    int i5 = wj.blF.ordinal();
    if (this.lvr[i5] == 0) {
      this.lvr[i5] = true;
      localGL.glLineWidth(this.lvq[i5]);
    }

    int i6 = wj.blH.ordinal();
    if (this.lvr[i6] == 0) {
      this.lvr[i6] = true;
      if (this.lvo[i6] == 1)
        localGL.glEnable(2852);
      else {
        localGL.glDisable(2852);
      }
    }

    int i7 = wj.blI.ordinal();
    int i8 = wj.blJ.ordinal();
    if ((this.lvr[i7] == 0) || (this.lvr[i8] == 0)) {
      this.lvr[i7] = true;
      this.lvr[i8] = true;
      localGL.glLineStipple(this.lvo[i7], this.lvp[i8]);
    }

    int i9 = wj.blL.ordinal();
    if (this.lvr[i9] == 0) {
      this.lvr[i9] = true;
      if (this.lvo[i9] == 1)
        localGL.glEnable(3089);
      else {
        localGL.glDisable(3089);
      }
    }

    int i10 = wj.blM.ordinal();
    int i11 = wj.blN.ordinal();
    int i12 = wj.blO.ordinal();
    int i13 = wj.blP.ordinal();
    if ((this.lvr[i10] == 0) || (this.lvr[i11] == 0) || (this.lvr[i12] == 0) || (this.lvr[i13] == 0)) {
      this.lvr[i10] = true;
      this.lvr[i11] = true;
      this.lvr[i12] = true;
      this.lvr[i13] = true;
      localGL.glScissor(this.lvo[i10], this.lvo[i11], this.lvo[i12], this.lvo[i13]);
    }

    int i14 = wj.blS.ordinal();
    if (this.lvr[i14] == 0) {
      this.lvr[i14] = true;
      if (this.lvo[i14] == 1)
        localGL.glEnable(2929);
      else
        localGL.glDisable(2929);
    }
    int i15 = wj.blT.ordinal();
    if (this.lvr[i15] == 0) {
      this.lvr[i15] = true;
      localGL.glDepthMask(this.lvo[i15] == 1);
    }
  }

  public void b(GL paramGL, int paramInt) {
    int i = wj.blU.ordinal();
    if (this.lvo[i] == paramInt)
      return;
    this.lvo[i] = paramInt;
    paramGL.glActiveTexture(33984 + paramInt);
  }

  public void c(GL paramGL, int paramInt) {
    int i = wj.blV.ordinal();
    if (this.lvo[i] == paramInt)
      return;
    this.lvo[i] = paramInt;
    paramGL.glClientActiveTexture(33984 + paramInt);
  }

  public void a(GL paramGL, aLv paramaLv) {
    int i = wj.blK.ordinal();
    int j = paramaLv.dNC;
    this.lvs[paramaLv.ordinal()].c(0.0F, 0.0F, 0.0F);
    if (this.lvo[i] == j)
      return;
    this.lvo[i] = j;
    paramGL.glMatrixMode(j);
  }

  public void a(GL paramGL, aLv paramaLv, Matrix44 paramMatrix44) {
    int i = wj.blK.ordinal();
    int j = paramaLv.dNC;
    if (this.lvo[i] != j) {
      this.lvo[i] = j;
      paramGL.glMatrixMode(j);
    }

    Matrix44 localMatrix44 = this.lvs[paramaLv.ordinal()];
    if (!localMatrix44.e(paramMatrix44)) {
      localMatrix44.a(paramMatrix44);

      if (paramMatrix44.isIdentity())
        paramGL.glLoadIdentity();
      else
        paramGL.glLoadMatrixf(paramMatrix44.Fj(), 0);
    }
  }

  public void a(bSr parambSr, cdg paramcdg)
  {
    if (this.fFR == paramcdg) {
      return;
    }

    if (paramcdg == null) {
      a(false, paramcdg);
    } else {
      a(true, paramcdg);
      b(paramcdg.Dw());
      this.fFR.t(parambSr);
    }
  }

  public void push() {
    this.bve = true;

    System.arraycopy(this.lvo, 0, this.lvk, 0, this.lvo.length);
    System.arraycopy(this.lvq, 0, this.lvm, 0, this.lvq.length);
    System.arraycopy(this.lvp, 0, this.lvl, 0, this.lvp.length);
    System.arraycopy(this.lvr, 0, this.lvn, 0, this.lvr.length);
  }

  public void pop() {
    if (this.bve) {
      System.arraycopy(this.lvk, 0, this.lvo, 0, this.lvo.length);
      System.arraycopy(this.lvm, 0, this.lvq, 0, this.lvq.length);
      System.arraycopy(this.lvl, 0, this.lvp, 0, this.lvp.length);
      System.arraycopy(this.lvn, 0, this.lvr, 0, this.lvr.length);

      this.bve = false;
    }
  }

  public void reset() {
    a(false, null);
  }

  public Fi cZg()
  {
    return this.bIu.OP();
  }

  public void cZh()
  {
    this.bIu.set(0, 0, 0, 0);
  }

  public void a(GL paramGL, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.bIu.d(paramInt1, paramInt2, paramInt3, paramInt4)) {
      return;
    }
    paramGL.glViewport(paramInt1, paramInt2, paramInt3, paramInt4);
    this.bIu.set(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  public void a(GL paramGL, Fi paramFi) {
    a(paramGL, paramFi.getX(), paramFi.getY(), paramFi.getWidth(), paramFi.getHeight());
    a(paramGL, aLv.epN);
    paramGL.glLoadIdentity();

    float f1 = paramFi.ON();
    float f2 = paramFi.OO();
    if (f1 < 1.0F) {
      f1 = 1.0F;
    }
    if (f2 < 1.0F) {
      f2 = 1.0F;
    }
    paramGL.glOrtho(-f1, f1, -f2, f2, 0.0D, 65535.0D);
  }

  public void a(GL paramGL, Material paramMaterial)
  {
    if (!paramMaterial.T(this.lvt)) {
      paramMaterial.U(this.lvt);
      paramGL.glMaterialfv(1032, 4609, this.lvt, 0);
    }
    if (!paramMaterial.Y(this.lvu)) {
      paramMaterial.Z(this.lvu);
      paramGL.glMaterialfv(1032, 4610, this.lvu, 0);
    }
  }
}