import java.nio.ByteBuffer;

public class dBs extends dzz
{
  private String hfY;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    byte[] arrayOfByte = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte);
    this.hfY = dzp.aJ(arrayOfByte);

    return true;
  }

  public int getId()
  {
    return 3162;
  }

  public String aFJ()
  {
    return this.hfY;
  }
}