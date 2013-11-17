import java.nio.ByteBuffer;
import java.util.ArrayList;

final class Gf
{
  private final ArrayList bOu = new ArrayList(0);

  private Gf(baA parambaA) {  } 
  public void z() { this.bOv.bOu.clear();
    this.bOv.bOu.ensureCapacity(this.bOu.size());
    this.bOv.bOu.addAll(this.bOu); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bOu.clear();
    this.bOu.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      djL localdjL = new djL();
      boolean bool = localdjL.b(paramByteBuffer, 0);
      if (!bool)
        return false;
      this.bOu.add(localdjL);
    }
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