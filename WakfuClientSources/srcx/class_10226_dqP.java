import java.nio.ByteBuffer;

public class dqP extends dzz
{
  private long iI;
  private int ltm;
  private short ltn;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.ltm = localByteBuffer.getInt();
    this.iI = localByteBuffer.getLong();
    this.ltn = localByteBuffer.getShort();

    return true;
  }

  public int getId()
  {
    return 4110;
  }

  public long eq() {
    return this.iI;
  }

  public int cXY() {
    return this.ltm;
  }

  public short cXZ() {
    return this.ltn;
  }
}