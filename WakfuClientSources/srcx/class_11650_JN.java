import java.nio.ByteBuffer;

public class JN extends dzz
{
  private boolean bUX;

  public boolean IR()
  {
    return this.bUX;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bUX = (localByteBuffer.get() != 0);
    return true;
  }

  public int getId()
  {
    return 15120;
  }
}