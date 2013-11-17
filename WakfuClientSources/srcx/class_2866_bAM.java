import java.nio.ByteBuffer;

public final class bAM extends aRw
{
  private final int aGC;
  private final boolean coU;

  public bAM(int paramInt, boolean paramBoolean)
  {
    this.aGC = paramInt;
    this.coU = paramBoolean;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(5);

    localByteBuffer.putInt(this.aGC);
    localByteBuffer.put((byte)(this.coU ? 1 : 0));

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 8009;
  }
}