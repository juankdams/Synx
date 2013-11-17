import java.nio.ByteBuffer;

public class adK extends dzz
{
  protected byte cUt;
  protected int cUu;
  protected long cUv;
  protected long cUw;
  protected long cUx;
  protected long cUy;

  public byte apK()
  {
    return this.cUt;
  }

  public int getKey() {
    return this.cUu;
  }

  public long apL() {
    return this.cUv;
  }

  public long apM() {
    return this.cUw;
  }

  public long apN() {
    return this.cUx;
  }

  public long apO() {
    return this.cUy;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    if (!j(paramArrayOfByte.length, 29, true))
      return false;
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.cUt = localByteBuffer.get();
    this.cUu = localByteBuffer.getInt();
    this.cUv = localByteBuffer.getLong();
    this.cUw = localByteBuffer.getLong();
    this.cUx = localByteBuffer.getLong();
    this.cUy = System.nanoTime();
    return true;
  }

  public int getId()
  {
    return 108;
  }
}