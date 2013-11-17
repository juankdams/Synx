import java.nio.ByteBuffer;

public class dal extends aRw
{
  private byte kQF;

  public void eQ(byte paramByte)
  {
    this.kQF = paramByte;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(1);
    localByteBuffer.put(this.kQF);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20041;
  }
}