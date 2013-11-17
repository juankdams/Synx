import java.nio.ByteBuffer;

public class ayU extends dzz
{
  private long bkH;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length < 8)
      return false;
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bkH = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 11110;
  }

  public long EN()
  {
    return this.bkH;
  }
}