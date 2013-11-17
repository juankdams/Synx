import java.nio.ByteBuffer;

public class blD extends dzz
{
  private long bkK;

  public long sN()
  {
    return this.bkK;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bkK = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 10002;
  }
}