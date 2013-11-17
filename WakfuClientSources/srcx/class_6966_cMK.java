import java.nio.ByteBuffer;

public class cMK extends dzz
{
  private long krZ;
  private byte[] ksa;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.krZ = localByteBuffer.getLong();
    this.ksa = new byte[localByteBuffer.remaining()];
    localByteBuffer.get(this.ksa);

    return true;
  }

  public long cFC() {
    return this.krZ;
  }

  public byte[] cFD() {
    return this.ksa;
  }

  public int getId()
  {
    return 1032;
  }
}