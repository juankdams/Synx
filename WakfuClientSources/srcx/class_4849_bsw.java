import java.nio.ByteBuffer;

public class bsw extends aRw
{
  private long bwS;
  private String fZo;

  public void bA(long paramLong)
  {
    this.bwS = paramLong;
  }

  public void iO(String paramString) {
    this.fZo = paramString;
  }

  public byte[] encode() {
    byte[] arrayOfByte = dzp.qC(this.fZo);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(9 + arrayOfByte.length);
    localByteBuffer.putLong(this.bwS);
    localByteBuffer.put((byte)arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 579;
  }
}