import java.nio.ByteBuffer;

public class Wl extends aRw
{
  private cYk cGk;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(10);

    localByteBuffer.putInt(this.cGk.getX());
    localByteBuffer.putInt(this.cGk.getY());
    localByteBuffer.putShort(this.cGk.IB());

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 8147;
  }

  public void n(cYk paramcYk) {
    this.cGk = paramcYk;
  }
}