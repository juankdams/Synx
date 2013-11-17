import java.nio.ByteBuffer;

public class bxg extends dzz
{
  private byte bwR;
  private long bwl;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bwR = localByteBuffer.get();
    this.bwl = localByteBuffer.getLong();
    return true;
  }

  public byte Kh() {
    return this.bwR;
  }

  public long JP() {
    return this.bwl;
  }

  public int getId() {
    return 570;
  }
}