import java.nio.ByteBuffer;

public class qH extends aRw
{
  private long aXW;
  private CG aXX;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(9);

    localByteBuffer.putLong(this.aXW);
    localByteBuffer.put((byte)this.aXX.m_index);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 4521;
  }

  public void X(long paramLong)
  {
    this.aXW = paramLong;
  }

  public void a(CG paramCG)
  {
    this.aXX = paramCG;
  }
}