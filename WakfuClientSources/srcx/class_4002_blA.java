import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class blA extends dzz
{
  protected static final Logger K = Logger.getLogger(blA.class);
  private long kD;
  private long fCF;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);

    this.kD = localByteBuffer.getLong();
    this.fCF = localByteBuffer.getLong();

    return true;
  }

  public int getId() {
    return 6324;
  }

  public long gA() {
    return this.kD;
  }

  public long bwK() {
    return this.fCF;
  }
}