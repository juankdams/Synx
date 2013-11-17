import java.nio.ByteBuffer;

public final class cCR extends aRw
{
  private long dyK = -1L;
  private short ivA;

  public void jdMethod_if(long paramLong)
  {
    this.dyK = paramLong;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(10);

    localByteBuffer.putLong(this.dyK);
    localByteBuffer.putShort(this.ivA);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15265;
  }

  public void dt(short paramShort) {
    this.ivA = paramShort;
  }
}