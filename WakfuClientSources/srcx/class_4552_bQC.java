import java.nio.ByteBuffer;

public class bQC extends cxw
{
  private short gYW;
  private short dhr;

  public byte[] encode()
  {
    int i = 27;
    if (this.ilw != 0L)
      i += 10;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);

    localByteBuffer.putLong(this.bkH);
    localByteBuffer.putLong(this.htC);
    localByteBuffer.putLong(this.ilv);
    localByteBuffer.putShort(this.dhr);
    if (this.ilw != 0L) {
      localByteBuffer.put((byte)1);
      localByteBuffer.putLong(this.ilw);
      localByteBuffer.putShort(this.gYW);
    } else {
      localByteBuffer.put((byte)0);
    }
    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 5213;
  }

  public void l(short paramShort) {
    this.gYW = paramShort;
  }

  public void aC(short paramShort) {
    this.dhr = paramShort;
  }
}