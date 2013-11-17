public class beq
{
  public static long fq(long paramLong)
  {
    long l = Math.abs(paramLong);
    while (l >= 1000L) {
      l /= 10L;
    }

    return l;
  }
}