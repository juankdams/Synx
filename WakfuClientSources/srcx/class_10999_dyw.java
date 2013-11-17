import java.nio.ByteBuffer;

public final class dyw extends aRw
{
  private int lFc;

  public dyw(int paramInt)
  {
    this.lFc = paramInt;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.lFc);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 8112;
  }
}