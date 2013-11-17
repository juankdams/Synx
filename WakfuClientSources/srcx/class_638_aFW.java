import java.nio.ByteBuffer;

public class aFW extends dzz
{
  private int cGS;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.cGS = localByteBuffer.getInt();

    return true;
  }

  public int ok() {
    return this.cGS;
  }

  public int getId()
  {
    return 4188;
  }
}