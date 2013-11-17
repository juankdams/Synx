import com.ankamagames.framework.graphics.engine.text.EntityText;

public class vk
  implements aQq
{
  private int bjr;
  private int bjs;

  public vk()
  {
  }

  public vk(int paramInt1, int paramInt2)
  {
    this.bjr = paramInt1;
    this.bjs = paramInt2;
  }

  public void a(dfj paramdfj, int paramInt) {
    int i = dfj.a(paramdfj);
    int j = paramdfj.getDuration();

    paramdfj.setXOffset(this.bjr);
    paramdfj.setYOffset((int)dfj.q(i, 60.0F, 50.0F, j) + this.bjs);

    bNa localbNa = paramdfj.KF().getColor();
    localbNa.z(dfj.q(i, 1.5F, -1.6F, j));
    paramdfj.KF().setColor(localbNa.QC(), localbNa.QD(), localbNa.QE(), localbNa.getAlpha());

    paramdfj.KF().setZoom(0.5F);
  }
}