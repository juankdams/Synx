import java.nio.ByteBuffer;
import java.util.ArrayList;

final class uN
{
  private final ArrayList biN = new ArrayList(0);
  private boolean biO = false;
  private final ArrayList biP = new ArrayList(0);
  private final ArrayList biQ = new ArrayList(0);

  private uN(bIq parambIq) {  } 
  public void z() { this.biR.biO = this.biO;
    this.biR.biP.clear();
    this.biR.biP.ensureCapacity(this.biP.size());
    this.biR.biP.addAll(this.biP);
    this.biR.biQ.clear();
    this.biR.biQ.ensureCapacity(this.biQ.size());
    this.biR.biQ.addAll(this.biQ); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    return true;
  }

  private boolean f(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.biN.clear();
    this.biN.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      tB localtB = new tB();
      boolean bool = localtB.b(paramByteBuffer, 1);
      if (!bool)
        return false;
      this.biN.add(localtB);
    }
    this.biO = (paramByteBuffer.get() == 1);
    return true;
  }

  public void A() {
  }

  public void DN() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 0)
    {
      return false;
    }
    boolean bool;
    if (paramInt < 1) {
      bool = e(paramByteBuffer);
      if (bool) {
        A();
        DN();
        return true;
      }
      return false;
    }
    if (paramInt < 10014) {
      bool = f(paramByteBuffer);
      if (bool) {
        DN();
        return true;
      }
      return false;
    }

    return false;
  }
}