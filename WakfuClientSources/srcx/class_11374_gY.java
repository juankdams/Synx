import com.ankamagames.framework.graphics.engine.text.EntityText;

public class gY
  implements aQq
{
  private int aGf = 0;

  public gY(int paramInt) {
    this.aGf = paramInt;
  }

  public void a(dfj paramdfj, int paramInt) {
    int i = dfj.c(paramdfj);
    int j = paramdfj.getDuration();

    int k = 0;
    int m = (int)dfj.q(Math.max(0, i - this.aGf), 80.0F, 100.0F, j);

    if (i < this.aGf) {
      float f = 1.0F - i / this.aGf;
      k += (int)bCO.U(-5.0F * f, 5.0F * f);
    }

    paramdfj.setYOffset(m);
    paramdfj.setXOffset(k);

    bNa localbNa = paramdfj.KF().getColor();
    localbNa.z(dfj.q(i, 1.5F, -1.6F, j));
    paramdfj.KF().setColor(localbNa.QC(), localbNa.QD(), localbNa.QE(), localbNa.getAlpha());
  }
}