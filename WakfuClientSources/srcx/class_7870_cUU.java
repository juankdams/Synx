import java.nio.ByteBuffer;

public class cUU extends dsQ
{
  private long aXW;
  private int kHz;
  private boolean aCl;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aN(localByteBuffer);

    this.aXW = localByteBuffer.getLong();
    this.kHz = localByteBuffer.getInt();
    this.aCl = (localByteBuffer.get() == 1);

    return true;
  }

  public int getId()
  {
    return 8410;
  }

  public long AD()
  {
    return this.aXW;
  }

  public int cJT() {
    return this.kHz;
  }

  public boolean isBlocking() {
    return this.aCl;
  }

  public int eo()
  {
    return 0;
  }

  public dPD ep()
  {
    return dPD.mib;
  }
}