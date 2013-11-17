import java.nio.ByteBuffer;

public class WW extends dzz
{
  private long bkH;
  private int cGS;
  private short aFe;
  private boolean cGT;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bkH = localByteBuffer.getLong();
    this.cGS = localByteBuffer.getInt();
    this.aFe = localByteBuffer.getShort();
    this.cGT = (localByteBuffer.get() != 0);
    return true;
  }

  public int getId()
  {
    return 11102;
  }

  public int ok() {
    return this.cGS;
  }

  public long EN() {
    return this.bkH;
  }

  public short nP() {
    return this.aFe;
  }

  public boolean ajl() {
    return this.cGT;
  }
}