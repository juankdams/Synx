import java.nio.ByteBuffer;

public class cIC extends dzz
{
  private long aFa;
  private short aFe;
  private int bsY;
  private bCe bsX;

  public long oj()
  {
    return this.aFa;
  }

  public short nP() {
    return this.aFe;
  }

  public int Hv() {
    return this.bsY;
  }

  public bCe Hy() {
    return this.bsX;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aFa = localByteBuffer.getLong();
    this.aFe = localByteBuffer.getShort();
    this.bsY = localByteBuffer.getInt();
    this.bsX = bCe.co(localByteBuffer.getShort());
    return true;
  }

  public int getId() {
    return 5238;
  }
}