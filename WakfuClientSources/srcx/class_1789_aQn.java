import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class aQn extends aRw
{
  protected static final Logger K = Logger.getLogger(aQn.class);
  private long eNd;
  private long eNe;
  private boolean eNf;

  public void eA(long paramLong)
  {
    this.eNd = paramLong;
  }

  public void eB(long paramLong) {
    this.eNe = paramLong;
  }

  public void dP(boolean paramBoolean) {
    this.eNf = paramBoolean;
  }

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(17);
    localByteBuffer.putLong(this.eNd);
    localByteBuffer.putLong(this.eNe);
    localByteBuffer.put((byte)(this.eNf ? 1 : 0));
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 5247;
  }
}