import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class cFP extends dzz
{
  protected static final Logger K = Logger.getLogger(cFP.class);
  private long iAN;
  private short etD;
  private long iAO;
  private byte iAP;
  private byte dMs;

  public cFP()
  {
    this.iAN = -1L;
    this.etD = -1;
    this.iAO = 0L;
    this.iAP = -1;
    this.dMs = -1;
  }

  public boolean a(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte.length == 13) || (paramArrayOfByte.length == 21)) {
      ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
      this.iAN = localByteBuffer.getLong();
      this.etD = localByteBuffer.getShort();
      this.iAP = localByteBuffer.get();
      this.dMs = localByteBuffer.get();
      int i = localByteBuffer.get();
      if (i == 1)
        this.iAO = localByteBuffer.getLong();
      else {
        this.iAO = 0L;
      }
    }
    return false;
  }

  public int getId() {
    return 5216;
  }

  public long cBf() {
    return this.iAN;
  }

  public short bej() {
    return this.etD;
  }

  public long cBg() {
    return this.iAO;
  }

  public byte cBh() {
    return this.iAP;
  }

  public byte getDestinationPosition() {
    return this.dMs;
  }
}