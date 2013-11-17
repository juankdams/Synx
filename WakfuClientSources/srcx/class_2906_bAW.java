import java.nio.ByteBuffer;

public class bAW extends dzz
{
  private long cws;

  public long agz()
  {
    return this.cws;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cws = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 10062;
  }
}