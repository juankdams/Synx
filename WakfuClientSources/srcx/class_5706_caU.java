import java.nio.ByteBuffer;

public class caU extends aRw
{
  private int aGC;
  private int hrK;
  private byte hrL;

  public void a(int paramInt1, bmt parambmt, int paramInt2)
  {
    this.aGC = paramInt1;
    this.hrL = parambmt.bUy;
    this.hrK = paramInt2;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(9);
    localByteBuffer.putInt(this.aGC);
    localByteBuffer.putInt(this.hrK);
    localByteBuffer.put(this.hrL);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 15331;
  }
}