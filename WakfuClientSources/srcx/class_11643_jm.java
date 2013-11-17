public class jm
  implements aAM
{
  public static final qM by = new cpQ(new ec[] { new dhX("standard", new dou[0]), new dhX("filtré", new dou[] { new dou("Id de la resource plantée"), new dou("id de la famille de ressource plantée") }) });
  private final int aKI;
  private final short aKJ;

  public jm(int paramInt, short paramShort)
  {
    this.aKI = paramInt;
    this.aKJ = paramShort;
  }

  public String[] mo() {
    return new String[] { String.valueOf(this.aKI), String.valueOf(this.aKJ) };
  }

  public qM aF() {
    return by;
  }

  public int getId() {
    return amb.dnU.getId();
  }
}