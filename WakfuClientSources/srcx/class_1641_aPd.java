import java.nio.ByteBuffer;

public class aPd extends aRw
{
  private long aXW;
  private long brC;
  private byte bPk;
  private int bMs;
  private int bMt;
  private short bMu;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(27);

    localByteBuffer.putLong(this.aXW);
    localByteBuffer.putLong(this.brC);
    localByteBuffer.put(this.bPk);
    localByteBuffer.putInt(this.bMs);
    localByteBuffer.putInt(this.bMt);
    localByteBuffer.putShort(this.bMu);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 8107;
  }

  public void X(long paramLong)
  {
    this.aXW = paramLong;
  }

  public void aW(long paramLong)
  {
    this.brC = paramLong;
  }

  public void V(byte paramByte) {
    this.bPk = paramByte;
  }

  public void z(int paramInt1, int paramInt2, short paramShort)
  {
    this.bMs = paramInt1;
    this.bMt = paramInt2;
    this.bMu = paramShort;
  }
}