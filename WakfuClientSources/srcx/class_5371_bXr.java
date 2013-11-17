import java.nio.ByteBuffer;

public class bXr extends dzz
{
  private je eaV;
  private long aT;
  private String aQZ;
  private int ejS;
  private long gcc;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.eaV = je.aZ(localByteBuffer.getInt());

    this.aT = localByteBuffer.getLong();
    byte[] arrayOfByte = new byte[localByteBuffer.getInt()];
    localByteBuffer.get(arrayOfByte);
    this.aQZ = dzp.aJ(arrayOfByte);
    this.ejS = localByteBuffer.getInt();
    this.gcc = localByteBuffer.getLong();

    return true;
  }

  public je aRB() {
    return this.eaV;
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

  public long ccG() {
    return this.gcc;
  }

  public int getId()
  {
    return 20094;
  }
}