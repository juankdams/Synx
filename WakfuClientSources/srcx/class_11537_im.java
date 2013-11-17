import java.nio.ByteBuffer;

public class im extends aRw
{
  private int aHQ;
  private byte aHR;
  private long aHS;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(13);

    localByteBuffer.putInt(this.aHQ);
    localByteBuffer.put(this.aHR);
    localByteBuffer.putLong(this.aHS);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15705;
  }

  public void aS(int paramInt) {
    this.aHQ = paramInt;
  }

  public void i(byte paramByte) {
    this.aHR = paramByte;
  }

  public void G(long paramLong) {
    this.aHS = paramLong;
  }
}