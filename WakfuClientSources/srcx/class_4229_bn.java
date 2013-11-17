import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class bn extends aRw
{
  protected static final Logger K = Logger.getLogger(bn.class);
  private long kh;

  public void h(long paramLong)
  {
    this.kh = paramLong;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.putLong(this.kh);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 10115;
  }
}