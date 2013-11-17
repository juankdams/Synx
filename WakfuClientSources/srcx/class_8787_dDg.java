import java.nio.ByteBuffer;
import java.util.ArrayList;

final class dDg
{
  private int cMk = 0;
  private long aGh = 0L;
  private final dWa cMl = new dWa();
  private final ArrayList cMm = new ArrayList(0);

  private dDg(ZN paramZN) {  } 
  public void z() { this.lLu.cMk = this.cMk;
    this.lLu.aGh = this.aGh;
    this.lLu.cMl.ekc = this.cMl.ekc;
    this.lLu.cMl.ekd = this.cMl.ekd;
    this.lLu.cMl.eke = this.cMl.eke;
    this.lLu.cMl.ekf = this.cMl.ekf;
    this.lLu.cMm.clear();
    this.lLu.cMm.ensureCapacity(this.cMm.size());
    this.lLu.cMm.addAll(this.cMm); }

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