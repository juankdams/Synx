import java.nio.ByteBuffer;

public class QN extends aRw
{
  private int aHQ;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);

    localByteBuffer.putInt(this.aHQ);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15703;
  }

  public void aS(int paramInt) {
    this.aHQ = paramInt;
  }
}