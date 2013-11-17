import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite;
import com.ankamagames.framework.graphics.engine.entity.EntitySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite.ObjectFactory;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import java.awt.Insets;

public final class cdv
{
  private bNa bPm;
  private int hY;
  private int hZ;
  private int hwR;
  private int hwS;
  private boolean gWf;
  private boolean hwT = false;
  private EntitySprite bWt;

  public int getX()
  {
    return this.hY;
  }

  public void setX(int paramInt) {
    this.hY = paramInt;
  }

  public int getY() {
    return this.hZ;
  }

  public void setY(int paramInt) {
    this.hZ = paramInt;
  }

  public int getHeight() {
    return this.hwS;
  }

  public int getWidth() {
    return this.hwR;
  }

  public void setSize(int paramInt1, int paramInt2) {
    this.hwR = paramInt1;
    this.hwS = paramInt2;
  }

  public void setModulationColor(bNa parambNa) {
    if (parambNa == this.bPm) {
      return;
    }
    if (parambNa != null)
      this.bWt.setColor(parambNa.QC(), parambNa.QD(), parambNa.QE(), parambNa.getAlpha());
    else {
      this.bWt.setColor(1.0F, 1.0F, 1.0F, 1.0F);
    }

    this.bPm = parambNa;
  }

  public bNa getModulationColor() {
    return this.bPm;
  }

  public void setFlipVerticaly(boolean paramBoolean) {
    this.gWf = paramBoolean;
  }

  public void a(drI paramdrI, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3)
  {
    if (this.bWt == null) {
      return;
    }
    if ((paramdrI == null) || (!paramdrI.cYv())) {
      this.bWt.setVisible(false);
      return;
    }

    int i = paramInsets2.right + paramInsets3.left + paramInsets3.right;
    int j = paramInsets1.left + paramInsets2.left + paramInsets3.left;
    int k = paramInsets1.top + paramInsets1.bottom + paramInsets2.top;
    int m = paramInsets1.bottom + paramInsets2.bottom + paramInsets3.bottom;
    int n = this.hwR - (j + i);
    int i1 = this.hwS - (k + m);
    int i2 = paramdrI.cYw();
    int i3 = paramdrI.cYx();

    if ((i1 == 0) || (i3 == 0)) {
      this.bWt.setVisible(false);
      return;
    }
    float f1 = n / i1;
    float f2 = i2 / i3;

    if ((!this.hwT) || (bCO.u(f1, f2, 0.01F))) {
      this.bWt.c(this.hwS - k, j, n, i1);
    }
    else
    {
      float f3;
      float f4;
      if (f1 > f2) {
        f3 = i1 * f2;
        f4 = (n - f3) / 2.0F;
        this.bWt.c(this.hwS - k, j + f4, Math.round(f3), i1);
      }
      else
      {
        f3 = n / f2;
        f4 = (i1 - f3) / 2.0F;
        this.bWt.c(this.hwS - k - f4, j, n, Math.round(f3));
      }
    }

    this.bWt.setVisible(true);

    if (this.bPm != null)
      this.bWt.setColor(this.bPm);
    else {
      this.bWt.setColor(1.0F, 1.0F, 1.0F, 1.0F);
    }
    this.bWt.setTexture(paramdrI.hN());

    this.bWt.dsE().a(0, -this.hwR / 2, -this.hwS / 2);
    this.bWt.dsE().a(1, this.hwR / 2, this.hwS / 2);

    a(paramdrI);
  }

  private void a(drI paramdrI)
  {
    float f1 = this.gWf ? paramdrI.bjM() : paramdrI.bjL();
    float f2 = this.gWf ? paramdrI.bjL() : paramdrI.bjM();

    float f3 = paramdrI.bjJ();
    float f4 = paramdrI.bjK();

    this.bWt.cPd().a(f1, f3, f2, f4, bOo.gTu);
  }

  public void bc() {
    this.bPm = null;
    this.bWt.axl();
    this.bWt = null;
  }

  public void aJ() {
    if ((!bB) && (this.bWt != null)) throw new AssertionError();
    this.bWt = ((EntitySprite)EntitySprite.kYR.bQy());
    this.bWt.mnU = this;
    GeometrySprite localGeometrySprite = (GeometrySprite)GLGeometrySprite.ieZ.bQy();
    this.bWt.a(localGeometrySprite);
    localGeometrySprite.axl();
    BatchTransformer localBatchTransformer = this.bWt.dsE();
    localBatchTransformer.a(new cxn());
    localBatchTransformer.a(new cxn());
  }

  public Entity getEntity() {
    return this.bWt;
  }

  public void setKeepRatio(boolean paramBoolean) {
    this.hwT = paramBoolean;
  }
}