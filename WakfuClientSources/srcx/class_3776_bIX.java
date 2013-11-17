import java.nio.ByteBuffer;
import java.util.ArrayList;

final class bIX
{
  private final ArrayList gJF = new ArrayList(0);

  private bIX(dQK paramdQK) {  } 
  public void z() { this.gJG.gJF.clear();
    this.gJG.gJF.ensureCapacity(this.gJF.size());
    this.gJG.gJF.addAll(this.gJF); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.gJF.clear();
    this.gJF.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      abF localabF = new abF();
      boolean bool = localabF.b(paramByteBuffer, 0);
      if (!bool)
        return false;
      this.gJF.add(localabF);
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