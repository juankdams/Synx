public class ZP extends bwF
{
  private final float cMo = 4.8F;
  private static final float cMp = 9.81F;
  private static final float cMq = 1.0F;
  private float cMr = 1.0F;

  private final float cxy = 9.81F;
  private final float cMs;
  private final float cMt;
  private final float cMu;
  private float cMv;
  private final float cMw;
  private final float cMx;
  private final float cMy;
  private final float cMz;
  private int bmM;

  public ZP(bSl parambSl, float paramFloat1, float paramFloat2, float paramFloat3, double paramDouble)
  {
    this(parambSl, paramFloat1, paramFloat2, paramFloat3, paramDouble, 1.0F);
  }

  public ZP(bSl parambSl, float paramFloat1, float paramFloat2, float paramFloat3, double paramDouble, float paramFloat4)
  {
    super(parambSl);
    this.cMr = paramFloat4;
    this.cMs = this.bpK.getWorldX();
    this.cMt = this.bpK.getWorldY();
    this.cMu = this.bpK.getAltitude();
    this.cMv = (paramFloat3 - this.cMu);

    paramDouble = (float)Math.toRadians(paramDouble == 0.0D ? 1.0D : paramDouble);

    float f1 = cEl.af(paramFloat1 - this.cMs, paramFloat2 - this.cMt);
    float f2 = (float)Math.sqrt(9.81F * f1 / Math.sin(2.0D * paramDouble));

    double d1 = Math.atan((paramFloat2 - this.cMt) / (paramFloat1 - this.cMs));
    if (paramFloat1 - this.cMs < 0.0F) {
      d1 += 3.141592653589793D;
    }

    this.cMz = (2.0F * f2 * (float)Math.sin(paramDouble) / 9.81F);

    double d2 = f2 * Math.cos(paramDouble);
    this.cMw = ((float)(Math.cos(d1) * d2));
    this.cMx = ((float)(Math.sin(d1) * d2));
    this.cMy = (f2 * (float)Math.sin(paramDouble));

    this.cMv /= this.cMz;
  }

  public void cz(int paramInt)
  {
    this.bmM += paramInt;

    float f1 = this.bmM * (this.cMr / 1000.0F);

    if ((this.bpK == null) || (f1 > this.cMz)) {
      bEk();
      return;
    }

    float f2 = this.cMw * f1 + this.cMs;
    float f3 = this.cMx * f1 + this.cMt;
    float f4 = -4.905F * f1 * f1 + this.cMy * f1;

    float f5 = 8.6F * f4 + this.cMu + f1 * this.cMv;

    this.bpK.k(f2, f3, f5);
  }

  public float alz()
  {
    return this.cMz * 1000.0F / this.cMr;
  }
}