import java.nio.ByteBuffer;

public class bmu extends dzz
{
  private Yp btC;

  public Yp HK()
  {
    return this.btC;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.btC = Yp.cj(localByteBuffer.getLong());
    return true;
  }

  public int getId()
  {
    return 15124;
  }
}