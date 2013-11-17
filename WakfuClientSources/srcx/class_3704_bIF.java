import com.ankamagames.framework.graphics.engine.text.EntityText;

public class bIF
  implements aQq
{
  private final int gHT;
  private final int gHU;

  public bIF(int paramInt1, int paramInt2)
  {
    this.gHT = paramInt1;
    this.gHU = paramInt2;
  }

  public void a(dfj paramdfj, int paramInt) {
    int i = dfj.d(paramdfj);
    int j = paramdfj.getDuration();

    bNa localbNa = paramdfj.KF().getColor();
    localbNa.z(dfj.q(i, 1.5F, -1.6F, j));
    paramdfj.KF().setColor(localbNa.QC(), localbNa.QD(), localbNa.QE(), localbNa.getAlpha());

    float f1 = 100.0F;
    float f2;
    if (i < 100.0F) {
      f2 = 0.75F;
    } else {
      f3 = bCO.t((i - 100.0F) / (j - 100.0F) * 4.0F, 0.0F, 1.0F);
      f2 = Math.max(0.0F, 0.75F - f3);
    }

    float f3 = Math.min(1.0F, i / j * 4.0F);
    paramdfj.setXOffset((int)(this.gHT * f3));
    double d = 3.141592653589793D * f3;
    paramdfj.setYOffset((int)(this.gHU * Math.abs(Math.sin(d))) + 60);

    paramdfj.KF().setZoom(f2);
  }
}