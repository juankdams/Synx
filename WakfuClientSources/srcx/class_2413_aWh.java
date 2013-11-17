import java.nio.ByteBuffer;

public class aWh extends dzz
{
  private String bSn;
  private Yp btC;
  private int fbp;

  public String aJm()
  {
    return this.bSn;
  }

  public Yp HK() {
    return this.btC;
  }

  public int getResultCode() {
    return this.fbp;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.btC = Yp.cj(localByteBuffer.getLong());
    this.fbp = localByteBuffer.getInt();
    byte[] arrayOfByte = new byte[localByteBuffer.remaining()];
    localByteBuffer.get(arrayOfByte);
    this.bSn = dzp.aJ(arrayOfByte);
    return true;
  }

  public int getId()
  {
    return 20026;
  }
}