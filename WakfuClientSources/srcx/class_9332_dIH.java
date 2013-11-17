import java.nio.ByteBuffer;

public class dIH extends aRw
{
  private int aVF;

  public byte[] encode()
  {
    byte[] arrayOfByte = new byte[4];
    ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
    localByteBuffer.putInt(this.aVF);
    return a((byte)3, arrayOfByte);
  }

  public int getId() {
    return 11101;
  }

  public void cb(int paramInt) {
    this.aVF = paramInt;
  }
}