public class adp
  implements Z
{
  private static final int cTz = 256;
  private static final byte[] cTA;
  private final int[] cTB;

  public adp(int[] paramArrayOfInt)
  {
    if ((!bB) && ((paramArrayOfInt == null) || (paramArrayOfInt.length < 1))) throw new AssertionError("Random patterns must contain at least 1 gfx (2 would be even better)");
    this.cTB = paramArrayOfInt;
  }

  public int f(int paramInt1, int paramInt2)
  {
    int i = paramInt1 * 7 + paramInt2 * 39;

    int j = cTA[(java.lang.Math.abs(i) % 256)];

    return this.cTB[(java.lang.Math.abs(j) % this.cTB.length)];
  }

  public void a(adz paramadz) {
    paramadz.n(this.cTB);
  }

  static
  {
    cTA = new byte[256];

    bCO.ag(cTA);
  }
}