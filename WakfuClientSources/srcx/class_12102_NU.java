public class NU
{
  private final int aw;
  private final int[] ceN;
  private static int ceO;
  private int ceP;

  public NU(int paramInt, int[] paramArrayOfInt)
  {
    this.aw = paramInt;
    this.ceN = paramArrayOfInt;
    this.ceP = ceO;
    ceO += 1;
  }

  public int getOrder() {
    return this.ceP;
  }

  public int getId() {
    return this.aw;
  }

  public boolean e(cIw paramcIw) {
    for (int k : this.ceN) {
      paramcIw.R(k);
    }
    return true;
  }

  public String getName() {
    return bU.fH().b(139, this.aw, new Object[0]);
  }
}