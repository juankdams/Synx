import java.nio.ByteBuffer;

public class cUB extends dzz
{
  private long kHg;
  private long kHh;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.kHh = localByteBuffer.getLong();
    this.kHg = localByteBuffer.getLong();

    return true;
  }

  public int getId()
  {
    return 4134;
  }

  public long cJM() {
    return this.kHg;
  }

  public long cJN() {
    return this.kHh;
  }
}