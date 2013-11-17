public class dbb
  implements aAM
{
  public static final qM by = new cpQ(new ec[] { new dhX("standard", new dou[0]), new dhX("filtré", new dou[] { new dou("Breed opposant"), new dou("Group Id") }) });
  private final int eMm;
  private final long Tj;

  public dbb(int paramInt, long paramLong)
  {
    this.eMm = paramInt;
    this.Tj = paramLong;
  }

  public String[] mo() {
    return new String[] { Integer.toString(this.eMm), Long.toString(this.Tj) };
  }

  public qM aF() {
    return by;
  }

  public int getId() {
    return amb.dor.getId();
  }
}