import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class aXv extends cVp
{
  protected static final Logger K = Logger.getLogger(aXv.class);
  private long ctZ;
  private int Sk;
  private int hY;
  private int hZ;
  private short aOl;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dON = localByteBuffer.get();
    this.dOO = localByteBuffer.getShort();
    this.eoe = localByteBuffer.getLong();
    this.ctZ = localByteBuffer.getInt();
    this.Sk = localByteBuffer.getInt();
    this.hY = localByteBuffer.getInt();
    this.hZ = localByteBuffer.getInt();
    this.aOl = localByteBuffer.getShort();
    return true;
  }

  public int getId() {
    return 4218;
  }

  public long getDuration() {
    return this.ctZ;
  }

  public int getX() {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public short IB() {
    return this.aOl;
  }

  public int gC() {
    return this.Sk;
  }
}