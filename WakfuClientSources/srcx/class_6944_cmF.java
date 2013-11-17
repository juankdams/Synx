import java.nio.ByteBuffer;

public class cmF extends aRw
{
  private long dPu;
  private long hRx;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(16);
    localByteBuffer.putLong(this.dPu);
    localByteBuffer.putLong(this.hRx);

    return a((byte)3, localByteBuffer.array());
  }

  public void hA(long paramLong) {
    this.dPu = paramLong;
  }

  public void hB(long paramLong) {
    this.hRx = paramLong;
  }

  public int getId()
  {
    return 13101;
  }
}