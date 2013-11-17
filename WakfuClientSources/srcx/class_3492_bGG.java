import java.nio.ByteBuffer;

public class bGG extends dzz
{
  private short dpZ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dpZ = localByteBuffer.getShort();
    return true;
  }

  public int getId() {
    return 11228;
  }

  public short azJ() {
    return this.dpZ;
  }
}