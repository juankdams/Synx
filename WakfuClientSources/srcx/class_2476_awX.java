import java.nio.ByteBuffer;

public class awX extends aRw
{
  private final long cXv;
  private final VI cRx;

  public awX(long paramLong, VI paramVI)
  {
    this.cXv = paramLong;
    this.cRx = paramVI;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(16 + this.cRx.O());
    localByteBuffer.putLong(this.cXv);
    localByteBuffer.putLong(this.cRx.getId());
    this.cRx.g(localByteBuffer);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 4529;
  }
}