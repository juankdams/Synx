import java.nio.ByteBuffer;

public class VA extends aRw
{
  private final auY cAz;

  public VA(auY paramauY)
  {
    this.cAz = paramauY;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(1 + this.cAz.O());

    localByteBuffer.put((byte)this.cAz.um().ordinal());
    this.cAz.v(localByteBuffer);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15733;
  }
}