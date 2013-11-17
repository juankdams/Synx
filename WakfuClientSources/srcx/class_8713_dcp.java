import java.nio.ByteBuffer;

public class dcp extends dzz
{
  private String dOI;
  private String cac;
  private String bQi;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    byte[] arrayOfByte1 = new byte[localByteBuffer.get()];
    localByteBuffer.get(arrayOfByte1);
    this.dOI = dzp.aJ(arrayOfByte1);

    byte[] arrayOfByte2 = new byte[localByteBuffer.get()];
    localByteBuffer.get(arrayOfByte2);
    this.cac = dzp.aJ(arrayOfByte2);

    byte[] arrayOfByte3 = new byte[localByteBuffer.get()];
    localByteBuffer.get(arrayOfByte3);
    this.bQi = dzp.aJ(arrayOfByte3);

    return true;
  }

  public int getId()
  {
    return 3140;
  }

  public String aKB()
  {
    return this.dOI;
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