import java.nio.ByteBuffer;
import java.util.ArrayList;

final class bVP
{
  private final ArrayList gAo = new ArrayList(0);

  private bVP(bFj parambFj) {  } 
  public void z() { this.fIX.gAo.clear();
    this.fIX.gAo.ensureCapacity(this.gAo.size());
    this.fIX.gAo.addAll(this.gAo); }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.gAo.clear();
    this.gAo.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      daX localdaX = new daX();
      boolean bool = localdaX.b(paramByteBuffer, 1);
      if (!bool)
        return false;
      this.gAo.add(localdaX);
    }
    return true;
  }

  public void cbn() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1)
    {
      return false;
    }if (paramInt < 220) {
      boolean bool = f(paramByteBuffer);
      if (bool) {
        cbn();
        return true;
      }
      return false;
    }

    return false;
  }
}