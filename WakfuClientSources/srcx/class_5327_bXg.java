import java.nio.ByteBuffer;

public class bXg extends dzz
{
  private long iI;
  private byte hlW;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.iI = localByteBuffer.getLong();
    this.hlW = localByteBuffer.get();

    return true;
  }

  public int getId()
  {
    return 4112;
  }

  public long eq() {
    return this.iI;
  }

  public byte ccC() {
    return this.hlW;
  }
}