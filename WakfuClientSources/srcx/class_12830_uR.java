import java.nio.ByteBuffer;

public class uR extends aRw
{
  private int ie;
  private byte biX;

  public void dc(int paramInt)
  {
    this.ie = paramInt;
  }

  public void G(byte paramByte) {
    this.biX = paramByte;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(5);
    localByteBuffer.putInt(this.ie);
    localByteBuffer.put(this.biX);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId() {
    return 20035;
  }
}