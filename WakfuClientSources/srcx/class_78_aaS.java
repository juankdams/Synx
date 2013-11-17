public class aaS
  implements agk
{
  private float cPl = 0.3F;

  private static final aaS cPm = new aaS();

  public static aaS anD() {
    return cPm;
  }

  public void update(int paramInt)
  {
  }

  public int getPriority()
  {
    return 300;
  }

  public boolean wS() {
    return false;
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float[] paramArrayOfFloat) {
    float f = this.cPl;
    if (paramArrayOfFloat[0] < this.cPl)
      paramArrayOfFloat[0] = f;
    if (paramArrayOfFloat[1] < this.cPl)
      paramArrayOfFloat[1] = f;
    if (paramArrayOfFloat[2] < this.cPl)
      paramArrayOfFloat[2] = f;
  }
}