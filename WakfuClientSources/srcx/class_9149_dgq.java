import java.nio.ByteBuffer;

public class dgq extends dzz
{
  private String hmP;
  private String bSn;
  private long dES;
  private String lbp;
  private short aSi;
  private long gCz;
  private byte aHn;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    byte[] arrayOfByte1 = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte1);
    this.hmP = dzp.aJ(arrayOfByte1);

    byte[] arrayOfByte2 = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte2);
    this.bSn = dzp.aJ(arrayOfByte2);

    byte[] arrayOfByte3 = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte3);
    this.lbp = dzp.aJ(arrayOfByte3);

    this.dES = localByteBuffer.getLong();

    this.aSi = localByteBuffer.getShort();

    this.aHn = localByteBuffer.get();

    this.gCz = localByteBuffer.getLong();

    return true;
  }

  public int getId()
  {
    return 3148;
  }

  public String ccV()
  {
    return this.hmP;
  }

  public long aFL()
  {
    return this.dES;
  }

  public String aJm() {
    return this.bSn;
  }

  public byte xK() {
    return this.aHn;
  }

  public short uO() {
    return this.aSi;
  }

  public String cPP() {
    return this.lbp;
  }

  public long ayX() {
    return this.gCz;
  }
}