import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.entity.Entity3D.ObjectFactory;
import com.ankamagames.framework.graphics.engine.geometry.GeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite.ObjectFactory;
import java.awt.Dimension;
import java.awt.Insets;
import org.apache.log4j.Logger;

public class bvR extends bOu
{
  private static final Logger K = Logger.getLogger(bvR.class);
  protected Entity3D aVX;
  private bNa bPm;
  private dDq ggr;
  private dDq ggs;
  private dDq ggt;
  private dDq ggu;
  private boolean ggv = false;
  private boolean ggw = false;
  private int[] ggx;
  private int[] ggy;
  private float[] ggz;
  private int ia;
  private int ib;
  private int ggA;
  private int ggB;
  private int ggC;
  private int ggD;

  public void setPixelSeparations(int[] paramArrayOfInt1, int[] paramArrayOfInt2, float[] paramArrayOfFloat)
  {
    this.ggx = paramArrayOfInt1;
    this.ggz = paramArrayOfFloat;

    B(paramArrayOfInt2);
    this.ggy = paramArrayOfInt2;
    bDG();

    bDJ();
  }

  public float[] bDA() {
    return this.ggz;
  }

  public int[] getPixelSeparations() {
    return this.ggx;
  }

  public void k(dDq paramdDq) {
    this.ggr = paramdDq;
    bDF();
  }

  public void l(dDq paramdDq) {
    this.ggt = paramdDq;
    bDF();
  }

  public void m(dDq paramdDq) {
    this.ggu = paramdDq;
    bDF();
  }

  public void n(dDq paramdDq) {
    this.ggs = paramdDq;
    bDF();
  }

  public dDq bDB() {
    return this.ggr;
  }

  public dDq bDC() {
    return this.ggs;
  }

  public dDq bDD() {
    return this.ggt;
  }

  public dDq bDE() {
    return this.ggu;
  }

  private void bDF() {
    this.ggv = ((this.ggr != null) && (this.ggu != null) && (this.ggt != null) && (this.ggs != null));
  }

  private void B(int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length - 1;
    int j = this.ggy.length - 1;
    while ((j >= 0) || (i >= 0)) {
      int k = (this.ggy.length > j) && (j >= 0) ? this.ggy[j] : 0;
      int m = (paramArrayOfInt.length > i) && (i >= 0) ? paramArrayOfInt[i] : 0;
      if ((i < 0) || ((j >= 0) && (k < m)))
      {
        rq(j);
        j--;
      } else if ((j < 0) || ((i >= 0) && (k > m)))
      {
        rp(j);
        i--;
      }
      else {
        j--;
        i--;
      }
    }
  }

  private void bDG() {
    int i = this.aVX.bvg();
    int j = i - 3;

    if (j < this.ggx.length)
      K.warn("mauvais nombre de jonctions : " + j + "/" + this.ggx.length);
    else if (j > this.ggx.length)
      K.warn("mauvais nombre de jonctions : " + j + "/" + this.ggx.length);
  }

  private void E(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = this.aVX.bvg();
    int j = i - 3;

    if ((paramInt1 < 0) || (paramInt1 >= j)) {
      return;
    }
    GeometrySprite localGeometrySprite = (GeometrySprite)this.aVX.pW(paramInt1 + 3);
    localGeometrySprite.M(paramInt3, paramInt2);
    localGeometrySprite.setColor(1.0F, 1.0F, 1.0F, this.ggz[paramInt1]);
  }

  public void rp(int paramInt) {
    if (!this.ggv) {
      return;
    }
    int i = this.aVX.bvg() - 3;

    GeometrySprite localGeometrySprite1 = (GeometrySprite)GLGeometrySprite.ieZ.bQy();
    localGeometrySprite1.setSize(this.ggu.getWidth(), this.ggu.getHeight());
    localGeometrySprite1.setColor(1.0F, 1.0F, 1.0F, 1.0F);
    localGeometrySprite1.a(this.ggu.bjL(), this.ggu.bjJ(), this.ggu.bjM(), this.ggu.bjK(), this.ggu.getRotation());
    this.aVX.a(localGeometrySprite1, this.ggu.hN(), null);
    localGeometrySprite1.axl();

    if (i > 0)
      for (int j = i; (j >= paramInt) && (j > 0); j--) {
        GeometrySprite localGeometrySprite2 = (GeometrySprite)this.aVX.pW(j + 3);
        GeometrySprite localGeometrySprite3 = (GeometrySprite)this.aVX.pW(j - 1 + 3);
        localGeometrySprite2.c(localGeometrySprite3.bjL(), localGeometrySprite3.bjJ(), localGeometrySprite3.getWidth(), localGeometrySprite3.getHeight());
      }
  }

  public void rq(int paramInt)
  {
    int i = this.aVX.bvg();
    int j = i - 3;

    if (j <= 0) {
      return;
    }

    this.aVX.b(this.aVX.pW(3 + paramInt));
  }

  private void bDH() {
    a(this.ia - this.ggr.getWidth(), 0, this.ggr.getWidth(), this.ggr.getHeight(), this.ggr);
    a(this.ia - this.ggs.getWidth(), 0, this.ggs.getWidth(), this.ggs.getHeight(), this.ggs);

    a(this.ia - this.ggt.getWidth(), 0, this.ggt.getWidth(), 0, this.ggt);

    this.ggw = true;
  }

  public void a(Dimension paramDimension, Insets paramInsets1, Insets paramInsets2, Insets paramInsets3)
  {
    this.ggA = (paramInsets1.left + paramInsets2.left + paramInsets3.left);
    this.ggD = (paramInsets1.bottom + paramInsets2.bottom + paramInsets3.bottom);
    this.ggB = (paramInsets1.right + paramInsets2.right + paramInsets3.right);
    this.ggC = (paramInsets1.top + paramInsets2.top + paramInsets3.top);

    this.ia = (paramDimension.width - this.ggA - this.ggB);
    this.ib = (paramDimension.height - this.ggC - this.ggD);

    if (!this.ggv) {
      return;
    }

    if (!this.ggw) {
      bDH();
    }

    bDI();
  }

  private void bDI() {
    GeometrySprite localGeometrySprite = (GeometrySprite)this.aVX.pW(0);
    localGeometrySprite.M(this.ggD + this.ggr.getHeight(), this.ggA + this.ia - this.ggr.getWidth());

    localGeometrySprite = (GeometrySprite)this.aVX.pW(1);
    localGeometrySprite.M(this.ggD + this.ib, this.ggA + this.ia - this.ggs.getWidth());

    localGeometrySprite = (GeometrySprite)this.aVX.pW(2);
    localGeometrySprite.c(this.ggD + this.ib - this.ggs.getHeight(), this.ggA + this.ia - this.ggs.getWidth(), this.ggt.getWidth(), this.ib - this.ggs.getHeight() - this.ggr.getHeight());

    bDJ();
  }

  private void bDJ() {
    if ((this.ggx != null) && (this.ggx.length > 0)) {
      int i = 0; for (int j = this.ggx.length; i < j; i++)
        E(i, this.ggA + this.ia - this.ggt.getWidth(), this.ggD + this.ggx[i]);
    }
  }

  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, dDq paramdDq)
  {
    if ((paramdDq == null) || (paramdDq.hN() == null)) {
      return;
    }
    GeometrySprite localGeometrySprite = (GeometrySprite)GLGeometrySprite.ieZ.bQy();
    localGeometrySprite.c(paramInt2, paramInt1, paramInt3, paramInt4);
    if (this.bPm != null)
      localGeometrySprite.setColor(this.bPm.QC(), this.bPm.QD(), this.bPm.QE(), this.bPm.getAlpha());
    else {
      localGeometrySprite.setColor(1.0F, 1.0F, 1.0F, 1.0F);
    }

    localGeometrySprite.a(paramdDq.bjL(), paramdDq.bjJ(), paramdDq.bjM(), paramdDq.bjK(), paramdDq.getRotation());
    this.aVX.a(localGeometrySprite, paramdDq.hN(), null);
    localGeometrySprite.axl();
  }

  public Entity getEntity() {
    return this.aVX;
  }

  public void bc() {
    this.ggr = null;
    this.ggs = null;
    this.ggu = null;
    this.ggt = null;

    this.aVX.axl();
    this.aVX = null;

    this.bPm = null;
  }

  public void aJ() {
    if ((!bB) && (this.aVX != null)) throw new AssertionError("Object already checked out");
    this.aVX = ((Entity3D)Entity3D.fAs.bQy());

    this.ggv = false;
    this.ggw = false;

    this.ggy = new int[0];
    this.ggz = new float[0];
    this.ggx = new int[0];
  }
}