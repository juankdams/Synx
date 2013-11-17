import java.nio.ByteBuffer;

public class bXE extends dzz
{
  private String hmP;
  private String bSn;
  private long hmQ;
  private short hmR;
  private byte hmS;
  private long hmT;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    byte[] arrayOfByte1 = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte1);
    this.hmP = dzp.aJ(arrayOfByte1);

    byte[] arrayOfByte2 = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte2);
    this.bSn = dzp.aJ(arrayOfByte2);

    this.hmQ = localByteBuffer.getLong();

    this.hmR = localByteBuffer.getShort();

    this.hmS = localByteBuffer.get();

    this.hmT = localByteBuffer.getLong();

    return true;
  }

  public int getId()
  {
    return 3156;
  }

  public String ccV()
  {
    return this.hmP;
  }

  public long ccW()
  {
    return this.hmQ;
  }

  public String aJm() {
    return this.bSn;
  }

  public short ccX() {
    return this.hmR;
  }

  public byte ccY() {
    return this.hmS;
  }

  public long ccZ() {
    return this.hmT;
  }
}