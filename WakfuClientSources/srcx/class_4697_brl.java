import java.nio.ByteBuffer;

public class brl extends aRw
{
  private long cfv;
  private long aLD;
  private short etD;

  public byte[] encode()
  {
    int i = 18;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);

    localByteBuffer.putLong(this.cfv);
    localByteBuffer.putLong(this.aLD);
    localByteBuffer.putShort(this.etD);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 6009;
  }

  public void bP(long paramLong) {
    this.cfv = paramLong;
  }

  public void setExchangeId(long paramLong)
  {
    this.aLD = paramLong;
  }

  public void bU(short paramShort)
  {
    this.etD = paramShort;
  }
}