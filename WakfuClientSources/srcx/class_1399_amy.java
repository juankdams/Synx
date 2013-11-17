import java.nio.ByteBuffer;

public class amy extends aRw
{
  private short dpn;

  public void aE(short paramShort)
  {
    this.dpn = paramShort;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(2);
    localByteBuffer.putShort(this.dpn);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20017;
  }
}