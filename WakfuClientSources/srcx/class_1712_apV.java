public class apV extends cIq
{
  private final aoL dwC = new aoL();

  public final void a(long paramLong, short paramShort, byte[] paramArrayOfByte, int[] paramArrayOfInt) {
    super.b(paramLong, paramShort, paramArrayOfByte);
    this.dwC.put(paramLong, paramArrayOfInt);
  }

  public final int[] cZ(long paramLong) {
    return (int[])this.dwC.get(paramLong);
  }
}