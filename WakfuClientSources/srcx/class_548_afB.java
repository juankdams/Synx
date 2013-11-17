import java.nio.ByteBuffer;

public class afB extends aRw
{
  private String cYx;

  public afB(String paramString)
  {
    this.cYx = paramString;
  }

  public byte[] encode()
  {
    byte[] arrayOfByte = dzp.qC(this.cYx);
    byte b = (byte)arrayOfByte.length;

    ByteBuffer localByteBuffer = ByteBuffer.allocate(b + 2);

    localByteBuffer.put(b);
    localByteBuffer.put(arrayOfByte);

    return a((byte)1, localByteBuffer.array());
  }

  public int getId()
  {
    return 1027;
  }

  public void setEmail(String paramString) {
    this.cYx = paramString;
  }
}