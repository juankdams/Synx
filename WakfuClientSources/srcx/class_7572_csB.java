import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class csB extends aRw
{
  protected static final Logger K = Logger.getLogger(csB.class);
  protected static final boolean aRN = false;
  private int aRQ;
  private int dhH;
  private int dhI;

  public csB(int paramInt1, int paramInt2, int paramInt3)
  {
    this.aRQ = paramInt1;
    this.dhH = paramInt2;
    this.dhI = paramInt3;
  }

  public byte[] encode() {
    int i = 12;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);

    localByteBuffer.putInt(this.aRQ);
    localByteBuffer.putInt(this.dhH);
    localByteBuffer.putInt(this.dhI);

    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 4143;
  }
}