import com.ankamagames.framework.graphics.engine.text.EntityText;

public class dqj
  implements aQq
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
  private boolean lrJ;

  public dqj(cXf paramcXf, cNz paramcNz, boolean paramBoolean)
  {
    this.cQs = paramcXf;
    this.flB = paramcNz;
    this.lrJ = paramBoolean;
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

  public void a(dfj paramdfj, int paramInt) {
    int i = dfj.e(paramdfj);
    int j = paramdfj.getDuration();

    EntityText localEntityText = paramdfj.KF();
    int k = j / 4;
    int m = j / 2;
    int n = localEntityText.getTextHeight();
    int i1 = localEntityText.cPC();
    int i2;
    if (i > m) {
      bjp();

      if (this.lrH == -1.0F) {
        this.lrH = paramdfj.getXOffset();
      }
      if (this.lrI == -1.0F) {
        this.lrI = paramdfj.getYOffset();
      }
      if (this.lrJ) {
        if (this.flG == -1) {
          this.flG = i1;
        }
        if (this.flH == -1) {
          this.flH = n;
        }

      }

      i2 = i - m;
      int i3 = j - m;
      int i4 = Math.round(dfj.r(i2, this.lrH, this.flC - (paramdfj.getX() - paramdfj.getXOffset()), i3));
      int i5 = Math.round(dfj.r(i2, this.lrI, this.flD - (paramdfj.getY() - paramdfj.getYOffset()), i3));

      paramdfj.setXOffset(i4);
      paramdfj.setYOffset(i5);

      if ((this.lrJ) && (i1 > 0) && (n > 0)) {
        int i6 = Math.max(0, (int)(i1 - (i1 - dfj.r(i2, this.flG, 0.0F, j))));
        int i7 = Math.max(0, (int)(n - (n - dfj.r(i2, this.flH, 0.0F, j))));
        paramdfj.KF().setZoom(dfj.r(i2, 2.0F, 1.0F, j));
      }
    }
    else if (i < k) {
      i2 = (int)dfj.q(i, 0.0F, 2.0F, k);
      paramdfj.setYOffset((int)dfj.q(i, 60.0F, 60.0F, j));
      paramdfj.setXOffset(-(i1 + i2) / 2);
      if (this.lrJ) {
        paramdfj.KF().setZoom(i2);
      }
    }

    dfj.f(paramdfj);
  }
}