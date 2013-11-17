import java.nio.ByteBuffer;

public class bkP extends aRw
{
  private int bdj = -1;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.bdj);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 8011;
  }

  public void cS(int paramInt) {
    this.bdj = paramInt;
  }
}