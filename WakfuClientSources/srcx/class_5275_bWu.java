import java.nio.ByteBuffer;

public class bWu extends aRw
{
  private final int aPh;
  private final long bXM;
  private final boolean hiC;

  public bWu(int paramInt, long paramLong, boolean paramBoolean)
  {
    this.aPh = paramInt;
    this.bXM = paramLong;
    this.hiC = paramBoolean;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(13);

    localByteBuffer.putInt(this.aPh);
    localByteBuffer.putLong(this.bXM);
    localByteBuffer.put((byte)(this.hiC ? 1 : 0));

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15613;
  }
}