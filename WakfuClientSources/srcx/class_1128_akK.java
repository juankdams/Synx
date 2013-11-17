import java.nio.ByteBuffer;

public class akK extends aRw
{
  private int ie;

  public void dc(int paramInt)
  {
    this.ie = paramInt;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.putInt(this.ie);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20037;
  }
}