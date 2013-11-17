import java.nio.ByteBuffer;

public class cWR extends dsQ
{
  private Long hUp;

  public int eo()
  {
    return 0;
  }

  public dPD ep()
  {
    return dPD.mhr;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aN(localByteBuffer);
    this.hUp = Long.valueOf(localByteBuffer.getLong());

    return true;
  }

  public int getId()
  {
    return 8033;
  }

  public long anE() {
    return this.hUp.longValue();
  }
}