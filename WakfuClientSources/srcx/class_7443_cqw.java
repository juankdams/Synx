import java.nio.ByteBuffer;

public final class cqw extends dsQ
{
  private long cGi;
  private long iao;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aN(localByteBuffer);
    this.cGi = localByteBuffer.getLong();
    this.iao = localByteBuffer.getLong();
    return true;
  }

  public long cpG() {
    return this.iao;
  }

  public long cpH() {
    return this.cGi;
  }

  public int eo() {
    return getId();
  }

  public dPD ep() {
    return dPD.mir;
  }

  public int getId() {
    return 8412;
  }
}