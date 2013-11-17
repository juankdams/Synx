import java.nio.ByteBuffer;

public class Gq extends aRw
{
  private long bwS;
  private String aGr;

  public void bA(long paramLong)
  {
    this.bwS = paramLong;
  }

  public void aP(String paramString) {
    this.aGr = paramString;
  }

  public byte[] encode() {
    byte[] arrayOfByte = dzp.qC(this.aGr);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(9 + arrayOfByte.length);
    localByteBuffer.putLong(this.bwS);
    if (arrayOfByte.length < 127) {
      localByteBuffer.put((byte)arrayOfByte.length);
      localByteBuffer.put(arrayOfByte);
    }
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 587;
  }
}