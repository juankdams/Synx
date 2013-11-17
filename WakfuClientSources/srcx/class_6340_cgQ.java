import java.nio.ByteBuffer;

public class cgQ extends aRw
{
  private final CG aXX;

  public cgQ(CG paramCG)
  {
    this.aXX = paramCG;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(1);
    localByteBuffer.put((byte)this.aXX.m_index);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 4117;
  }
}