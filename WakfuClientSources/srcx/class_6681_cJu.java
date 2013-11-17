import java.nio.ByteBuffer;

public class cJu extends aRw
{
  public static final byte iHB = 0;
  public static final byte iHC = 1;
  private long bwS;
  private byte iHD;

  public void bA(long paramLong)
  {
    this.bwS = paramLong;
  }

  public void ep(byte paramByte) {
    this.iHD = paramByte;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(9);
    localByteBuffer.putLong(this.bwS);
    localByteBuffer.put(this.iHD);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 581;
  }
}