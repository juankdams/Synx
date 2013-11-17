import java.nio.ByteBuffer;

public class ZB extends aRw
{
  private String aGr;

  public ZB(String paramString)
  {
    this.aGr = paramString;
  }

  public byte[] encode() {
    byte[] arrayOfByte = dzp.qC(this.aGr);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(1 + arrayOfByte.length);
    localByteBuffer.put((byte)arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20081;
  }
}