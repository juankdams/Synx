import java.nio.ByteBuffer;

public class dll extends aRw
{
  private long bwS;
  private cYq aHo;

  public void bA(long paramLong)
  {
    this.bwS = paramLong;
  }

  public void h(dxL paramdxL) {
    this.aHo = new cYq(paramdxL);
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(16);
    localByteBuffer.putLong(this.bwS);
    localByteBuffer.putLong(this.aHo.rP());
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 585;
  }
}