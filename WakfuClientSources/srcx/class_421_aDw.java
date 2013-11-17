import java.nio.ByteBuffer;

public class aDw extends aRw
{
  private byte dYp;

  public void bz(byte paramByte)
  {
    this.dYp = paramByte;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(1);
    localByteBuffer.put(this.dYp);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 561;
  }
}