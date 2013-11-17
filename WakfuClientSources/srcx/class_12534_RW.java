import java.nio.ByteBuffer;

public final class RW extends aRw
{
  private final int bdj;

  public RW(int paramInt)
  {
    this.bdj = paramInt;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.bdj);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 8039;
  }
}