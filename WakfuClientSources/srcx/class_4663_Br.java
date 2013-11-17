import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public final class Br
{
  protected static final Logger K = Logger.getLogger(Br.class);
  private short bxq;
  private short bxr;
  private ArrayList bxs;

  public boolean a(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    return B(localByteBuffer);
  }

  public boolean B(ByteBuffer paramByteBuffer)
  {
    this.bxq = paramByteBuffer.getShort();
    this.bxr = paramByteBuffer.getShort();
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bxs = new ArrayList(i * 10);
    for (int j = 0; j < i; j++) {
      short s = paramByteBuffer.getShort();
      int k = paramByteBuffer.getShort() & 0xFFFF;
      for (int m = 0; m < k; m++) {
        dIE localdIE = new dIE(s);
        localdIE.d(paramByteBuffer.getInt(), this.bxq, this.bxr);
        this.bxs.add(localdIE);
      }
    }
    return true;
  }

  public short Ky()
  {
    return this.bxq;
  }

  public short Kz()
  {
    return this.bxr;
  }

  public ArrayList KA()
  {
    return this.bxs;
  }
}