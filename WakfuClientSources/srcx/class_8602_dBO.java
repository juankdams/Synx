import java.nio.ByteBuffer;

public abstract class dBO extends aRw
{
  private String bQi;

  public byte[] encode()
  {
    byte[] arrayOfByte = dzp.qC(this.bQi);

    ByteBuffer localByteBuffer = ByteBuffer.allocate(1 + arrayOfByte.length);

    localByteBuffer.put((byte)arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);

    return a((byte)3, localByteBuffer.array());
  }

  public void ca(String paramString)
  {
    this.bQi = paramString;
  }

  public String Xd() {
    return this.bQi;
  }
}