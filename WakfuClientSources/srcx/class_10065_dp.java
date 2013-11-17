import java.nio.ByteBuffer;

public class dp extends aRw
{
  private String TB;

  public void F(String paramString)
  {
    this.TB = paramString;
  }

  public byte[] encode()
  {
    byte[] arrayOfByte = dzp.qC(this.TB);

    ByteBuffer localByteBuffer = ByteBuffer.allocate(2 + arrayOfByte.length);
    localByteBuffer.putShort((short)arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 13003;
  }
}