import java.nio.ByteBuffer;

public class bOt extends aRw
{
  private String bQi;

  public byte[] encode()
  {
    byte[] arrayOfByte = dzp.qC(this.bQi);

    ByteBuffer localByteBuffer = ByteBuffer.allocate(1 + arrayOfByte.length);

    localByteBuffer.put((byte)arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);

    return a((byte)6, localByteBuffer.array());
  }

  public int getId()
  {
    return 3163;
  }

  public void ca(String paramString)
  {
    this.bQi = paramString;
  }
}