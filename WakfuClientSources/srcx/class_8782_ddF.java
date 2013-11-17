import java.nio.ByteBuffer;

public class ddF extends dzz
{
  private byte bwR;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bwR = localByteBuffer.get();
    return true;
  }

  public int getId()
  {
    return 2056;
  }

  public byte Kh()
  {
    return this.bwR;
  }
}