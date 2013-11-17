import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.opengl.GLGeometrySprite;

public class dCy
  implements dbK
{
  private cXf cQs;
  private cNz flB;
  private float flC;
  private float flD;
  private float blZ;
  private float lrH = -1.0F;
  private float lrI = -1.0F;
  private int flG = -1;
  private int flH = -1;

  public dCy(cXf paramcXf, cNz paramcNz) {
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
    int k = Math.min(250, j / 4);
    int m = j / 2;
    int n = localGLGeometrySprite.getHeight();
    int i1 = localGLGeometrySprite.getWidth();
    if (i > m) {
      bjp();

      if (this.lrH == -1.0F) {
        this.lrH = paramdoc.getXOffset();
      }
      if (this.lrI == -1.0F) {
        this.lrI = paramdoc.getYOffset();
      }
      if (this.flG == -1) {
        this.flG = i1;
      }
      if (this.flH == -1) {
        this.flH = n;
      }

      int i2 = i - m;
      int i3 = j - m;
      int i4 = Math.round(doc.u(i2, this.lrH, this.flC - (paramdoc.getX() - paramdoc.getXOffset()), i3));
      int i5 = Math.round(doc.u(i2, this.lrI, this.flD - (paramdoc.getY() - paramdoc.getYOffset()), i3));

      paramdoc.setXOffset(i4);
      paramdoc.setYOffset(i5);

      if ((i1 > 0) && (n > 0)) {
        int i6 = Math.max(0, (int)(i1 - (i1 - doc.u(i2, this.flG, 0.0F, j))));
        int i7 = Math.max(0, (int)(n - (n - doc.u(i2, this.flH, 0.0F, j))));
        localGLGeometrySprite.setSize(i6, i7);
      }
    } else if (i < k) {
      float f = doc.t(i, 0.0F, 1.0F, k);
      localGLGeometrySprite.setSize((int)(48.0F * f), (int)(48.0F * f));
      paramdoc.setYOffset((int)doc.t(i, 60.0F, 60.0F, j));
      paramdoc.setXOffset(-localGLGeometrySprite.getWidth() / 2);
    }

    doc.a(paramdoc);

    localEntity3D.setColor(1.0F, 1.0F, 1.0F, 1.0F);
  }
}