import java.nio.ByteBuffer;

public class sb extends dzz
{
  private int baj;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.baj = localByteBuffer.getInt();
    return true;
  }

  public int yC() {
    return this.baj;
  }

  public int getId() {
    return 11232;
  }
}