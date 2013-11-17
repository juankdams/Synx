import java.nio.ByteBuffer;

public class atM extends dzz
{
  private String aQZ;
  private long aT;
  private long dFD;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    byte[] arrayOfByte = new byte[localByteBuffer.get()];
    localByteBuffer.get(arrayOfByte);
    this.aQZ = dzp.aJ(arrayOfByte);

    this.aT = localByteBuffer.getLong();
    this.dFD = localByteBuffer.getLong();
    return false;
  }

  public int getId() {
    return 526;
  }

  public String uo() {
    return this.aQZ;
  }

  public long CD() {
    return this.aT;
  }

  public long aFR() {
    return this.dFD;
  }
}