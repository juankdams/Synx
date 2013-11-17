public class bHw
  implements Z
{
  private final int gFX;
  private final int gFY;

  public bHw(int paramInt1, int paramInt2)
  {
    this.gFX = paramInt1;
    this.gFY = paramInt2;
  }

  public int f(int paramInt1, int paramInt2) {
    if ((paramInt1 == 1) && (paramInt2 == 0)) {
      return this.gFX;
    }
    if ((paramInt1 == 0) && (paramInt2 == 1)) {
      return this.gFY;
    }
    return 0;
  }

  public void a(adz paramadz) {
    paramadz.hL(this.gFX);
    paramadz.hL(this.gFY);
  }
}