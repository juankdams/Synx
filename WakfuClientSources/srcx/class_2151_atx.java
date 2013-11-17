import java.nio.ByteBuffer;

public class atx extends dzz
{
  private long aLD;
  private long dET;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.aLD = localByteBuffer.getLong();
    this.dET = localByteBuffer.getLong();

    return true;
  }

  public int getId()
  {
    return 6002;
  }

  public long aFM() {
    return this.dET;
  }

  public long acp() {
    return this.aLD;
  }
}