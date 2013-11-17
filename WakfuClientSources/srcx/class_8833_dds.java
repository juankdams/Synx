import java.nio.ByteBuffer;

public class dds extends aRw
{
  private long diD;
  private long cfv;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(16);
    localByteBuffer.putLong(this.diD);
    localByteBuffer.putLong(this.cfv);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 15983;
  }

  public void cS(long paramLong) {
    this.diD = paramLong;
  }

  public void bP(long paramLong) {
    this.cfv = paramLong;
  }
}