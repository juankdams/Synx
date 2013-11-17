import java.nio.ByteBuffer;

public final class Qn extends dzz
{
  private long iI;
  private String bOG;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.iI = localByteBuffer.getLong();
    byte[] arrayOfByte = new byte[localByteBuffer.getInt()];
    localByteBuffer.get(arrayOfByte);
    this.bOG = dzp.aJ(arrayOfByte);

    return true;
  }

  public int getId() {
    return 9202;
  }

  public long eq() {
    return this.iI;
  }

  public String acb() {
    return this.bOG;
  }
}