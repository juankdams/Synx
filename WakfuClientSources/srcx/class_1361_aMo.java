import java.nio.ByteBuffer;

public class aMo extends dzz
{
  private int cZL;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.cZL = localByteBuffer.getInt();

    return true;
  }

  public int arM() {
    return this.cZL;
  }

  public int getId()
  {
    return 20096;
  }
}