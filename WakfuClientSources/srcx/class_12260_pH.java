import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh.ObjectFactory;

public abstract class pH extends dDv
{
  public float aVV;
  public float aVW;
  protected final Entity3D aVX;
  protected VertexBufferPCT aVY;
  protected static final int aVZ = 4096;
  protected static final float[] aWa = new float[32768];
  protected static final float[] aWb = new float[65536];
  protected static final float[] aWc = new float[32768];
  protected final vo aWd;
  protected Yr aWe;
  protected int aWf;
  protected int aWg;
  protected int aWh;
  protected cSi aWi;
  protected cpz[] aWj;
  protected czT aWk;
  protected float aWl;
  protected float aWm;

  public pH(vo paramvo)
  {
    this.aVX = ((Entity3D)Entity3D.fAs.bQx());
    this.aWd = paramvo;
  }

  private void E(int paramInt1, int paramInt2) {
    paramInt1 = Math.min(paramInt1, 4096);
    this.aWg = 0;
    this.aWf = 0;
    this.aWh = Math.min(paramInt2, paramInt1);

    this.aWj = new cpz[paramInt1];
    for (int i = 0; i < paramInt1; i++) {
      this.aWj[i] = this.aWd.mN();
    }
    this.aWe = new Yr(paramInt1);
    this.aWi = new cSi(paramInt1);

    i = paramInt1 * 4;
    this.aVY = VertexBufferPCT.gNI.zM(i);

    GLGeometryMesh localGLGeometryMesh = (GLGeometryMesh)GLGeometryMesh.djO.bQy();
    localGLGeometryMesh.a(cSb.kEo, this.aVY, dUU.mtc);
    localGLGeometryMesh.a(cnQ.hUX, cnQ.hUY);
    this.aVX.a(localGLGeometryMesh);
    localGLGeometryMesh.axl();
  }

  public void initialize(int paramInt) {
    E(paramInt, paramInt);
  }

  public void cc(int paramInt) {
    this.aWh = Math.min(paramInt, this.aWj.length);
  }

  public void clear() {
    this.aVX.axl();
  }

  public void reset() {
    this.aWl = 0.0F;
    this.aWm = 0.0F;
    if (this.aWe != null) {
      for (int i = 0; i < this.aWg; i++) {
        this.aWe.hq(this.aWi.get(i) - 1);
      }
    }
    if (this.aWi != null)
      this.aWi.clear();
    this.aWg = 0;
  }

  public void update(int paramInt)
  {
    this.aWl += paramInt;
    if (this.cHC == null) {
      return;
    }
    wV();

    float f1 = paramInt / 1000.0F;
    this.aWm += f1;
    wU();

    y(f1);

    this.aVY.clear();
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    for (int n = 0; n < this.aWg; n++) {
      int i1 = this.aWi.wm(n) - 1;
      cpz localcpz = this.aWj[i1];

      float f2 = (localcpz.aOR - localcpz.aOS) * 43.0F;
      float f3 = -(localcpz.aOR + localcpz.aOS) * 21.5F + localcpz.aOT * 10.0F;

      float f4 = 1.0F;
      if (!wX()) {
        f4 = 1.5F / this.cHC.csO();
      }
      float f5 = localcpz.buN * f4;
      float f6 = localcpz.hYO * f4;

      if (wW()) {
        f7 = bCO.bI(localcpz.cAH);
        float f8 = bCO.bH(localcpz.cAH);

        float f9 = f7 * f6;
        float f10 = f8 * f6;

        float f11 = -f8 * f5;
        float f12 = f7 * f5;

        aWa[(m++)] = (f2 - f9 - f11);
        aWa[(m++)] = (f3 - f10 - f12);
        aWa[(m++)] = (f2 - f9 + f11);
        aWa[(m++)] = (f3 - f10 + f12);
        aWa[(m++)] = (f2 + f9 + f11);
        aWa[(m++)] = (f3 + f10 + f12);
        aWa[(m++)] = (f2 + f9 - f11);
        aWa[(m++)] = (f3 + f10 - f12);
      } else {
        aWa[(m++)] = (f2 - f5);
        aWa[(m++)] = (f3 - f6);
        aWa[(m++)] = (f2 - f5);
        aWa[(m++)] = (f3 + f6);
        aWa[(m++)] = (f2 + f5);
        aWa[(m++)] = (f3 + f6);
        aWa[(m++)] = (f2 + f5);
        aWa[(m++)] = (f3 - f6);
      }

      float f7 = localcpz.bPc;

      aWb[(k++)] = localcpz.bOZ;
      aWb[(k++)] = localcpz.bPa;
      aWb[(k++)] = localcpz.bPb;
      aWb[(k++)] = f7;
      aWb[(k++)] = localcpz.bOZ;
      aWb[(k++)] = localcpz.bPa;
      aWb[(k++)] = localcpz.bPb;
      aWb[(k++)] = f7;
      aWb[(k++)] = localcpz.bOZ;
      aWb[(k++)] = localcpz.bPa;
      aWb[(k++)] = localcpz.bPb;
      aWb[(k++)] = f7;
      aWb[(k++)] = localcpz.bOZ;
      aWb[(k++)] = localcpz.bPa;
      aWb[(k++)] = localcpz.bPb;
      aWb[(k++)] = f7;

      aWc[(j++)] = localcpz.eVH;
      aWc[(j++)] = localcpz.hYN;
      aWc[(j++)] = localcpz.eVH;
      aWc[(j++)] = localcpz.eVG;
      aWc[(j++)] = localcpz.hYM;
      aWc[(j++)] = localcpz.eVG;
      aWc[(j++)] = localcpz.hYM;
      aWc[(j++)] = localcpz.hYN;

      i++;
    }
    this.aVY.d(aWa, m);
    this.aVY.f(aWb, k);
    this.aVY.h(aWc, j);
    this.aVY.tg(i * 4);
  }

  private void y(float paramFloat) {
    for (int i = 0; i < this.aWg; i++) {
      int j = this.aWi.wm(i) - 1;
      cpz localcpz = this.aWj[j];
      a(localcpz, paramFloat);
    }
  }

  private void wU() {
    if (this.aWm > this.aVV) {
      for (int i = 0; i < this.aVW; i++)
      {
        if (this.aWg >= this.aWh) {
          break;
        }
        int j = this.aWe.ajZ();
        this.aWi.add(j + 1);
        this.aWg += 1;

        cpz localcpz = this.aWj[j];
        a(localcpz);
      }

      this.aWm -= this.aVV;
    }
  }

  private void wV() {
    float f1 = this.cHC.getAltitude();
    for (int i = 0; i < this.aWg; ) {
      int j = this.aWi.wm(i) - 1;
      cpz localcpz = this.aWj[j];

      float f2 = localcpz.aOT - f1;
      if ((f2 <= this.aWk.cwW()) && (f2 >= this.aWk.cwX()) && (localcpz.gFI <= localcpz.gFJ))
      {
        i++;
      }
      else
      {
        this.aWg -= 1;
        this.aWi.wH(i);
        this.aWe.hq(j);
      }
    }
  }

  public void a(bSr parambSr) { this.aVX.a(parambSr); }

  public void a(czT paramczT)
  {
    this.aWk = paramczT;
  }

  protected abstract boolean wW();

  protected abstract boolean wX();

  protected abstract void a(cpz paramcpz);

  protected abstract void a(cpz paramcpz, float paramFloat);

  public final void cd(int paramInt)
  {
    float f = paramInt / 1000.0F;
    for (int i = 0; i < this.aWg; i++) {
      int j = this.aWi.wm(i) - 1;
      if (this.aWj[j].gFJ > f)
        this.aWj[j].gFJ = f;
    }
  }
}