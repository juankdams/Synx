import java.nio.ByteBuffer;

public class azW extends dzz
{
  private int aCV;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.aCV = localByteBuffer.getInt();

    return true;
  }

  public int mP() {
    return this.aCV;
  }

  public int getId()
  {
    return 20097;
  }
}