import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class bpb extends dzz
{
  protected static final Logger K = Logger.getLogger(bpb.class);
  protected static final boolean aRN = false;
  private byte fIK;
  private long ctZ;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.fIK = localByteBuffer.get();
    this.ctZ = localByteBuffer.getInt();

    return true;
  }

  public int getId() {
    return 4141;
  }

  public byte byF() {
    return this.fIK;
  }

  public long getDuration() {
    return this.ctZ;
  }
}