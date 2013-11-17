import java.nio.ByteBuffer;

public class Fq extends dzz
{
  private int bMF;
  private long bMG;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.bMF = localByteBuffer.getInt();
    this.bMG = localByteBuffer.getLong();
    return true;
  }

  public int getId() {
    return 15604;
  }

  public int OS() {
    return this.bMF;
  }

  public long OT() {
    return this.bMG;
  }
}