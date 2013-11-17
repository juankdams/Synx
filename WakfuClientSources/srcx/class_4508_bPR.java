public class bPR
{
  public static final boolean[] eWs = new boolean[0];

  public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

  public static final char[] eWu = new char[0];

  public static final double[] eWo = new double[0];

  public static final float[] eWq = new float[0];

  public static final int[] eWj = new int[0];

  public static final long[] eWh = new long[0];

  public static final short[] eWl = new short[0];

  static final Boolean[] eWt = new Boolean[0];

  static final Byte[] eWn = new Byte[0];

  static final Character[] eWv = new Character[0];

  static final Double[] eWp = new Double[0];

  static final Float[] eWr = new Float[0];

  static final Integer[] eWk = new Integer[0];

  static final Long[] eWi = new Long[0];

  static final Short[] eWm = new Short[0];

  public static Boolean[] e(boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean == null) {
      return null;
    }
    int i = paramArrayOfBoolean.length;
    if (i == 0) {
      return eWt;
    }
    Boolean[] arrayOfBoolean = new Boolean[i];
    for (int j = 0; j < i; j++) {
      arrayOfBoolean[j] = Boolean.valueOf(paramArrayOfBoolean[j]);
    }
    return arrayOfBoolean;
  }

  public static Byte[] R(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    int i = paramArrayOfByte.length;
    if (i == 0) {
      return eWn;
    }
    Byte[] arrayOfByte = new Byte[i];
    for (int j = 0; j < i; j++) {
      arrayOfByte[j] = Byte.valueOf(paramArrayOfByte[j]);
    }
    return arrayOfByte;
  }

  public static Character[] e(char[] paramArrayOfChar)
  {
    if (paramArrayOfChar == null) {
      return null;
    }
    int i = paramArrayOfChar.length;
    if (i == 0) {
      return eWv;
    }
    Character[] arrayOfCharacter = new Character[i];
    for (int j = 0; j < i; j++) {
      arrayOfCharacter[j] = Character.valueOf(paramArrayOfChar[j]);
    }
    return arrayOfCharacter;
  }

  public static Double[] f(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null) {
      return null;
    }
    int i = paramArrayOfDouble.length;
    if (i == 0) {
      return eWp;
    }
    Double[] arrayOfDouble = new Double[i];
    for (int j = 0; j < i; j++) {
      arrayOfDouble[j] = Double.valueOf(paramArrayOfDouble[j]);
    }
    return arrayOfDouble;
  }

  public static Float[] q(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == null) {
      return null;
    }
    int i = paramArrayOfFloat.length;
    if (i == 0) {
      return eWr;
    }
    Float[] arrayOfFloat = new Float[i];
    for (int j = 0; j < i; j++) {
      arrayOfFloat[j] = Float.valueOf(paramArrayOfFloat[j]);
    }
    return arrayOfFloat;
  }

  public static Integer[] x(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {
      return null;
    }
    int i = paramArrayOfInt.length;
    if (i == 0) {
      return eWk;
    }
    Integer[] arrayOfInteger = new Integer[i];
    for (int j = 0; j < i; j++) {
      arrayOfInteger[j] = Integer.valueOf(paramArrayOfInt[j]);
    }
    return arrayOfInteger;
  }

  public static Long[] h(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null) {
      return null;
    }
    int i = paramArrayOfLong.length;
    if (i == 0) {
      return eWi;
    }
    Long[] arrayOfLong = new Long[i];
    for (int j = 0; j < i; j++) {
      arrayOfLong[j] = Long.valueOf(paramArrayOfLong[j]);
    }
    return arrayOfLong;
  }

  public static Short[] i(short[] paramArrayOfShort)
  {
    if (paramArrayOfShort == null) {
      return null;
    }
    int i = paramArrayOfShort.length;
    if (i == 0) {
      return eWm;
    }
    Short[] arrayOfShort = new Short[i];
    for (int j = 0; j < i; j++) {
      arrayOfShort[j] = Short.valueOf(paramArrayOfShort[j]);
    }
    return arrayOfShort;
  }

  public static boolean[] b(Boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean == null) {
      return null;
    }
    int i = paramArrayOfBoolean.length;
    if (i == 0) {
      return eWs;
    }
    boolean[] arrayOfBoolean = new boolean[i];
    for (int j = 0; j < i; j++) {
      Boolean localBoolean = paramArrayOfBoolean[j];
      if (localBoolean == null) {
        throw new IllegalArgumentException("array element is null.");
      }
      arrayOfBoolean[j] = localBoolean.booleanValue();
    }
    return arrayOfBoolean;
  }

  public static byte[] b(Byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    int i = paramArrayOfByte.length;
    if (i == 0) {
      return EMPTY_BYTE_ARRAY;
    }
    byte[] arrayOfByte = new byte[i];
    for (int j = 0; j < i; j++) {
      Byte localByte = paramArrayOfByte[j];
      if (localByte == null) {
        throw new IllegalArgumentException("array element is null.");
      }
      arrayOfByte[j] = localByte.byteValue();
    }
    return arrayOfByte;
  }

  public static char[] b(Character[] paramArrayOfCharacter)
  {
    if (paramArrayOfCharacter == null) {
      return null;
    }
    int i = paramArrayOfCharacter.length;
    if (i == 0) {
      return eWu;
    }
    char[] arrayOfChar = new char[i];
    for (int j = 0; j < i; j++) {
      Character localCharacter = paramArrayOfCharacter[j];
      if (localCharacter == null) {
        throw new IllegalArgumentException("array element is null.");
      }
      arrayOfChar[j] = localCharacter.charValue();
    }
    return arrayOfChar;
  }

  public static double[] b(Double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble == null) {
      return null;
    }
    int i = paramArrayOfDouble.length;
    if (i == 0) {
      return eWo;
    }
    double[] arrayOfDouble = new double[i];
    for (int j = 0; j < i; j++) {
      Double localDouble = paramArrayOfDouble[j];
      if (localDouble == null) {
        throw new IllegalArgumentException("array element is null.");
      }
      arrayOfDouble[j] = localDouble.doubleValue();
    }
    return arrayOfDouble;
  }

  public static float[] b(Float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat == null) {
      return null;
    }
    int i = paramArrayOfFloat.length;
    if (i == 0) {
      return eWq;
    }
    float[] arrayOfFloat = new float[i];
    for (int j = 0; j < i; j++) {
      Float localFloat = paramArrayOfFloat[j];
      if (localFloat == null) {
        throw new IllegalArgumentException("array element is null.");
      }
      arrayOfFloat[j] = localFloat.floatValue();
    }
    return arrayOfFloat;
  }

  public static int[] b(Integer[] paramArrayOfInteger)
  {
    if (paramArrayOfInteger == null) {
      return null;
    }
    int i = paramArrayOfInteger.length;
    if (i == 0) {
      return eWj;
    }
    int[] arrayOfInt = new int[i];
    for (int j = 0; j < i; j++) {
      Integer localInteger = paramArrayOfInteger[j];
      if (localInteger == null) {
        throw new IllegalArgumentException("array element is null.");
      }
      arrayOfInt[j] = localInteger.intValue();
    }
    return arrayOfInt;
  }

  public static long[] b(Long[] paramArrayOfLong)
  {
    if (paramArrayOfLong == null) {
      return null;
    }
    int i = paramArrayOfLong.length;
    if (i == 0) {
      return eWh;
    }
    long[] arrayOfLong = new long[i];
    for (int j = 0; j < i; j++) {
      Long localLong = paramArrayOfLong[j];
      if (localLong == null) {
        throw new IllegalArgumentException("array element is null.");
      }
      arrayOfLong[j] = localLong.longValue();
    }
    return arrayOfLong;
  }

  public static short[] b(Short[] paramArrayOfShort)
  {
    if (paramArrayOfShort == null) {
      return null;
    }
    int i = paramArrayOfShort.length;
    if (i == 0) {
      return eWl;
    }
    short[] arrayOfShort = new short[i];
    for (int j = 0; j < i; j++) {
      Short localShort = paramArrayOfShort[j];
      if (localShort == null) {
        throw new IllegalArgumentException("array element is null.");
      }
      arrayOfShort[j] = localShort.shortValue();
    }
    return arrayOfShort;
  }

  public static boolean[] a(Boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    if (paramArrayOfBoolean == null) {
      return null;
    }
    int i = paramArrayOfBoolean.length;
    if (i == 0) {
      return eWs;
    }
    boolean[] arrayOfBoolean = new boolean[i];
    for (int j = 0; j < i; j++) {
      Boolean localBoolean = paramArrayOfBoolean[j];
      arrayOfBoolean[j] = (localBoolean == null ? paramBoolean : localBoolean.booleanValue());
    }
    return arrayOfBoolean;
  }

  public static byte[] a(Byte[] paramArrayOfByte, byte paramByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    int i = paramArrayOfByte.length;
    if (i == 0) {
      return EMPTY_BYTE_ARRAY;
    }
    byte[] arrayOfByte = new byte[i];
    for (int j = 0; j < i; j++) {
      Byte localByte = paramArrayOfByte[j];
      arrayOfByte[j] = (localByte == null ? paramByte : localByte.byteValue());
    }
    return arrayOfByte;
  }

  public static char[] a(Character[] paramArrayOfCharacter, char paramChar)
  {
    if (paramArrayOfCharacter == null) {
      return null;
    }
    int i = paramArrayOfCharacter.length;
    if (i == 0) {
      return eWu;
    }
    char[] arrayOfChar = new char[i];
    for (int j = 0; j < i; j++) {
      Character localCharacter = paramArrayOfCharacter[j];
      arrayOfChar[j] = (localCharacter == null ? paramChar : localCharacter.charValue());
    }
    return arrayOfChar;
  }

  public static double[] a(Double[] paramArrayOfDouble, double paramDouble)
  {
    if (paramArrayOfDouble == null) {
      return null;
    }
    int i = paramArrayOfDouble.length;
    if (i == 0) {
      return eWo;
    }
    double[] arrayOfDouble = new double[i];
    for (int j = 0; j < i; j++) {
      Double localDouble = paramArrayOfDouble[j];
      arrayOfDouble[j] = (localDouble == null ? paramDouble : localDouble.doubleValue());
    }
    return arrayOfDouble;
  }

  public static float[] a(Float[] paramArrayOfFloat, float paramFloat)
  {
    if (paramArrayOfFloat == null) {
      return null;
    }
    int i = paramArrayOfFloat.length;
    if (i == 0) {
      return eWq;
    }
    float[] arrayOfFloat = new float[i];
    for (int j = 0; j < i; j++) {
      Float localFloat = paramArrayOfFloat[j];
      arrayOfFloat[j] = (localFloat == null ? paramFloat : localFloat.floatValue());
    }
    return arrayOfFloat;
  }

  public static int[] a(Integer[] paramArrayOfInteger, int paramInt)
  {
    if (paramArrayOfInteger == null) {
      return null;
    }
    int i = paramArrayOfInteger.length;
    if (i == 0) {
      return eWj;
    }
    int[] arrayOfInt = new int[i];
    for (int j = 0; j < i; j++) {
      Integer localInteger = paramArrayOfInteger[j];
      arrayOfInt[j] = (localInteger == null ? paramInt : localInteger.intValue());
    }
    return arrayOfInt;
  }

  public static long[] a(Long[] paramArrayOfLong, long paramLong)
  {
    if (paramArrayOfLong == null) {
      return null;
    }
    int i = paramArrayOfLong.length;
    if (i == 0) {
      return eWh;
    }
    long[] arrayOfLong = new long[i];
    for (int j = 0; j < i; j++) {
      Long localLong = paramArrayOfLong[j];
      arrayOfLong[j] = (localLong == null ? paramLong : localLong.longValue());
    }
    return arrayOfLong;
  }

  public static short[] a(Short[] paramArrayOfShort, short paramShort)
  {
    if (paramArrayOfShort == null) {
      return null;
    }
    int i = paramArrayOfShort.length;
    if (i == 0) {
      return eWl;
    }
    short[] arrayOfShort = new short[i];
    for (int j = 0; j < i; j++) {
      Short localShort = paramArrayOfShort[j];
      arrayOfShort[j] = (localShort == null ? paramShort : localShort.shortValue());
    }
    return arrayOfShort;
  }

  public static String a(boolean[] paramArrayOfBoolean, String paramString1, String paramString2, String paramString3)
  {
    if (paramArrayOfBoolean == null) {
      throw new IllegalArgumentException("Array argument null.");
    }
    int i = paramArrayOfBoolean.length;
    if (i == 0) {
      return paramString1 + paramString2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(paramArrayOfBoolean[j]);
      localStringBuilder.append(paramString3);
    }
    localStringBuilder.setLength(localStringBuilder.length() - paramString3.length());
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }

  public static String a(byte[] paramArrayOfByte, String paramString1, String paramString2, String paramString3)
  {
    if (paramArrayOfByte == null) {
      throw new IllegalArgumentException("Array argument null.");
    }
    int i = paramArrayOfByte.length;
    if (i == 0) {
      return paramString1 + paramString2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(paramArrayOfByte[j]);
      localStringBuilder.append(paramString3);
    }
    localStringBuilder.setLength(localStringBuilder.length() - paramString3.length());
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }

  public static String a(char[] paramArrayOfChar, String paramString1, String paramString2, String paramString3)
  {
    if (paramArrayOfChar == null) {
      throw new IllegalArgumentException("Array argument null.");
    }
    int i = paramArrayOfChar.length;
    if (i == 0) {
      return paramString1 + paramString2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(paramArrayOfChar[j]);
      localStringBuilder.append(paramString3);
    }
    localStringBuilder.setLength(localStringBuilder.length() - paramString3.length());
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }

  public static String a(double[] paramArrayOfDouble, String paramString1, String paramString2, String paramString3)
  {
    if (paramArrayOfDouble == null) {
      throw new IllegalArgumentException("Array argument null.");
    }
    int i = paramArrayOfDouble.length;
    if (i == 0) {
      return paramString1 + paramString2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(paramArrayOfDouble[j]);
      localStringBuilder.append(paramString3);
    }
    localStringBuilder.setLength(localStringBuilder.length() - paramString3.length());
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }

  public static String a(float[] paramArrayOfFloat, String paramString1, String paramString2, String paramString3)
  {
    if (paramArrayOfFloat == null) {
      throw new IllegalArgumentException("Array argument null.");
    }
    int i = paramArrayOfFloat.length;
    if (i == 0) {
      return paramString1 + paramString2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(paramArrayOfFloat[j]);
      localStringBuilder.append(paramString3);
    }
    localStringBuilder.setLength(localStringBuilder.length() - paramString3.length());
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }

  public static String a(int[] paramArrayOfInt, String paramString1, String paramString2, String paramString3)
  {
    if (paramArrayOfInt == null) {
      throw new IllegalArgumentException("Array argument null.");
    }
    int i = paramArrayOfInt.length;
    if (i == 0) {
      return paramString1 + paramString2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(paramArrayOfInt[j]);
      localStringBuilder.append(paramString3);
    }
    localStringBuilder.setLength(localStringBuilder.length() - paramString3.length());
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }

  public static String a(long[] paramArrayOfLong, String paramString1, String paramString2, String paramString3)
  {
    if (paramArrayOfLong == null) {
      throw new IllegalArgumentException("Array argument null.");
    }
    int i = paramArrayOfLong.length;
    if (i == 0) {
      return paramString1 + paramString2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(paramArrayOfLong[j]);
      localStringBuilder.append(paramString3);
    }
    localStringBuilder.setLength(localStringBuilder.length() - paramString3.length());
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }

  public static String a(short[] paramArrayOfShort, String paramString1, String paramString2, String paramString3)
  {
    if (paramArrayOfShort == null) {
      throw new IllegalArgumentException("Array argument null.");
    }
    int i = paramArrayOfShort.length;
    if (i == 0) {
      return paramString1 + paramString2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(paramArrayOfShort[j]);
      localStringBuilder.append(paramString3);
    }
    localStringBuilder.setLength(localStringBuilder.length() - paramString3.length());
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }

  public static String a(boolean[] paramArrayOfBoolean, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (paramArrayOfBoolean == null) {
      return paramString4;
    }
    int i = paramArrayOfBoolean.length;
    if (i == 0) {
      return paramString1 + paramString2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(paramArrayOfBoolean[j]);
      localStringBuilder.append(paramString3);
    }
    localStringBuilder.setLength(localStringBuilder.length() - paramString3.length());
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }

  public static String a(byte[] paramArrayOfByte, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (paramArrayOfByte == null) {
      return paramString4;
    }
    int i = paramArrayOfByte.length;
    if (i == 0) {
      return paramString1 + paramString2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(paramArrayOfByte[j]);
      localStringBuilder.append(paramString3);
    }
    localStringBuilder.setLength(localStringBuilder.length() - paramString3.length());
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }

  public static String a(char[] paramArrayOfChar, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (paramArrayOfChar == null) {
      return paramString4;
    }
    int i = paramArrayOfChar.length;
    if (i == 0) {
      return paramString1 + paramString2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(paramArrayOfChar[j]);
      localStringBuilder.append(paramString3);
    }
    localStringBuilder.setLength(localStringBuilder.length() - paramString3.length());
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }

  public static String a(double[] paramArrayOfDouble, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (paramArrayOfDouble == null) {
      return paramString4;
    }
    int i = paramArrayOfDouble.length;
    if (i == 0) {
      return paramString1 + paramString2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(paramArrayOfDouble[j]);
      localStringBuilder.append(paramString3);
    }
    localStringBuilder.setLength(localStringBuilder.length() - paramString3.length());
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }

  public static String a(float[] paramArrayOfFloat, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (paramArrayOfFloat == null) {
      return paramString4;
    }
    int i = paramArrayOfFloat.length;
    if (i == 0) {
      return paramString1 + paramString2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(paramArrayOfFloat[j]);
      localStringBuilder.append(paramString3);
    }
    localStringBuilder.setLength(localStringBuilder.length() - paramString3.length());
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }

  public static String a(int[] paramArrayOfInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (paramArrayOfInt == null) {
      return paramString4;
    }
    int i = paramArrayOfInt.length;
    if (i == 0) {
      return paramString1 + paramString2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(paramArrayOfInt[j]);
      localStringBuilder.append(paramString3);
    }
    localStringBuilder.setLength(localStringBuilder.length() - paramString3.length());
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }

  public static String a(long[] paramArrayOfLong, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (paramArrayOfLong == null) {
      return paramString4;
    }
    int i = paramArrayOfLong.length;
    if (i == 0) {
      return paramString1 + paramString2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(paramArrayOfLong[j]);
      localStringBuilder.append(paramString3);
    }
    localStringBuilder.setLength(localStringBuilder.length() - paramString3.length());
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }

  public static String a(short[] paramArrayOfShort, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (paramArrayOfShort == null) {
      return paramString4;
    }
    int i = paramArrayOfShort.length;
    if (i == 0) {
      return paramString1 + paramString2;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    for (int j = 0; j < i; j++) {
      localStringBuilder.append(paramArrayOfShort[j]);
      localStringBuilder.append(paramString3);
    }
    localStringBuilder.setLength(localStringBuilder.length() - paramString3.length());
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }

  public static Object[] aO(Object paramObject)
  {
    if (!paramObject.getClass().isArray()) {
      throw new IllegalArgumentException("argument is not an array.");
    }
    if ((paramObject instanceof boolean[])) {
      return e((boolean[])paramObject);
    }
    if ((paramObject instanceof byte[])) {
      return R((byte[])paramObject);
    }
    if ((paramObject instanceof char[])) {
      return e((char[])paramObject);
    }
    if ((paramObject instanceof double[])) {
      return f((double[])paramObject);
    }
    if ((paramObject instanceof float[])) {
      return q((float[])paramObject);
    }
    if ((paramObject instanceof int[])) {
      return x((int[])paramObject);
    }
    if ((paramObject instanceof long[])) {
      return h((long[])paramObject);
    }
    if ((paramObject instanceof short[])) {
      return i((short[])paramObject);
    }
    return (Object[])paramObject;
  }

  public static boolean c(int[] paramArrayOfInt, int paramInt) {
    for (int i = 0; i < paramArrayOfInt.length; i++) {
      if (paramArrayOfInt[i] == paramInt) {
        return true;
      }
    }
    return false;
  }
}