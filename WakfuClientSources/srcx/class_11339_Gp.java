import java.nio.ByteBuffer;

public class Gp extends dsQ
{
  private short bOD;
  private byte[] bOE;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aN(localByteBuffer);
    this.bOD = localByteBuffer.getShort();

    if (localByteBuffer.remaining() > 0) {
      this.bOE = new byte[localByteBuffer.getShort()];
      localByteBuffer.get(this.bOE);
    }

    return true;
  }

  public byte[] Qo() {
    return this.bOE;
  }

  public int getId()
  {
    return 8100;
  }

  public short Qp()
  {
    return this.bOD;
  }

  public int eo()
  {
    return 0;
  }

  public dPD ep()
  {
    return dPD.mhp;
  }
}