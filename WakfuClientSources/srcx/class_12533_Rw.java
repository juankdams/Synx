import java.nio.ByteBuffer;

public class Rw extends dzz
{
  private int aPh;
  private long crb;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aPh = localByteBuffer.getInt();
    this.crb = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 15602;
  }

  public int sY() {
    return this.aPh;
  }

  public long acT() {
    return this.crb;
  }
}