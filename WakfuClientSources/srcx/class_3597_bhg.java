import org.apache.log4j.Logger;

public class bhg
{
  protected static final Logger K = Logger.getLogger(bhg.class);

  private static long fvW = 72057594037927935L;

  private static aIX fvX = new aIX();

  public static long cL(byte paramByte) {
    long l = fvX.a(paramByte, 1L, 1L);
    return i(paramByte, l);
  }

  public void g(byte paramByte, long paramLong) {
    fvX.c(paramByte, paramLong);
  }

  public static byte fy(long paramLong) {
    return (byte)(int)(paramLong >> 56);
  }

  public static long fz(long paramLong) {
    return paramLong & 0xFFFFFFFF;
  }

  public static void h(byte paramByte, long paramLong) {
    fvX.c(paramByte, paramLong);
  }

  public static long i(byte paramByte, long paramLong) {
    if (paramLong > fvW) {
      K.fatal("[GROUP ID] Dépassement de capacité pour les ID de groupe");
      return 0L;
    }

    long l1 = paramLong & 0xFFFFFFFF;
    long l2 = paramByte & 0xFF;

    return l2 << 56 | l1;
  }
}