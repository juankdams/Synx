import java.nio.ByteBuffer;

public class SO extends dzz
{
  private long aLD;
  private byte cuu;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.aLD = localByteBuffer.getLong();
    this.cuu = localByteBuffer.get();

    return true;
  }

  public int getId()
  {
    return 6050;
  }

  public byte agd() {
    return this.cuu;
  }

  public long acp() {
    return this.aLD;
  }
}