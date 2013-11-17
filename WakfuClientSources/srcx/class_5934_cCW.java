import java.nio.ByteBuffer;

public class cCW extends aRw
{
  private long dPu;
  private long ivD;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(16);
    localByteBuffer.putLong(this.dPu);
    localByteBuffer.putLong(this.ivD);

    return a((byte)3, localByteBuffer.array());
  }

  public void ig(long paramLong) {
    this.ivD = paramLong;
  }

  public void hA(long paramLong) {
    this.dPu = paramLong;
  }

  public int getId()
  {
    return 4189;
  }
}