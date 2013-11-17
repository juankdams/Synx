import java.nio.ByteBuffer;

public class KG extends dzz
{
  private byte[] bXj;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.bXj = new byte[localByteBuffer.getShort() & 0xFFFF];
    localByteBuffer.get(this.bXj);

    return true;
  }

  public int getId()
  {
    return 2046;
  }

  public byte[] Vf()
  {
    return this.bXj;
  }
}