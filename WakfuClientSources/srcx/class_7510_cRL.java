public final class cRL
{
  public static final int kDZ = 6003720;
  public static final int kEa = 6005892;
  public static final int kEb = 6103765;
  public static final int kEc = 10006703;
  private static final int kEd = 500;
  public static final int kEe = 20;

  public static long yW(int paramInt)
  {
    return (int)(-paramInt * 3600000L / 500.0D);
  }

  public static long A(long paramLong, int paramInt)
  {
    return (int)(paramLong - paramLong * (paramInt / 100.0D));
  }

  public static int A(int paramInt, long paramLong) {
    double d = 500L * paramLong / 3600000.0D;
    return (int)Math.round(paramInt + d);
  }
}