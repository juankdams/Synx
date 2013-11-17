import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class cnV extends cVp
{
  protected static final Logger K = Logger.getLogger(cnV.class);
  private int aHf;
  private long ctZ;
  private int Sk;
  private int bOr;
  private int bOs;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dON = localByteBuffer.get();
    this.dOO = localByteBuffer.getShort();
    this.eoe = localByteBuffer.getLong();
    this.aHf = localByteBuffer.getInt();
    this.ctZ = localByteBuffer.getInt();
    this.Sk = localByteBuffer.getInt();
    this.bOr = localByteBuffer.getInt();
    this.bOs = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 4172;
  }

  public int axX() {
    return this.aHf;
  }

  public long getDuration() {
    return this.ctZ;
  }

  public int bxE() {
    return this.bOr;
  }

  public int bxF() {
    return this.bOs;
  }

  public int gC() {
    return this.Sk;
  }
}