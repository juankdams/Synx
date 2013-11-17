import java.nio.ByteBuffer;

public class dAe extends dzz
{
  private byte bwR;
  private long lGL;
  private long lGM;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bwR = localByteBuffer.get();
    this.lGL = localByteBuffer.getLong();
    this.lGM = localByteBuffer.getLong();
    return true;
  }

  public byte Kh() {
    return this.bwR;
  }

  public long ddi() {
    return this.lGL;
  }

  public long ddj() {
    return this.lGM;
  }

  public int getId() {
    return 564;
  }
}