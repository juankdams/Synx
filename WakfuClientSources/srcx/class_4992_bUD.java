import java.io.PrintStream;

public class bUD
{
  public static String getString(Object paramObject)
  {
    return paramObject == null ? "null" : paramObject.toString();
  }

  public static boolean getBoolean(String paramString, boolean paramBoolean) {
    if (paramString == null) {
      return paramBoolean;
    }
    return paramString.equalsIgnoreCase("true");
  }

  public static boolean getBoolean(String paramString) {
    return (paramString != null) && (paramString.equalsIgnoreCase("true"));
  }

  public static boolean getBoolean(Object paramObject) {
    return (paramObject != null) && (getBoolean(paramObject.toString()));
  }

  public static int aR(Object paramObject) {
    return f(paramObject, 0);
  }

  public static int f(Object paramObject, int paramInt) {
    long l = b(paramObject, paramInt);
    if ((l < -2147483648L) || (l > 2147483647L))
      return paramInt;
    return (int)l;
  }

  public static double getDouble(Object paramObject) {
    return b(paramObject, 0.0D);
  }

  public static double b(Object paramObject, double paramDouble) {
    try {
      if ((paramObject instanceof Number))
        return ((Number)paramObject).doubleValue();
      if ((paramObject instanceof String))
        return Double.parseDouble((String)paramObject);
    }
    catch (Exception localException) {
      return paramDouble;
    }

    return paramDouble;
  }

  public static float getFloat(Object paramObject) {
    return e(paramObject, 0.0F);
  }

  public static float e(Object paramObject, float paramFloat) {
    try {
      if ((paramObject instanceof Number))
        return ((Number)paramObject).floatValue();
      if ((paramObject instanceof String))
        return Float.parseFloat((String)paramObject);
    }
    catch (Exception localException) {
      return paramFloat;
    }

    return paramFloat;
  }

  public static long getLong(Object paramObject) {
    return getLong(paramObject, 0L);
  }

  public static long getLong(Object paramObject, long paramLong) {
    return b(paramObject, paramLong);
  }

  public static byte getByte(Object paramObject) {
    return e(paramObject, (byte)0);
  }

  public static byte e(Object paramObject, byte paramByte) {
    long l = b(paramObject, paramByte);
    if ((l < -128L) || (l > 127L))
      return paramByte;
    return (byte)(int)l;
  }

  public static short getShort(Object paramObject) {
    return a(paramObject, (short)0);
  }

  public static short a(Object paramObject, short paramShort) {
    long l = b(paramObject, paramShort);
    if ((l < -32768L) || (l > 32767L))
      return paramShort;
    return (short)(int)l;
  }

  private static long b(Object paramObject, long paramLong) {
    if (paramObject == null) {
      return paramLong;
    }
    String str = paramObject.toString();
    int i = str.length();
    long l = 0L;
    int j = 0;
    int k = 0;

    if (i == 0)
      return paramLong;
    int m;
    if (((m = str.charAt(0)) < '0') || (m > 57)) {
      if (m == 45)
        k = 1;
      else if (m == 43)
        k = 0;
      else
        return paramLong;
      j++;
    }

    if (((m = str.charAt(j)) < '0') || (m > 57)) {
      return paramLong;
    }

    for (; ; l *= 10L) {
      l += 48 - m;
      j++; if (j == i)
        return k != 0 ? l : -l;
      if (((m = str.charAt(j)) < '0') || (m > 57))
        return paramLong;
    }
  }

  public static void main(String[] paramArrayOfString) {
    long l1 = b("+1000", 1L);
    long l2 = b("-1000", 1L);
    long l3 = b("1000", 1L);
    System.out.println(l1);
  }
}