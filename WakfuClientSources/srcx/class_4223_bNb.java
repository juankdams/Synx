import java.nio.ByteBuffer;

public class bNb extends dzz
{
  private int gRS;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.gRS = localByteBuffer.getInt();
    return true;
  }

  public int bUY() {
    return this.gRS;
  }

  public int getId()
  {
    return 15956;
  }
}