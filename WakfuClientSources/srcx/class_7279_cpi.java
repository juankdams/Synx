import java.nio.ByteBuffer;

public final class cpi extends aRw
{
  private final int dFY;

  public cpi(int paramInt)
  {
    this.dFY = paramInt;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.dFY);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 9106;
  }
}