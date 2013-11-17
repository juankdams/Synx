import java.nio.ByteBuffer;

public class bZy extends aRw
{
  private int aGC;
  private byte bwk;
  private int aDH;

  public void aM(int paramInt)
  {
    this.aGC = paramInt;
  }

  public void dB(byte paramByte) {
    this.bwk = paramByte;
  }

  public void aG(int paramInt) {
    this.aDH = paramInt;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(9);
    localByteBuffer.putInt(this.aGC);
    localByteBuffer.put(this.bwk);
    localByteBuffer.putInt(this.aDH);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 15329;
  }
}