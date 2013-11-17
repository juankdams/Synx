public final class asd
{
  public static int k(double paramDouble)
  {
    if ((!bB) && (Double.isNaN(paramDouble))) throw new AssertionError("Values of NaN are not supported.");

    long l = Double.doubleToLongBits(paramDouble);
    return (int)(l ^ l >>> 32);
  }

  public static int aA(float paramFloat)
  {
    if ((!bB) && (Float.isNaN(paramFloat))) throw new AssertionError("Values of NaN are not supported.");

    return Float.floatToIntBits(paramFloat * 6.63609E+008F);
  }

  public static int jV(int paramInt)
  {
    return paramInt * 31;
  }

  public static int dm(long paramLong)
  {
    return (int)(paramLong ^ paramLong >>> 32) * 31;
  }

  public static int af(Object paramObject)
  {
    return paramObject == null ? 0 : paramObject.hashCode();
  }

  static int aB(float paramFloat)
  {
    int i = (int)paramFloat;
    if (paramFloat - i > 0.0F) i++;
    return i;
  }
}