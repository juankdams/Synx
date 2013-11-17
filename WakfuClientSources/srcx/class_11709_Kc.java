import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite.ObjectFactory;
import java.awt.Dimension;
import java.awt.Insets;

public class Kc extends VJ
{
  protected EntitySprite bWt;
  protected bNa bPo;
  protected bNa bPm;

  public void g(float[] paramArrayOfFloat)
  {
    if ((!bB) && (paramArrayOfFloat == null)) throw new AssertionError("Color components array can't be null");
    if ((!bB) && (paramArrayOfFloat.length != 4)) throw new AssertionError("Color components size must be equal to 4");

    this.bPo = new bNa(paramArrayOfFloat[0], paramArrayOfFloat[1], paramArrayOfFloat[2], paramArrayOfFloat[3]);
    this.bWt.setColor(this.bPo);
  }

  public void setColor(bNa parambNa)
  {
    if ((!bB) && (parambNa == null)) throw new AssertionError("Color can't be null");
    if ((this.bPo != null) && (this.bPo.get() == parambNa.get())) {
      return;
    }
    this.bPo = parambNa;

    QL();
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

    this.bWt.setColor(f1, f2, f3, f4);
  }

  public final bNa getColor()
  {
    return this.bPo;
  }

  public bNa getModulationColor() {
    return this.bPm;
  }

  public void setModulationColor(bNa parambNa) {
    if (this.bPm == parambNa) {
      return;
    }
    this.bPm = parambNa;

    QL();
  }

  public final EntitySprite UM() {
    return this.bWt;
  }

  public void bc() {
    this.bPm = null;
    this.bPo = null;

    this.bWt.axl();
    this.bWt = null;
  }

  public void aJ() {
    if ((!bB) && (this.bWt != null)) throw new AssertionError("Object is already checked out");
    this.bWt = ((EntitySprite)EntitySprite.kYR.bQy());
    this.bWt.mnU = this;
    GeometrySprite localGeometrySprite = (GeometrySprite)GLGeometrySprite.ieZ.bQy();
    this.bWt.a(localGeometrySprite);
    localGeometrySprite.axl();
  }

  public void a(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3)
  {
    int i = paramDimension.width - paramInsets1.right - paramInsets2.right - paramInsets1.left - paramInsets2.left;
    int j = paramDimension.height - paramInsets1.top - paramInsets2.top - paramInsets1.bottom - paramInsets2.bottom;
    int k = paramInsets1.left + paramInsets2.left;
    int m = paramInsets1.bottom + paramInsets2.bottom + j;

    this.bWt.c(m, k, i, j);
  }
}