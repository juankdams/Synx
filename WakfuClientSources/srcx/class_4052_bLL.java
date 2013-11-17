import java.nio.ByteBuffer;

public class bLL extends aRw
{
  private int aTl;

  public void bP(int paramInt)
  {
    this.aTl = paramInt;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);

    localByteBuffer.putInt(this.aTl);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 10047;
  }
}