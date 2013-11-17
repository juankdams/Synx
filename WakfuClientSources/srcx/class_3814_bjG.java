import java.nio.ByteBuffer;

public class bjG extends dzz
{
  private long fAc;
  private int fAd;

  public long buT()
  {
    return this.fAc;
  }

  public int buU() {
    return this.fAd;
  }

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.fAc = localByteBuffer.getInt();
    this.fAd = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 5242;
  }
}