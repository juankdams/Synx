import java.nio.ByteBuffer;

public class dke extends aRw
{
  private long cfv;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);

    localByteBuffer.putLong(this.cfv);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 5261;
  }

  public void bP(long paramLong) {
    this.cfv = paramLong;
  }
}