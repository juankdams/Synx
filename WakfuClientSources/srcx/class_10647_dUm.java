import java.nio.ByteBuffer;

public class dUm extends aRw
{
  private int aHQ;
  private int iqa;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);

    localByteBuffer.putInt(this.aHQ);
    localByteBuffer.putInt(this.iqa);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15701;
  }

  public void aS(int paramInt) {
    this.aHQ = paramInt;
  }

  public void Eb(int paramInt) {
    this.iqa = paramInt;
  }
}