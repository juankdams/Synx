import java.nio.ByteBuffer;

public class ta extends dzz
{
  private long aXW;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aXW = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 7902;
  }

  public final long AD()
  {
    return this.aXW;
  }
}