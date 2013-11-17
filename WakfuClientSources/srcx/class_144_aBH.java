import java.nio.ByteBuffer;

public class aBH extends aRw
{
  long bwS;

  public void dN(long paramLong)
  {
    this.bwS = paramLong;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putLong(this.bwS);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 571;
  }
}