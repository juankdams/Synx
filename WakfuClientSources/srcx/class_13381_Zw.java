import java.nio.ByteBuffer;

public class Zw extends aRw
{
  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(aUk.eVc.length);
    localByteBuffer.put(aUk.eVc);
    return a((byte)0, localByteBuffer.array());
  }

  public int getId()
  {
    return 7;
  }
}