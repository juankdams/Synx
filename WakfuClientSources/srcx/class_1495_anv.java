import java.nio.ByteBuffer;

public class anv extends dWi
{
  private int cfh;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aY(localByteBuffer);
    this.cfh = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 8030;
  }

  public int lQ() {
    return this.cfh;
  }
}