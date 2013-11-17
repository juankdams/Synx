import java.nio.ByteBuffer;
import org.apache.log4j.Logger;

public class or extends aRw
{
  private static final Logger K = Logger.getLogger(or.class);
  private final dsW aTw = new cLk(this);

  private final dFu aTx = new dFu();
  private int aTy = 0;

  public void a(dFu paramdFu) {
    paramdFu.b(this.aTw);
  }

  public void bR(int paramInt) {
    this.aTy = paramInt;
  }

  public byte[] encode() {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4 + this.aTx.size() * 8);
    localByteBuffer.putInt(this.aTy);
    for (aso localaso = this.aTx.abR(); localaso.hasNext(); ) {
      localaso.fl();
      localByteBuffer.putInt(localaso.zY());
      localByteBuffer.putInt(localaso.value());
    }
    return a((byte)3, localByteBuffer.array());
  }

  public int getId() {
    return 15731;
  }
}