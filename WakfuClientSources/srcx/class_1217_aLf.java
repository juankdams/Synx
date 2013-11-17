import java.nio.ByteBuffer;

public class aLf extends aRw
{
  private final long cfv;
  private final dKf epu;

  public aLf(long paramLong, dKf paramdKf)
  {
    this.cfv = paramLong;
    this.epu = paramdKf;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(12 + this.epu.O());
    localByteBuffer.putInt(this.epu.getId());
    localByteBuffer.putLong(this.cfv);
    this.epu.g(localByteBuffer);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 5309;
  }
}