import java.nio.ByteBuffer;

public class anb extends dzz
{
  private long kh;

  public long aiQ()
  {
    return this.kh;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.kh = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 10120;
  }
}