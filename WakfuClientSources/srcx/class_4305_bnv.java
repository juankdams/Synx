import java.nio.ByteBuffer;

public class bnv extends dzz
{
  private long cfv;
  private short aFe;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.cfv = localByteBuffer.getLong();
    this.aFe = localByteBuffer.getShort();
    return true;
  }

  public int getId()
  {
    return 5212;
  }

  public long anE() {
    return this.cfv;
  }

  public short nP() {
    return this.aFe;
  }
}