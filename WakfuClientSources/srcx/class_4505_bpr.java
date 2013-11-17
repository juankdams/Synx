public final class bpr
  implements Cloneable
{
  private static final int fJE = 1;
  private static final int fJF = 65280;
  private static final int fJG = 8;
  private static final int fJH = 2;
  private static final int fJI = 16711680;
  private static final int fJJ = 16;
  private static final int fJK = 3;
  private static final long fJL = 4278190080L;
  private static final int fJM = 24;
  private final long value;
  public static final bpr fJN = new bpr(33639248L);

  public static final bpr fJO = new bpr(67324752L);

  public static final bpr fJP = new bpr(134695760L);

  static final bpr fJQ = new bpr(4294967295L);

  public bpr(long paramLong)
  {
    this.value = paramLong;
  }

  public bpr(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, 0);
  }

  public bpr(byte[] paramArrayOfByte, int paramInt)
  {
    this.value = h(paramArrayOfByte, paramInt);
  }

  public byte[] getBytes()
  {
    return fS(this.value);
  }

  public long getValue()
  {
    return this.value;
  }

  public static byte[] fS(long paramLong)
  {
    byte[] arrayOfByte = new byte[4];
    arrayOfByte[0] = ((byte)(int)(paramLong & 0xFF));
    arrayOfByte[1] = ((byte)(int)((paramLong & 0xFF00) >> 8));
    arrayOfByte[2] = ((byte)(int)((paramLong & 0xFF0000) >> 16));
    arrayOfByte[3] = ((byte)(int)((paramLong & 0xFF000000) >> 24));
    return arrayOfByte;
  }

  public static long h(byte[] paramArrayOfByte, int paramInt)
  {
    long l = paramArrayOfByte[(paramInt + 3)] << 24 & 0xFF000000;
    l += (paramArrayOfByte[(paramInt + 2)] << 16 & 0xFF0000);
    l += (paramArrayOfByte[(paramInt + 1)] << 8 & 0xFF00);
    l += (paramArrayOfByte[paramInt] & 0xFF);
    return l;
  }

  public static long ac(byte[] paramArrayOfByte)
  {
    return h(paramArrayOfByte, 0);
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof bpr))) {
      return false;
    }
    return this.value == ((bpr)paramObject).getValue();
  }

  public int hashCode()
  {
    return (int)this.value;
  }

  public Object clone()
  {
    try {
      return super.clone();
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {
      throw new RuntimeException(localCloneNotSupportedException);
    }
  }

  public String toString()
  {
    return "ZipLong value: " + this.value;
  }
}