import java.nio.ByteBuffer;

public class afD extends dzz
{
  private int aNN;
  private byte cYF;
  private long cYG;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.aNN = localByteBuffer.getInt();
    this.cYF = localByteBuffer.get();
    this.cYG = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 11204;
  }

  public int se()
  {
    return this.aNN;
  }

  public byte arc() {
    return this.cYF;
  }

  public long ard() {
    return this.cYG;
  }
}