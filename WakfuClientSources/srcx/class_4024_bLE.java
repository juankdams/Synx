import java.nio.ByteBuffer;

public class bLE extends aRw
{
  private long aLD;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putLong(this.aLD);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 6021;
  }

  public void setExchangeId(long paramLong)
  {
    this.aLD = paramLong;
  }
}