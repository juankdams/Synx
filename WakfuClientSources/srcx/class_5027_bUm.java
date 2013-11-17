import java.nio.ByteBuffer;

public class bUm extends dsQ
{
  private long aXW;
  private CG ax;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    aN(localByteBuffer);
    this.aXW = localByteBuffer.getLong();
    this.ax = CG.eu(localByteBuffer.get());
    return true;
  }

  public int getId() {
    return 4522;
  }

  public long AD() {
    return this.aXW;
  }

  public CG E() {
    return this.ax;
  }

  public int eo() {
    return 0;
  }

  public dPD ep() {
    return dPD.mhk;
  }
}