public final class clH
{
  public static short dM(byte paramByte)
  {
    if (paramByte < 0)
      return (short)(256 + paramByte);
    return (short)paramByte;
  }

  public static byte l(byte[] paramArrayOfByte, int paramInt) {
    return paramArrayOfByte[paramInt];
  }

  public static short m(byte[] paramArrayOfByte, int paramInt) {
    return (short)(dM(paramArrayOfByte[paramInt]) | dM(paramArrayOfByte[(paramInt + 1)]) << 8);
  }

  public static int n(byte[] paramArrayOfByte, int paramInt) {
    return dM(paramArrayOfByte[paramInt]) | dM(paramArrayOfByte[(paramInt + 1)]) << 8 | dM(paramArrayOfByte[(paramInt + 2)]) << 16 | dM(paramArrayOfByte[(paramInt + 3)]) << 24;
  }

  public static byte b(byte[] paramArrayOfByte, bVk parambVk) {
    int i = ((Integer)parambVk.get()).intValue();
    parambVk.set(Integer.valueOf(i + 1));
    return l(paramArrayOfByte, i);
  }

  public static short c(byte[] paramArrayOfByte, bVk parambVk) {
    int i = ((Integer)parambVk.get()).intValue();
    parambVk.set(Integer.valueOf(i + 2));
    return m(paramArrayOfByte, i);
  }

  public static int d(byte[] paramArrayOfByte, bVk parambVk) {
    int i = ((Integer)parambVk.get()).intValue();
    parambVk.set(Integer.valueOf(i + 4));
    return n(paramArrayOfByte, i);
  }
}