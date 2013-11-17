import java.nio.ByteBuffer;

public class GI extends aRw
{
  private int aGC;

  public void aM(int paramInt)
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
    return 15333;
  }
}