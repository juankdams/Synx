import java.nio.ByteBuffer;

public class cPy extends dsQ
{
  private long aXW;
  private byte kyD;

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 21, true)) {
      return false;
    }
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    aN(localByteBuffer);
    this.aXW = localByteBuffer.getLong();
    this.kyD = localByteBuffer.get();

    return true;
  }

  public int getId() {
    return 4520;
  }

  public long AD() {
    return this.aXW;
  }

  public byte cGE() {
    return this.kyD;
  }

  public int eo() {
    return 0;
  }

  public dPD ep() {
    return dPD.mhi;
  }
}