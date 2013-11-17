import com.ankamagames.framework.graphics.engine.text.EntityText;

public class dUw
  implements aQq
{
  private final int gHT;
  private final int gHU;
  private final int bjr;
  private final int bjs;
  private final float lrc;
  private final int lrd;
  public static final int lrf = 100;

  public dUw(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
  {
    this.gHT = paramInt1;
    this.gHU = paramInt2;
    this.bjr = paramInt3;
    this.bjs = paramInt4;
    this.lrc = paramFloat;
    this.lrd = paramInt5;
  }

  public void a(dfj paramdfj, int paramInt) {
    paramdfj.KF().a(dRJ.mnn);

    int i = dfj.g(paramdfj);
    int j = paramdfj.getDuration();

    bNa localbNa = paramdfj.KF().getColor();
    if (i > j - 500)
    {
      localbNa.z(dfj.q(i - j + 500, 1.5F, -1.6F, 500.0F));
    }
    paramdfj.KF().setColor(localbNa.QC(), localbNa.QD(), localbNa.QE(), localbNa.getAlpha());

    int k = this.bjr;
    int m = this.bjs;
    float f1;
    if (i < this.lrd)
    {
      f1 = dfj.e(this.lrc * 3.0F, this.lrc, i, this.lrd);
    } else if (i > this.lrd + 350) {
      f1 = this.lrc;

      int n = j - this.lrd - 350;
      int i1 = i - this.lrd - 350;

      float f2 = dfj.e(0.0F, 1.0F, i1, n);

      k += (int)(this.gHT * f2);
      m += (int)(this.gHU * f2);
    } else {
      f1 = this.lrc;
    }

    paramdfj.setXOffset(k);
    paramdfj.setYOffset(m);

    paramdfj.KF().setZoom(f1);
  }
}