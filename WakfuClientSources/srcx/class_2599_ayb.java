import java.nio.ByteBuffer;

public class ayb
{
  public String name;
  public String dNE;
  public String dNF;
  public boolean dNG;
  public long bIa;
  public short bWC;
  public byte bUn;
  public long aGh;

  public ayb(bpc parambpc)
  {
  }

  public void C(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    byte[] arrayOfByte1 = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte1);
    this.name = dzp.aJ(arrayOfByte1);

    byte[] arrayOfByte2 = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte2);
    this.dNE = dzp.aJ(arrayOfByte2);

    byte[] arrayOfByte3 = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(arrayOfByte3);
    this.dNF = dzp.aJ(arrayOfByte3);

    this.dNG = (localByteBuffer.get() == 1);

    this.bIa = localByteBuffer.getLong();

    this.bWC = localByteBuffer.getShort();

    this.bUn = localByteBuffer.get();

    this.aGh = localByteBuffer.getLong();
  }
}