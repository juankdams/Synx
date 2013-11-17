import java.nio.ByteBuffer;

public class VT extends dzz
{
  private long kh;
  private boolean coU;

  public long aiQ()
  {
    return this.kh;
  }

  public boolean isLocked() {
    return this.coU;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.kh = localByteBuffer.getLong();
    this.coU = (localByteBuffer.get() != 0);
    return localByteBuffer.remaining() == 0;
  }

  public int getId() {
    return 10108;
  }
}