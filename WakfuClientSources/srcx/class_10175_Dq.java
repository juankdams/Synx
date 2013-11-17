public class Dq
{
  private final int aw;
  private final int[] bHZ;

  public Dq(int paramInt, int[] paramArrayOfInt)
  {
    this.aw = paramInt;
    this.bHZ = clr.O(paramArrayOfInt);
  }

  public int getId() {
    return this.aw;
  }

  public boolean eC(int paramInt) {
    return aUP.c(this.bHZ, paramInt);
  }

  public void a(cSi paramcSi) {
    paramcSi.add(this.bHZ);
  }
}