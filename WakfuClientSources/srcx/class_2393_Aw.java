import java.nio.ByteBuffer;

public final class Aw extends dzz
{
  private short bwb;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bwb = localByteBuffer.getShort();
    return true;
  }

  public short Jz() {
    return this.bwb;
  }

  public int getId() {
    return 20099;
  }
}