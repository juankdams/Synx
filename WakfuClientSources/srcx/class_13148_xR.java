import java.nio.ByteBuffer;

public final class xR extends aRw
{
  public boolean bqF = true;
  private long Tj;
  private long iI;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(16);
    localByteBuffer.putLong(this.Tj);
    localByteBuffer.putLong(this.iI);

    if (this.bqF)
      return a((byte)6, localByteBuffer.array());
    return a((byte)2, localByteBuffer.array());
  }

  public final int getId() {
    return 505;
  }

  public void aS(long paramLong) {
    this.Tj = paramLong;
  }

  public void g(long paramLong) {
    this.iI = paramLong;
  }

  public void al(boolean paramBoolean) {
    this.bqF = paramBoolean;
  }
}