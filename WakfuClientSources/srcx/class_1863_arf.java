import java.nio.ByteBuffer;

public final class arf extends aRw
{
  private final long dyK;

  public arf(long paramLong)
  {
    this.dyK = paramLong;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);

    localByteBuffer.putLong(this.dyK);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15267;
  }
}