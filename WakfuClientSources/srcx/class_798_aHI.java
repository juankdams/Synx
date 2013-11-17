import java.nio.ByteBuffer;

public class aHI extends aRw
{
  private long cYn;
  private byte cYo;
  private boolean cQj;

  public void dT(long paramLong)
  {
    this.cYn = paramLong;
  }

  public void bL(byte paramByte) {
    this.cYo = paramByte;
  }

  public void bL(boolean paramBoolean) {
    this.cQj = paramBoolean;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(10);

    localByteBuffer.putLong(this.cYn);
    localByteBuffer.put(this.cYo);
    localByteBuffer.put((byte)(this.cQj ? 1 : 0));

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 10035;
  }
}