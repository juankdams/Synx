import java.nio.ByteBuffer;

public final class bLA extends dzz
{
  private long iI;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.iI = localByteBuffer.getLong();
    return true;
  }

  public int getId()
  {
    return 2070;
  }

  public long eq() {
    return this.iI;
  }
}