import java.nio.ByteBuffer;

public class dWx extends aRw
{
  private String mwL;

  public void sl(String paramString)
  {
    this.mwL = paramString;
  }

  public byte[] encode() {
    byte[] arrayOfByte = dzp.qC(this.mwL);
    int i = arrayOfByte.length;

    ByteBuffer localByteBuffer = ByteBuffer.allocate(4 + i);
    localByteBuffer.putInt(i);
    localByteBuffer.put(arrayOfByte);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20015;
  }
}