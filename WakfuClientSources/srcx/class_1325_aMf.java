import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class aMf extends cVp
{
  protected static final Logger K = Logger.getLogger(aMf.class);

  private byte cqy = 0;
  private long cqz = 0L;
  private byte cqA = 0;
  private int aRQ = 0;
  private byte erb = 0;
  private int hY;
  private int hZ;
  private double erc;
  private int dFY;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dON = localByteBuffer.get();
    this.dOO = localByteBuffer.getShort();
    this.eoe = localByteBuffer.getLong();

    this.cqz = localByteBuffer.getLong();
    this.cqy = localByteBuffer.get();
    this.hY = localByteBuffer.getInt();
    this.hZ = localByteBuffer.getInt();
    this.cqA = localByteBuffer.get();
    this.aRQ = localByteBuffer.getInt();
    this.erb = localByteBuffer.get();
    this.erc = localByteBuffer.getDouble();
    this.dFY = localByteBuffer.getInt();
    return true;
  }

  public int getId() {
    return 4174;
  }

  public byte acF() {
    return this.cqy;
  }

  public long acG() {
    return this.cqz;
  }

  public byte acH() {
    return this.cqA;
  }

  public byte acK() {
    return this.erb;
  }

  public int getX() {
    return this.hY;
  }

  public int getY() {
    return this.hZ;
  }

  public int eo() {
    return this.aRQ;
  }

  public double bdv() {
    return this.erc;
  }

  public int aFY() {
    return this.dFY;
  }
}