import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class aVK extends aRw
{
  protected static final Logger K = Logger.getLogger(aVK.class);
  private long eXQ;
  private boolean eNf;

  public void eL(long paramLong)
  {
    this.eXQ = paramLong;
  }

  public void dP(boolean paramBoolean) {
    this.eNf = paramBoolean;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(9);
    localByteBuffer.putLong(this.eXQ);
    localByteBuffer.put((byte)(this.eNf ? 1 : 0));
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 10113;
  }
}