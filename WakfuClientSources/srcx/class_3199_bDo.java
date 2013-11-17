import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class bDo extends dzz
{
  protected static final Logger K = Logger.getLogger(bDo.class);
  protected static final boolean aRN = false;
  private long gyW;
  private int aEz;
  private boolean bvn;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.gyW = localByteBuffer.getLong();
    this.aEz = localByteBuffer.getInt();
    int i = localByteBuffer.get();
    this.bvn = (i == 1);

    return true;
  }

  public int getId() {
    return 4142;
  }

  public long bMx() {
    return this.gyW;
  }

  public int ajS() {
    return this.aEz;
  }

  public boolean IR() {
    return this.bvn;
  }
}