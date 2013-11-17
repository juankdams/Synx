import java.nio.ByteBuffer;
import java.util.ArrayList;

class cCF
{
  private static final int ivb = 10;
  private final int ivc;
  private final ArrayList ivd = new ArrayList();
  private final ArrayList ive = new ArrayList();
  private final Object ivf = new Object();

  public cCF(int paramInt) {
    this.ivc = paramInt;
  }

  public ByteBuffer cyL()
  {
    synchronized (this.ivf)
    {
      if (this.ive.isEmpty()) {
        for (int i = 0; i < 10; i++) {
          this.ive.add(ByteBuffer.allocate(this.ivc));
        }
      }
      if (this.ive.isEmpty()) {
        return null;
      }
      ByteBuffer localByteBuffer = (ByteBuffer)this.ive.remove(0);
      this.ivd.add(localByteBuffer);
      return localByteBuffer;
    }
  }

  public boolean aF(ByteBuffer paramByteBuffer)
  {
    if (paramByteBuffer == null) {
      throw new IllegalArgumentException("buffer = null");
    }
    synchronized (this.ivf) {
      if (!this.ivd.contains(paramByteBuffer)) {
        return false;
      }
      paramByteBuffer.clear();
      this.ivd.remove(paramByteBuffer);
      this.ive.add(paramByteBuffer);
      return true;
    }
  }
}