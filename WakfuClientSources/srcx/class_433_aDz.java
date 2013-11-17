import java.nio.ByteBuffer;

public class aDz extends aRw
{
  private String dYs;
  private long dYt;

  public aDz(String paramString, long paramLong)
  {
    this.dYs = paramString;
    this.dYt = paramLong;
  }

  public byte[] encode() {
    byte[] arrayOfByte = dzp.qC(this.dYs);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(1 + arrayOfByte.length + 8);
    localByteBuffer.put((byte)arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);
    localByteBuffer.putLong(this.dYt);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20065;
  }
}