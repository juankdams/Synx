import com.ankamagames.framework.graphics.engine.text.EntityText;

public class NP
  implements aQq
{
  private int bjr;
  private int bjs;

  public NP(int paramInt1, int paramInt2)
  {
    this.bjr = paramInt1;
    this.bjs = paramInt2;
  }

  public void a(dfj paramdfj, int paramInt) {
    int i = dfj.b(paramdfj);
    int j = paramdfj.getDuration();

    paramdfj.setYOffset((int)dfj.q(i, 60.0F, 60.0F, j) + this.bjs);
    paramdfj.setXOffset(this.bjr);

    bNa localbNa = paramdfj.KF().getColor();
    float f = j * 0.8F;
    localbNa.z(bCO.t(dfj.q(Math.min(i, f), 20.0F, -20.1F, f), 0.0F, 1.0F));
    paramdfj.KF().setColor(localbNa.QC(), localbNa.QD(), localbNa.QE(), localbNa.getAlpha());
  }

  private float a(float paramFloat1, float paramFloat2, int paramInt) {
    float f1 = paramFloat1 * paramInt / paramFloat2;
    int i = (int)Math.floor(f1);
    float f2 = f1 - i;

    int j = i % 2 == 0 ? 1 : 0;
    if (j != 0) {
      return f2;
    }
    return 1.0F - f2;
  }
}