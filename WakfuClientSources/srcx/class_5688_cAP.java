import java.nio.ByteBuffer;

public class cAP extends dzz
{
  private byte cuu;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cuu = localByteBuffer.get();
    return true;
  }

  public int getId() {
    return 7904;
  }

  public byte agd()
  {
    return this.cuu;
  }
}