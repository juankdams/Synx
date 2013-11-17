import java.nio.ByteBuffer;

public class HR extends aRw
{
  private String bQh;
  private String bQi;

  public byte[] encode()
  {
    byte[] arrayOfByte1 = dzp.qC(this.bQh);
    byte[] arrayOfByte2;
    try
    {
      arrayOfByte2 = dzp.qC(this.bQi);
    } catch (Exception localException) {
      arrayOfByte2 = this.bQi.getBytes();
    }

    ByteBuffer localByteBuffer = ByteBuffer.allocate(1 + arrayOfByte1.length + 1 + arrayOfByte2.length);

    localByteBuffer.put((byte)arrayOfByte1.length);
    localByteBuffer.put(arrayOfByte1);

    localByteBuffer.put((byte)arrayOfByte2.length);
    localByteBuffer.put(arrayOfByte2);

    return a((byte)4, localByteBuffer.array());
  }

  public int getId()
  {
    return 3155;
  }

  public void setUserName(String paramString)
  {
    this.bQh = paramString;
  }

  public void ca(String paramString)
  {
    this.bQi = paramString;
  }
}