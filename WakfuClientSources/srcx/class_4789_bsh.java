import java.nio.ByteBuffer;

public final class bsh extends dzz
{
  private byte bwR;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bwR = localByteBuffer.get();
    return true;
  }

  public byte Kh() {
    return this.bwR;
  }

  public int getId() {
    return 7998;
  }
}