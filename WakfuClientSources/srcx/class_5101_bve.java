import java.nio.ByteBuffer;

public class bve extends aRw
{
  private long geP;

  public void ge(long paramLong)
  {
    this.geP = paramLong;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putLong(this.geP);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 10003;
  }
}