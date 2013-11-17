public class bcQ
  implements bNi
{
  private final cDs fmW;
  private final int fmX;
  private final int fmY;

  public bcQ(cDs paramcDs, int paramInt1, int paramInt2)
  {
    this.fmW = paramcDs;
    this.fmX = paramInt1;
    this.fmY = paramInt2;
  }

  public dmh bqM() {
    return dmh.ljS;
  }

  public MD Qx() {
    return new MD(this.fmX * 9, this.fmY * 9);
  }

  public cDs bqN() {
    return this.fmW;
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

  public short bqQ() {
    return this.fmW.bqQ();
  }

  public long EN() {
    return 31 * this.fmX + this.fmY;
  }
}