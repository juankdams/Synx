import java.nio.ByteBuffer;

public class dGb extends aRw
{
  public static final byte lQx = 1;
  public static final byte lQy = 2;
  private long bwS;
  private byte lQz;
  private byte bkM;

  public void fJ(byte paramByte)
  {
    this.lQz = paramByte;
  }

  public void bA(long paramLong) {
    this.bwS = paramLong;
  }

  public void setType(byte paramByte) {
    this.bkM = paramByte;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(10);
    localByteBuffer.putLong(this.bwS);
    localByteBuffer.put(this.lQz);
    localByteBuffer.put(this.bkM);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 577;
  }
}