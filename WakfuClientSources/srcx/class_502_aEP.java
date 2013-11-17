import java.nio.ByteBuffer;

public final class aEP extends aRw
{
  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(0);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15269;
  }
}