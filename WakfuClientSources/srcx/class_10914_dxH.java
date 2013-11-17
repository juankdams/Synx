import java.nio.ByteBuffer;

public class dxH extends dzz
{
  private int cpF;
  private int lEz;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length != 8) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cpF = localByteBuffer.getInt();
    this.lEz = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 15200;
  }

  public int acm() {
    return this.cpF;
  }

  public int dcA() {
    return this.lEz;
  }
}