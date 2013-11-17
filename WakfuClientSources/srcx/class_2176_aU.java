import java.nio.ByteBuffer;

public class aU extends aRw
{
  private long iI;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putLong(this.iI);
    return a((byte)3, localByteBuffer.array());
  }

  public void g(long paramLong) {
    this.iI = paramLong;
  }

  public int getId()
  {
    return 10015;
  }
}