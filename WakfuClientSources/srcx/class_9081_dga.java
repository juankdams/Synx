import java.nio.ByteBuffer;

public class dga extends dzz
{
  private int cpF;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length != 4) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cpF = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 15202;
  }

  public int acm() {
    return this.cpF;
  }
}