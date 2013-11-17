import java.nio.ByteBuffer;

public class dau extends aRw
{
  private long iI;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putLong(this.iI);
    return a((byte)2, localByteBuffer.array());
  }

  public int getId()
  {
    return 2049;
  }

  public void g(long paramLong)
  {
    this.iI = paramLong;
  }
}