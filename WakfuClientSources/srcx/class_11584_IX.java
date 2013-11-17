import java.nio.ByteBuffer;

public class IX extends aRw
{
  private final cSi bSd = new cSi();
  private final cbQ bSe = new cbQ();

  public byte[] encode()
  {
    int i = this.bSd.size();
    ByteBuffer localByteBuffer = ByteBuffer.allocate(1 + 12 * i);
    localByteBuffer.put((byte)i);
    for (int j = 0; j < i; j++)
    {
      localByteBuffer.putInt(this.bSd.get(j));
      localByteBuffer.putLong(this.bSe.get(j));
    }
    return a((byte)3, localByteBuffer.array());
  }

  public void a(int paramInt, long paramLong)
  {
    this.bSd.add(paramInt);
    this.bSe.add(paramLong);
  }

  public int getId()
  {
    return 13201;
  }
}