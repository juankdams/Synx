import java.nio.ByteBuffer;

public class yh extends aRw
{
  private long brC;
  private short aFe;

  public void aW(long paramLong)
  {
    this.brC = paramLong;
  }

  public void l(short paramShort) {
    this.aFe = paramShort;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(10);
    localByteBuffer.putLong(this.brC);
    localByteBuffer.putShort(this.aFe);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 10117;
  }
}