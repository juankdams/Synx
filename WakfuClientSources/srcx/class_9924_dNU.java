import java.nio.ByteBuffer;

public class dNU extends dzz
{
  private String hmP;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    byte[] arrayOfByte = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte);
    this.hmP = dzp.aJ(arrayOfByte);

    return true;
  }

  public String ccV()
  {
    return this.hmP;
  }

  public int getId()
  {
    return 3160;
  }
}