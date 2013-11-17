import java.nio.ByteBuffer;

public class afg extends dzz
{
  private long cXv;
  private long kM;
  private long aCq;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.cXv = localByteBuffer.getLong();
    this.kM = localByteBuffer.getLong();
    this.aCq = localByteBuffer.getLong();

    return true;
  }

  public int getId()
  {
    return 4530;
  }

  public long eW() {
    return this.kM;
  }

  public long aqN() {
    return this.cXv;
  }

  public long aqO() {
    return this.aCq;
  }
}