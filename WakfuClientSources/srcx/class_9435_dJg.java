import java.nio.ByteBuffer;

public class dJg extends aRw
{
  private long aXW;
  private short bdn;

  public dJg(long paramLong, short paramShort)
  {
    this.aXW = paramLong;
    this.bdn = paramShort;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(10);
    localByteBuffer.putLong(this.aXW);
    localByteBuffer.putShort(this.bdn);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 8105;
  }
}