public final class dAV
  implements aAM
{
  public static final qM by = new cpQ(new ec[] { new dhX("standard", new dou[0]), new dhX("filtré", new dou[] { new dou("id de l'instance") }) });
  private final int brP;

  public dAV(int paramInt)
  {
    this.brP = paramInt;
  }

  public String[] mo() {
    return new String[] { Integer.toString(this.brP) };
  }

  public qM aF() {
    return by;
  }

  public int getId() {
    return amb.doB.getId();
  }

  public String toString()
  {
    return "ClientEventLeaveInstance{m_instanceId=" + this.brP + '}';
  }
}