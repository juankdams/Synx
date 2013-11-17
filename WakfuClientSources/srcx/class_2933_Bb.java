import java.nio.ByteBuffer;

public class Bb extends dzz
{
  private byte bwR;
  private long bwS;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bwR = localByteBuffer.get();
    this.bwS = localByteBuffer.getLong();
    return true;
  }

  public byte Kh() {
    return this.bwR;
  }

  public long Ki() {
    return this.bwS;
  }

  public int getId() {
    return 566;
  }
}