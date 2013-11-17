public class bZk
  implements aAM
{
  public static final qM by = new cpQ(new ec[] { new dhX("standard", new dou[0]), new dhX("filtré sur l'Dd de l'item", new dou[] { new dou("Id de l'item"), new dou("Id de la famille directe") }) });
  private final int bWq;
  private short hpH;

  public bZk(bBn parambBn)
  {
    this.bWq = parambBn.getId();
    this.hpH = parambBn.bKn().nc();
  }

  public String[] mo() {
    return new String[] { Integer.toString(this.bWq), Integer.toString(this.hpH) };
  }

  public qM aF() {
    return by;
  }

  public int getId() {
    return amb.dnT.getId();
  }
}