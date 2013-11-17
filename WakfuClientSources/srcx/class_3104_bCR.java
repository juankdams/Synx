import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class bCR extends dzz
{
  private static final Logger K = Logger.getLogger(bCR.class);
  private cYq dUj;
  private String gxK;
  private String gxL;
  private cYq gxM;
  private kb gxN;
  private boolean gxO;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.dUj = cYq.jq(localByteBuffer.getLong());
    this.gxM = cYq.jq(localByteBuffer.getLong());
    this.gxN = kb.I(localByteBuffer.getLong());
    this.gxO = (localByteBuffer.get() == 1);
    int i = localByteBuffer.get() == 1 ? 1 : 0;
    if (i != 0) {
      byte[] arrayOfByte1 = new byte[localByteBuffer.get()];
      localByteBuffer.get(arrayOfByte1);
      this.gxK = dzp.aJ(arrayOfByte1);
    }
    int j = localByteBuffer.get() == 1 ? 1 : 0;
    if (j != 0) {
      byte[] arrayOfByte2 = new byte[localByteBuffer.get()];
      localByteBuffer.get(arrayOfByte2);
      this.gxL = dzp.aJ(arrayOfByte2);
    }
    return true;
  }

  public dxL aMT() {
    return this.dUj;
  }

  public cYq bLs() {
    return this.gxM;
  }

  public kb bLt() {
    return this.gxN;
  }

  public boolean bLu() {
    return this.gxO;
  }

  public String bLv() {
    return this.gxK;
  }

  public String bLw() {
    return this.gxL;
  }

  public int getId() {
    return 20006;
  }
}