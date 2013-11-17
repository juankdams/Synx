import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh.ObjectFactory;
import java.awt.Insets;

public class biA extends GX
{
  private static byte fza = 32;
  private Entity3D aVX;
  private VertexBufferPCT aVY;
  private dUU UJ;
  private bNa bPo;
  private float fzb = 0.5F;
  private float fzc = 1.0F;
  private byte fzd = fza;
  private float dmQ = 1.570796F;
  private float dmP = 1.0F;

  protected dDq bQC = null;

  public float getDeltaAngle()
  {
    return this.dmQ;
  }

  public void setDeltaAngle(float paramFloat) {
    this.dmQ = paramFloat;
  }

  public void setPosition(aFG paramaFG) {
  }

  public aFG getPosition() {
    return null;
  }

  public final void setColor(bNa parambNa)
  {
    if (this.bPo == parambNa) {
      return;
    }

    this.bPo = parambNa;

    QL();
  }

  public void setModulationColor(bNa parambNa) {
    super.setModulationColor(parambNa);

    QL();
  }

  private void QL()
  {
    float f4;
    float f3;
    float f2;
    float f1;
    if (this.bPo == null) {
      f1 = f2 = f3 = f4 = 1.0F;
    } else {
      f1 = this.bPo.QC();
      f2 = this.bPo.QD();
      f3 = this.bPo.QE();
      f4 = this.bPo.getAlpha();
    }

    if (this.bPm != null) {
      f1 *= this.bPm.QC();
      f2 *= this.bPm.QD();
      f3 *= this.bPm.QE();
      f4 *= this.bPm.getAlpha();
    }

    for (int i = 0; i < this.aVY.bSW(); i++)
      this.aVY.a(i, f1, f2, f3, f4);
  }

  public float getFullCirclePercentage()
  {
    return this.dmP;
  }

  public void setFullCirclePercentage(float paramFloat) {
    if (paramFloat < 0.0F)
      paramFloat = 0.0F;
    else if (paramFloat > 1.0F) {
      paramFloat = 1.0F;
    }
    this.dmP = paramFloat;
  }

  public final bNa getColor()
  {
    return this.bPo;
  }

  public float buA() {
    return this.fzb;
  }

  public void bj(float paramFloat) {
    this.fzb = paramFloat;
  }

  public float buB() {
    return this.fzc;
  }

  public void bk(float paramFloat) {
    this.fzc = paramFloat;
  }

  public boolean isHorizontal() {
    return false;
  }

  public void setHorizontal(boolean paramBoolean) {
  }

  public void setBorderColor(bNa parambNa) {
  }

  public bNa getBorderColor() {
    return null;
  }

  public void setBorder(Insets paramInsets) {
  }

  public Insets getBorder() {
    return null;
  }

  public void setPixmaps(dDq paramdDq1, dDq paramdDq2, dDq paramdDq3, dDq paramdDq4, dDq paramdDq5, dDq paramdDq6, dDq paramdDq7, dDq paramdDq8, dDq paramdDq9)
  {
    this.bQC = paramdDq5;

    this.aVX.a(0, this.bQC.hN());

    b(this.aVY, this.aVY.bSV());
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat)
  {
    float f1 = -(float)(6.283185307179586D * this.dmP) / this.fzd;
    int i = (int)Math.floor(this.fzd * paramFloat) + 1;
    float f2 = -(float)(6.283185307179586D * this.dmP * paramFloat);

    int j = (i + (i > this.fzd ? 0 : 1)) * 2;

    if (j < 4) {
      le(0);
      return;
    }
    le(j);

    int k = paramInt3 / 2 + paramInt1;
    int m = paramInt4 / 2 + paramInt2;

    float f3 = Math.min(paramInt3, paramInt4) / 2.0F;
    float f4 = f3 * this.fzb;
    float f5 = f3 * this.fzc;
    float f6;
    float f7;
    float f8;
    float f9;
    float f10;
    float f11;
    for (int n = 0; n < i; n++) {
      f6 = (float)Math.cos(f1 * n + this.dmQ);
      f7 = (float)Math.sin(f1 * n + this.dmQ);

      f8 = f6 * f4 + k;
      f9 = f7 * f4 + m;
      f10 = f6 * f5 + k;
      f11 = f7 * f5 + m;

      this.aVY.d(n * 2, f8, f9);
      this.aVY.d(n * 2 + 1, f10, f11);
    }

    if (i < this.fzd + 1) {
      n = i;

      f6 = (float)Math.cos(f2 + this.dmQ);
      f7 = (float)Math.sin(f2 + this.dmQ);

      f8 = f6 * f4 + k;
      f9 = f7 * f4 + m;
      f10 = f6 * f5 + k;
      f11 = f7 * f5 + m;

      this.aVY.d(n * 2, f8, f9);
      this.aVY.d(n * 2 + 1, f10, f11);
    }
  }

  public final Entity getEntity() {
    return this.aVX;
  }

  private void le(int paramInt) {
    if (paramInt != this.aVY.bSV())
      b(this.aVY, paramInt);
  }

  protected void b(VertexBufferPCT paramVertexBufferPCT, int paramInt)
  {
    paramVertexBufferPCT.tg(paramInt);
    if (this.bQC != null)
    {
      int j = 0;
      for (int k = 0; k < paramInt; k++) {
        int i = k % 4 < 2 ? 1 : 0;
        j = j == 0 ? 1 : 0;
        float f1 = i != 0 ? this.bQC.bjK() : this.bQC.bjJ();
        float f2 = j != 0 ? this.bQC.bjL() : this.bQC.bjM();
        paramVertexBufferPCT.c(k, f1, f2);
      }
    }
  }

  public void aJ() {
    if ((!bB) && (this.aVX != null)) throw new AssertionError();
    if ((!bB) && (this.aVY != null)) throw new AssertionError();
    if ((!bB) && (this.UJ != null)) throw new AssertionError();
    this.aVX = ((Entity3D)Entity3D.fAs.bQy());
    GeometryMesh localGeometryMesh = (GeometryMesh)GLGeometryMesh.djO.bQy();
    int i = (this.fzd + 1) * 2;
    this.aVY = VertexBufferPCT.gNI.zM(i);
    this.UJ = dUU.mtc;
    this.aVY.tg(i);

    setColor(new bNa(bNa.gRx));

    localGeometryMesh.a(cSb.kEm, this.aVY, this.UJ);

    this.aVX.a(localGeometryMesh);
    localGeometryMesh.axl();
  }

  public final void bc() {
    super.bc();

    this.aVY.axl();
    this.aVY = null;
    this.UJ = null;
    this.aVX.axl();
    this.aVX = null;

    this.bPo = null;
    this.bQC = null;
  }
}