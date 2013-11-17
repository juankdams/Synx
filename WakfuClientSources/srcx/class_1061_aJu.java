import java.nio.ByteBuffer;

public class aJu extends dzz
{
  private byte[] cwZ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cwZ = new byte[localByteBuffer.getShort()];
    localByteBuffer.get(this.cwZ);
    return true;
  }

  public int getId() {
    return 4122;
  }

  public byte[] agH() {
    return this.cwZ;
  }
}