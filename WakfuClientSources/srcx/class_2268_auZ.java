public class auZ extends bxd
{
  private static final String[] aUE = { "before", "after", "equal" };

  private static final wh aIk = wh.Fo();

  public static final auZ dJO = new auZ("before");

  public static final auZ dJP = new auZ("after");

  public static final auZ dJQ = new auZ("equal");

  public auZ()
  {
  }

  public auZ(String paramString)
  {
    setValue(paramString);
  }

  public String[] wp()
  {
    return aUE;
  }

  public boolean n(long paramLong1, long paramLong2)
  {
    return b(paramLong1, paramLong2, aIk.Fp());
  }

  public boolean b(long paramLong1, long paramLong2, long paramLong3)
  {
    int i = getIndex();
    if (i == -1) {
      throw new cJ("TimeComparison value not set.");
    }
    if (i == 0) {
      return paramLong1 - paramLong3 < paramLong2;
    }
    if (i == 1) {
      return paramLong1 + paramLong3 > paramLong2;
    }
    return Math.abs(paramLong1 - paramLong2) <= paramLong3;
  }

  public static int o(long paramLong1, long paramLong2)
  {
    return c(paramLong1, paramLong2, aIk.Fp());
  }

  public static int c(long paramLong1, long paramLong2, long paramLong3)
  {
    long l1 = paramLong1 - paramLong2;
    long l2 = Math.abs(l1);
    return l2 > Math.abs(paramLong3) ? (int)(l1 / l2) : 0;
  }
}