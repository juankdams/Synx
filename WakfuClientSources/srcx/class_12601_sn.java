import java.nio.ByteBuffer;

public class sn extends aRw
{
  private final byte[] baw;
  private final String bax;

  public sn(byte[] paramArrayOfByte, String paramString)
  {
    this.baw = paramArrayOfByte;
    this.bax = paramString;
  }

  public byte[] encode()
  {
    byte[] arrayOfByte = dzp.qC(this.bax);
    int i = (byte)arrayOfByte.length;

    ByteBuffer localByteBuffer = ByteBuffer.allocate(2 + this.baw.length + 1 + i);

    localByteBuffer.putShort((short)this.baw.length);
    localByteBuffer.put(this.baw);
    localByteBuffer.put(i);
    localByteBuffer.put(arrayOfByte);

    return a((byte)1, localByteBuffer.array());
  }

  public int getId()
  {
    return 1029;
  }
}