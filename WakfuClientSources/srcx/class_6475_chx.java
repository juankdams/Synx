import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.ankamagames.framework.graphics.engine.transformer.BatchTransformer;
import java.awt.Rectangle;

public class chx extends auC
{
  public static final String TAG = "animatedLoadingViewer";

  protected void aGQ()
  {
    Entity localEntity = this.dGZ.getEntity();
    cxn localcxn = (cxn)localEntity.dsE().sz(0);
    localcxn.b((float)this.haN.getWidth() / 2.0F + this.aZs, (float)this.haN.getHeight() / 2.0F + this.aZt, 0.0F);
    float f1 = 1.0F;
    if (this.dGZ.aty() != null) {
      f1 = this.dGZ.aty().getScale();

      Or localOr = getSize();
      double d1 = localOr.getWidth();
      double d2 = localOr.getHeight();
      double d3 = d1 / d2;

      dQx localdQx = this.dGZ.aty().ig();
      int i = localdQx.drx() - localdQx.drw();
      int j = localdQx.drz() - localdQx.dry();
      float f2 = i / j;

      if (d3 < f2)
        this.cas = ((float)(d1 / i));
      else {
        this.cas = ((float)(d2 / j));
      }

      float f3 = 0.8F;
      float f4 = 0.74F;
      float f5 = i * this.cas * 0.8F;
      float f6 = j * this.cas * 0.74F;

      setScissor(new Rectangle((int)((d1 - f5) / 2.0D), (int)((d2 - f6) / 2.0D), (int)f5, (int)f6));
    }

    localcxn.c(this.cas / f1, this.cas / f1, 0.0F);

    localEntity.dsE().bMH();
    this.dHf = false;
  }

  public void setSize(int paramInt1, int paramInt2)
  {
    super.setSize(paramInt1, paramInt2);
    setNeedsToPostProcess();
  }

  public String getTag()
  {
    return "animatedLoadingViewer";
  }
}