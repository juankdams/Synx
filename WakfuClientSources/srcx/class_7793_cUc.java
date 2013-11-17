import java.nio.ByteBuffer;

public class cUc extends aRw
{
  private long kGq;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putLong(this.kGq);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 6001;
  }

  public void jh(long paramLong) {
    this.kGq = paramLong;
  }
}