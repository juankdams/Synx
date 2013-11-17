import java.nio.ByteBuffer;

public class wy extends aRw
{
  private boolean bmu;

  public void aj(boolean paramBoolean)
  {
    this.bmu = paramBoolean;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(1);

    localByteBuffer.put((byte)(this.bmu ? 1 : 0));

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 10045;
  }
}