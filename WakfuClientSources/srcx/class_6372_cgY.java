public class cgY
  implements aAM
{
  public static final qM by = new cpQ(new ec[] { new dhX("standard", new dou[0]), new dhX("filtré", new dou[] { new dou("id de l'instance") }), new dhX("Ancien monde", new dou[] { new dou("id de l'instance"), new dou("id de l'ancienne instance") }) });
  private final int hEQ;
  private final int brP;

  public cgY(int paramInt1, int paramInt2)
  {
    this.hEQ = paramInt1;
    this.brP = paramInt2;
  }

  public String[] mo() {
    return new String[] { Integer.toString(this.brP), Integer.toString(this.hEQ) };
  }

  public qM aF() {
    return by;
  }

  public int getId() {
    return amb.dod.getId();
  }
}