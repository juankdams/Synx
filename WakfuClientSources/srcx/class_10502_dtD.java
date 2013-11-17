import java.nio.ByteBuffer;

public class dtD extends aRw
{
  private int aGC;
  private int baj;
  private boolean lwF;

  public void aM(int paramInt)
  {
    this.aGC = paramInt;
  }

  public void zi(int paramInt) {
    this.baj = paramInt;
  }

  public void setSelection(boolean paramBoolean) {
    this.lwF = paramBoolean;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(9);
    localByteBuffer.putInt(this.aGC);
    localByteBuffer.putInt(this.baj);
    localByteBuffer.put((byte)(this.lwF ? 1 : 0));

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 15323;
  }
}