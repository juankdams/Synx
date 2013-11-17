import java.nio.ByteBuffer;

public class cbN extends aRw
{
  private final int boF;
  private final auY cAz;

  public cbN(int paramInt, auY paramauY)
  {
    this.boF = paramInt;
    this.cAz = paramauY;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(5 + this.cAz.O());

    localByteBuffer.putInt(this.boF);
    localByteBuffer.put((byte)this.cAz.um().ordinal());
    this.cAz.v(localByteBuffer);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15625;
  }
}