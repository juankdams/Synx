import java.nio.ByteBuffer;

public class crM extends aRw
{
  private cYk edo;

  public void S(cYk paramcYk)
  {
    this.edo = paramcYk;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(10);
    localByteBuffer.putInt(this.edo.getX());
    localByteBuffer.putInt(this.edo.getY());
    localByteBuffer.putShort(this.edo.IB());

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 8155;
  }
}