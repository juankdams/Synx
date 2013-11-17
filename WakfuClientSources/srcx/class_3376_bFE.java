public final class bFE
  implements aAM
{
  public static final qM by = new cpQ(new ec[] { new dhX("standard", new dou[0]), new dhX("filtré", new dou[] { new dou("id du groupe") }) });
  private final long Tj;

  public bFE(long paramLong)
  {
    this.Tj = paramLong;
  }

  public int getId() {
    return amb.doD.getId();
  }

  public String[] mo() {
    return new String[] { Long.toString(this.Tj) };
  }

  public qM aF() {
    return by;
  }

  public String toString()
  {
    return "ClientEventGroupKilled{m_groupId=" + this.Tj + '}';
  }
}