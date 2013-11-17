import java.nio.ByteBuffer;

public class csg extends aRw
{
  long bwS;
  long iI;

  public void bA(long paramLong)
  {
    this.bwS = paramLong;
  }

  public void g(long paramLong) {
    this.iI = paramLong;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(16);
    localByteBuffer.putLong(this.bwS);
    localByteBuffer.putLong(this.iI);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 575;
  }
}