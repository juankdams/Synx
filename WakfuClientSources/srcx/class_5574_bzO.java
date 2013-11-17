import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh.ObjectFactory;
import java.awt.Insets;

public class bzO extends GX
{
  private Entity3D aVX;
  private bNa bPo;
  private bNa aDj;
  private final Insets ePY = new Insets(0, 0, 0, 0);
  private boolean bY = true;
  private VertexBufferPCT aVY;
  private VertexBufferPCT gor;
  private static final dUU UJ;
  private static final dUU gos = new dUU(arrayOfShort2);

  public float getDeltaAngle()
  {
    return 0.0F;
  }

  public void setDeltaAngle(float paramFloat) {
  }

  public void setPosition(aFG paramaFG) {
  }

  public aFG getPosition() {
    return null;
  }

  public void setPixmaps(dDq paramdDq1, dDq paramdDq2, dDq paramdDq3, dDq paramdDq4, dDq paramdDq5, dDq paramdDq6, dDq paramdDq7, dDq paramdDq8, dDq paramdDq9)
  {
  }

  public final void setColor(bNa parambNa)
  {
    if (this.bPo == parambNa) {
      return;
    }
    this.bPo = parambNa;

    QL();
  }

  public void setBorderColor(bNa parambNa) {
    if (this.aDj == parambNa) {
      return;
    }

    this.aDj = parambNa;

    QL();
  }

  public bNa getBorderColor() {
    return this.aDj;
  }

  public void setBorder(Insets paramInsets) {
    this.ePY.set(paramInsets.top, paramInsets.left, paramInsets.bottom, paramInsets.right);
  }

  public Insets getBorder() {
    return this.ePY;
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

    for (int i = 0; i < this.gor.bSW(); i++)
      this.gor.a(i, f1, f2, f3, f4);
    float f8;
    float f7;
    float f6;
    float f5;
    if (this.aDj == null) {
      f5 = f6 = f7 = f8 = 1.0F;
    } else {
      f5 = this.aDj.QC();
      f6 = this.aDj.QD();
      f7 = this.aDj.QE();
      f8 = this.aDj.getAlpha();
    }

    if (this.bPm != null) {
      f5 *= this.bPm.QC();
      f6 *= this.bPm.QD();
      f7 *= this.bPm.QE();
      f8 *= this.bPm.getAlpha();
    }

    for (int j = 0; j < this.aVY.bSW(); j++)
      this.aVY.a(j, f5, f6, f7, f8);
  }

  public final bNa getColor()
  {
    return this.bPo;
  }

  public void setFullCirclePercentage(float paramFloat) {
  }

  public float getFullCirclePercentage() {
    return 0.0F;
  }

  public boolean isHorizontal() {
    return this.bY;
  }

  public void setHorizontal(boolean paramBoolean) {
    this.bY = paramBoolean;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat)
  {
    paramInt3 = (int)(paramInt3 * (this.bY ? paramFloat : 1.0F));
    paramInt4 = (int)(paramInt4 * (this.bY ? 1.0F : paramFloat));

    paramInt3 = Math.max(paramInt3, this.ePY.left + this.ePY.right);
    paramInt4 = Math.max(paramInt4, this.ePY.top + this.ePY.bottom);

    int i = paramInt1;
    int j = paramInt2 + paramInt4;

    this.aVY.d(0, i, paramInt2);
    this.aVY.d(1, i + this.ePY.left, paramInt2);
    this.aVY.d(2, i + this.ePY.left, paramInt2 + this.ePY.bottom);
    this.aVY.d(3, i, paramInt2 + this.ePY.bottom);

    this.aVY.d(4, i + this.ePY.left, j - this.ePY.top);
    this.aVY.d(5, i, j - this.ePY.top);
    this.aVY.d(6, i, j);
    this.aVY.d(7, i + this.ePY.left, j);

    this.aVY.d(8, paramInt1 + paramInt3 - this.ePY.right, j);
    this.aVY.d(9, paramInt1 + paramInt3, j);
    this.aVY.d(10, paramInt1 + paramInt3, j - this.ePY.top);
    this.aVY.d(11, paramInt1 + paramInt3 - this.ePY.right, j - this.ePY.top);

    this.aVY.d(12, paramInt1 + paramInt3 - this.ePY.right, paramInt2 + this.ePY.bottom);
    this.aVY.d(13, paramInt1 + paramInt3, paramInt2 + this.ePY.bottom);
    this.aVY.d(14, paramInt1 + paramInt3, paramInt2);
    this.aVY.d(15, paramInt1 + paramInt3 - this.ePY.right, paramInt2);

    this.gor.d(0, i + this.ePY.left, paramInt2 + this.ePY.bottom);
    this.gor.d(1, paramInt1 + paramInt3 - this.ePY.right, paramInt2 + this.ePY.bottom);
    this.gor.d(2, paramInt1 + paramInt3 - this.ePY.right, j - this.ePY.top);
    this.gor.d(3, i + this.ePY.left, j - this.ePY.top);
  }

  public final Entity getEntity() {
    return this.aVX;
  }

  public final void aJ() {
    if ((!bB) && (this.aVX != null)) throw new AssertionError("Object is already checked out");
    this.aVX = ((Entity3D)Entity3D.fAs.bQy());

    GeometryMesh localGeometryMesh = (GeometryMesh)GLGeometryMesh.djO.bQy();
    this.aVX.a(localGeometryMesh);
    localGeometryMesh.axl();

    if ((!bB) && (this.aVY != null)) throw new AssertionError();
    this.aVY = VertexBufferPCT.gNI.zN(16);
    localGeometryMesh.a(cSb.kEl, this.aVY, UJ);

    localGeometryMesh = (GeometryMesh)GLGeometryMesh.djO.bQy();
    this.aVX.a(localGeometryMesh);
    localGeometryMesh.axl();

    if ((!bB) && (this.gor != null)) throw new AssertionError();
    this.gor = VertexBufferPCT.gNI.zN(4);
    localGeometryMesh.a(cSb.kEl, this.gor, gos);
  }

  public final void bc() {
    super.bc();

    this.bPo = null;
    this.aDj = null;
    this.ePY.set(0, 0, 0, 0);

    this.aVX.axl();
    this.aVX = null;

    this.aVY.axl();
    this.aVY = null;
    this.gor.axl();
    this.gor = null;
  }

  static
  {
    short[] arrayOfShort1 = { 5, 4, 7, 6, 5, 7, 4, 11, 8, 7, 4, 8, 11, 10, 9, 8, 11, 9, 3, 2, 4, 5, 3, 4, 12, 13, 10, 11, 12, 10, 0, 1, 2, 3, 0, 2, 1, 15, 12, 2, 1, 12, 15, 14, 13, 12, 15, 13 };

    UJ = new dUU(arrayOfShort1);

    short[] arrayOfShort2 = { 0, 1, 2, 3, 0, 2 };
  }
}