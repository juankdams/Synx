import java.nio.ByteBuffer;

public class abL extends aRw
{
  private byte cQi;
  private boolean cQj;
  private long cQk;
  private byte cQl;

  public void aG(byte paramByte)
  {
    this.cQi = paramByte;
  }

  public void bL(boolean paramBoolean) {
    this.cQj = paramBoolean;
  }

  public void cx(long paramLong) {
    this.cQk = paramLong;
  }

  public void aH(byte paramByte) {
    this.cQl = paramByte;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(11);

    localByteBuffer.putLong(this.cQk);
    localByteBuffer.put(this.cQl);
    localByteBuffer.put(this.cQi);
    localByteBuffer.put((byte)(this.cQj ? 1 : 0));

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 10037;
  }
}