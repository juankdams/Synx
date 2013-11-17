import java.nio.ByteBuffer;

public class aBD extends aRw
{
  private final int aPh;

  public aBD(int paramInt)
  {
    this.aPh = paramInt;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);

    localByteBuffer.putInt(this.aPh);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15615;
  }
}