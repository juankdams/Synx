import java.nio.ByteBuffer;

public class cyZ extends aRw
{
  private String hmP;

  public byte[] encode()
  {
    byte[] arrayOfByte = dzp.qC(this.hmP);

    ByteBuffer localByteBuffer = ByteBuffer.allocate(1 + arrayOfByte.length);

    localByteBuffer.put((byte)arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);

    return a((byte)4, localByteBuffer.array());
  }

  public int getId()
  {
    return 3133;
  }

  public void mA(String paramString)
  {
    this.hmP = paramString;
  }
}