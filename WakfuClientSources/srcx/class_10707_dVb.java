import java.nio.ByteBuffer;
import java.util.ArrayList;

final class dVb
{
  private final ArrayList mtR = new ArrayList(0);
  private final ArrayList mtS = new ArrayList(0);

  private dVb(dDj paramdDj) {
  }
  public void z() {
  }
  private boolean e(ByteBuffer paramByteBuffer) { int i = paramByteBuffer.getShort() & 0xFFFF;
    this.mtR.clear();
    this.mtR.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      bMP localbMP = new bMP();
      boolean bool1 = localbMP.b(paramByteBuffer, 0);
      if (!bool1)
        return false;
      this.mtR.add(localbMP);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    this.mtS.clear();
    this.mtS.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      bTD localbTD = new bTD();
      boolean bool2 = localbTD.b(paramByteBuffer, 0);
      if (!bool2)
        return false;
      this.mtS.add(localbTD);
    }
    return true; }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.mtR.clear();
    this.mtR.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      bMP localbMP = new bMP();
      boolean bool1 = localbMP.b(paramByteBuffer, 1);
      if (!bool1)
        return false;
      this.mtR.add(localbMP);
    }
    j = paramByteBuffer.getShort() & 0xFFFF;
    this.mtS.clear();
    this.mtS.ensureCapacity(j);
    for (int k = 0; k < j; k++) {
      bTD localbTD = new bTD();
      boolean bool2 = localbTD.b(paramByteBuffer, 1);
      if (!bool2)
        return false;
      this.mtS.add(localbTD);
    }
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