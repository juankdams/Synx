class cSF extends cuA
{
  private static final float kFa = 0.005F;
  private final cyd kFb = new cyd();
  private float kFc = 0.1F;
  private float dkb = 0.1F;

  private float kFd = 1.0F;
  private float aOR;
  private float aOS;
  private float blZ;

  private cSF(cXf paramcXf)
  {
    super(paramcXf);
    this.kFb.setSpeed(2.0F);
    this.kFb.cs(0.005F);
  }

  public float xV()
  {
    return 0.0F;
  }

  public float xW()
  {
    return 0.0F;
  }

  public final float yf()
  {
    return this.aOR;
  }

  public final float yg()
  {
    return this.aOS;
  }

  public float yh()
  {
    return 0.0F;
  }

  public final float getZoomFactor()
  {
    return this.blZ;
  }

  public void cz(int paramInt)
  {
    this.kFb.xd(paramInt);
    if (csR())
      csQ();
  }

  final void a(rp paramrp, float paramFloat1, float paramFloat2, float paramFloat3) {
    this.kFc = paramFloat1;
    this.dkb = paramFloat2;
    this.kFd = paramFloat3;
    this.blZ = this.kFd;

    if (paramrp == null) {
      this.aOR = 0.0F;
      this.aOS = 0.0F;
      this.kFb.set(0.0F);
    } else {
      this.aOR = paramrp.yf();
      this.aOS = paramrp.yg();
      this.kFb.set(paramrp.getAltitude());
    }

    csS();
  }

  final void a(aWe paramaWe, boolean paramBoolean, int paramInt) {
    b(paramaWe);
    this.kFb.cu(paramaWe.getAltitude());
    cz(paramInt);
    a(paramaWe, paramBoolean);
  }

  private void b(aWe paramaWe) {
    float f1 = paramaWe.yf() * this.kFc;
    float f2 = paramaWe.yg() * this.kFc;

    if ((yf() != f1) || (yg() != f2)) {
      this.aOR = f1;
      this.aOS = f2;
      csS();
    }
  }

  private void a(aWe paramaWe, boolean paramBoolean) {
    float f1 = paramaWe.getZoomFactor() - 1.0F;
    float f2 = 0.005F * this.kFb.getValue();

    float f3 = this.kFd + (f1 + f2) * this.dkb;

    if (getZoomFactor() != f3) {
      this.blZ = f3;
      csS();
    }
  }
}