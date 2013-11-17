import java.nio.ByteBuffer;

public class bJn extends aRw
{
  private long aXW;
  private long fCN;
  private int bMs;
  private int bMt;
  private short bMu;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(26);

    localByteBuffer.putLong(this.aXW);
    localByteBuffer.putLong(this.fCN);
    localByteBuffer.putInt(this.bMs);
    localByteBuffer.putInt(this.bMt);
    localByteBuffer.putShort(this.bMu);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 8109;
  }

  public void X(long paramLong)
  {
    this.aXW = paramLong;
  }

  public void fG(long paramLong)
  {
    this.fCN = paramLong;
  }

  public void z(int paramInt1, int paramInt2, short paramShort)
  {
    this.bMs = paramInt1;
    this.bMt = paramInt2;
    this.bMu = paramShort;
  }
}