import java.nio.ByteBuffer;

public class dIm extends aRw
{
  protected byte cUt;
  protected int cUu;

  public byte apK()
  {
    return this.cUt;
  }

  public dIm(byte paramByte, int paramInt) {
    this.cUt = paramByte;
    this.cUu = paramInt;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(13);
    localByteBuffer.put(this.cUt);
    localByteBuffer.putInt(this.cUu);
    localByteBuffer.putLong(System.nanoTime());
    return a(this.cUt, localByteBuffer.array());
  }

  public int getId()
  {
    return 107;
  }
}