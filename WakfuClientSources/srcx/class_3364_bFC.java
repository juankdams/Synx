import java.nio.ByteBuffer;

public class bFC extends aRw
{
  private byte dlR;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(1);
    localByteBuffer.put(this.dlR);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 5403;
  }

  public void dn(byte paramByte)
  {
    this.dlR = paramByte;
  }
}