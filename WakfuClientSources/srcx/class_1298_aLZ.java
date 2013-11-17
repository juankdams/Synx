public class aLZ
  implements aAM
{
  public static final qM by = new cpQ(new ec[] { new dhX("standard", new dou[0]), new dhX("filtré", new dou[] { new dou("id de l'objectif débloqué") }), new dhX("filtré", new dou[] { new dou("id de l'objectif débloqué"), new dou("id de l'achievement") }) });
  private final int btQ;
  private final int aPh;

  public aLZ(int paramInt1, int paramInt2)
  {
    this.btQ = paramInt1;
    this.aPh = paramInt2;
  }

  public String[] mo() {
    return new String[] { Integer.toString(this.btQ), Integer.toString(this.aPh) };
  }

  public qM aF() {
    return by;
  }

  public int getId() {
    return amb.dop.getId();
  }
}