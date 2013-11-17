import java.nio.ByteBuffer;

public class kw extends aRw
{
  private long kD;
  private int hY;
  private int hZ;
  private short aOl;
  private boolean aOm;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(19);

    localByteBuffer.putLong(this.kD);
    localByteBuffer.putInt(this.hY);
    localByteBuffer.putInt(this.hZ);
    localByteBuffer.putShort(this.aOl);
    localByteBuffer.put((byte)(this.aOm ? 1 : 0));

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 8001;
  }

  public void O(long paramLong) {
    this.kD = paramLong;
  }

  public void h(int paramInt1, int paramInt2, short paramShort) {
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.aOl = paramShort;
  }

  public void sn() {
    this.aOm = true;
  }
}