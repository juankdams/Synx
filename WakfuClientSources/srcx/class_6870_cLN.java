public abstract class cLN
  implements cLZ
{
  public static final boolean yp(int paramInt)
  {
    return paramInt >= 0;
  }

  public static final boolean yq(int paramInt)
  {
    return paramInt < 0;
  }

  public static final boolean b(Nt paramNt)
  {
    if (paramNt != null) {
      return yp(paramNt.intValue());
    }
    return false;
  }

  public static final boolean c(Nt paramNt)
  {
    if (paramNt != null) {
      return yq(paramNt.intValue());
    }
    return false;
  }

  public static final int yr(int paramInt)
  {
    return paramInt & 0xFFFF;
  }

  public static final int ys(int paramInt)
  {
    return paramInt & 0xFFFF;
  }

  public static final int yt(int paramInt)
  {
    return paramInt >>= 16 & 0x1FFF;
  }

  public static final int dM(short paramShort)
  {
    return (paramShort = (short)(paramShort >> 16)) & 0x1FFF;
  }

  public static short yu(int paramInt)
  {
    return (short)(paramInt >>= 31 & 0x1);
  }

  public static short dN(short paramShort)
  {
    return (short)((paramShort = (short)(paramShort >> 31)) & 0x1);
  }

  public static int e(short paramShort1, short paramShort2, short paramShort3)
  {
    return paramShort1 << 31 | paramShort2 << 16 | paramShort3;
  }

  public static final int f(short paramShort1, short paramShort2, short paramShort3)
  {
    return paramShort1 << 31 | paramShort2 << 16 | paramShort3;
  }

  public static final Nt yv(int paramInt)
  {
    int i = 7;
    return new Nt(paramInt <= 0 ? paramInt : paramInt & 0xFFFF | i <<= 16 | 0x80000000);
  }

  public static final int yw(int paramInt)
  {
    int i = 31;
    return paramInt & 0x8000FFFF | i <<= 16;
  }
}