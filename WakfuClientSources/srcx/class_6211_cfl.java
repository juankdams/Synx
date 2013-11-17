import java.nio.ByteBuffer;

public class cfl extends dzz
{
  private byte[] hAf = new byte[4];

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 4, true)) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    localByteBuffer.get(this.hAf);
    return true;
  }

  public int getId()
  {
    return 110;
  }

  public byte[] cie() {
    return this.hAf;
  }
}