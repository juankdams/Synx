import java.nio.ByteBuffer;

public class ayy extends dzz
{
  private String dOI;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    byte[] arrayOfByte = new byte[localByteBuffer.get()];
    localByteBuffer.get(arrayOfByte);

    this.dOI = dzp.aJ(arrayOfByte);

    return true;
  }

  public int getId()
  {
    return 3202;
  }

  public String aKB()
  {
    return this.dOI;
  }
}