import java.math.BigInteger;

public final class bPi
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
  private static final int gVG = 4;
  private static final long gVH = 1095216660480L;
  private static final int gVI = 32;
  private static final int gVJ = 5;
  private static final long gVK = 280375465082880L;
  private static final int gVL = 40;
  private static final int gVM = 6;
  private static final long gVN = 71776119061217280L;
  private static final int gVO = 48;
  private static final int gVP = 7;
  private static final long gVQ = 9151314442816847872L;
  private static final int gVR = 56;
  private static final int gVS = 63;
  private static final byte gVT = -128;
  private final BigInteger gVU;
  public static final bPi gVV = new bPi(0L);

  public bPi(long paramLong)
  {
    this(BigInteger.valueOf(paramLong));
  }

  public bPi(BigInteger paramBigInteger)
  {
    this.gVU = paramBigInteger;
  }

  public bPi(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, 0);
  }

  public bPi(byte[] paramArrayOfByte, int paramInt)
  {
    this.gVU = j(paramArrayOfByte, paramInt);
  }

  public byte[] getBytes()
  {
    return a(this.gVU);
  }

  public long ah()
  {
    return this.gVU.longValue();
  }

  public BigInteger bVQ()
  {
    return this.gVU;
  }

  public static byte[] fS(long paramLong)
  {
    return a(BigInteger.valueOf(paramLong));
  }

  public static byte[] a(BigInteger paramBigInteger)
  {
    byte[] arrayOfByte = new byte[8];
    long l = paramBigInteger.longValue();
    arrayOfByte[0] = ((byte)(int)(l & 0xFF));
    arrayOfByte[1] = ((byte)(int)((l & 0xFF00) >> 8));
    arrayOfByte[2] = ((byte)(int)((l & 0xFF0000) >> 16));
    arrayOfByte[3] = ((byte)(int)((l & 0xFF000000) >> 24));
    arrayOfByte[4] = ((byte)(int)((l & 0x0) >> 32));
    arrayOfByte[5] = ((byte)(int)((l & 0x0) >> 40));
    arrayOfByte[6] = ((byte)(int)((l & 0x0) >> 48));
    arrayOfByte[7] = ((byte)(int)((l & 0x0) >> 56));
    if (paramBigInteger.testBit(63))
    {
      byte[] tmp125_122 = arrayOfByte; tmp125_122[7] = ((byte)(tmp125_122[7] | 0xFFFFFF80));
    }
    return arrayOfByte;
  }

  public static long i(byte[] paramArrayOfByte, int paramInt)
  {
    return j(paramArrayOfByte, paramInt).longValue();
  }

  public static BigInteger j(byte[] paramArrayOfByte, int paramInt)
  {
    long l = paramArrayOfByte[(paramInt + 7)] << 56 & 0x0;
    l += (paramArrayOfByte[(paramInt + 6)] << 48 & 0x0);
    l += (paramArrayOfByte[(paramInt + 5)] << 40 & 0x0);
    l += (paramArrayOfByte[(paramInt + 4)] << 32 & 0x0);
    l += (paramArrayOfByte[(paramInt + 3)] << 24 & 0xFF000000);
    l += (paramArrayOfByte[(paramInt + 2)] << 16 & 0xFF0000);
    l += (paramArrayOfByte[(paramInt + 1)] << 8 & 0xFF00);
    l += (paramArrayOfByte[paramInt] & 0xFF);
    BigInteger localBigInteger = BigInteger.valueOf(l);
    return (paramArrayOfByte[(paramInt + 7)] & 0xFFFFFF80) == -128 ? localBigInteger.setBit(63) : localBigInteger;
  }

  public static long am(byte[] paramArrayOfByte)
  {
    return i(paramArrayOfByte, 0);
  }

  public static BigInteger an(byte[] paramArrayOfByte)
  {
    return j(paramArrayOfByte, 0);
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof bPi))) {
      return false;
    }
    return this.gVU.equals(((bPi)paramObject).bVQ());
  }

  public int hashCode()
  {
    return this.gVU.hashCode();
  }

  public String toString()
  {
    return "ZipEightByteInteger value: " + this.gVU;
  }
}