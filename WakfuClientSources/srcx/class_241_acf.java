import java.nio.ByteBuffer;

public class acf extends aRw
{
  private int aGC;
  private long kh;
  private long brC;

  public void aM(int paramInt)
  {
    this.aGC = paramInt;
  }

  public void h(long paramLong) {
    this.kh = paramLong;
  }

  public void aW(long paramLong) {
    this.brC = paramLong;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(20);
    localByteBuffer.putInt(this.aGC);
    localByteBuffer.putLong(this.kh);
    localByteBuffer.putLong(this.brC);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 15315;
  }
}