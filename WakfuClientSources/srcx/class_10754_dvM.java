import java.nio.ByteBuffer;
import java.util.ArrayList;

final class dvM
{
  private final dA hmO = new dA();

  private dvM(bXC parambXC) {  } 
  public void z() { this.hiy.hmO.aq = this.hmO.aq;
    this.hiy.hmO.ar = this.hmO.ar;
    this.hiy.hmO.as.clear();
    this.hiy.hmO.as.ensureCapacity(this.hmO.as.size());
    this.hiy.hmO.as.addAll(this.hmO.as); }

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