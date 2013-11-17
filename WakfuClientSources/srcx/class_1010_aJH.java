import java.nio.ByteBuffer;

public class aJH extends dzz
{
  private long aT;
  private String aQZ;
  private int ejS;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aT = localByteBuffer.getLong();
    byte[] arrayOfByte = new byte[localByteBuffer.getInt()];
    localByteBuffer.get(arrayOfByte);
    this.aQZ = dzp.aJ(arrayOfByte);
    this.ejS = localByteBuffer.getInt();
    return true;
  }

  public long CD() {
    return this.aT;
  }

  public String uo() {
    return this.aQZ;
  }

  public int bbm() {
    return this.ejS;
  }

  public int getId()
  {
    return 5526;
  }
}