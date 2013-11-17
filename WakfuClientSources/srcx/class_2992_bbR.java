import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

public class bbR
  implements dbK
{
  private cXf cQs;
  private cNz flB;
  private float flC;
  private float flD;
  private float blZ;
  private float flE = -1.0F;
  private float flF = -1.0F;
  private int flG = -1;
  private int flH = -1;

  public bbR(cXf paramcXf, cNz paramcNz) {
    this.cQs = paramcXf;
    this.flB = paramcNz;
  }

  private void bjp() {
    aWe localaWe = this.cQs.cKV();
    this.blZ = localaWe.csO();

    int i = localaWe.getScreenX();
    int j = localaWe.getScreenY();

    int k = (int)(this.flB.getScreenX() / this.blZ);
    int m = (int)(this.flB.getScreenY() / this.blZ);

    this.flC = (k + i);
    this.flD = (m + j);
  }

  public void a(doc paramdoc, int paramInt) {
    int i = paramdoc.Ft();
    int j = paramdoc.getDuration();

    Entity3D localEntity3D = paramdoc.cVt();
    GLGeometrySprite localGLGeometrySprite = (GLGeometrySprite)localEntity3D.pW(0);
    int k = j / 2;
    int m = k;
    int n = j / 2;
    int i1 = localGLGeometrySprite.getHeight();
    int i2 = localGLGeometrySprite.getWidth();

    bjp();

    if ((paramdoc.getX() != 0.0F) || (paramdoc.getY() != 0.0F)) {
      if (this.flE == -1.0F) {
        this.flE = (this.flC - paramdoc.getX());
      }
      if (this.flF == -1.0F) {
        this.flF = (this.flD - paramdoc.getY());
      }

      paramdoc.setYOffset((int)this.flF);
      paramdoc.setXOffset((int)this.flE);

      paramdoc.cVt().setColor(1.0F, 1.0F, 1.0F, 1.0F);
    }

    if (this.flG == -1) {
      this.flG = i2;
    }

    if (this.flH == -1)
      this.flH = i1;
    int i3;
    if (i > m) {
      i3 = i - m;

      paramdoc.setYOffset((int)doc.t(i3, 60.0F, 40.0F, n));
      paramdoc.setXOffset(-localGLGeometrySprite.getWidth() / 2);

      float f1 = n * 0.8F;
      float f2 = bCO.t(doc.t(Math.min(i3, f1), 20.0F, -20.1F, f1), 0.0F, 1.0F);
      paramdoc.cVt().setColor(1.0F, 1.0F, 1.0F, f2);
    } else {
      i3 = Math.round(doc.t(i, this.flE, -this.flE - i2 / 2, k));
      int i4 = Math.round(doc.t(i, this.flF, -this.flF + 60.0F, k));

      paramdoc.setXOffset(i3);
      paramdoc.setYOffset(i4);
    }

    doc.a(paramdoc);
  }
}