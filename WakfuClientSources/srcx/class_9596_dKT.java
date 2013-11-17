import java.nio.ByteBuffer;

public class dKT extends aRw
{
  private final long lZr;
  private final long lZs;

  public dKT(long paramLong1, long paramLong2)
  {
    this.lZr = paramLong1;
    this.lZs = paramLong2;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(16);

    localByteBuffer.putLong(this.lZr);
    localByteBuffer.putLong(this.lZs);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15725;
  }
}