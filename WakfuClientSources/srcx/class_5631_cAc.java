public class cAc
  implements aAM
{
  public static final qM by = new cpQ(new ec[] { new dhX("standard", new dou[0]), new dhX("filtré", new dou[] { new dou("Id du dialogue"), new dou("Id du choix") }) });
  private final int aHQ;
  private final int iqa;

  public cAc(int paramInt1, int paramInt2)
  {
    this.aHQ = paramInt1;
    this.iqa = paramInt2;
  }

  public String[] mo() {
    return new String[] { Integer.toString(this.aHQ), Integer.toString(this.iqa) };
  }

  public qM aF() {
    return by;
  }

  public int getId() {
    return amb.dos.getId();
  }
}