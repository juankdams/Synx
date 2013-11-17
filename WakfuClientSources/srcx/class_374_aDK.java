public class aDK extends CU
{
  private final int dah;
  private final int dai;
  private final int daj;

  public aDK(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super(paramLong, paramInt1);
    this.dah = paramInt2;
    this.dai = paramInt3;
    this.daj = paramInt4;
  }

  public aDK(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, dFN paramdFN) {
    super(paramLong, paramInt1, paramInt5, paramdFN);
    this.dah = paramInt2;
    this.dai = paramInt3;
    this.daj = paramInt4;
  }

  public int arR() {
    return this.dah;
  }

  public int arS() {
    return this.dai;
  }

  public int arT() {
    return this.daj;
  }
}