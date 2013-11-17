import java.nio.ByteBuffer;

public class bAY extends aRw
{
  private long ag;
  private short grQ;

  public void b(long paramLong)
  {
    this.ag = paramLong;
  }

  public void ch(short paramShort) {
    this.grQ = paramShort;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(12);
    localByteBuffer.putLong(this.ag);
    localByteBuffer.putShort(this.grQ);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 201;
  }
}