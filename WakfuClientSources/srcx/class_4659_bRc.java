public class bRc
  implements bNi
{
  private final bAb had;
  private final int fmX;
  private final int fmY;

  public bRc(bAb parambAb, int paramInt1, int paramInt2)
  {
    this.had = parambAb;
    this.fmX = paramInt1;
    this.fmY = paramInt2;
  }

  public dmh bqM() {
    return dmh.ljU;
  }

  public MD Qx() {
    return new MD(this.fmX, this.fmY);
  }

  public bAb bXP() {
    return this.had;
  }

  public boolean equals(Object paramObject)
  {
    return nJ.a(this, paramObject);
  }

  public int hashCode()
  {
    return nJ.a(this);
  }

  public int bqO() {
    return this.fmX;
  }

  public int bqP() {
    return this.fmY;
  }

  public long EN() {
    return 31 * this.fmX + this.fmY;
  }
}