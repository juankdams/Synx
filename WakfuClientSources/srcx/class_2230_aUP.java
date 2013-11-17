import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class aUP
{
  public static final Object[] eWg = new Object[0];

  public static final Class[] EMPTY_CLASS_ARRAY = new Class[0];

  public static final String[] EMPTY_STRING_ARRAY = new String[0];

  public static final long[] eWh = new long[0];

  public static final Long[] eWi = new Long[0];

  public static final int[] eWj = new int[0];

  public static final Integer[] eWk = new Integer[0];

  public static final short[] eWl = new short[0];

  public static final Short[] eWm = new Short[0];

  public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

  public static final Byte[] eWn = new Byte[0];

  public static final double[] eWo = new double[0];

  public static final Double[] eWp = new Double[0];

  public static final float[] eWq = new float[0];

  public static final Float[] eWr = new Float[0];

  public static final boolean[] eWs = new boolean[0];

  public static final Boolean[] eWt = new Boolean[0];

  public static final char[] eWu = new char[0];

  public static final Character[] eWv = new Character[0];
  public static final int eWw = -1;

  public static String toString(Object paramObject)
  {
    return b(paramObject, "{}");
  }

  public static String b(Object paramObject, String paramString)
  {
    if (paramObject == null) {
      return paramString;
    }
    return new sT(paramObject, Jo.bTf).u(paramObject).toString();
  }

  public static int ab(Object paramObject)
  {
    return new dSp().bC(paramObject).dsT();
  }

  public static boolean k(Object paramObject1, Object paramObject2)
  {
    return new dkZ().v(paramObject1, paramObject2).cTb();
  }

  public static Map j(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {
      return null;
    }
    HashMap localHashMap = new HashMap((int)(paramArrayOfObject.length * 1.5D));
    for (int i = 0; i < paramArrayOfObject.length; i++) {
      Object localObject1 = paramArrayOfObject[i];
      Object localObject2;
      if ((localObject1 instanceof Map.Entry)) {
        localObject2 = (Map.Entry)localObject1;
        localHashMap.put(((Map.Entry)localObject2).getKey(), ((Map.Entry)localObject2).getValue());
      } else if ((localObject1 instanceof Object[])) {
        localObject2 = (Object[])localObject1;
        if (localObject2.length < 2) {
          throw new IllegalArgumentException("Array element " + i + ", '" + localObject1 + "', has a length less than 2");
        }

        localHashMap.put(localObject2[0], localObject2[1]);
      } else {
        throw new IllegalArgumentException("Array element " + i + ", '" + localObject1 + "', is neither of type Map.Entry nor an Array");
      }

    }

    return localHashMap;
  }

  public static Object[] toArray(Object[] paramArrayOfObject)
  {
    return paramArrayOfObject;
  }

  public static Object[] k(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {
      return null;
    }
    return (Object[])paramArrayOfObject.clone();
  }

  public static long[] e(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null) {
      return null;
    }
    return (long[])paramArrayOfLong.clone();
  }

  public static int[] u(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {
      return null;
    }
    return (int[])paramArrayOfInt.clone();
  }

  public static short[] f(short[] paramArrayOfShort)
  {
    if (paramArrayOfShort == null) {
      return null;
    }
    return (short[])paramArrayOfShort.clone();
  }

  public static char[] b(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar == null) {
      return null;
    }
    return (char[])paramArrayOfChar.clone();
  }

  public static byte[] O(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    return (byte[])paramArrayOfByte.clone();
  }

  public static double[] c(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null) {
      return null;
    }
    return (double[])paramArrayOfDouble.clone();
  }

  public static float[] n(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == null) {
      return null;
    }
    return (float[])paramArrayOfFloat.clone();
  }

  public static boolean[] b(boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean == null) {
      return null;
    }
    return (boolean[])paramArrayOfBoolean.clone();
  }

  public static Object[] l(Object[] paramArrayOfObject)
  {
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length == 0)) {
      return eWg;
    }
    return paramArrayOfObject;
  }

  public static String[] m(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
      return EMPTY_STRING_ARRAY;
    }
    return paramArrayOfString;
  }

  public static long[] f(long[] paramArrayOfLong)
  {
    if ((paramArrayOfLong == null) || (paramArrayOfLong.length == 0)) {
      return eWh;
    }
    return paramArrayOfLong;
  }

  public static int[] v(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      return eWj;
    }
    return paramArrayOfInt;
  }

  public static short[] g(short[] paramArrayOfShort)
  {
    if ((paramArrayOfShort == null) || (paramArrayOfShort.length == 0)) {
      return eWl;
    }
    return paramArrayOfShort;
  }

  public static char[] c(char[] paramArrayOfChar)
  {
    if ((paramArrayOfChar == null) || (paramArrayOfChar.length == 0)) {
      return eWu;
    }
    return paramArrayOfChar;
  }

  public static byte[] P(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return EMPTY_BYTE_ARRAY;
    }
    return paramArrayOfByte;
  }

  public static double[] d(double[] paramArrayOfDouble)
  {
    if ((paramArrayOfDouble == null) || (paramArrayOfDouble.length == 0)) {
      return eWo;
    }
    return paramArrayOfDouble;
  }

  public static float[] o(float[] paramArrayOfFloat)
  {
    if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length == 0)) {
      return eWq;
    }
    return paramArrayOfFloat;
  }

  public static boolean[] c(boolean[] paramArrayOfBoolean)
  {
    if ((paramArrayOfBoolean == null) || (paramArrayOfBoolean.length == 0)) {
      return eWs;
    }
    return paramArrayOfBoolean;
  }

  public static Long[] a(Long[] paramArrayOfLong)
  {
    if ((paramArrayOfLong == null) || (paramArrayOfLong.length == 0)) {
      return eWi;
    }
    return paramArrayOfLong;
  }

  public static Integer[] a(Integer[] paramArrayOfInteger)
  {
    if ((paramArrayOfInteger == null) || (paramArrayOfInteger.length == 0)) {
      return eWk;
    }
    return paramArrayOfInteger;
  }

  public static Short[] a(Short[] paramArrayOfShort)
  {
    if ((paramArrayOfShort == null) || (paramArrayOfShort.length == 0)) {
      return eWm;
    }
    return paramArrayOfShort;
  }

  public static Character[] a(Character[] paramArrayOfCharacter)
  {
    if ((paramArrayOfCharacter == null) || (paramArrayOfCharacter.length == 0)) {
      return eWv;
    }
    return paramArrayOfCharacter;
  }

  public static Byte[] a(Byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return eWn;
    }
    return paramArrayOfByte;
  }

  public static Double[] a(Double[] paramArrayOfDouble)
  {
    if ((paramArrayOfDouble == null) || (paramArrayOfDouble.length == 0)) {
      return eWp;
    }
    return paramArrayOfDouble;
  }

  public static Float[] a(Float[] paramArrayOfFloat)
  {
    if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length == 0)) {
      return eWr;
    }
    return paramArrayOfFloat;
  }

  public static Boolean[] a(Boolean[] paramArrayOfBoolean)
  {
    if ((paramArrayOfBoolean == null) || (paramArrayOfBoolean.length == 0)) {
      return eWt;
    }
    return paramArrayOfBoolean;
  }

  public static Object[] a(Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    if (paramArrayOfObject == null) {
      return null;
    }
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    if (paramInt2 > paramArrayOfObject.length) {
      paramInt2 = paramArrayOfObject.length;
    }
    int i = paramInt2 - paramInt1;
    Class localClass = paramArrayOfObject.getClass().getComponentType();
    if (i <= 0)
    {
      arrayOfObject = (Object[])Array.newInstance(localClass, 0);
      return arrayOfObject;
    }

    Object[] arrayOfObject = (Object[])Array.newInstance(localClass, i);
    System.arraycopy(paramArrayOfObject, paramInt1, arrayOfObject, 0, i);
    return arrayOfObject;
  }

  public static long[] c(long[] paramArrayOfLong, int paramInt1, int paramInt2)
  {
    if (paramArrayOfLong == null) {
      return null;
    }
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    if (paramInt2 > paramArrayOfLong.length) {
      paramInt2 = paramArrayOfLong.length;
    }
    int i = paramInt2 - paramInt1;
    if (i <= 0) {
      return eWh;
    }

    long[] arrayOfLong = new long[i];
    System.arraycopy(paramArrayOfLong, paramInt1, arrayOfLong, 0, i);
    return arrayOfLong;
  }

  public static int[] b(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    if (paramArrayOfInt == null) {
      return null;
    }
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    if (paramInt2 > paramArrayOfInt.length) {
      paramInt2 = paramArrayOfInt.length;
    }
    int i = paramInt2 - paramInt1;
    if (i <= 0) {
      return eWj;
    }

    int[] arrayOfInt = new int[i];
    System.arraycopy(paramArrayOfInt, paramInt1, arrayOfInt, 0, i);
    return arrayOfInt;
  }

  public static short[] a(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    if (paramArrayOfShort == null) {
      return null;
    }
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    if (paramInt2 > paramArrayOfShort.length) {
      paramInt2 = paramArrayOfShort.length;
    }
    int i = paramInt2 - paramInt1;
    if (i <= 0) {
      return eWl;
    }

    short[] arrayOfShort = new short[i];
    System.arraycopy(paramArrayOfShort, paramInt1, arrayOfShort, 0, i);
    return arrayOfShort;
  }

  public static char[] a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramArrayOfChar == null) {
      return null;
    }
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    if (paramInt2 > paramArrayOfChar.length) {
      paramInt2 = paramArrayOfChar.length;
    }
    int i = paramInt2 - paramInt1;
    if (i <= 0) {
      return eWu;
    }

    char[] arrayOfChar = new char[i];
    System.arraycopy(paramArrayOfChar, paramInt1, arrayOfChar, 0, i);
    return arrayOfChar;
  }

  public static byte[] h(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    if (paramInt2 > paramArrayOfByte.length) {
      paramInt2 = paramArrayOfByte.length;
    }
    int i = paramInt2 - paramInt1;
    if (i <= 0) {
      return EMPTY_BYTE_ARRAY;
    }

    byte[] arrayOfByte = new byte[i];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, i);
    return arrayOfByte;
  }

  public static double[] a(double[] paramArrayOfDouble, int paramInt1, int paramInt2)
  {
    if (paramArrayOfDouble == null) {
      return null;
    }
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    if (paramInt2 > paramArrayOfDouble.length) {
      paramInt2 = paramArrayOfDouble.length;
    }
    int i = paramInt2 - paramInt1;
    if (i <= 0) {
      return eWo;
    }

    double[] arrayOfDouble = new double[i];
    System.arraycopy(paramArrayOfDouble, paramInt1, arrayOfDouble, 0, i);
    return arrayOfDouble;
  }

  public static float[] e(float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    if (paramArrayOfFloat == null) {
      return null;
    }
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    if (paramInt2 > paramArrayOfFloat.length) {
      paramInt2 = paramArrayOfFloat.length;
    }
    int i = paramInt2 - paramInt1;
    if (i <= 0) {
      return eWq;
    }

    float[] arrayOfFloat = new float[i];
    System.arraycopy(paramArrayOfFloat, paramInt1, arrayOfFloat, 0, i);
    return arrayOfFloat;
  }

  public static boolean[] a(boolean[] paramArrayOfBoolean, int paramInt1, int paramInt2)
  {
    if (paramArrayOfBoolean == null) {
      return null;
    }
    if (paramInt1 < 0) {
      paramInt1 = 0;
    }
    if (paramInt2 > paramArrayOfBoolean.length) {
      paramInt2 = paramArrayOfBoolean.length;
    }
    int i = paramInt2 - paramInt1;
    if (i <= 0) {
      return eWs;
    }

    boolean[] arrayOfBoolean = new boolean[i];
    System.arraycopy(paramArrayOfBoolean, paramInt1, arrayOfBoolean, 0, i);
    return arrayOfBoolean;
  }

  public static boolean b(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    if (((paramArrayOfObject1 == null) && (paramArrayOfObject2 != null) && (paramArrayOfObject2.length > 0)) || ((paramArrayOfObject2 == null) && (paramArrayOfObject1 != null) && (paramArrayOfObject1.length > 0)) || ((paramArrayOfObject1 != null) && (paramArrayOfObject2 != null) && (paramArrayOfObject1.length != paramArrayOfObject2.length)))
    {
      return false;
    }
    return true;
  }

  public static boolean b(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    if (((paramArrayOfLong1 == null) && (paramArrayOfLong2 != null) && (paramArrayOfLong2.length > 0)) || ((paramArrayOfLong2 == null) && (paramArrayOfLong1 != null) && (paramArrayOfLong1.length > 0)) || ((paramArrayOfLong1 != null) && (paramArrayOfLong2 != null) && (paramArrayOfLong1.length != paramArrayOfLong2.length)))
    {
      return false;
    }
    return true;
  }

  public static boolean b(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if (((paramArrayOfInt1 == null) && (paramArrayOfInt2 != null) && (paramArrayOfInt2.length > 0)) || ((paramArrayOfInt2 == null) && (paramArrayOfInt1 != null) && (paramArrayOfInt1.length > 0)) || ((paramArrayOfInt1 != null) && (paramArrayOfInt2 != null) && (paramArrayOfInt1.length != paramArrayOfInt2.length)))
    {
      return false;
    }
    return true;
  }

  public static boolean b(short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    if (((paramArrayOfShort1 == null) && (paramArrayOfShort2 != null) && (paramArrayOfShort2.length > 0)) || ((paramArrayOfShort2 == null) && (paramArrayOfShort1 != null) && (paramArrayOfShort1.length > 0)) || ((paramArrayOfShort1 != null) && (paramArrayOfShort2 != null) && (paramArrayOfShort1.length != paramArrayOfShort2.length)))
    {
      return false;
    }
    return true;
  }

  public static boolean b(char[] paramArrayOfChar1, char[] paramArrayOfChar2)
  {
    if (((paramArrayOfChar1 == null) && (paramArrayOfChar2 != null) && (paramArrayOfChar2.length > 0)) || ((paramArrayOfChar2 == null) && (paramArrayOfChar1 != null) && (paramArrayOfChar1.length > 0)) || ((paramArrayOfChar1 != null) && (paramArrayOfChar2 != null) && (paramArrayOfChar1.length != paramArrayOfChar2.length)))
    {
      return false;
    }
    return true;
  }

  public static boolean c(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (((paramArrayOfByte1 == null) && (paramArrayOfByte2 != null) && (paramArrayOfByte2.length > 0)) || ((paramArrayOfByte2 == null) && (paramArrayOfByte1 != null) && (paramArrayOfByte1.length > 0)) || ((paramArrayOfByte1 != null) && (paramArrayOfByte2 != null) && (paramArrayOfByte1.length != paramArrayOfByte2.length)))
    {
      return false;
    }
    return true;
  }

  public static boolean b(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    if (((paramArrayOfDouble1 == null) && (paramArrayOfDouble2 != null) && (paramArrayOfDouble2.length > 0)) || ((paramArrayOfDouble2 == null) && (paramArrayOfDouble1 != null) && (paramArrayOfDouble1.length > 0)) || ((paramArrayOfDouble1 != null) && (paramArrayOfDouble2 != null) && (paramArrayOfDouble1.length != paramArrayOfDouble2.length)))
    {
      return false;
    }
    return true;
  }

  public static boolean b(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    if (((paramArrayOfFloat1 == null) && (paramArrayOfFloat2 != null) && (paramArrayOfFloat2.length > 0)) || ((paramArrayOfFloat2 == null) && (paramArrayOfFloat1 != null) && (paramArrayOfFloat1.length > 0)) || ((paramArrayOfFloat1 != null) && (paramArrayOfFloat2 != null) && (paramArrayOfFloat1.length != paramArrayOfFloat2.length)))
    {
      return false;
    }
    return true;
  }

  public static boolean b(boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    if (((paramArrayOfBoolean1 == null) && (paramArrayOfBoolean2 != null) && (paramArrayOfBoolean2.length > 0)) || ((paramArrayOfBoolean2 == null) && (paramArrayOfBoolean1 != null) && (paramArrayOfBoolean1.length > 0)) || ((paramArrayOfBoolean1 != null) && (paramArrayOfBoolean2 != null) && (paramArrayOfBoolean1.length != paramArrayOfBoolean2.length)))
    {
      return false;
    }
    return true;
  }

  public static int getLength(Object paramObject)
  {
    if (paramObject == null) {
      return 0;
    }
    return Array.getLength(paramObject);
  }

  public static boolean l(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 == null) || (paramObject2 == null)) {
      throw new IllegalArgumentException("The Array must not be null");
    }
    return paramObject1.getClass().getName().equals(paramObject2.getClass().getName());
  }

  public static void m(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {
      return;
    }
    int i = 0;
    int j = paramArrayOfObject.length - 1;

    while (j > i) {
      Object localObject = paramArrayOfObject[j];
      paramArrayOfObject[j] = paramArrayOfObject[i];
      paramArrayOfObject[i] = localObject;
      j--;
      i++;
    }
  }

  public static void g(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null) {
      return;
    }
    int i = 0;
    int j = paramArrayOfLong.length - 1;

    while (j > i) {
      long l = paramArrayOfLong[j];
      paramArrayOfLong[j] = paramArrayOfLong[i];
      paramArrayOfLong[i] = l;
      j--;
      i++;
    }
  }

  public static void w(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {
      return;
    }
    int i = 0;
    int j = paramArrayOfInt.length - 1;

    while (j > i) {
      int k = paramArrayOfInt[j];
      paramArrayOfInt[j] = paramArrayOfInt[i];
      paramArrayOfInt[i] = k;
      j--;
      i++;
    }
  }

  public static void h(short[] paramArrayOfShort)
  {
    if (paramArrayOfShort == null) {
      return;
    }
    int i = 0;
    int j = paramArrayOfShort.length - 1;

    while (j > i) {
      int k = paramArrayOfShort[j];
      paramArrayOfShort[j] = paramArrayOfShort[i];
      paramArrayOfShort[i] = k;
      j--;
      i++;
    }
  }

  public static void d(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar == null) {
      return;
    }
    int i = 0;
    int j = paramArrayOfChar.length - 1;

    while (j > i) {
      int k = paramArrayOfChar[j];
      paramArrayOfChar[j] = paramArrayOfChar[i];
      paramArrayOfChar[i] = k;
      j--;
      i++;
    }
  }

  public static void Q(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return;
    }
    int i = 0;
    int j = paramArrayOfByte.length - 1;

    while (j > i) {
      int k = paramArrayOfByte[j];
      paramArrayOfByte[j] = paramArrayOfByte[i];
      paramArrayOfByte[i] = k;
      j--;
      i++;
    }
  }

  public static void e(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null) {
      return;
    }
    int i = 0;
    int j = paramArrayOfDouble.length - 1;

    while (j > i) {
      double d = paramArrayOfDouble[j];
      paramArrayOfDouble[j] = paramArrayOfDouble[i];
      paramArrayOfDouble[i] = d;
      j--;
      i++;
    }
  }

  public static void p(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == null) {
      return;
    }
    int i = 0;
    int j = paramArrayOfFloat.length - 1;

    while (j > i) {
      float f = paramArrayOfFloat[j];
      paramArrayOfFloat[j] = paramArrayOfFloat[i];
      paramArrayOfFloat[i] = f;
      j--;
      i++;
    }
  }

  public static void d(boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean == null) {
      return;
    }
    int i = 0;
    int j = paramArrayOfBoolean.length - 1;

    while (j > i) {
      int k = paramArrayOfBoolean[j];
      paramArrayOfBoolean[j] = paramArrayOfBoolean[i];
      paramArrayOfBoolean[i] = k;
      j--;
      i++;
    }
  }

  public static int a(Object[] paramArrayOfObject, Object paramObject)
  {
    return a(paramArrayOfObject, paramObject, 0);
  }

  public static int a(Object[] paramArrayOfObject, Object paramObject, int paramInt)
  {
    if (paramArrayOfObject == null) {
      return -1;
    }
    if (paramInt < 0)
      paramInt = 0;
    int i;
    if (paramObject == null) {
      for (i = paramInt; i < paramArrayOfObject.length; i++) {
        if (paramArrayOfObject[i] == null)
          return i;
      }
    }
    else if (paramArrayOfObject.getClass().getComponentType().isInstance(paramObject)) {
      for (i = paramInt; i < paramArrayOfObject.length; i++) {
        if (paramObject.equals(paramArrayOfObject[i])) {
          return i;
        }
      }
    }
    return -1;
  }

  public static int b(Object[] paramArrayOfObject, Object paramObject)
  {
    return b(paramArrayOfObject, paramObject, 2147483647);
  }

  public static int b(Object[] paramArrayOfObject, Object paramObject, int paramInt)
  {
    if (paramArrayOfObject == null) {
      return -1;
    }
    if (paramInt < 0)
      return -1;
    if (paramInt >= paramArrayOfObject.length)
      paramInt = paramArrayOfObject.length - 1;
    int i;
    if (paramObject == null) {
      for (i = paramInt; i >= 0; i--) {
        if (paramArrayOfObject[i] == null)
          return i;
      }
    }
    else if (paramArrayOfObject.getClass().getComponentType().isInstance(paramObject)) {
      for (i = paramInt; i >= 0; i--) {
        if (paramObject.equals(paramArrayOfObject[i])) {
          return i;
        }
      }
    }
    return -1;
  }

  public static boolean c(Object[] paramArrayOfObject, Object paramObject)
  {
    return a(paramArrayOfObject, paramObject) != -1;
  }

  public static int a(long[] paramArrayOfLong, long paramLong)
  {
    return a(paramArrayOfLong, paramLong, 0);
  }

  public static int a(long[] paramArrayOfLong, long paramLong, int paramInt)
  {
    if (paramArrayOfLong == null) {
      return -1;
    }
    if (paramInt < 0) {
      paramInt = 0;
    }
    for (int i = paramInt; i < paramArrayOfLong.length; i++) {
      if (paramLong == paramArrayOfLong[i]) {
        return i;
      }
    }
    return -1;
  }

  public static int b(long[] paramArrayOfLong, long paramLong)
  {
    return b(paramArrayOfLong, paramLong, 2147483647);
  }

  public static int b(long[] paramArrayOfLong, long paramLong, int paramInt)
  {
    if (paramArrayOfLong == null) {
      return -1;
    }
    if (paramInt < 0)
      return -1;
    if (paramInt >= paramArrayOfLong.length) {
      paramInt = paramArrayOfLong.length - 1;
    }
    for (int i = paramInt; i >= 0; i--) {
      if (paramLong == paramArrayOfLong[i]) {
        return i;
      }
    }
    return -1;
  }

  public static boolean c(long[] paramArrayOfLong, long paramLong)
  {
    return a(paramArrayOfLong, paramLong) != -1;
  }

  public static int g(int[] paramArrayOfInt, int paramInt)
  {
    return c(paramArrayOfInt, paramInt, 0);
  }

  public static int c(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    if (paramArrayOfInt == null) {
      return -1;
    }
    if (paramInt2 < 0) {
      paramInt2 = 0;
    }
    for (int i = paramInt2; i < paramArrayOfInt.length; i++) {
      if (paramInt1 == paramArrayOfInt[i]) {
        return i;
      }
    }
    return -1;
  }

  public static int h(int[] paramArrayOfInt, int paramInt)
  {
    return d(paramArrayOfInt, paramInt, 2147483647);
  }

  public static int d(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    if (paramArrayOfInt == null) {
      return -1;
    }
    if (paramInt2 < 0)
      return -1;
    if (paramInt2 >= paramArrayOfInt.length) {
      paramInt2 = paramArrayOfInt.length - 1;
    }
    for (int i = paramInt2; i >= 0; i--) {
      if (paramInt1 == paramArrayOfInt[i]) {
        return i;
      }
    }
    return -1;
  }

  public static boolean c(int[] paramArrayOfInt, int paramInt)
  {
    return g(paramArrayOfInt, paramInt) != -1;
  }

  public static int a(short[] paramArrayOfShort, short paramShort)
  {
    return a(paramArrayOfShort, paramShort, 0);
  }

  public static int a(short[] paramArrayOfShort, short paramShort, int paramInt)
  {
    if (paramArrayOfShort == null) {
      return -1;
    }
    if (paramInt < 0) {
      paramInt = 0;
    }
    for (int i = paramInt; i < paramArrayOfShort.length; i++) {
      if (paramShort == paramArrayOfShort[i]) {
        return i;
      }
    }
    return -1;
  }

  public static int b(short[] paramArrayOfShort, short paramShort)
  {
    return b(paramArrayOfShort, paramShort, 2147483647);
  }

  public static int b(short[] paramArrayOfShort, short paramShort, int paramInt)
  {
    if (paramArrayOfShort == null) {
      return -1;
    }
    if (paramInt < 0)
      return -1;
    if (paramInt >= paramArrayOfShort.length) {
      paramInt = paramArrayOfShort.length - 1;
    }
    for (int i = paramInt; i >= 0; i--) {
      if (paramShort == paramArrayOfShort[i]) {
        return i;
      }
    }
    return -1;
  }

  public static boolean c(short[] paramArrayOfShort, short paramShort)
  {
    return a(paramArrayOfShort, paramShort) != -1;
  }

  public static int a(char[] paramArrayOfChar, char paramChar)
  {
    return a(paramArrayOfChar, paramChar, 0);
  }

  public static int a(char[] paramArrayOfChar, char paramChar, int paramInt)
  {
    if (paramArrayOfChar == null) {
      return -1;
    }
    if (paramInt < 0) {
      paramInt = 0;
    }
    for (int i = paramInt; i < paramArrayOfChar.length; i++) {
      if (paramChar == paramArrayOfChar[i]) {
        return i;
      }
    }
    return -1;
  }

  public static int b(char[] paramArrayOfChar, char paramChar)
  {
    return b(paramArrayOfChar, paramChar, 2147483647);
  }

  public static int b(char[] paramArrayOfChar, char paramChar, int paramInt)
  {
    if (paramArrayOfChar == null) {
      return -1;
    }
    if (paramInt < 0)
      return -1;
    if (paramInt >= paramArrayOfChar.length) {
      paramInt = paramArrayOfChar.length - 1;
    }
    for (int i = paramInt; i >= 0; i--) {
      if (paramChar == paramArrayOfChar[i]) {
        return i;
      }
    }
    return -1;
  }

  public static boolean c(char[] paramArrayOfChar, char paramChar)
  {
    return a(paramArrayOfChar, paramChar) != -1;
  }

  public static int a(byte[] paramArrayOfByte, byte paramByte)
  {
    return a(paramArrayOfByte, paramByte, 0);
  }

  public static int a(byte[] paramArrayOfByte, byte paramByte, int paramInt)
  {
    if (paramArrayOfByte == null) {
      return -1;
    }
    if (paramInt < 0) {
      paramInt = 0;
    }
    for (int i = paramInt; i < paramArrayOfByte.length; i++) {
      if (paramByte == paramArrayOfByte[i]) {
        return i;
      }
    }
    return -1;
  }

  public static int b(byte[] paramArrayOfByte, byte paramByte)
  {
    return b(paramArrayOfByte, paramByte, 2147483647);
  }

  public static int b(byte[] paramArrayOfByte, byte paramByte, int paramInt)
  {
    if (paramArrayOfByte == null) {
      return -1;
    }
    if (paramInt < 0)
      return -1;
    if (paramInt >= paramArrayOfByte.length) {
      paramInt = paramArrayOfByte.length - 1;
    }
    for (int i = paramInt; i >= 0; i--) {
      if (paramByte == paramArrayOfByte[i]) {
        return i;
      }
    }
    return -1;
  }

  public static boolean c(byte[] paramArrayOfByte, byte paramByte)
  {
    return a(paramArrayOfByte, paramByte) != -1;
  }

  public static int a(double[] paramArrayOfDouble, double paramDouble)
  {
    return a(paramArrayOfDouble, paramDouble, 0);
  }

  public static int a(double[] paramArrayOfDouble, double paramDouble1, double paramDouble2)
  {
    return a(paramArrayOfDouble, paramDouble1, 0, paramDouble2);
  }

  public static int a(double[] paramArrayOfDouble, double paramDouble, int paramInt)
  {
    if (g(paramArrayOfDouble)) {
      return -1;
    }
    if (paramInt < 0) {
      paramInt = 0;
    }
    for (int i = paramInt; i < paramArrayOfDouble.length; i++) {
      if (paramDouble == paramArrayOfDouble[i]) {
        return i;
      }
    }
    return -1;
  }

  public static int a(double[] paramArrayOfDouble, double paramDouble1, int paramInt, double paramDouble2)
  {
    if (g(paramArrayOfDouble)) {
      return -1;
    }
    if (paramInt < 0) {
      paramInt = 0;
    }
    double d1 = paramDouble1 - paramDouble2;
    double d2 = paramDouble1 + paramDouble2;
    for (int i = paramInt; i < paramArrayOfDouble.length; i++) {
      if ((paramArrayOfDouble[i] >= d1) && (paramArrayOfDouble[i] <= d2)) {
        return i;
      }
    }
    return -1;
  }

  public static int b(double[] paramArrayOfDouble, double paramDouble)
  {
    return b(paramArrayOfDouble, paramDouble, 2147483647);
  }

  public static int b(double[] paramArrayOfDouble, double paramDouble1, double paramDouble2)
  {
    return b(paramArrayOfDouble, paramDouble1, 2147483647, paramDouble2);
  }

  public static int b(double[] paramArrayOfDouble, double paramDouble, int paramInt)
  {
    if (g(paramArrayOfDouble)) {
      return -1;
    }
    if (paramInt < 0)
      return -1;
    if (paramInt >= paramArrayOfDouble.length) {
      paramInt = paramArrayOfDouble.length - 1;
    }
    for (int i = paramInt; i >= 0; i--) {
      if (paramDouble == paramArrayOfDouble[i]) {
        return i;
      }
    }
    return -1;
  }

  public static int b(double[] paramArrayOfDouble, double paramDouble1, int paramInt, double paramDouble2)
  {
    if (g(paramArrayOfDouble)) {
      return -1;
    }
    if (paramInt < 0)
      return -1;
    if (paramInt >= paramArrayOfDouble.length) {
      paramInt = paramArrayOfDouble.length - 1;
    }
    double d1 = paramDouble1 - paramDouble2;
    double d2 = paramDouble1 + paramDouble2;
    for (int i = paramInt; i >= 0; i--) {
      if ((paramArrayOfDouble[i] >= d1) && (paramArrayOfDouble[i] <= d2)) {
        return i;
      }
    }
    return -1;
  }

  public static boolean c(double[] paramArrayOfDouble, double paramDouble)
  {
    return a(paramArrayOfDouble, paramDouble) != -1;
  }

  public static boolean c(double[] paramArrayOfDouble, double paramDouble1, double paramDouble2)
  {
    return a(paramArrayOfDouble, paramDouble1, 0, paramDouble2) != -1;
  }

  public static int f(float[] paramArrayOfFloat, float paramFloat)
  {
    return a(paramArrayOfFloat, paramFloat, 0);
  }

  public static int a(float[] paramArrayOfFloat, float paramFloat, int paramInt)
  {
    if (r(paramArrayOfFloat)) {
      return -1;
    }
    if (paramInt < 0) {
      paramInt = 0;
    }
    for (int i = paramInt; i < paramArrayOfFloat.length; i++) {
      if (paramFloat == paramArrayOfFloat[i]) {
        return i;
      }
    }
    return -1;
  }

  public static int g(float[] paramArrayOfFloat, float paramFloat)
  {
    return b(paramArrayOfFloat, paramFloat, 2147483647);
  }

  public static int b(float[] paramArrayOfFloat, float paramFloat, int paramInt)
  {
    if (r(paramArrayOfFloat)) {
      return -1;
    }
    if (paramInt < 0)
      return -1;
    if (paramInt >= paramArrayOfFloat.length) {
      paramInt = paramArrayOfFloat.length - 1;
    }
    for (int i = paramInt; i >= 0; i--) {
      if (paramFloat == paramArrayOfFloat[i]) {
        return i;
      }
    }
    return -1;
  }

  public static boolean h(float[] paramArrayOfFloat, float paramFloat)
  {
    return f(paramArrayOfFloat, paramFloat) != -1;
  }

  public static int a(boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    return a(paramArrayOfBoolean, paramBoolean, 0);
  }

  public static int a(boolean[] paramArrayOfBoolean, boolean paramBoolean, int paramInt)
  {
    if (f(paramArrayOfBoolean)) {
      return -1;
    }
    if (paramInt < 0) {
      paramInt = 0;
    }
    for (int i = paramInt; i < paramArrayOfBoolean.length; i++) {
      if (paramBoolean == paramArrayOfBoolean[i]) {
        return i;
      }
    }
    return -1;
  }

  public static int b(boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    return b(paramArrayOfBoolean, paramBoolean, 2147483647);
  }

  public static int b(boolean[] paramArrayOfBoolean, boolean paramBoolean, int paramInt)
  {
    if (f(paramArrayOfBoolean)) {
      return -1;
    }
    if (paramInt < 0)
      return -1;
    if (paramInt >= paramArrayOfBoolean.length) {
      paramInt = paramArrayOfBoolean.length - 1;
    }
    for (int i = paramInt; i >= 0; i--) {
      if (paramBoolean == paramArrayOfBoolean[i]) {
        return i;
      }
    }
    return -1;
  }

  public static boolean c(boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    return a(paramArrayOfBoolean, paramBoolean) != -1;
  }

  public static char[] b(Character[] paramArrayOfCharacter)
  {
    if (paramArrayOfCharacter == null)
      return null;
    if (paramArrayOfCharacter.length == 0) {
      return eWu;
    }
    char[] arrayOfChar = new char[paramArrayOfCharacter.length];
    for (int i = 0; i < paramArrayOfCharacter.length; i++) {
      arrayOfChar[i] = paramArrayOfCharacter[i].charValue();
    }
    return arrayOfChar;
  }

  public static char[] a(Character[] paramArrayOfCharacter, char paramChar)
  {
    if (paramArrayOfCharacter == null)
      return null;
    if (paramArrayOfCharacter.length == 0) {
      return eWu;
    }
    char[] arrayOfChar = new char[paramArrayOfCharacter.length];
    for (int i = 0; i < paramArrayOfCharacter.length; i++) {
      Character localCharacter = paramArrayOfCharacter[i];
      arrayOfChar[i] = (localCharacter == null ? paramChar : localCharacter.charValue());
    }
    return arrayOfChar;
  }

  public static Character[] e(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar == null)
      return null;
    if (paramArrayOfChar.length == 0) {
      return eWv;
    }
    Character[] arrayOfCharacter = new Character[paramArrayOfChar.length];
    for (int i = 0; i < paramArrayOfChar.length; i++) {
      arrayOfCharacter[i] = Character.valueOf(paramArrayOfChar[i]);
    }
    return arrayOfCharacter;
  }

  public static long[] b(Long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null)
      return null;
    if (paramArrayOfLong.length == 0) {
      return eWh;
    }
    long[] arrayOfLong = new long[paramArrayOfLong.length];
    for (int i = 0; i < paramArrayOfLong.length; i++) {
      arrayOfLong[i] = paramArrayOfLong[i].longValue();
    }
    return arrayOfLong;
  }

  public static long[] a(Long[] paramArrayOfLong, long paramLong)
  {
    if (paramArrayOfLong == null)
      return null;
    if (paramArrayOfLong.length == 0) {
      return eWh;
    }
    long[] arrayOfLong = new long[paramArrayOfLong.length];
    for (int i = 0; i < paramArrayOfLong.length; i++) {
      Long localLong = paramArrayOfLong[i];
      arrayOfLong[i] = (localLong == null ? paramLong : localLong.longValue());
    }
    return arrayOfLong;
  }

  public static Long[] h(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null)
      return null;
    if (paramArrayOfLong.length == 0) {
      return eWi;
    }
    Long[] arrayOfLong = new Long[paramArrayOfLong.length];
    for (int i = 0; i < paramArrayOfLong.length; i++) {
      arrayOfLong[i] = Long.valueOf(paramArrayOfLong[i]);
    }
    return arrayOfLong;
  }

  public static int[] b(Integer[] paramArrayOfInteger)
  {
    if (paramArrayOfInteger == null)
      return null;
    if (paramArrayOfInteger.length == 0) {
      return eWj;
    }
    int[] arrayOfInt = new int[paramArrayOfInteger.length];
    for (int i = 0; i < paramArrayOfInteger.length; i++) {
      arrayOfInt[i] = paramArrayOfInteger[i].intValue();
    }
    return arrayOfInt;
  }

  public static int[] a(Integer[] paramArrayOfInteger, int paramInt)
  {
    if (paramArrayOfInteger == null)
      return null;
    if (paramArrayOfInteger.length == 0) {
      return eWj;
    }
    int[] arrayOfInt = new int[paramArrayOfInteger.length];
    for (int i = 0; i < paramArrayOfInteger.length; i++) {
      Integer localInteger = paramArrayOfInteger[i];
      arrayOfInt[i] = (localInteger == null ? paramInt : localInteger.intValue());
    }
    return arrayOfInt;
  }

  public static Integer[] x(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null)
      return null;
    if (paramArrayOfInt.length == 0) {
      return eWk;
    }
    Integer[] arrayOfInteger = new Integer[paramArrayOfInt.length];
    for (int i = 0; i < paramArrayOfInt.length; i++) {
      arrayOfInteger[i] = Integer.valueOf(paramArrayOfInt[i]);
    }
    return arrayOfInteger;
  }

  public static short[] b(Short[] paramArrayOfShort)
  {
    if (paramArrayOfShort == null)
      return null;
    if (paramArrayOfShort.length == 0) {
      return eWl;
    }
    short[] arrayOfShort = new short[paramArrayOfShort.length];
    for (int i = 0; i < paramArrayOfShort.length; i++) {
      arrayOfShort[i] = paramArrayOfShort[i].shortValue();
    }
    return arrayOfShort;
  }

  public static short[] a(Short[] paramArrayOfShort, short paramShort)
  {
    if (paramArrayOfShort == null)
      return null;
    if (paramArrayOfShort.length == 0) {
      return eWl;
    }
    short[] arrayOfShort = new short[paramArrayOfShort.length];
    for (int i = 0; i < paramArrayOfShort.length; i++) {
      Short localShort = paramArrayOfShort[i];
      arrayOfShort[i] = (localShort == null ? paramShort : localShort.shortValue());
    }
    return arrayOfShort;
  }

  public static Short[] i(short[] paramArrayOfShort)
  {
    if (paramArrayOfShort == null)
      return null;
    if (paramArrayOfShort.length == 0) {
      return eWm;
    }
    Short[] arrayOfShort = new Short[paramArrayOfShort.length];
    for (int i = 0; i < paramArrayOfShort.length; i++) {
      arrayOfShort[i] = Short.valueOf(paramArrayOfShort[i]);
    }
    return arrayOfShort;
  }

  public static byte[] b(Byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return null;
    if (paramArrayOfByte.length == 0) {
      return EMPTY_BYTE_ARRAY;
    }
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      arrayOfByte[i] = paramArrayOfByte[i].byteValue();
    }
    return arrayOfByte;
  }

  public static byte[] a(Byte[] paramArrayOfByte, byte paramByte)
  {
    if (paramArrayOfByte == null)
      return null;
    if (paramArrayOfByte.length == 0) {
      return EMPTY_BYTE_ARRAY;
    }
    byte[] arrayOfByte = new byte[paramArrayOfByte.length];
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      Byte localByte = paramArrayOfByte[i];
      arrayOfByte[i] = (localByte == null ? paramByte : localByte.byteValue());
    }
    return arrayOfByte;
  }

  public static Byte[] R(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return null;
    if (paramArrayOfByte.length == 0) {
      return eWn;
    }
    Byte[] arrayOfByte = new Byte[paramArrayOfByte.length];
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      arrayOfByte[i] = Byte.valueOf(paramArrayOfByte[i]);
    }
    return arrayOfByte;
  }

  public static double[] b(Double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null)
      return null;
    if (paramArrayOfDouble.length == 0) {
      return eWo;
    }
    double[] arrayOfDouble = new double[paramArrayOfDouble.length];
    for (int i = 0; i < paramArrayOfDouble.length; i++) {
      arrayOfDouble[i] = paramArrayOfDouble[i].doubleValue();
    }
    return arrayOfDouble;
  }

  public static double[] a(Double[] paramArrayOfDouble, double paramDouble)
  {
    if (paramArrayOfDouble == null)
      return null;
    if (paramArrayOfDouble.length == 0) {
      return eWo;
    }
    double[] arrayOfDouble = new double[paramArrayOfDouble.length];
    for (int i = 0; i < paramArrayOfDouble.length; i++) {
      Double localDouble = paramArrayOfDouble[i];
      arrayOfDouble[i] = (localDouble == null ? paramDouble : localDouble.doubleValue());
    }
    return arrayOfDouble;
  }

  public static Double[] f(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null)
      return null;
    if (paramArrayOfDouble.length == 0) {
      return eWp;
    }
    Double[] arrayOfDouble = new Double[paramArrayOfDouble.length];
    for (int i = 0; i < paramArrayOfDouble.length; i++) {
      arrayOfDouble[i] = Double.valueOf(paramArrayOfDouble[i]);
    }
    return arrayOfDouble;
  }

  public static float[] b(Float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == null)
      return null;
    if (paramArrayOfFloat.length == 0) {
      return eWq;
    }
    float[] arrayOfFloat = new float[paramArrayOfFloat.length];
    for (int i = 0; i < paramArrayOfFloat.length; i++) {
      arrayOfFloat[i] = paramArrayOfFloat[i].floatValue();
    }
    return arrayOfFloat;
  }

  public static float[] a(Float[] paramArrayOfFloat, float paramFloat)
  {
    if (paramArrayOfFloat == null)
      return null;
    if (paramArrayOfFloat.length == 0) {
      return eWq;
    }
    float[] arrayOfFloat = new float[paramArrayOfFloat.length];
    for (int i = 0; i < paramArrayOfFloat.length; i++) {
      Float localFloat = paramArrayOfFloat[i];
      arrayOfFloat[i] = (localFloat == null ? paramFloat : localFloat.floatValue());
    }
    return arrayOfFloat;
  }

  public static Float[] q(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == null)
      return null;
    if (paramArrayOfFloat.length == 0) {
      return eWr;
    }
    Float[] arrayOfFloat = new Float[paramArrayOfFloat.length];
    for (int i = 0; i < paramArrayOfFloat.length; i++) {
      arrayOfFloat[i] = Float.valueOf(paramArrayOfFloat[i]);
    }
    return arrayOfFloat;
  }

  public static boolean[] b(Boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean == null)
      return null;
    if (paramArrayOfBoolean.length == 0) {
      return eWs;
    }
    boolean[] arrayOfBoolean = new boolean[paramArrayOfBoolean.length];
    for (int i = 0; i < paramArrayOfBoolean.length; i++) {
      arrayOfBoolean[i] = paramArrayOfBoolean[i].booleanValue();
    }
    return arrayOfBoolean;
  }

  public static boolean[] a(Boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    if (paramArrayOfBoolean == null)
      return null;
    if (paramArrayOfBoolean.length == 0) {
      return eWs;
    }
    boolean[] arrayOfBoolean = new boolean[paramArrayOfBoolean.length];
    for (int i = 0; i < paramArrayOfBoolean.length; i++) {
      Boolean localBoolean = paramArrayOfBoolean[i];
      arrayOfBoolean[i] = (localBoolean == null ? paramBoolean : localBoolean.booleanValue());
    }
    return arrayOfBoolean;
  }

  public static Boolean[] e(boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean == null)
      return null;
    if (paramArrayOfBoolean.length == 0) {
      return eWt;
    }
    Boolean[] arrayOfBoolean = new Boolean[paramArrayOfBoolean.length];
    for (int i = 0; i < paramArrayOfBoolean.length; i++) {
      arrayOfBoolean[i] = (paramArrayOfBoolean[i] != 0 ? Boolean.TRUE : Boolean.FALSE);
    }
    return arrayOfBoolean;
  }

  public static boolean n(Object[] paramArrayOfObject)
  {
    return (paramArrayOfObject == null) || (paramArrayOfObject.length == 0);
  }

  public static boolean i(long[] paramArrayOfLong)
  {
    return (paramArrayOfLong == null) || (paramArrayOfLong.length == 0);
  }

  public static boolean y(int[] paramArrayOfInt)
  {
    return (paramArrayOfInt == null) || (paramArrayOfInt.length == 0);
  }

  public static boolean j(short[] paramArrayOfShort)
  {
    return (paramArrayOfShort == null) || (paramArrayOfShort.length == 0);
  }

  public static boolean f(char[] paramArrayOfChar)
  {
    return (paramArrayOfChar == null) || (paramArrayOfChar.length == 0);
  }

  public static boolean S(byte[] paramArrayOfByte)
  {
    return (paramArrayOfByte == null) || (paramArrayOfByte.length == 0);
  }

  public static boolean g(double[] paramArrayOfDouble)
  {
    return (paramArrayOfDouble == null) || (paramArrayOfDouble.length == 0);
  }

  public static boolean r(float[] paramArrayOfFloat)
  {
    return (paramArrayOfFloat == null) || (paramArrayOfFloat.length == 0);
  }

  public static boolean f(boolean[] paramArrayOfBoolean)
  {
    return (paramArrayOfBoolean == null) || (paramArrayOfBoolean.length == 0);
  }

  public static boolean o(Object[] paramArrayOfObject)
  {
    return (paramArrayOfObject != null) && (paramArrayOfObject.length != 0);
  }

  public static boolean j(long[] paramArrayOfLong)
  {
    return (paramArrayOfLong != null) && (paramArrayOfLong.length != 0);
  }

  public static boolean z(int[] paramArrayOfInt)
  {
    return (paramArrayOfInt != null) && (paramArrayOfInt.length != 0);
  }

  public static boolean k(short[] paramArrayOfShort)
  {
    return (paramArrayOfShort != null) && (paramArrayOfShort.length != 0);
  }

  public static boolean g(char[] paramArrayOfChar)
  {
    return (paramArrayOfChar != null) && (paramArrayOfChar.length != 0);
  }

  public static boolean T(byte[] paramArrayOfByte)
  {
    return (paramArrayOfByte != null) && (paramArrayOfByte.length != 0);
  }

  public static boolean h(double[] paramArrayOfDouble)
  {
    return (paramArrayOfDouble != null) && (paramArrayOfDouble.length != 0);
  }

  public static boolean s(float[] paramArrayOfFloat)
  {
    return (paramArrayOfFloat != null) && (paramArrayOfFloat.length != 0);
  }

  public static boolean g(boolean[] paramArrayOfBoolean)
  {
    return (paramArrayOfBoolean != null) && (paramArrayOfBoolean.length != 0);
  }

  public static Object[] c(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    if (paramArrayOfObject1 == null)
      return k(paramArrayOfObject2);
    if (paramArrayOfObject2 == null) {
      return k(paramArrayOfObject1);
    }
    Class localClass1 = paramArrayOfObject1.getClass().getComponentType();

    Object[] arrayOfObject = (Object[])Array.newInstance(localClass1, paramArrayOfObject1.length + paramArrayOfObject2.length);
    System.arraycopy(paramArrayOfObject1, 0, arrayOfObject, 0, paramArrayOfObject1.length);
    try {
      System.arraycopy(paramArrayOfObject2, 0, arrayOfObject, paramArrayOfObject1.length, paramArrayOfObject2.length);
    }
    catch (ArrayStoreException localArrayStoreException)
    {
      Class localClass2 = paramArrayOfObject2.getClass().getComponentType();
      if (!localClass1.isAssignableFrom(localClass2)) {
        throw new IllegalArgumentException("Cannot store " + localClass2.getName() + " in an array of " + localClass1.getName(), localArrayStoreException);
      }

      throw localArrayStoreException;
    }
    return arrayOfObject;
  }

  public static boolean[] c(boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    if (paramArrayOfBoolean1 == null)
      return b(paramArrayOfBoolean2);
    if (paramArrayOfBoolean2 == null) {
      return b(paramArrayOfBoolean1);
    }
    boolean[] arrayOfBoolean = new boolean[paramArrayOfBoolean1.length + paramArrayOfBoolean2.length];
    System.arraycopy(paramArrayOfBoolean1, 0, arrayOfBoolean, 0, paramArrayOfBoolean1.length);
    System.arraycopy(paramArrayOfBoolean2, 0, arrayOfBoolean, paramArrayOfBoolean1.length, paramArrayOfBoolean2.length);
    return arrayOfBoolean;
  }

  public static char[] c(char[] paramArrayOfChar1, char[] paramArrayOfChar2)
  {
    if (paramArrayOfChar1 == null)
      return b(paramArrayOfChar2);
    if (paramArrayOfChar2 == null) {
      return b(paramArrayOfChar1);
    }
    char[] arrayOfChar = new char[paramArrayOfChar1.length + paramArrayOfChar2.length];
    System.arraycopy(paramArrayOfChar1, 0, arrayOfChar, 0, paramArrayOfChar1.length);
    System.arraycopy(paramArrayOfChar2, 0, arrayOfChar, paramArrayOfChar1.length, paramArrayOfChar2.length);
    return arrayOfChar;
  }

  public static byte[] d(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1 == null)
      return O(paramArrayOfByte2);
    if (paramArrayOfByte2 == null) {
      return O(paramArrayOfByte1);
    }
    byte[] arrayOfByte = new byte[paramArrayOfByte1.length + paramArrayOfByte2.length];
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 0, paramArrayOfByte1.length);
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, paramArrayOfByte1.length, paramArrayOfByte2.length);
    return arrayOfByte;
  }

  public static short[] c(short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    if (paramArrayOfShort1 == null)
      return f(paramArrayOfShort2);
    if (paramArrayOfShort2 == null) {
      return f(paramArrayOfShort1);
    }
    short[] arrayOfShort = new short[paramArrayOfShort1.length + paramArrayOfShort2.length];
    System.arraycopy(paramArrayOfShort1, 0, arrayOfShort, 0, paramArrayOfShort1.length);
    System.arraycopy(paramArrayOfShort2, 0, arrayOfShort, paramArrayOfShort1.length, paramArrayOfShort2.length);
    return arrayOfShort;
  }

  public static int[] c(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if (paramArrayOfInt1 == null)
      return u(paramArrayOfInt2);
    if (paramArrayOfInt2 == null) {
      return u(paramArrayOfInt1);
    }
    int[] arrayOfInt = new int[paramArrayOfInt1.length + paramArrayOfInt2.length];
    System.arraycopy(paramArrayOfInt1, 0, arrayOfInt, 0, paramArrayOfInt1.length);
    System.arraycopy(paramArrayOfInt2, 0, arrayOfInt, paramArrayOfInt1.length, paramArrayOfInt2.length);
    return arrayOfInt;
  }

  public static long[] c(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    if (paramArrayOfLong1 == null)
      return e(paramArrayOfLong2);
    if (paramArrayOfLong2 == null) {
      return e(paramArrayOfLong1);
    }
    long[] arrayOfLong = new long[paramArrayOfLong1.length + paramArrayOfLong2.length];
    System.arraycopy(paramArrayOfLong1, 0, arrayOfLong, 0, paramArrayOfLong1.length);
    System.arraycopy(paramArrayOfLong2, 0, arrayOfLong, paramArrayOfLong1.length, paramArrayOfLong2.length);
    return arrayOfLong;
  }

  public static float[] c(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    if (paramArrayOfFloat1 == null)
      return n(paramArrayOfFloat2);
    if (paramArrayOfFloat2 == null) {
      return n(paramArrayOfFloat1);
    }
    float[] arrayOfFloat = new float[paramArrayOfFloat1.length + paramArrayOfFloat2.length];
    System.arraycopy(paramArrayOfFloat1, 0, arrayOfFloat, 0, paramArrayOfFloat1.length);
    System.arraycopy(paramArrayOfFloat2, 0, arrayOfFloat, paramArrayOfFloat1.length, paramArrayOfFloat2.length);
    return arrayOfFloat;
  }

  public static double[] c(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    if (paramArrayOfDouble1 == null)
      return c(paramArrayOfDouble2);
    if (paramArrayOfDouble2 == null) {
      return c(paramArrayOfDouble1);
    }
    double[] arrayOfDouble = new double[paramArrayOfDouble1.length + paramArrayOfDouble2.length];
    System.arraycopy(paramArrayOfDouble1, 0, arrayOfDouble, 0, paramArrayOfDouble1.length);
    System.arraycopy(paramArrayOfDouble2, 0, arrayOfDouble, paramArrayOfDouble1.length, paramArrayOfDouble2.length);
    return arrayOfDouble;
  }

  public static Object[] d(Object[] paramArrayOfObject, Object paramObject)
  {
    Class localClass;
    if (paramArrayOfObject != null)
      localClass = paramArrayOfObject.getClass();
    else if (paramObject != null)
      localClass = paramObject.getClass();
    else {
      throw new IllegalArgumentException("Arguments cannot both be null");
    }

    Object[] arrayOfObject = (Object[])b(paramArrayOfObject, localClass);
    arrayOfObject[(arrayOfObject.length - 1)] = paramObject;
    return arrayOfObject;
  }

  public static boolean[] d(boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    boolean[] arrayOfBoolean = (boolean[])b(paramArrayOfBoolean, Boolean.TYPE);
    arrayOfBoolean[(arrayOfBoolean.length - 1)] = paramBoolean;
    return arrayOfBoolean;
  }

  public static byte[] d(byte[] paramArrayOfByte, byte paramByte)
  {
    byte[] arrayOfByte = (byte[])b(paramArrayOfByte, Byte.TYPE);
    arrayOfByte[(arrayOfByte.length - 1)] = paramByte;
    return arrayOfByte;
  }

  public static char[] d(char[] paramArrayOfChar, char paramChar)
  {
    char[] arrayOfChar = (char[])b(paramArrayOfChar, Character.TYPE);
    arrayOfChar[(arrayOfChar.length - 1)] = paramChar;
    return arrayOfChar;
  }

  public static double[] d(double[] paramArrayOfDouble, double paramDouble)
  {
    double[] arrayOfDouble = (double[])b(paramArrayOfDouble, Double.TYPE);
    arrayOfDouble[(arrayOfDouble.length - 1)] = paramDouble;
    return arrayOfDouble;
  }

  public static float[] i(float[] paramArrayOfFloat, float paramFloat)
  {
    float[] arrayOfFloat = (float[])b(paramArrayOfFloat, Float.TYPE);
    arrayOfFloat[(arrayOfFloat.length - 1)] = paramFloat;
    return arrayOfFloat;
  }

  public static int[] i(int[] paramArrayOfInt, int paramInt)
  {
    int[] arrayOfInt = (int[])b(paramArrayOfInt, Integer.TYPE);
    arrayOfInt[(arrayOfInt.length - 1)] = paramInt;
    return arrayOfInt;
  }

  public static long[] d(long[] paramArrayOfLong, long paramLong)
  {
    long[] arrayOfLong = (long[])b(paramArrayOfLong, Long.TYPE);
    arrayOfLong[(arrayOfLong.length - 1)] = paramLong;
    return arrayOfLong;
  }

  public static short[] d(short[] paramArrayOfShort, short paramShort)
  {
    short[] arrayOfShort = (short[])b(paramArrayOfShort, Short.TYPE);
    arrayOfShort[(arrayOfShort.length - 1)] = paramShort;
    return arrayOfShort;
  }

  private static Object b(Object paramObject, Class paramClass)
  {
    if (paramObject != null) {
      int i = Array.getLength(paramObject);
      Object localObject = Array.newInstance(paramObject.getClass().getComponentType(), i + 1);
      System.arraycopy(paramObject, 0, localObject, 0, i);
      return localObject;
    }
    return Array.newInstance(paramClass, 1);
  }

  public static Object[] a(Object[] paramArrayOfObject, int paramInt, Object paramObject)
  {
    Class localClass = null;
    if (paramArrayOfObject != null)
      localClass = paramArrayOfObject.getClass().getComponentType();
    else if (paramObject != null)
      localClass = paramObject.getClass();
    else {
      throw new IllegalArgumentException("Array and element cannot both be null");
    }

    Object[] arrayOfObject = (Object[])a(paramArrayOfObject, paramInt, paramObject, localClass);
    return arrayOfObject;
  }

  public static boolean[] a(boolean[] paramArrayOfBoolean, int paramInt, boolean paramBoolean)
  {
    return (boolean[])a(paramArrayOfBoolean, paramInt, Boolean.valueOf(paramBoolean), Boolean.TYPE);
  }

  public static char[] a(char[] paramArrayOfChar, int paramInt, char paramChar)
  {
    return (char[])a(paramArrayOfChar, paramInt, Character.valueOf(paramChar), Character.TYPE);
  }

  public static byte[] b(byte[] paramArrayOfByte, int paramInt, byte paramByte)
  {
    return (byte[])a(paramArrayOfByte, paramInt, Byte.valueOf(paramByte), Byte.TYPE);
  }

  public static short[] a(short[] paramArrayOfShort, int paramInt, short paramShort)
  {
    return (short[])a(paramArrayOfShort, paramInt, Short.valueOf(paramShort), Short.TYPE);
  }

  public static int[] e(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    return (int[])a(paramArrayOfInt, paramInt1, Integer.valueOf(paramInt2), Integer.TYPE);
  }

  public static long[] a(long[] paramArrayOfLong, int paramInt, long paramLong)
  {
    return (long[])a(paramArrayOfLong, paramInt, Long.valueOf(paramLong), Long.TYPE);
  }

  public static float[] a(float[] paramArrayOfFloat, int paramInt, float paramFloat)
  {
    return (float[])a(paramArrayOfFloat, paramInt, Float.valueOf(paramFloat), Float.TYPE);
  }

  public static double[] a(double[] paramArrayOfDouble, int paramInt, double paramDouble)
  {
    return (double[])a(paramArrayOfDouble, paramInt, Double.valueOf(paramDouble), Double.TYPE);
  }

  private static Object a(Object paramObject1, int paramInt, Object paramObject2, Class paramClass)
  {
    if (paramObject1 == null) {
      if (paramInt != 0) {
        throw new IndexOutOfBoundsException("Index: " + paramInt + ", Length: 0");
      }
      Object localObject1 = Array.newInstance(paramClass, 1);
      Array.set(localObject1, 0, paramObject2);
      return localObject1;
    }
    int i = Array.getLength(paramObject1);
    if ((paramInt > i) || (paramInt < 0)) {
      throw new IndexOutOfBoundsException("Index: " + paramInt + ", Length: " + i);
    }
    Object localObject2 = Array.newInstance(paramClass, i + 1);
    System.arraycopy(paramObject1, 0, localObject2, 0, paramInt);
    Array.set(localObject2, paramInt, paramObject2);
    if (paramInt < i) {
      System.arraycopy(paramObject1, paramInt, localObject2, paramInt + 1, i - paramInt);
    }
    return localObject2;
  }

  public static Object[] b(Object[] paramArrayOfObject, int paramInt)
  {
    return (Object[])b(paramArrayOfObject, paramInt);
  }

  public static Object[] e(Object[] paramArrayOfObject, Object paramObject)
  {
    int i = a(paramArrayOfObject, paramObject);
    if (i == -1) {
      return k(paramArrayOfObject);
    }
    return b(paramArrayOfObject, i);
  }

  public static boolean[] a(boolean[] paramArrayOfBoolean, int paramInt)
  {
    return (boolean[])b(paramArrayOfBoolean, paramInt);
  }

  public static boolean[] e(boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    int i = a(paramArrayOfBoolean, paramBoolean);
    if (i == -1) {
      return b(paramArrayOfBoolean);
    }
    return a(paramArrayOfBoolean, i);
  }

  public static byte[] e(byte[] paramArrayOfByte, int paramInt)
  {
    return (byte[])b(paramArrayOfByte, paramInt);
  }

  public static byte[] e(byte[] paramArrayOfByte, byte paramByte)
  {
    int i = a(paramArrayOfByte, paramByte);
    if (i == -1) {
      return O(paramArrayOfByte);
    }
    return e(paramArrayOfByte, i);
  }

  public static char[] a(char[] paramArrayOfChar, int paramInt)
  {
    return (char[])b(paramArrayOfChar, paramInt);
  }

  public static char[] e(char[] paramArrayOfChar, char paramChar)
  {
    int i = a(paramArrayOfChar, paramChar);
    if (i == -1) {
      return b(paramArrayOfChar);
    }
    return a(paramArrayOfChar, i);
  }

  public static double[] a(double[] paramArrayOfDouble, int paramInt)
  {
    return (double[])b(paramArrayOfDouble, paramInt);
  }

  public static double[] e(double[] paramArrayOfDouble, double paramDouble)
  {
    int i = a(paramArrayOfDouble, paramDouble);
    if (i == -1) {
      return c(paramArrayOfDouble);
    }
    return a(paramArrayOfDouble, i);
  }

  public static float[] b(float[] paramArrayOfFloat, int paramInt)
  {
    return (float[])b(paramArrayOfFloat, paramInt);
  }

  public static float[] j(float[] paramArrayOfFloat, float paramFloat)
  {
    int i = f(paramArrayOfFloat, paramFloat);
    if (i == -1) {
      return n(paramArrayOfFloat);
    }
    return b(paramArrayOfFloat, i);
  }

  public static int[] j(int[] paramArrayOfInt, int paramInt)
  {
    return (int[])b(paramArrayOfInt, paramInt);
  }

  public static int[] k(int[] paramArrayOfInt, int paramInt)
  {
    int i = g(paramArrayOfInt, paramInt);
    if (i == -1) {
      return u(paramArrayOfInt);
    }
    return j(paramArrayOfInt, i);
  }

  public static long[] a(long[] paramArrayOfLong, int paramInt)
  {
    return (long[])b(paramArrayOfLong, paramInt);
  }

  public static long[] e(long[] paramArrayOfLong, long paramLong)
  {
    int i = a(paramArrayOfLong, paramLong);
    if (i == -1) {
      return e(paramArrayOfLong);
    }
    return a(paramArrayOfLong, i);
  }

  public static short[] a(short[] paramArrayOfShort, int paramInt)
  {
    return (short[])b(paramArrayOfShort, paramInt);
  }

  public static short[] e(short[] paramArrayOfShort, short paramShort)
  {
    int i = a(paramArrayOfShort, paramShort);
    if (i == -1) {
      return f(paramArrayOfShort);
    }
    return a(paramArrayOfShort, i);
  }

  private static Object b(Object paramObject, int paramInt)
  {
    int i = getLength(paramObject);
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new IndexOutOfBoundsException("Index: " + paramInt + ", Length: " + i);
    }

    Object localObject = Array.newInstance(paramObject.getClass().getComponentType(), i - 1);
    System.arraycopy(paramObject, 0, localObject, 0, paramInt);
    if (paramInt < i - 1) {
      System.arraycopy(paramObject, paramInt + 1, localObject, paramInt, i - paramInt - 1);
    }

    return localObject;
  }

  public static Object[] a(Object[] paramArrayOfObject, int[] paramArrayOfInt)
  {
    return (Object[])a(paramArrayOfObject, u(paramArrayOfInt));
  }

  public static Object[] d(Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    if ((n(paramArrayOfObject1)) || (n(paramArrayOfObject2))) {
      return k(paramArrayOfObject1);
    }
    HashMap localHashMap = new HashMap(paramArrayOfObject2.length);
    Object localObject2;
    for (localObject2 : paramArrayOfObject2) {
      dVB localdVB = (dVB)localHashMap.get(localObject2);
      if (localdVB == null)
        localHashMap.put(localObject2, new dVB(1));
      else {
        localdVB.dvt();
      }
    }
    ??? = new HashSet();
    for (Map.Entry localEntry : localHashMap.entrySet()) {
      localObject2 = localEntry.getKey();
      int k = 0;
      int m = 0; for (int n = ((dVB)localEntry.getValue()).intValue(); m < n; m++) {
        k = a(paramArrayOfObject1, localObject2, k);
        if (k < 0) {
          break;
        }
        ((HashSet)???).add(Integer.valueOf(k++));
      }
    }
    return a(paramArrayOfObject1, b((HashSet)???));
  }

  public static byte[] a(byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    return (byte[])a(paramArrayOfByte, u(paramArrayOfInt));
  }

  public static byte[] e(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if ((S(paramArrayOfByte1)) || (S(paramArrayOfByte2))) {
      return O(paramArrayOfByte1);
    }
    HashMap localHashMap = new HashMap(paramArrayOfByte2.length);
    for (byte b : paramArrayOfByte2) {
      Byte localByte2 = Byte.valueOf(b);
      dVB localdVB = (dVB)localHashMap.get(localByte2);
      if (localdVB == null)
        localHashMap.put(localByte2, new dVB(1));
      else {
        localdVB.dvt();
      }
    }
    ??? = new HashSet();
    for (Map.Entry localEntry : localHashMap.entrySet()) {
      Byte localByte1 = (Byte)localEntry.getKey();
      int k = 0;
      int m = 0; for (int n = ((dVB)localEntry.getValue()).intValue(); m < n; m++) {
        k = a(paramArrayOfByte1, localByte1.byteValue(), k);
        if (k < 0) {
          break;
        }
        ((HashSet)???).add(Integer.valueOf(k++));
      }
    }
    return a(paramArrayOfByte1, b((HashSet)???));
  }

  public static short[] a(short[] paramArrayOfShort, int[] paramArrayOfInt)
  {
    return (short[])a(paramArrayOfShort, u(paramArrayOfInt));
  }

  public static short[] d(short[] paramArrayOfShort1, short[] paramArrayOfShort2)
  {
    if ((j(paramArrayOfShort1)) || (j(paramArrayOfShort2))) {
      return f(paramArrayOfShort1);
    }
    HashMap localHashMap = new HashMap(paramArrayOfShort2.length);
    for (short s : paramArrayOfShort2) {
      Short localShort2 = Short.valueOf(s);
      dVB localdVB = (dVB)localHashMap.get(localShort2);
      if (localdVB == null)
        localHashMap.put(localShort2, new dVB(1));
      else {
        localdVB.dvt();
      }
    }
    ??? = new HashSet();
    for (Map.Entry localEntry : localHashMap.entrySet()) {
      Short localShort1 = (Short)localEntry.getKey();
      int k = 0;
      int m = 0; for (int n = ((dVB)localEntry.getValue()).intValue(); m < n; m++) {
        k = a(paramArrayOfShort1, localShort1.shortValue(), k);
        if (k < 0) {
          break;
        }
        ((HashSet)???).add(Integer.valueOf(k++));
      }
    }
    return a(paramArrayOfShort1, b((HashSet)???));
  }

  public static int[] d(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return (int[])a(paramArrayOfInt1, u(paramArrayOfInt2));
  }

  public static int[] e(int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    if ((y(paramArrayOfInt1)) || (y(paramArrayOfInt2))) {
      return u(paramArrayOfInt1);
    }
    HashMap localHashMap = new HashMap(paramArrayOfInt2.length);
    for (int k : paramArrayOfInt2) {
      Integer localInteger2 = Integer.valueOf(k);
      dVB localdVB = (dVB)localHashMap.get(localInteger2);
      if (localdVB == null)
        localHashMap.put(localInteger2, new dVB(1));
      else {
        localdVB.dvt();
      }
    }
    ??? = new HashSet();
    for (Map.Entry localEntry : localHashMap.entrySet()) {
      Integer localInteger1 = (Integer)localEntry.getKey();
      int m = 0;
      int n = 0; for (int i1 = ((dVB)localEntry.getValue()).intValue(); n < i1; n++) {
        m = c(paramArrayOfInt1, localInteger1.intValue(), m);
        if (m < 0) {
          break;
        }
        ((HashSet)???).add(Integer.valueOf(m++));
      }
    }
    return d(paramArrayOfInt1, b((HashSet)???));
  }

  public static char[] a(char[] paramArrayOfChar, int[] paramArrayOfInt)
  {
    return (char[])a(paramArrayOfChar, u(paramArrayOfInt));
  }

  public static char[] d(char[] paramArrayOfChar1, char[] paramArrayOfChar2)
  {
    if ((f(paramArrayOfChar1)) || (f(paramArrayOfChar2))) {
      return b(paramArrayOfChar1);
    }
    HashMap localHashMap = new HashMap(paramArrayOfChar2.length);
    for (char c : paramArrayOfChar2) {
      Character localCharacter2 = Character.valueOf(c);
      dVB localdVB = (dVB)localHashMap.get(localCharacter2);
      if (localdVB == null)
        localHashMap.put(localCharacter2, new dVB(1));
      else {
        localdVB.dvt();
      }
    }
    ??? = new HashSet();
    for (Map.Entry localEntry : localHashMap.entrySet()) {
      Character localCharacter1 = (Character)localEntry.getKey();
      int k = 0;
      int m = 0; for (int n = ((dVB)localEntry.getValue()).intValue(); m < n; m++) {
        k = a(paramArrayOfChar1, localCharacter1.charValue(), k);
        if (k < 0) {
          break;
        }
        ((HashSet)???).add(Integer.valueOf(k++));
      }
    }
    return a(paramArrayOfChar1, b((HashSet)???));
  }

  public static long[] a(long[] paramArrayOfLong, int[] paramArrayOfInt)
  {
    return (long[])a(paramArrayOfLong, u(paramArrayOfInt));
  }

  public static long[] d(long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    if ((i(paramArrayOfLong1)) || (i(paramArrayOfLong2))) {
      return e(paramArrayOfLong1);
    }
    HashMap localHashMap = new HashMap(paramArrayOfLong2.length);
    for (long l : paramArrayOfLong2) {
      Long localLong2 = Long.valueOf(l);
      dVB localdVB = (dVB)localHashMap.get(localLong2);
      if (localdVB == null)
        localHashMap.put(localLong2, new dVB(1));
      else {
        localdVB.dvt();
      }
    }
    ??? = new HashSet();
    for (Map.Entry localEntry : localHashMap.entrySet()) {
      Long localLong1 = (Long)localEntry.getKey();
      int k = 0;
      int m = 0; for (int n = ((dVB)localEntry.getValue()).intValue(); m < n; m++) {
        k = a(paramArrayOfLong1, localLong1.longValue(), k);
        if (k < 0) {
          break;
        }
        ((HashSet)???).add(Integer.valueOf(k++));
      }
    }
    return a(paramArrayOfLong1, b((HashSet)???));
  }

  public static float[] a(float[] paramArrayOfFloat, int[] paramArrayOfInt)
  {
    return (float[])a(paramArrayOfFloat, u(paramArrayOfInt));
  }

  public static float[] d(float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    if ((r(paramArrayOfFloat1)) || (r(paramArrayOfFloat2))) {
      return n(paramArrayOfFloat1);
    }
    HashMap localHashMap = new HashMap(paramArrayOfFloat2.length);
    for (float f : paramArrayOfFloat2) {
      Float localFloat2 = Float.valueOf(f);
      dVB localdVB = (dVB)localHashMap.get(localFloat2);
      if (localdVB == null)
        localHashMap.put(localFloat2, new dVB(1));
      else {
        localdVB.dvt();
      }
    }
    ??? = new HashSet();
    for (Map.Entry localEntry : localHashMap.entrySet()) {
      Float localFloat1 = (Float)localEntry.getKey();
      int k = 0;
      int m = 0; for (int n = ((dVB)localEntry.getValue()).intValue(); m < n; m++) {
        k = a(paramArrayOfFloat1, localFloat1.floatValue(), k);
        if (k < 0) {
          break;
        }
        ((HashSet)???).add(Integer.valueOf(k++));
      }
    }
    return a(paramArrayOfFloat1, b((HashSet)???));
  }

  public static double[] a(double[] paramArrayOfDouble, int[] paramArrayOfInt)
  {
    return (double[])a(paramArrayOfDouble, u(paramArrayOfInt));
  }

  public static double[] d(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    if ((g(paramArrayOfDouble1)) || (g(paramArrayOfDouble2))) {
      return c(paramArrayOfDouble1);
    }
    HashMap localHashMap = new HashMap(paramArrayOfDouble2.length);
    for (double d : paramArrayOfDouble2) {
      Double localDouble2 = Double.valueOf(d);
      dVB localdVB = (dVB)localHashMap.get(localDouble2);
      if (localdVB == null)
        localHashMap.put(localDouble2, new dVB(1));
      else {
        localdVB.dvt();
      }
    }
    ??? = new HashSet();
    for (Map.Entry localEntry : localHashMap.entrySet()) {
      Double localDouble1 = (Double)localEntry.getKey();
      int k = 0;
      int m = 0; for (int n = ((dVB)localEntry.getValue()).intValue(); m < n; m++) {
        k = a(paramArrayOfDouble1, localDouble1.doubleValue(), k);
        if (k < 0) {
          break;
        }
        ((HashSet)???).add(Integer.valueOf(k++));
      }
    }
    return a(paramArrayOfDouble1, b((HashSet)???));
  }

  public static boolean[] a(boolean[] paramArrayOfBoolean, int[] paramArrayOfInt)
  {
    return (boolean[])a(paramArrayOfBoolean, u(paramArrayOfInt));
  }

  public static boolean[] d(boolean[] paramArrayOfBoolean1, boolean[] paramArrayOfBoolean2)
  {
    if ((f(paramArrayOfBoolean1)) || (f(paramArrayOfBoolean2))) {
      return b(paramArrayOfBoolean1);
    }
    HashMap localHashMap = new HashMap(paramArrayOfBoolean2.length);
    for (int k : paramArrayOfBoolean2) {
      Boolean localBoolean2 = Boolean.valueOf(k);
      dVB localdVB = (dVB)localHashMap.get(localBoolean2);
      if (localdVB == null)
        localHashMap.put(localBoolean2, new dVB(1));
      else {
        localdVB.dvt();
      }
    }
    ??? = new HashSet();
    for (Map.Entry localEntry : localHashMap.entrySet()) {
      Boolean localBoolean1 = (Boolean)localEntry.getKey();
      int m = 0;
      int n = 0; for (int i1 = ((dVB)localEntry.getValue()).intValue(); n < i1; n++) {
        m = a(paramArrayOfBoolean1, localBoolean1.booleanValue(), m);
        if (m < 0) {
          break;
        }
        ((HashSet)???).add(Integer.valueOf(m++));
      }
    }
    return a(paramArrayOfBoolean1, b((HashSet)???));
  }

  private static Object a(Object paramObject, int[] paramArrayOfInt)
  {
    int i = getLength(paramObject);
    int j = 0;
    int m;
    int n;
    if (z(paramArrayOfInt)) {
      Arrays.sort(paramArrayOfInt);

      int k = paramArrayOfInt.length;
      m = i;
      while (true) { k--; if (k < 0) break;
        n = paramArrayOfInt[k];
        if ((n < 0) || (n >= i)) {
          throw new IndexOutOfBoundsException("Index: " + n + ", Length: " + i);
        }
        if (n < m)
        {
          j++;
          m = n;
        } }
    }
    Object localObject = Array.newInstance(paramObject.getClass().getComponentType(), i - j);
    if (j < i) {
      m = i;
      n = i - j;
      for (int i1 = paramArrayOfInt.length - 1; i1 >= 0; i1--) {
        int i2 = paramArrayOfInt[i1];
        if (m - i2 > 1) {
          int i3 = m - i2 - 1;
          n -= i3;
          System.arraycopy(paramObject, i2 + 1, localObject, n, i3);
        }
        m = i2;
      }
      if (m > 0) {
        System.arraycopy(paramObject, 0, localObject, 0, m);
      }
    }
    return localObject;
  }

  private static int[] b(HashSet paramHashSet)
  {
    int[] arrayOfInt = new int[paramHashSet.size()];
    int i = 0;
    for (Integer localInteger : paramHashSet) {
      arrayOfInt[(i++)] = localInteger.intValue();
    }
    return arrayOfInt;
  }
}