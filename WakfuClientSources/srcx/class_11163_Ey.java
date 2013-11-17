import java.nio.ByteBuffer;

public final class Ey extends aRw
{
  private int bJP;

  public Ey(int paramInt)
  {
    this.bJP = paramInt;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.bJP);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId()
  {
    return 20093;
  }
}