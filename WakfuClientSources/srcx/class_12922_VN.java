import java.nio.ByteBuffer;

public final class VN extends dzz
{
  private short az;
  private int cAU;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.az = localByteBuffer.getShort();
    this.cAU = localByteBuffer.getInt();

    return true;
  }

  public short D() {
    return this.az;
  }

  public int aiO() {
    return this.cAU;
  }

  public int getId() {
    return 15655;
  }
}