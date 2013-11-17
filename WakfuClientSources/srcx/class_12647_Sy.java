import java.nio.ByteBuffer;

public class Sy extends dzz
{
  private bHu ctx = new bHu();
  private long kM;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.kM = localByteBuffer.getLong();
    int i = localByteBuffer.get();
    for (int j = 0; j < i; j++)
      this.ctx.add(localByteBuffer.getShort());
    return true;
  }

  public int getId() {
    return 11106;
  }

  public bHu afy()
  {
    return this.ctx;
  }

  public long eW() {
    return this.kM;
  }
}