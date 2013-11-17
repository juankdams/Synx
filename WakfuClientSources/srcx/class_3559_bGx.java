import java.nio.ByteBuffer;

public final class bGx extends aRw
{
  private final int aGC;

  public bGx(int paramInt)
  {
    this.aGC = paramInt;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.aGC);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 15316;
  }
}