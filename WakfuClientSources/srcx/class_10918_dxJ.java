import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class dxJ extends aRw
{
  protected static final Logger K = Logger.getLogger(dxJ.class);
  private long lEB;
  private cVf lyh;

  public dxJ(long paramLong, cVf paramcVf)
  {
    this.lEB = paramLong;
    this.lyh = paramcVf;
  }

  public byte[] encode() {
    int i = 9;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);

    localByteBuffer.putLong(this.lEB);
    localByteBuffer.put(this.lyh.bJ());

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 4193;
  }
}