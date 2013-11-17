import java.nio.ByteBuffer;

public class agc extends dzz
{
  private int aGC;
  private byte[] cZs;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.aGC = localByteBuffer.getInt();

    int i = localByteBuffer.getShort() & 0xFFFF;
    this.cZs = new byte[i];
    localByteBuffer.get(this.cZs);

    return true;
  }

  public int CB() {
    return this.aGC;
  }

  public byte[] art() {
    return this.cZs;
  }

  public int getId() {
    return 15334;
  }
}