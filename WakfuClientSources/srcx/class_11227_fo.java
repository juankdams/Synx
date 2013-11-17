public class fo
  implements aAM
{
  public static final qM by = new cpQ(new ec[] { new dhX("standard", new dou[0]), new dhX("[Element|Template|Action] Id", new dou[] { new dou("element Id"), new dou("template Id"), new dou("action Id") }) });
  private final long ag;
  private final long aCq;
  private final long aCr;

  public fo(cMb paramcMb, long paramLong)
  {
    this.aCq = paramLong;
    this.ag = paramcMb.getId();
    this.aCr = paramcMb.boN();
  }

  public String[] mo() {
    return new String[] { String.valueOf(this.ag), String.valueOf(this.aCr), String.valueOf(this.aCq) };
  }

  public qM aF() {
    return by;
  }

  public int getId() {
    return amb.doo.getId();
  }
}