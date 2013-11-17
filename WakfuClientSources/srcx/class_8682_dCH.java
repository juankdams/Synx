import java.nio.ByteBuffer;

public class dCH extends dzz
{
  private long iI;
  private String bSn;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.iI = localByteBuffer.getLong();
    byte[] arrayOfByte = new byte[localByteBuffer.get()];
    localByteBuffer.get(arrayOfByte);
    this.bSn = dzp.aJ(arrayOfByte);

    return true;
  }

  public long eq() {
    return this.iI;
  }

  public void g(long paramLong) {
    this.iI = paramLong;
  }

  public String aJm() {
    return this.bSn;
  }

  public void cf(String paramString) {
    this.bSn = paramString;
  }

  public int getId() {
    return 2065;
  }
}