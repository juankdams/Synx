import java.nio.ByteBuffer;

public class aEu extends dsQ
{
  private long ead;
  private long eae;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 28, true)) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aN(localByteBuffer);

    this.ead = localByteBuffer.getLong();
    this.eae = localByteBuffer.getLong();

    return true;
  }

  public int getId()
  {
    return 4506;
  }

  public long aQF()
  {
    return this.ead;
  }

  public long aQG()
  {
    return this.eae;
  }

  public int eo()
  {
    return 0;
  }

  public dPD ep()
  {
    return dPD.mhh;
  }
}