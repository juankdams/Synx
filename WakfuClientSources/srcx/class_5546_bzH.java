import java.nio.ByteBuffer;

public final class bzH extends aRw
{
  private long Tj;
  private String bQi;

  public byte[] encode()
  {
    byte[] arrayOfByte = dzp.qC(this.bQi);

    ByteBuffer localByteBuffer = ByteBuffer.allocate(9 + arrayOfByte.length);

    localByteBuffer.putLong(this.Tj);
    localByteBuffer.put((byte)arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);

    return a((byte)6, localByteBuffer.array());
  }

  public int getId()
  {
    return 523;
  }

  public void ca(String paramString)
  {
    this.bQi = paramString;
  }

  public void aS(long paramLong)
  {
    this.Tj = paramLong;
  }
}