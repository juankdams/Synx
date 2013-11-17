import java.nio.ByteBuffer;

public class dQg extends aRw
{
  private long brC;
  private boolean mkn = false;
  private int hY;
  private int hZ;
  private short aOl;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(9 + (this.mkn ? 10 : 0));
    localByteBuffer.putLong(this.brC);
    if (this.mkn) {
      localByteBuffer.put((byte)1);
      localByteBuffer.putInt(this.hY);
      localByteBuffer.putInt(this.hZ);
      localByteBuffer.putShort(this.aOl);
    } else {
      localByteBuffer.put((byte)0);
    }
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 9105;
  }

  public void aW(long paramLong) {
    this.brC = paramLong;
  }

  public void d(int paramInt1, int paramInt2, short paramShort)
  {
    this.mkn = true;
    this.hY = paramInt1;
    this.hZ = paramInt2;
    this.aOl = paramShort;
  }
}