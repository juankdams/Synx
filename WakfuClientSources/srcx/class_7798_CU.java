public abstract class CU
{
  protected final long aTz;
  protected final int Sk;
  protected final int bHh;
  protected final dFN bHi;

  public CU(long paramLong, int paramInt)
  {
    this(paramLong, paramInt, -1, dFN.lQh);
  }

  public CU(long paramLong, int paramInt1, int paramInt2, dFN paramdFN) {
    this.aTz = paramLong;
    this.Sk = paramInt1;
    this.bHh = paramInt2;
    this.bHi = paramdFN;
  }

  public long getId() {
    return this.aTz;
  }

  public int gC() {
    return this.Sk;
  }

  public int Mc() {
    return this.bHh;
  }

  public dFN Md() {
    return this.bHi;
  }
}