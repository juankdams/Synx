import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class aCZ extends cVp
{
  protected static final Logger K = Logger.getLogger(aCZ.class);

  public boolean a(byte[] paramArrayOfByte) {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    i(localByteBuffer);
    return true;
  }

  protected void i(ByteBuffer paramByteBuffer) {
    this.dON = paramByteBuffer.get();
    this.dOO = paramByteBuffer.getShort();
    this.eoe = paramByteBuffer.getLong();
    this.bFC = new byte[paramByteBuffer.remaining()];
    paramByteBuffer.get(this.bFC);
  }

  public int getId() {
    return 4170;
  }
}