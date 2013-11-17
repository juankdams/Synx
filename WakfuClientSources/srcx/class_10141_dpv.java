import java.nio.ByteBuffer;

public class dpv extends aRw
{
  private long kM;
  private int hY;
  private int hZ;
  private short aOl;
  private boolean lqm;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(19);
    localByteBuffer.putLong(this.kM);
    localByteBuffer.putInt(this.hY);
    localByteBuffer.putInt(this.hZ);
    localByteBuffer.putShort(this.aOl);
    localByteBuffer.put((byte)(this.lqm ? 1 : 0));

    return a((byte)3, localByteBuffer.array());
  }

  public void j(long paramLong)
  {
    this.kM = paramLong;
  }

  public void ad(int paramInt1, int paramInt2, short paramShort)
  {
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.aOl = paramShort;
  }

  public void kc(boolean paramBoolean) {
    this.lqm = paramBoolean;
  }

  public int getId() {
    return 7901;
  }

  public void bc() {
    super.bc();
    this.kM = 0L;
  }
}