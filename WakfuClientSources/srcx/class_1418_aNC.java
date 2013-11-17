import java.nio.ByteBuffer;

public class aNC extends dzz
{
  private byte[] etG;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    int i = localByteBuffer.getShort() & 0xFFFF;
    if (i > 0) {
      this.etG = new byte[i];
      localByteBuffer.get(this.etG);
    }
    return true;
  }

  public byte[] bem() {
    return this.etG;
  }

  public int getId() {
    return 9602;
  }
}