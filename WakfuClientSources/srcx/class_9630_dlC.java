import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class dlC extends dzz
{
  private static final Logger K = Logger.getLogger(dlC.class);
  private kb dUl;
  private cYq lja;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    this.lja = cYq.jq(localByteBuffer.getLong());
    this.dUl = kb.I(localByteBuffer.getLong());
    return true;
  }

  public cds aMV() {
    return this.dUl;
  }

  public cYq cTr() {
    return this.lja;
  }

  public int getId() {
    return 20004;
  }
}