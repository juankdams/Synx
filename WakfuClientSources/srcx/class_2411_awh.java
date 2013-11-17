import java.nio.ByteBuffer;

public class awh extends aRw
{
  private long dhx;

  public awh(long paramLong)
  {
    this.dhx = paramLong;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putLong(this.dhx);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20060;
  }
}