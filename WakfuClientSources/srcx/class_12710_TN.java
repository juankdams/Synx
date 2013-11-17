import java.nio.ByteBuffer;

public class TN extends dzz
{
  private byte[] cwZ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cwZ = new byte[localByteBuffer.get() & 0xFF];
    localByteBuffer.get(this.cwZ);
    return true;
  }

  public int getId() {
    return 4123;
  }

  public byte[] agH() {
    return this.cwZ;
  }
}