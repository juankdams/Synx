import java.nio.ByteBuffer;

public class aiY extends aRw
{
  private long dhx;
  private long brD;

  public aiY(long paramLong1, long paramLong2)
  {
    this.dhx = paramLong1;
    this.brD = paramLong2;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(16);
    localByteBuffer.putLong(this.dhx);
    localByteBuffer.putLong(this.brD);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20071;
  }
}