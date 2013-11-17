import java.nio.ByteBuffer;

public class VZ extends dzz
{
  private int aVF;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aVF = localByteBuffer.getInt();
    return true;
  }

  public int wx() {
    return this.aVF;
  }

  public int getId()
  {
    return 15958;
  }
}