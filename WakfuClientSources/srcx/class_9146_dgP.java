public class dgP
  implements aAM
{
  public static final qM by = new cpQ(new ec[] { new dhX("standard", new dou[0]), new dhX("filtré", new dou[] { new dou("id unique de l'action d?événement client LAUCH_TUTORIAL") }) });
  private final int aGt;

  public dgP(int paramInt)
  {
    this.aGt = paramInt;
  }

  public String[] mo() {
    return new String[] { Integer.toString(this.aGt) };
  }

  public qM aF() {
    return by;
  }

  public int getId() {
    return amb.dop.getId();
  }
}