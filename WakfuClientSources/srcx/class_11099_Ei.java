import java.nio.ByteBuffer;

public class Ei extends dWi
{
  private drv bIN;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aY(localByteBuffer);

    this.bIN = drv.aM(localByteBuffer);

    return true;
  }

  public int getId()
  {
    return 8158;
  }

  public drv MP() {
    return this.bIN;
  }
}