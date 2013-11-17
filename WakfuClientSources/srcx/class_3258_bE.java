import java.nio.ByteBuffer;

public class bE extends aRw
{
  private final long kD;
  private boolean kE;

  public bE(long paramLong, boolean paramBoolean)
  {
    this.kD = paramLong;
    this.kE = paramBoolean;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(9);

    localByteBuffer.putLong(this.kD);
    localByteBuffer.put((byte)(this.kE ? 1 : 0));

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 8003;
  }
}