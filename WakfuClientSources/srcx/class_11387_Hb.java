import com.ankamagames.framework.graphics.engine.VertexBufferPCT;
import com.ankamagames.framework.graphics.engine.VertexBufferPCT.ObjectFactory;
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometryMesh.ObjectFactory;
import java.awt.Dimension;
import java.awt.Insets;

public class Hb extends cCO
{
  private static final dUU UJ = new dUU(arrayOfShort);
  private VertexBufferPCT aVY;
  private Entity3D aVX;
  private bNa bPo;
  private bNa bPm;

  public final void setColor(bNa parambNa)
  {
    if ((!bB) && (parambNa == null)) throw new AssertionError("Color can't be null");
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

  public final void setModulationColor(bNa parambNa)
  {
    if (this.bPm == parambNa) {
      return;
    }
    this.bPm = parambNa;

    QL();
  }

  public final bNa getModulationColor()
  {
    return this.bPm;
  }

  private void QL()
  {
    float f1 = this.bPo != null ? this.bPo.QC() : 1.0F;
    float f2 = this.bPo != null ? this.bPo.QD() : 1.0F;
    float f3 = this.bPo != null ? this.bPo.QE() : 1.0F;
    float f4 = this.bPo != null ? this.bPo.getAlpha() : 1.0F;

    f1 *= (this.bPm != null ? this.bPm.QC() : 1.0F);
    f2 *= (this.bPm != null ? this.bPm.QD() : 1.0F);
    f3 *= (this.bPm != null ? this.bPm.QE() : 1.0F);
    f4 *= (this.bPm != null ? this.bPm.getAlpha() : 1.0F);

    float[] arrayOfFloat = new float[this.aVY.bSW() * 4];
    for (int i = 0; i < arrayOfFloat.length; i += 4) {
      arrayOfFloat[i] = f1;
      arrayOfFloat[(i + 1)] = f2;
      arrayOfFloat[(i + 2)] = f3;
      arrayOfFloat[(i + 3)] = f4;
    }
    this.aVY.E(arrayOfFloat);
  }

  public void a(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3)
  {
    int i = paramInsets1.left + paramInsets2.left;
    int j = paramInsets1.right + paramInsets2.right;
    int k = paramInsets1.top + paramInsets2.top;
    int m = paramInsets1.bottom + paramInsets2.bottom;

    int n = 0;
    float[] arrayOfFloat = new float[this.aVY.bSW() * 2];
    arrayOfFloat[(n++)] = paramInsets1.left;
    arrayOfFloat[(n++)] = paramInsets1.bottom;
    arrayOfFloat[(n++)] = i;
    arrayOfFloat[(n++)] = paramInsets1.bottom;
    arrayOfFloat[(n++)] = i;
    arrayOfFloat[(n++)] = m;
    arrayOfFloat[(n++)] = paramInsets1.left;
    arrayOfFloat[(n++)] = m;

    arrayOfFloat[(n++)] = i;
    arrayOfFloat[(n++)] = (paramDimension.height - k);
    arrayOfFloat[(n++)] = paramInsets1.left;
    arrayOfFloat[(n++)] = (paramDimension.height - k);
    arrayOfFloat[(n++)] = paramInsets1.left;
    arrayOfFloat[(n++)] = (paramDimension.height - paramInsets1.top);
    arrayOfFloat[(n++)] = i;
    arrayOfFloat[(n++)] = (paramDimension.height - paramInsets1.top);

    arrayOfFloat[(n++)] = (paramDimension.width - j);
    arrayOfFloat[(n++)] = (paramDimension.height - paramInsets1.top);
    arrayOfFloat[(n++)] = (paramDimension.width - paramInsets1.right);
    arrayOfFloat[(n++)] = (paramDimension.height - paramInsets1.top);
    arrayOfFloat[(n++)] = (paramDimension.width - paramInsets1.right);
    arrayOfFloat[(n++)] = (paramDimension.height - k);
    arrayOfFloat[(n++)] = (paramDimension.width - j);
    arrayOfFloat[(n++)] = (paramDimension.height - k);

    arrayOfFloat[(n++)] = (paramDimension.width - j);
    arrayOfFloat[(n++)] = m;
    arrayOfFloat[(n++)] = (paramDimension.width - paramInsets1.right);
    arrayOfFloat[(n++)] = m;
    arrayOfFloat[(n++)] = (paramDimension.width - paramInsets1.right);
    arrayOfFloat[(n++)] = paramInsets1.bottom;
    arrayOfFloat[(n++)] = (paramDimension.width - j);
    arrayOfFloat[n] = paramInsets1.bottom;

    this.aVY.A(arrayOfFloat);
  }

  public Entity getEntity() {
    return this.aVX;
  }

  public void bc() {
    this.bPo = null;

    this.bPm = null;
    this.aVX.axl();
    this.aVX = null;

    this.aVY.axl();
    this.aVY = null;
  }

  public void aJ() {
    if ((!bB) && (this.aVX != null)) throw new AssertionError("Object is already checked out");
    if ((!bB) && (this.aVY != null)) throw new AssertionError();
    this.aVX = ((Entity3D)Entity3D.fAs.bQy());

    GeometryMesh localGeometryMesh = (GeometryMesh)GLGeometryMesh.djO.bQy();
    this.aVX.a(localGeometryMesh);
    localGeometryMesh.axl();

    this.aVY = VertexBufferPCT.gNI.zN(16);
    localGeometryMesh.a(cSb.kEl, this.aVY, UJ);
  }

  static
  {
    short[] arrayOfShort = { 5, 4, 7, 6, 5, 7, 4, 11, 8, 7, 4, 8, 11, 10, 9, 8, 11, 9, 3, 2, 4, 5, 3, 4, 12, 13, 10, 11, 12, 10, 0, 1, 2, 3, 0, 2, 1, 15, 12, 2, 1, 12, 15, 14, 13, 12, 15, 13 };
  }
}