import java.nio.ByteBuffer;

public class JR extends aRw
{
  private int aRQ;
  private long ayH;

  public JR(int paramInt, long paramLong)
  {
    this.aRQ = paramInt;
    this.ayH = paramLong;
  }

  public byte[] encode() {
    int i = 12;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);

    localByteBuffer.putInt(this.aRQ);
    localByteBuffer.putLong(this.ayH);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 4167;
  }
}