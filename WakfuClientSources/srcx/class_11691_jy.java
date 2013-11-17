import java.nio.ByteBuffer;

public class jy extends aRw
{
  private long aLD;
  private byte aLE;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(9);
    localByteBuffer.putLong(this.aLD);
    localByteBuffer.put(this.aLE);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 6003;
  }

  public void s(byte paramByte)
  {
    this.aLE = paramByte;
  }

  public void setExchangeId(long paramLong)
  {
    this.aLD = paramLong;
  }
}