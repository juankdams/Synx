import java.nio.ByteBuffer;

public class aTD extends aRw
{
  private String eRP;

  public aTD(String paramString)
  {
    this.eRP = paramString;
  }

  public byte[] encode() {
    byte[] arrayOfByte = dzp.qC(this.eRP);
    ByteBuffer localByteBuffer = ByteBuffer.allocate(1 + arrayOfByte.length);
    localByteBuffer.put((byte)arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20055;
  }
}