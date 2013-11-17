public class Et
{
  private static final double bJo = 10.0D;
  private static final double bJp = 10.0D;
  public static final short bJq = 100;
  private static final float bJr = 100.0F;
  public static final int bJs = 10;

  public static long Ne()
  {
    return 100L;
  }

  public static long a(short paramShort1, short paramShort2, deT paramdeT, aGH paramaGH) {
    return a(paramShort1, paramShort2, paramdeT, 100, paramaGH);
  }

  public static long a(short paramShort1, short paramShort2, deT paramdeT, int paramInt, aGH paramaGH) {
    if ((!bGP.gDv.a(new aGH[] { paramaGH })) && (paramShort1 >= 10)) {
      return 0L;
    }

    double d1 = paramShort1 - (paramShort2 + 10.0D);
    if (d1 > 10.0D)
    {
      return 0L;
    }

    if (d1 < 0.0D)
    {
      return Math.round(100.0F * paramdeT.bAz() * paramInt / 100.0F);
    }

    double d2 = paramShort2 + 10.0D - paramShort1;
    float f = paramdeT.bAz() * paramInt / 100.0F;
    return Math.round(Ne() / 2.0D * (1.0D + Math.cos(d2 * 3.141592653589793D / 10.0D)) * f);
  }

  public static long D(short paramShort)
  {
    return 100L * paramShort * paramShort;
  }

  public static long E(short paramShort)
  {
    return D(paramShort) - D((short)(paramShort - 1));
  }

  public static long bo(long paramLong)
  {
    return D((short)(bq(paramLong) + 1)) - paramLong;
  }

  public static double bp(long paramLong)
  {
    return Math.sqrt(paramLong / 100.0D);
  }

  public static short bq(long paramLong)
  {
    return (short)(int)Math.floor(bp(paramLong));
  }

  public static double br(long paramLong)
  {
    double d = bp(paramLong);
    return d - Math.floor(d);
  }

  public static Cs bs(long paramLong)
  {
    double d = bp(paramLong);
    short s = (short)(int)Math.floor(d);
    return new Cs(Short.valueOf(s), Double.valueOf(d - s));
  }
}