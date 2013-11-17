import java.nio.ByteBuffer;

public class ajo extends aRw
{
  private long diD;
  private byte cQl;
  private long diE;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(17);
    localByteBuffer.putLong(this.diD);
    localByteBuffer.put(this.cQl);
    localByteBuffer.putLong(this.diE);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 15987;
  }

  public void cS(long paramLong) {
    this.diD = paramLong;
  }

  public void aH(byte paramByte) {
    this.cQl = paramByte;
  }

  public void cT(long paramLong) {
    this.diE = paramLong;
  }
}