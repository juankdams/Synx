import java.nio.ByteBuffer;

public class aNB extends dzz
{
  private int aHQ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aHQ = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 15702;
  }

  public int bel() {
    return this.aHQ;
  }
}