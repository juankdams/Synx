import java.nio.ByteBuffer;

public class Oq extends aRw
{
  private long cfv;
  private long cfw;
  private short cfx;

  public byte[] encode()
  {
    int i = 18;

    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);

    localByteBuffer.putLong(this.cfv);
    localByteBuffer.putLong(this.cfw);
    localByteBuffer.putShort(this.cfx);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 5211;
  }

  public void bP(long paramLong) {
    this.cfv = paramLong;
  }

  public void bQ(long paramLong) {
    this.cfw = paramLong;
  }

  public void S(short paramShort) {
    this.cfx = paramShort;
  }
}