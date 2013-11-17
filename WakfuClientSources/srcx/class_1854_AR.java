import java.nio.ByteBuffer;

public class AR extends aRw
{
  private long brD;

  public AR(long paramLong)
  {
    this.brD = paramLong;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putLong(this.brD);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20067;
  }
}