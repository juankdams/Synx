import org.apache.log4j.Logger;

public class dgy
  implements WA
{
  private static final Logger K = Logger.getLogger(dgy.class);
  private final aWe hLY;
  private final ahm dJp;

  public dgy(ahm paramahm, aWe paramaWe)
  {
    this.dJp = paramahm;
    this.hLY = paramaWe;
  }

  public void a(float paramFloat1, float paramFloat2, cYm paramcYm) {
    dQx localdQx = a(this.hLY, paramFloat1, paramFloat2, paramcYm);
    if (localdQx == null) {
      return;
    }
    int i = (int)paramFloat1;
    this.dJp.getScreenX();
    int j = (int)paramFloat2;
    this.dJp.getScreenY();

    if (i < localdQx.hqu)
      paramcYm.aOR -= localdQx.hqu - i;
    if (i > localdQx.hqv) {
      paramcYm.aOR -= localdQx.hqv - i;
    }
    if (j < localdQx.hqw)
      paramcYm.aOS -= localdQx.hqw - j;
    if (j > localdQx.hqx)
      paramcYm.aOS -= localdQx.hqx - j;
  }

  static dQx a(aWe paramaWe, float paramFloat1, float paramFloat2, cYm paramcYm) {
    dQx localdQx = new dQx();
    float f1 = paramFloat1 + paramcYm.aOR;
    float f2 = paramFloat2 + paramcYm.aOS;
    paramaWe.a(f1, f2, localdQx);

    if ((localdQx.width() < 100) && (localdQx.height() < 100)) {
      K.error("la vue est trop petite)");
      paramcYm.ae(0.0F, 0.0F);
      return null;
    }
    return localdQx;
  }
}