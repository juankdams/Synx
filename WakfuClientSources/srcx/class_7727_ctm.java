class ctm extends dcj
{
  private final dcj idg;

  public ctm(dcj paramdcj, long paramLong1, long paramLong2)
  {
    this.size = paramLong2;
    this.dMH = (paramdcj.dMH + paramLong1);
  }

  protected void dispose() {
    this.dMH = 0L;
  }

  protected void F(long paramLong1, long paramLong2) {
    this.idg.F(this.dMH - this.idg.dMH + paramLong1, paramLong2);
  }
  public String toString() {
    return super.toString() + " (shared from " + this.idg.toString() + ")";
  }
}