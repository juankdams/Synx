import java.nio.ByteBuffer;

public class caH extends aRw
{
  private long ag;
  private cYk hrt;

  public void b(long paramLong)
  {
    this.ag = paramLong;
  }

  public void N(cYk paramcYk) {
    this.hrt = paramcYk;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(18);
    localByteBuffer.putLong(this.ag);
    localByteBuffer.putInt(this.hrt.getX());
    localByteBuffer.putInt(this.hrt.getY());
    localByteBuffer.putShort(this.hrt.IB());
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 203;
  }
}