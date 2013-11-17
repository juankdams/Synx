import java.nio.ByteBuffer;

public class bMO extends dzz
{
  private String bQh;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    byte[] arrayOfByte = new byte[localByteBuffer.get()];
    localByteBuffer.get(arrayOfByte);

    this.bQh = dzp.aJ(arrayOfByte);

    return true;
  }

  public int getId()
  {
    return 3204;
  }

  public String getUserName()
  {
    return this.bQh;
  }
}