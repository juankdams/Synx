import java.nio.ByteBuffer;

public final class drk extends dzz
{
  private byte ltI;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.ltI = localByteBuffer.get();
    return true;
  }

  public int getId()
  {
    return 2072;
  }

  public byte Kh() {
    return this.ltI;
  }
}