public class cTT
{
  private static final double kGl = 4.0D;
  private static final int kGm = 100;

  public static int W(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      throw new IllegalArgumentException("inits cannot be null or empty.");
    }
    int i = 0;
    for (int m : paramArrayOfInt)
      i += m + 100;
    return (int)(4.0D * i / paramArrayOfInt.length + paramArrayOfInt.length * 100);
  }

  public static int zd(int paramInt) {
    return paramInt + 100;
  }
}