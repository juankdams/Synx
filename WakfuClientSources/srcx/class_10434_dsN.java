import java.nio.ByteBuffer;
import java.util.ArrayList;

final class dsN
{
  private final dA lcq = new dA();

  private dsN(dhk paramdhk) {  } 
  public void z() { this.eRA.lcq.aq = this.lcq.aq;
    this.eRA.lcq.ar = this.lcq.ar;
    this.eRA.lcq.as.clear();
    this.eRA.lcq.as.ensureCapacity(this.lcq.as.size());
    this.eRA.lcq.as.addAll(this.lcq.as); }

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