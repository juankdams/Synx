import java.nio.ByteBuffer;
import java.util.ArrayList;

final class t
{
  private cLm aq = null;
  private Wf ar = null;
  private final ArrayList as = new ArrayList(0);

  private t(dA paramdA) {  } 
  public void z() { this.at.aq = this.aq;
    this.at.ar = this.ar;
    this.at.as.clear();
    this.at.as.ensureCapacity(this.as.size());
    this.at.as.addAll(this.as); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  public void A() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 0)
    {
      return false;
    }if (paramInt < 1) {
      boolean bool = e(paramByteBuffer);
      if (bool) {
        A();
        return true;
      }
      return false;
    }

    return false;
  }
}