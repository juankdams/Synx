public class vf
  implements dwL
{
  private final long bji;
  private final long kM;
  private final String bjj;

  public vf(long paramLong1, long paramLong2, String paramString)
  {
    this.bji = paramLong1;
    this.kM = paramLong2;
    this.bjj = paramString;
  }

  public long eW() {
    return this.kM;
  }

  public long Ea() {
    return this.bji;
  }

  public String Eb() {
    return this.bjj;
  }

  public String toString() {
    return this.bjj + " playerId=" + this.kM + " accountId=" + this.bji;
  }
}