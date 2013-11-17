import java.nio.ByteBuffer;

public class dOn extends dzz
{
  private long kM;
  private CG ax;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.kM = localByteBuffer.getLong();
    this.ax = CG.eu(localByteBuffer.get());
    return true;
  }

  public int getId() {
    return 4118;
  }

  public long eW() {
    return this.kM;
  }

  public CG E() {
    return this.ax;
  }

  public int eo()
  {
    return 0;
  }
}