import java.nio.ByteBuffer;

public final class bng extends aRw
{
  private int bdj = -1;

  public void cS(int paramInt) {
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
    return 8037;
  }
}