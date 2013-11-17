import java.nio.ByteBuffer;

public class baj extends aRw
{
  private int ie;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(6);
    localByteBuffer.putInt(this.ie);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 15643;
  }

  public void dc(int paramInt) {
    this.ie = paramInt;
  }
}