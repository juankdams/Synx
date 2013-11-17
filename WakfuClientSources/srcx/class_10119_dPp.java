import java.nio.ByteBuffer;

public class dPp extends aRw
{
  private String aGr;

  public dPp(String paramString)
  {
    this.aGr = paramString;
  }

  public byte[] encode() {
    byte[] arrayOfByte = dzp.qC(this.aGr);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4 + arrayOfByte.length);
    localByteBuffer.putInt(arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20079;
  }
}