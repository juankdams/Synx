import java.nio.ByteBuffer;

public class Zr extends dzz
{
  private short TD;
  private byte[] cKP;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.TD = localByteBuffer.getShort();
    this.cKP = new byte[localByteBuffer.remaining()];
    localByteBuffer.get(this.cKP);
    return true;
  }

  public short Lk() {
    return this.TD;
  }

  public byte[] akA() {
    return this.cKP;
  }

  public int getId()
  {
    return 15950;
  }
}