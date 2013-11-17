public final class bTM
  implements Cloneable
{
  private static final int fJF = 65280;
  private static final int fJG = 8;
  private final int value;

  public bTM(int paramInt)
  {
    this.value = paramInt;
  }

  public bTM(byte[] paramArrayOfByte)
  {
    this(paramArrayOfByte, 0);
  }

  public bTM(byte[] paramArrayOfByte, int paramInt)
  {
    this.value = k(paramArrayOfByte, paramInt);
  }

  public byte[] getBytes()
  {
    byte[] arrayOfByte = new byte[2];
    arrayOfByte[0] = ((byte)(this.value & 0xFF));
    arrayOfByte[1] = ((byte)((this.value & 0xFF00) >> 8));
    return arrayOfByte;
  }

  public int getValue()
  {
    return this.value;
  }

  public static byte[] getBytes(int paramInt)
  {
    byte[] arrayOfByte = new byte[2];
    arrayOfByte[0] = ((byte)(paramInt & 0xFF));
    arrayOfByte[1] = ((byte)((paramInt & 0xFF00) >> 8));
    return arrayOfByte;
  }

  public static int k(byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramArrayOfByte[(paramInt + 1)] << 8 & 0xFF00;
    i += (paramArrayOfByte[paramInt] & 0xFF);
    return i;
  }

  public static int ao(byte[] paramArrayOfByte)
  {
    return k(paramArrayOfByte, 0);
  }

  public boolean equals(Object paramObject)
  {
    if ((paramObject == null) || (!(paramObject instanceof bTM))) {
      return false;
    }
    return this.value == ((bTM)paramObject).getValue();
  }

  public int hashCode()
  {
    return this.value;
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
    return "ZipShort value: " + this.value;
  }
}