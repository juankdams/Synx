import java.nio.ByteBuffer;

public class bjw extends dzz
{
  private int aPh;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aPh = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 15606;
  }

  public int sY() {
    return this.aPh;
  }
}