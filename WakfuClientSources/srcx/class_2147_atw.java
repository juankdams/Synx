import java.nio.ByteBuffer;

public class atw extends dzz
{
  private String dEQ;
  private String dER;
  private long dES;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    byte[] arrayOfByte1 = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte1);
    this.dEQ = dzp.aJ(arrayOfByte1);
    byte[] arrayOfByte2 = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte2);
    this.dER = dzp.aJ(arrayOfByte2);
    this.dES = localByteBuffer.getLong();

    return true;
  }

  public int getId()
  {
    return 3164;
  }

  public String aFJ()
  {
    return this.dEQ;
  }

  public String aFK() {
    return this.dER;
  }

  public long aFL()
  {
    return this.dES;
  }
}