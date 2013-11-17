import java.nio.ByteBuffer;

public class and extends dzz
{
  private long dqt;
  private long kh;

  public long azO()
  {
    return this.dqt;
  }

  public long aiQ() {
    return this.kh;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dqt = localByteBuffer.getLong();
    this.kh = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 5236;
  }
}