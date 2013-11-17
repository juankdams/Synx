public class clm
  implements aAM
{
  public static final qM by = new cpQ(new ec[] { new dhX("standard", new dou[0]), new dhX("filtré", new dou[] { new dou("previousNationId"), new dou("newNationId") }) });
  private final int hMW;
  private final int hMX;

  public clm(int paramInt1, int paramInt2)
  {
    this.hMW = paramInt1;
    this.hMX = paramInt2;
  }

  public String[] mo() {
    return new String[] { String.valueOf(this.hMW), String.valueOf(this.hMX) };
  }

  public qM aF() {
    return by;
  }

  public int getId() {
    return amb.doF.getId();
  }
}