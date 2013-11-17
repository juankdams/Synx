import java.nio.ByteBuffer;

public class caO extends dzz
{
  private short az;
  private int cZL;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.az = localByteBuffer.getShort();
    this.cZL = localByteBuffer.getInt();

    return true;
  }

  public short D() {
    return this.az;
  }

  public int arM() {
    return this.cZL;
  }

  public int getId()
  {
    return 5522;
  }
}