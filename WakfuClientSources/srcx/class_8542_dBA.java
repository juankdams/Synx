import java.nio.ByteBuffer;

public final class dBA extends aRw
{
  private long aXW;
  private int baA;

  public void X(long paramLong)
  {
    this.aXW = paramLong;
  }

  public void Cp(int paramInt) {
    this.baA = paramInt;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(12);
    localByteBuffer.putLong(this.aXW);
    localByteBuffer.putInt(this.baA);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 8307;
  }
}