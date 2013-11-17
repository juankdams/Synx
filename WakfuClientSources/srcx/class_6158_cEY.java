import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class cEY extends dzz
{
  protected static final Logger K = Logger.getLogger(cEY.class);
  protected static final boolean aRN = false;
  private boolean bvn;
  private int iyZ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    int i = localByteBuffer.get();
    this.bvn = (i == 1);
    this.iyZ = (localByteBuffer.remaining() > 0 ? localByteBuffer.getInt() : -1);

    return true;
  }

  public int getId() {
    return 4180;
  }

  public boolean IR() {
    return this.bvn;
  }

  public int cAD() {
    return this.iyZ;
  }
}