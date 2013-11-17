import java.nio.ByteBuffer;

public class aYz extends aRw
{
  private short fev;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(2);
    localByteBuffer.putShort(this.fev);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 5501;
  }

  public void bA(short paramShort)
  {
    this.fev = paramShort;
  }
}