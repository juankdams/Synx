import java.nio.ByteBuffer;

public class Zq extends aRw
{
  private final int aPh;
  private final boolean bFz;

  public Zq(int paramInt, boolean paramBoolean)
  {
    this.aPh = paramInt;
    this.bFz = paramBoolean;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(5);

    localByteBuffer.putInt(this.aPh);
    localByteBuffer.put((byte)(this.bFz ? 1 : 0));

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15607;
  }
}