import java.nio.ByteBuffer;

public final class cHg extends aRw
{
  private String bSn;

  public byte[] encode()
  {
    byte[] arrayOfByte = dzp.qC(this.bSn);

    int i = 1 + arrayOfByte.length;

    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);

    localByteBuffer.put((byte)arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);

    return a((byte)2, localByteBuffer.array());
  }

  public int getId()
  {
    return 2060;
  }

  public void cf(String paramString) {
    this.bSn = paramString;
  }
}