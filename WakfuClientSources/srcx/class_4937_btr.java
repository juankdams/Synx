public class btr
{
  private final float gbY;
  private final float gbZ;
  private final float gca;
  private final float gcb;
  private final int aKS;
  private long gcc = -1L;

  public btr(cAx paramcAx, float paramFloat1, float paramFloat2, int paramInt) {
    this.gbY = cAx.a(paramcAx);
    this.gbZ = cAx.b(paramcAx);
    this.gca = paramFloat1;
    this.gcb = paramFloat2;
    this.aKS = paramInt;
  }

  public boolean gb(long paramLong) {
    if (this.gcc == -1L) {
      this.gcc = paramLong;
      return true;
    }

    int i = (int)(paramLong - this.gcc);
    int j = bCO.J(i, 0, this.aKS);

    cAx.a(this.gcd, a(this.gbY, this.gca, j, this.aKS));
    cAx.b(this.gcd, a(this.gbZ, this.gcb, j, this.aKS));

    cAx.a(this.gcd, cAx.a(this.gcd), cAx.b(this.gcd));

    return i < this.aKS;
  }

  private float a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2) {
    float f1 = paramInt1 / paramInt2;

    float f2 = (0.5F - f1) * (1.0F - 2.0F * Math.abs(0.5F - f1));

    f1 -= f2;

    return paramFloat1 + (paramFloat2 - paramFloat1) * f1;
  }
}