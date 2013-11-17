import java.nio.ByteBuffer;

public final class bAg extends dzz
{
  private long iI;
  private String goR;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.iI = localByteBuffer.getLong();
    byte[] arrayOfByte = new byte[localByteBuffer.getShort()];
    localByteBuffer.get(arrayOfByte);
    this.goR = dzp.aJ(arrayOfByte);
    return true;
  }

  public long eq() {
    return this.iI;
  }

  public String bIB() {
    return this.goR;
  }

  public int getId()
  {
    return 2074;
  }
}