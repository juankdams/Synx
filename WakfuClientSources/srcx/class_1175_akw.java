import java.nio.ByteBuffer;

public class akw extends dsQ
{
  private long aXW;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aN(localByteBuffer);

    this.aXW = localByteBuffer.getLong();

    return true;
  }

  public int getId()
  {
    return 8104;
  }

  public long AD() {
    return this.aXW;
  }

  public int eo()
  {
    return 0;
  }

  public dPD ep()
  {
    return dPD.mho;
  }
}