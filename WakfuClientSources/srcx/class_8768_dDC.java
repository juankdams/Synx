public class dDC
{
  private static final int lLK = 75;
  private static final int lLL = 3;
  private static final int lLM = 1;

  public static boolean a(short paramShort1, short paramShort2, short paramShort3, int paramInt)
  {
    if (paramInt == 75)
      return true;
    return Math.abs(paramShort2 - paramShort3) <= paramShort1;
  }

  public static boolean fe(int paramInt1, int paramInt2) {
    if (paramInt2 == 75)
      return paramInt1 <= 3;
    return paramInt1 == 1;
  }

  public static int Ct(int paramInt) {
    if (paramInt == 75)
      return 3;
    return 1;
  }
}