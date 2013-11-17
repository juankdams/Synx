import java.nio.ByteBuffer;

public abstract class Nb extends dzz
{
  private String cac;
  private long cad;
  private String bQi;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    byte[] arrayOfByte1 = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte1);

    this.cac = dzp.aJ(arrayOfByte1);

    this.cad = localByteBuffer.getLong();

    byte[] arrayOfByte2 = new byte[localByteBuffer.get() & 0xFF];

    localByteBuffer.get(arrayOfByte2);

    this.bQi = dzp.aJ(arrayOfByte2);

    return true;
  }

  public long Xb()
  {
    return this.cad;
  }

  public String Xc()
  {
    return this.cac;
  }

  public String Xd()
  {
    return this.bQi;
  }
}