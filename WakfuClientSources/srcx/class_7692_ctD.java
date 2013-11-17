public class ctD
  implements aAM
{
  public static final qM by = new cpQ(new ec[] { new dhX("standard", new dou[0]), new dhX("filtré", new dou[] { new dou("Id de l'item"), new dou("Id de catégorie") }) });
  private final bBn idM;

  public ctD(bBn parambBn)
  {
    this.idM = parambBn;
  }

  public String[] mo() {
    return new String[] { Integer.toString(this.idM.getId()), Integer.toString(this.idM.bKn().nc()) };
  }

  public qM aF() {
    return by;
  }

  public int getId() {
    return amb.doj.getId();
  }
}