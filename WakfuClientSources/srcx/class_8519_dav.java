import java.nio.ByteBuffer;

public class dav extends cVp
{
  private long fst;
  private long ayG;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dON = localByteBuffer.get();
    this.dOO = localByteBuffer.getShort();
    this.eoe = localByteBuffer.getLong();

    this.fst = localByteBuffer.getLong();
    this.ayG = localByteBuffer.getLong();
    return true;
  }

  public long ll() {
    return this.ayG;
  }

  public int getId() {
    return 4206;
  }

  public long cwa() {
    return this.fst;
  }
}