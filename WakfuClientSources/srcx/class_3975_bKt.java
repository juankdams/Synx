import java.nio.ByteBuffer;

public class bKt extends aRw
{
  private int bQo;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.bQo);
    return a((byte)1, localByteBuffer.array());
  }

  public int getId()
  {
    return 1201;
  }

  public void sH(int paramInt)
  {
    this.bQo = paramInt;
  }
}