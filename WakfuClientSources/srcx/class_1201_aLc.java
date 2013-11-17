import java.nio.ByteBuffer;

public class aLc extends aRw
{
  private long aLD;

  public byte[] encode()
  {
    int i = 8;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);

    localByteBuffer.putLong(this.aLD);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 6049;
  }

  public void setExchangeId(long paramLong)
  {
    this.aLD = paramLong;
  }
}