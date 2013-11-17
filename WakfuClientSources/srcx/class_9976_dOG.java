import java.nio.ByteBuffer;

public class dOG extends aRw
{
  private String hfY;

  public byte[] encode()
  {
    byte[] arrayOfByte = dzp.qC(this.hfY);

    ByteBuffer localByteBuffer = ByteBuffer.allocate(1 + arrayOfByte.length);

    localByteBuffer.put((byte)arrayOfByte.length);
    localByteBuffer.put(arrayOfByte);

    return a((byte)4, localByteBuffer.array());
  }

  public int getId()
  {
    return 3135;
  }

  public void pG(String paramString)
  {
    this.hfY = paramString;
  }
}