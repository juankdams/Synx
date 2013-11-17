import java.nio.ByteBuffer;

public class aJw
{
  private long aT;
  private long dUK;
  private String m_name;
  private String aLm;
  private int cHZ;
  private int ejK;
  private short cZu;

  public long CD()
  {
    return this.aT;
  }

  public long CH() {
    return this.dUK;
  }

  public String getName() {
    return this.m_name;
  }

  public String getDescription() {
    return this.aLm;
  }

  public int ajD() {
    return this.cHZ;
  }

  public int bbe() {
    return this.ejK;
  }

  public short nU() {
    return this.cZu;
  }

  public void U(ByteBuffer paramByteBuffer) {
    this.aT = paramByteBuffer.getLong();
    this.dUK = paramByteBuffer.getLong();
    byte[] arrayOfByte1 = new byte[paramByteBuffer.getInt()];
    paramByteBuffer.get(arrayOfByte1);
    this.m_name = dzp.aJ(arrayOfByte1);
    byte[] arrayOfByte2 = new byte[paramByteBuffer.getInt()];
    paramByteBuffer.get(arrayOfByte2);
    this.aLm = dzp.aJ(arrayOfByte2);
    this.cHZ = paramByteBuffer.getInt();
    this.ejK = paramByteBuffer.getInt();
    this.cZu = paramByteBuffer.getShort();
  }
}