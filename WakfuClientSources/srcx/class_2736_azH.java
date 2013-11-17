import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh.ObjectFactory;
import java.awt.Insets;

public class azH extends GX
{
  private Entity3D aVX;
  private VertexBufferPCT aVY;
  private dUU UJ;
  private bNa bPo;
  private aFG dRk = aFG.eck;

  public float getDeltaAngle()
  {
    return 0.0F;
  }

  public void setDeltaAngle(float paramFloat)
  {
  }

  public void setPixmaps(dDq paramdDq1, dDq paramdDq2, dDq paramdDq3, dDq paramdDq4, dDq paramdDq5, dDq paramdDq6, dDq paramdDq7, dDq paramdDq8, dDq paramdDq9)
  {
  }

  public void setBorderColor(bNa parambNa) {
  }

  public Insets getBorder() {
    return null;
  }

  public bNa getBorderColor() {
    return null;
  }

  public void setBorder(Insets paramInsets)
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

  public final bNa getColor()
  {
    return this.bPo;
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

  public boolean isHorizontal()
  {
    return false;
  }

  public void setHorizontal(boolean paramBoolean) {
  }

  public void setFullCirclePercentage(float paramFloat) {
  }

  public float getFullCirclePercentage() {
    return 0.0F;
  }

  public void setPosition(aFG paramaFG) {
    this.dRk = paramaFG;
  }

  public aFG getPosition() {
    return this.dRk;
  }

  private float[] aI(float paramFloat)
  {
    float[] arrayOfFloat = null;
    if (paramFloat == 0.0F)
      arrayOfFloat = new float[0];
    else if (paramFloat <= 0.3F)
      arrayOfFloat = new float[6];
    else if (paramFloat <= 0.6F)
      arrayOfFloat = new float[10];
    else if (paramFloat <= 0.9F)
      arrayOfFloat = new float[14];
    else
      arrayOfFloat = new float[18];
    float f;
    if (paramFloat > 0.0F)
    {
      f = Math.min(1.0F, paramFloat / 0.3F);

      arrayOfFloat[0] = 0.5F;
      arrayOfFloat[1] = 0.0F;

      arrayOfFloat[2] = (0.5F - 0.3F * f);
      arrayOfFloat[3] = (0.3F * f);

      arrayOfFloat[4] = (1.0F - arrayOfFloat[2]);
      arrayOfFloat[5] = arrayOfFloat[3];
    }

    if (paramFloat > 0.3F) {
      f = Math.min(1.0F, (paramFloat - 0.3F) / 0.3F);

      arrayOfFloat[6] = (0.2F * (1.0F - f));
      arrayOfFloat[7] = (0.3F + 0.3F * f);

      arrayOfFloat[8] = (1.0F - arrayOfFloat[6]);
      arrayOfFloat[9] = arrayOfFloat[7];
    }

    if (paramFloat > 0.6F) {
      f = Math.min(1.0F, (paramFloat - 0.6F) / 0.3F);

      arrayOfFloat[10] = 0.0F;
      arrayOfFloat[11] = (0.6F + 0.3F * f);

      arrayOfFloat[12] = 1.0F;
      arrayOfFloat[13] = arrayOfFloat[11];
    }

    if (paramFloat > 0.9F) {
      f = Math.min(1.0F, (paramFloat - 0.9F) / 0.1F);

      arrayOfFloat[14] = (0.3F * f);
      arrayOfFloat[15] = (0.9F + 0.1F * f);

      arrayOfFloat[16] = (1.0F - arrayOfFloat[14]);
      arrayOfFloat[17] = arrayOfFloat[15];
    }

    int i = 0; for (int j = arrayOfFloat.length; i < j; i += 2) {
      if (this.dRk.awc())
        arrayOfFloat[i] = Math.min(arrayOfFloat[i], 0.5F);
      else if (this.dRk.awd()) {
        arrayOfFloat[i] = Math.max(arrayOfFloat[i], 0.5F);
      }
    }

    return arrayOfFloat;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat)
  {
    float[] arrayOfFloat = aI(paramFloat);

    le(arrayOfFloat.length / 2);

    int i = arrayOfFloat.length / 2;
    for (int j = 0; j < i; j++) {
      float f1 = paramInt1 + paramInt3 * arrayOfFloat[(j * 2)];
      float f2 = paramInt2 + paramInt4 * arrayOfFloat[(j * 2 + 1)];
      this.aVY.d(j, f1, f2);
    }
  }

  public final Entity getEntity()
  {
    return this.aVX;
  }

  private void le(int paramInt) {
    if (paramInt != this.aVY.bSV())
      b(this.aVY, paramInt);
  }

  private void b(VertexBufferPCT paramVertexBufferPCT, int paramInt)
  {
    paramVertexBufferPCT.tg(paramInt);
  }

  public final void aJ() {
    if ((!bB) && (this.aVX != null)) throw new AssertionError();
    if ((!bB) && (this.aVY != null)) throw new AssertionError();
    if ((!bB) && (this.UJ != null)) throw new AssertionError();
    this.aVX = ((Entity3D)Entity3D.fAs.bQy());
    GeometryMesh localGeometryMesh = (GeometryMesh)GLGeometryMesh.djO.bQy();

    this.aVY = VertexBufferPCT.gNI.zN(9);
    this.UJ = dUU.mtc;
    this.aVY.tg(0);

    setColor(new bNa(bNa.gRy));

    localGeometryMesh.a(cSb.kEm, this.aVY, this.UJ);

    this.aVX.a(localGeometryMesh);
    localGeometryMesh.axl();
  }

  public final void bc() {
    super.bc();

    this.bPo = null;

    this.aVY.axl();
    this.aVY = null;

    this.UJ = null;
    this.aVX.axl();
    this.aVX = null;
  }
}