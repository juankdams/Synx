import java.nio.ByteBuffer;

public final class cBy extends dzz
{
  private long eoV;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.eoV = localByteBuffer.getLong();
    return true;
  }

  public int getId()
  {
    return 2063;
  }

  public long bcB() {
    return this.eoV;
  }
}