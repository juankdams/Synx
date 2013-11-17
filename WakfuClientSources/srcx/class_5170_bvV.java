import java.nio.ByteBuffer;

public class bvV extends aRw
{
  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(0);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20033;
  }
}