import java.nio.ByteBuffer;

public class TC extends aRw
{
  private final int aPh;

  public TC(int paramInt)
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
    return 15619;
  }
}