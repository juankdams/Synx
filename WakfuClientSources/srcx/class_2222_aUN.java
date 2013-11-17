import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class aUN extends aRw
{
  private static final Logger K = Logger.getLogger(aUN.class);
  private int eWc;
  private int eWd;
  private byte eWe;
  private byte eWf;

  public byte[] encode()
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(10);
    localByteBuffer.putInt(this.eWc);
    localByteBuffer.put(this.eWe);
    localByteBuffer.putInt(this.eWd);
    localByteBuffer.put(this.eWf);
    return a((byte)6, localByteBuffer.array());
  }

  public int getId()
  {
    return 20201;
  }

  public void nZ(int paramInt) {
    this.eWc = paramInt;
  }

  public void oa(int paramInt) {
    this.eWd = paramInt;
  }

  public void cr(byte paramByte) {
    this.eWf = paramByte;
  }

  public void cs(byte paramByte) {
    this.eWe = paramByte;
  }
}