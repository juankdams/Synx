import java.nio.ByteBuffer;

public class cnI extends dsQ
{
  private Long hUp;
  private long hUq;
  private boolean bUX;

  public int eo()
  {
    return 0;
  }

  public dPD ep()
  {
    return dPD.mhs;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aN(localByteBuffer);
    this.hUp = Long.valueOf(localByteBuffer.getLong());
    this.hUq = localByteBuffer.getLong();
    this.bUX = (localByteBuffer.get() == 1);

    return true;
  }

  public int getId()
  {
    return 8034;
  }

  public long anE() {
    return this.hUp.longValue();
  }

  public long cod() {
    return this.hUq;
  }

  public boolean IR() {
    return this.bUX;
  }
}