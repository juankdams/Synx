public class bGL extends bxu
{
  private static final cRS gDi = new DC();

  private static final cRS gDj = new Dv();

  private static final cRS gDk = new Dw();

  private static final cRS gDl = new Dx();
  protected float[] gDm;
  protected int gDn;
  protected bSl bpK;

  protected bGL()
  {
    bQ(this.duj);
  }

  protected bGL(cEi paramcEi) {
    super(paramcEi);
    bQ(this.duj);
  }

  protected bGL(cEi paramcEi, float paramFloat) {
    super(paramcEi, paramFloat);
    bQ(this.duj);
  }

  protected bGL(bSl parambSl, float paramFloat)
  {
    this.bpK = parambSl;
    this.duj = paramFloat;
    bQ(this.duj);
  }

  protected bGL(bSl parambSl) {
    this(parambSl, 3.0F);
    this.bur = true;
    bQ(this.duj);
  }

  public bSl Gu() {
    return this.bpK;
  }

  public void b(bSl parambSl) {
    if ((this.bpK instanceof csQ)) {
      ((csQ)this.bpK).b(this);
    }
    this.bpK = parambSl;
    if ((this.bpK instanceof csQ))
      ((csQ)this.bpK).a(this);
  }

  private void bQ(float paramFloat)
  {
    int i = bCO.bD(paramFloat + 1.0F);
    if (i == this.gDn)
      return;
    this.gDn = i;
    this.gDm = new float[this.gDn * this.gDn * 4];

    float f1 = 1.0F / (this.ghS[0] + this.ghS[1] * this.duj + this.ghS[2] * this.duj * this.duj);

    cEl localcEl = new cEl(0.0F, 0.0F);
    for (int j = 0; j < this.gDn * 2; j++)
      for (int k = 0; k < this.gDn * 2; k++) {
        int m = k - this.gDn;
        int n = j - this.gDn;
        localcEl.ae(m, n);
        float f2 = localcEl.czQ();
        if (f2 == 0.0F)
          this.gDm[(k + j * this.gDn * 2)] = 1.0F;
        else if (f2 > this.duj)
          this.gDm[(k + j * this.gDn * 2)] = 0.0F;
        else
          this.gDm[(k + j * this.gDn * 2)] = Math.max(0.0F, 1.0F - f2 * f1);
      }
  }

  public final boolean isEnabled()
  {
    if ((this.bpK != null) && (!this.bpK.isVisible())) {
      return false;
    }
    return super.isEnabled();
  }

  public void aG(float paramFloat)
  {
    if (paramFloat == this.duj)
      return;
    super.aG(paramFloat);
    bQ(this.duj);
  }

  private static cRS cS(int paramInt1, int paramInt2) {
    if (paramInt1 == 0) {
      if (paramInt2 == 0)
        return gDi;
      return gDk;
    }

    if (paramInt2 == 0)
      return gDj;
    return gDl;
  }

  public void a(aiT paramaiT, float paramFloat) {
    dQx localdQx = paramaiT.Pf();

    cEi localcEi = bDo();
    float f1 = localcEi.getX();
    float f2 = localcEi.getY();
    float f3 = localcEi.aCv();

    int i = bCO.bD(f1);
    int j = bCO.bD(f2);
    int k = bCO.bD(f3);

    int m = (int)Math.ceil(this.duj);
    if (!localdQx.O(i - m, i + m, j - m, j + m)) {
      return;
    }
    float f4 = i - f1;
    float f5 = j - f2;

    int n = (int)Math.signum(f4);
    int i1 = (int)Math.signum(f5);

    cRS localcRS = cS(n, i1);
    localcRS.b(f4, f5, n, i1);

    paramFloat *= this.ghT;

    int i2 = this.gDn * 2;
    for (int i3 = 0; i3 < i2; i3++) {
      int i4 = j + i3 - this.gDn;
      for (int i5 = 0; i5 < i2; i5++) {
        int i6 = i + i5 - this.gDn;

        float f6 = this.gDm[(i5 + i3 * i2)];
        float f7 = localcRS.a(i5, i3, f6, this.gDm, i2);
        f7 *= paramFloat;
        if (f7 >= 0.004F)
        {
          for (int i7 = 0; i7 < i2; i7 += i2) {
            int i8 = k + i7 - this.gDn;

            paramaiT.a(i6, i4, i8, f7 * this.ghQ.QC(), f7 * this.ghQ.QD(), f7 * this.ghQ.QE(), f7 * this.ghR.QC(), f7 * this.ghR.QD(), f7 * this.ghR.QE());
          }
        }
      }
    }
  }

  public cEi bDo()
  {
    if (this.bpK != null)
      return new cEi(this.bpK.getWorldX(), this.bpK.getWorldY(), this.bpK.getAltitude());
    return super.bDo();
  }

  public void e(cEi paramcEi)
  {
    if (this.bpK != null)
      throw new RuntimeException("La source est attachée à une cible, on ne changera pas la position de la cible à travers la source.");
    super.e(paramcEi);
  }
}