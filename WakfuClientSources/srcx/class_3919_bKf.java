import java.nio.ByteBuffer;

public class bKf extends dzz
{
  private int bPA;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bPA = localByteBuffer.getInt();

    return true;
  }

  public int getReason() {
    return this.bPA;
  }

  public int getId()
  {
    return 8004;
  }
}