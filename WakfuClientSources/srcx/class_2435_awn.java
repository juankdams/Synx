public class awn
{
  public static final long dLA = -1L;

  public static long B(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length == 4) {
      long l = 0L;
      l |= (0xFF & paramArrayOfByte[0]) << 24;
      l |= (0xFF & paramArrayOfByte[1]) << 16;
      l |= (0xFF & paramArrayOfByte[2]) << 8;
      l |= 0xFF & paramArrayOfByte[3];
      return l;
    }
    return -1L;
  }
}