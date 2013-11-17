import java.nio.ByteBuffer;

public class aZF extends aRw
{
  private byte dMs;
  private long diE;

  public byte[] encode()
  {
    int i = 9;

    ByteBuffer localByteBuffer = ByteBuffer.allocate(9);

    localByteBuffer.putLong(this.diE);
    localByteBuffer.put(this.dMs);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 5220;
  }

  public void cz(byte paramByte) {
    this.dMs = paramByte;
  }

  public void cT(long paramLong) {
    this.diE = paramLong;
  }
}