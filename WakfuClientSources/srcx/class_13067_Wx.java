import java.nio.ByteBuffer;

public class Wx extends dzz
{
  private byte cGt;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cGt = localByteBuffer.get();
    return true;
  }

  public int getId() {
    return 15962;
  }

  public byte aiZ() {
    return this.cGt;
  }
}