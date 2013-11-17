import java.nio.ByteBuffer;

public class dkG extends dzz
{
  private String hfY;
  private long dES;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    byte[] arrayOfByte = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte);
    this.hfY = dzp.aJ(arrayOfByte);
    this.dES = localByteBuffer.getLong();

    return true;
  }

  public int getId()
  {
    return 3166;
  }

  public String aFJ()
  {
    return this.hfY;
  }

  public long aFL() {
    return this.dES;
  }
}