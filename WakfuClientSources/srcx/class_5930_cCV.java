import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class cCV extends aRw
{
  private static final Logger K = Logger.getLogger(cCV.class);
  private int boF;

  public byte[] encode()
  {
    int i = 4;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
    localByteBuffer.putInt(this.boF);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 15621;
  }

  public void du(int paramInt) {
    this.boF = paramInt;
  }
}