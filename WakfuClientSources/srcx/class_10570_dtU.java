import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class dtU extends aRw
{
  private static final Logger K = Logger.getLogger(dtU.class);
  private byte beg;

  public byte[] encode()
  {
    int i = 1;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
    localByteBuffer.put(this.beg);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId()
  {
    return 8405;
  }

  public void fy(byte paramByte) {
    this.beg = paramByte;
  }
}