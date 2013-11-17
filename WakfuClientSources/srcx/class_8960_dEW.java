import java.nio.ByteBuffer;

public class dEW extends dsQ
{
  private long lOe;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aN(localByteBuffer);
    this.lOe = localByteBuffer.getLong();
    return true;
  }

  public int getId()
  {
    return 6204;
  }

  public int eo()
  {
    return 0;
  }

  public dPD ep()
  {
    return dPD.mhw;
  }

  public long dgC() {
    return this.lOe;
  }
}