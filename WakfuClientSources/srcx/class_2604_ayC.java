import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class ayC extends aRw
{
  protected static final Logger K = Logger.getLogger(ayC.class);
  private byte dON;
  private short dOO;

  public byte[] encode()
  {
    int i = 3;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
    localByteBuffer.put(this.dON);
    localByteBuffer.putShort(this.dOO);
    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 4171;
  }

  public void bt(byte paramByte)
  {
    this.dON = paramByte;
  }

  public void aS(short paramShort)
  {
    this.dOO = paramShort;
  }
}