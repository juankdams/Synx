public final class bwJ
  implements aAM
{
  public static final qM by = new cpQ(new ec[] { new dhX("filtré", new dou[] { new dou("Id du perso"), new dou("Id de breed"), new dou("Id du groupe") }) });
  private final long aXW;
  private final int ghi;
  private final long ghj;

  public bwJ(long paramLong1, int paramInt, long paramLong2)
  {
    this.aXW = paramLong1;
    this.ghi = paramInt;
    this.ghj = paramLong2;
  }

  public int getId() {
    return amb.dow.getId();
  }

  public String[] mo() {
    return new String[] { String.valueOf(this.aXW), String.valueOf(this.ghi), String.valueOf(this.ghj) };
  }

  public qM aF() {
    return by;
  }
}