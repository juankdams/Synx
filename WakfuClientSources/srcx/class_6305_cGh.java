import java.nio.ByteBuffer;

public class cGh extends aRw
{
  private int fsR;
  private long aLD;

  public byte[] encode()
  {
    int i = 12;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
    localByteBuffer.putLong(this.aLD);
    localByteBuffer.putInt(this.fsR);
    return a((byte)3, localByteBuffer.array());
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    throw new UnsupportedOperationException("On tente de décoder un message Client -> Server côté client");
  }

  public int getId()
  {
    return 6013;
  }

  public void xJ(int paramInt)
  {
    this.fsR = paramInt;
  }

  public void setExchangeId(long paramLong)
  {
    this.aLD = paramLong;
  }
}