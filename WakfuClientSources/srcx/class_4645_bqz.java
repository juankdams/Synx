import java.nio.ByteBuffer;

public class bqz extends dzz
{
  private long Tj;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.Tj = localByteBuffer.getLong();

    return true;
  }

  public int getId() {
    return 516;
  }

  public long hf() {
    return this.Tj;
  }
}