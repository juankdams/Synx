import com.ankamagames.framework.graphics.engine.text.EntityText;

public class dqe
  implements aQq
{
  private final int gHT;
  private final int gHU;
  private final int bjr;
  private final int bjs;
  private final float lrc;
  private final int lrd;
  private final int lre;
  public static final int lrf = 100;

  public dqe(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5)
  {
    this.gHT = paramInt1;
    this.gHU = paramInt2;
    this.bjr = paramInt3;
    this.bjs = paramInt4;
    this.lrc = paramFloat;
    this.lrd = paramInt5;
    this.lre = 0;
  }

  public dqe(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5, int paramInt6) {
    this.gHT = paramInt1;
    this.gHU = paramInt2;
    this.bjr = paramInt3;
    this.bjs = paramInt4;
    this.lrc = paramFloat;
    this.lrd = paramInt5;
    this.lre = paramInt6;
  }

  public void a(dfj paramdfj, int paramInt) {
    int i = dfj.h(paramdfj);
    int j = paramdfj.getDuration();

    bNa localbNa = paramdfj.KF().getColor();
    if (i > j - 500)
    {
      localbNa.z(dfj.q(i - j + 500, 1.5F, -1.6F, 500.0F));
    }
    paramdfj.KF().setColor(localbNa.QC(), localbNa.QD(), localbNa.QE(), localbNa.getAlpha());
    float f1;
    if (i < this.lrd)
      f1 = i / this.lrd;
    else {
      f1 = 1.0F;
    }

    int k = (int)(this.gHT * f1) + this.bjr;
    int m = (int)(this.gHU * f1) + this.bjs;

    if (i < this.lre) {
      float f2 = 1.0F - i / this.lre;
      k += (int)bCO.U(-10.0F * f2, 10.0F * f2);
      m += (int)bCO.U(-10.0F * f2, 10.0F * f2);
    }

    paramdfj.setXOffset(k);
    paramdfj.setYOffset(m);

    paramdfj.KF().setZoom(this.lrc * f1);
  }
}