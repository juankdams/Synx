import java.nio.ByteBuffer;

public class djc extends dzz
{
  private short bxq;
  private short bxr;
  private short aTB;
  private short aTC;
  private short aTD;
  private short aTE;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.bxq = localByteBuffer.getShort();
    this.bxr = localByteBuffer.getShort();
    this.aTB = localByteBuffer.getShort();
    this.aTC = localByteBuffer.getShort();
    this.aTD = localByteBuffer.getShort();
    this.aTE = localByteBuffer.getShort();

    return true;
  }

  public short Ky() {
    return this.bxq;
  }

  public short Kz() {
    return this.bxr;
  }

  public short vQ() {
    return this.aTB;
  }

  public short vR() {
    return this.aTC;
  }

  public short vS() {
    return this.aTD;
  }

  public short vT() {
    return this.aTE;
  }

  public int getId()
  {
    return 5510;
  }
}