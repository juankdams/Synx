import java.nio.ByteBuffer;

public class Fd extends dzz
{
  private long ag;
  private byte[] bMq;

  public long m()
  {
    return this.ag;
  }

  public byte[] OF() {
    return this.bMq;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    i(localByteBuffer);
    return true;
  }

  protected void i(ByteBuffer paramByteBuffer) {
    this.ag = paramByteBuffer.getLong();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    if (i > 0) {
      this.bMq = new byte[i];
      paramByteBuffer.get(this.bMq);
    } else {
      this.bMq = null;
    }
  }

  public int getId() { return 202; }

}