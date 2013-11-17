import java.nio.ByteBuffer;

public class sv extends dzz
{
  private int bbC;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bbC = localByteBuffer.getInt();

    return true;
  }

  public int getId() {
    return 5502;
  }

  public int zU() {
    return this.bbC;
  }
}