public class Jv
{
  public static int fp(int paramInt)
  {
    return 64 / paramInt;
  }

  public static int fq(int paramInt) {
    return 32 / paramInt;
  }

  public static int getMask(int paramInt) {
    return (1 << paramInt) - 1;
  }

  public static int a(long[] paramArrayOfLong, int paramInt1, int paramInt2)
  {
    int i = bCO.sk(paramInt2);
    int j = fp(i);
    long l1 = getMask(i);

    long l2 = paramArrayOfLong[(paramInt1 / j)];
    l2 >>= i * (paramInt1 % j);
    return (int)(l2 & l1);
  }

  public static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = bCO.sk(paramInt2);
    int j = fq(i);
    int k = getMask(i);

    int m = paramArrayOfInt[(paramInt1 / j)];
    m >>= i * (paramInt1 % j);
    return m & k;
  }

  public static int[] a(int[] paramArrayOfInt, int paramInt, aYQ paramaYQ)
  {
    return paramaYQ.ov(paramInt);
  }

  public static long[] a(long[] paramArrayOfLong, int paramInt, aYQ paramaYQ)
  {
    long[] arrayOfLong = new long[paramInt];
    for (int i = 0; i < paramInt; i++) {
      arrayOfLong[i] = paramaYQ.readLong();
    }
    return arrayOfLong;
  }

  public static void a(int[] paramArrayOfInt, dSw paramdSw) {
    for (int i = 0; i < paramArrayOfInt.length; i++)
      paramdSw.writeInt(paramArrayOfInt[i]);
  }

  public static void a(long[] paramArrayOfLong, dSw paramdSw)
  {
    for (int i = 0; i < paramArrayOfLong.length; i++)
      paramdSw.writeLong(paramArrayOfLong[i]);
  }

  public static int[] a(int[] paramArrayOfInt, int paramInt)
  {
    int i = bCO.sk(paramInt);
    int j = fq(i);
    int k = getMask(i);

    int m = (int)Math.ceil(paramArrayOfInt.length / j);
    int[] arrayOfInt = new int[m];
    for (int n = 0; n < paramArrayOfInt.length; n++) {
      int i1 = n / j;
      arrayOfInt[i1] |= (paramArrayOfInt[n] & k) << i * (n % j);
    }
    return arrayOfInt;
  }

  public static long[] b(int[] paramArrayOfInt, int paramInt) {
    int i = bCO.sk(paramInt);
    int j = fp(i);
    long l = getMask(i);

    int k = (int)Math.ceil(paramArrayOfInt.length / j);
    long[] arrayOfLong = new long[k];
    for (int m = 0; m < paramArrayOfInt.length; m++) {
      int n = m / j;
      arrayOfLong[n] |= (paramArrayOfInt[m] & l) << i * (m % j);
    }
    return arrayOfLong;
  }

  public static void main(String[] paramArrayOfString)
  {
  }
}