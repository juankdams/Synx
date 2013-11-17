import java.nio.ByteBuffer;

public class daV extends cxw
{
  private byte dMs;

  public byte[] encode()
  {
    int i = 17;

    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);

    localByteBuffer.putLong(this.bkH);
    localByteBuffer.putLong(this.ilw);
    localByteBuffer.put(this.dMs);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 5219;
  }

  public void cz(byte paramByte) {
    this.dMs = paramByte;
  }
}