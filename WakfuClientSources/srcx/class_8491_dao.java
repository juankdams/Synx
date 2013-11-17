import java.nio.ByteBuffer;

public class dao extends aRw
{
  private long fAU;
  private int eeH;

  public dao(long paramLong, int paramInt)
  {
    this.fAU = paramLong;
    this.eeH = paramInt;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(12);

    localByteBuffer.putLong(this.fAU);
    localByteBuffer.putInt(this.eeH);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15941;
  }
}