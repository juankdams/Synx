import java.nio.ByteBuffer;

public class bUi extends dzz
{
  private long hfX;
  private String hfY;
  private String bSn;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.hfX = localByteBuffer.getLong();

    byte[] arrayOfByte1 = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte1);
    this.hfY = dzp.aJ(arrayOfByte1);

    byte[] arrayOfByte2 = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte2);
    this.bSn = dzp.aJ(arrayOfByte2);

    return true;
  }

  public int getId()
  {
    return 3158;
  }

  public String aFJ()
  {
    return this.hfY;
  }

  public String aJm() {
    return this.bSn;
  }

  public long cal() {
    return this.hfX;
  }
}