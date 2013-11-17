import java.nio.ByteBuffer;

public class dlX extends aRw
{
  private byte ePB;
  private short ljP;

  public void fd(byte paramByte)
  {
    this.ePB = paramByte;
  }

  public void em(short paramShort) {
    this.ljP = paramShort;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(3);
    localByteBuffer.put(this.ePB);
    localByteBuffer.putShort(this.ljP);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 10013;
  }
}