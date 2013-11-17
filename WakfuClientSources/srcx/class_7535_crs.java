import java.nio.ByteBuffer;

public class crs extends cxw
{
  private byte dMs;

  public byte[] encode()
  {
    int i = 17;

    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);

    localByteBuffer.putLong(this.bkH);
    localByteBuffer.putLong(this.ilv);

    localByteBuffer.put(this.dMs);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 5218;
  }

  public void cz(byte paramByte) {
    this.dMs = paramByte;
  }
}