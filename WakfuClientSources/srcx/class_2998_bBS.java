import java.nio.ByteBuffer;

public class bBS extends cxw
{
  private short aFe;

  public byte[] encode()
  {
    int i = 18;

    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
    localByteBuffer.putLong(this.bkH);
    localByteBuffer.putLong(this.ilv);
    localByteBuffer.putShort(this.aFe);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 5209;
  }

  public void l(short paramShort) {
    this.aFe = paramShort;
  }
}