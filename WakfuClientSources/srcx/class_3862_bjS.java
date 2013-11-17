import java.nio.ByteBuffer;

public class bjS extends dzz
{
  private long RY;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.RY = localByteBuffer.getLong();
    return true;
  }

  public int getId()
  {
    return 5514;
  }

  public long gv() {
    return this.RY;
  }
}