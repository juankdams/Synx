import java.nio.ByteBuffer;

public class bxI extends aRw
{
  private final long giP;
  private final int buQ;

  public bxI(long paramLong, int paramInt)
  {
    this.giP = paramLong;
    this.buQ = paramInt;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(12);

    localByteBuffer.putLong(this.giP);
    localByteBuffer.putInt(this.buQ);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15711;
  }
}