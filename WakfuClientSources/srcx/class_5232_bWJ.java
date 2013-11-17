import java.nio.ByteBuffer;

public class bWJ extends aRw
{
  private long bwS;
  private String hh;

  public void bA(long paramLong)
  {
    this.bwS = paramLong;
  }

  public void setTitle(String paramString) {
    this.hh = paramString;
  }

  public byte[] encode() {
    byte[] arrayOfByte = dzp.qC(this.hh);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(9 + arrayOfByte.length);
    localByteBuffer.putLong(this.bwS);
    if (arrayOfByte.length < 32) {
      localByteBuffer.put((byte)arrayOfByte.length);
      localByteBuffer.put(arrayOfByte);
    }
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 589;
  }
}