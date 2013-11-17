import java.nio.ByteBuffer;

public class boH extends dsQ
{
  private long aXW;
  private int eei;
  private int eej;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aN(localByteBuffer);

    this.aXW = localByteBuffer.getLong();
    this.eei = localByteBuffer.getInt();
    this.eej = localByteBuffer.getInt();
    return true;
  }

  public int getId()
  {
    return 8106;
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
    return dPD.mhn;
  }

  public int byo() {
    return this.eei;
  }

  public int byp() {
    return this.eej;
  }
}