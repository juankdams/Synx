public class uP
{
  public static final uP biS = new uP(0L, (short)0);
  private final long biT;
  private final short biU;

  public uP(long paramLong, short paramShort)
  {
    this.biU = paramShort;
    this.biT = paramLong;
  }

  public short DO() {
    return this.biU;
  }

  public long DP() {
    return this.biT;
  }

  public long DQ() {
    return Math.max(0L, this.biT);
  }

  public boolean DR() {
    return this.biU > 0;
  }

  public boolean DS() {
    return (this.biU != 0) || (this.biT != 0L);
  }
}