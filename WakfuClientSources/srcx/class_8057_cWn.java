import java.nio.ByteBuffer;

public class cWn extends dzz
{
  private String hmP;
  private String bSn;
  private long dES;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    byte[] arrayOfByte1 = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte1);
    this.hmP = dzp.aJ(arrayOfByte1);

    byte[] arrayOfByte2 = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte2);
    this.bSn = dzp.aJ(arrayOfByte2);

    this.dES = localByteBuffer.getLong();

    return true;
  }

  public int getId()
  {
    return 3150;
  }

  public String ccV()
  {
    return this.hmP;
  }

  public String aJm() {
    return this.bSn;
  }

  public long aFL() {
    return this.dES;
  }
}