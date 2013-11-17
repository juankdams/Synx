import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class akG extends aRw
{
  protected static final Logger K = Logger.getLogger(akG.class);
  private final long dlx;

  public akG(long paramLong)
  {
    this.dlx = paramLong;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);

    localByteBuffer.putLong(this.dlx);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 4195;
  }
}