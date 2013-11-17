import java.nio.ByteBuffer;
import java.util.ArrayList;

final class Ie
{
  private final ArrayList bQH = new ArrayList(0);

  private Ie(apY paramapY) {  } 
  public void z() { this.bQI.bQH.clear();
    this.bQI.bQH.ensureCapacity(this.bQH.size());
    this.bQI.bQH.addAll(this.bQH); }

  private boolean e(ByteBuffer paramByteBuffer)
  {
    int i = paramByteBuffer.getShort() & 0xFFFF;
    this.bQH.clear();
    this.bQH.ensureCapacity(i);
    for (int j = 0; j < i; j++) {
      auQ localauQ = new auQ();
      boolean bool = localauQ.b(paramByteBuffer, 0);
      if (!bool)
        return false;
      this.bQH.add(localauQ);
    }
    return true;
  }

  public void RA() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 0)
    {
      return false;
    }if (paramInt < 10028001) {
      boolean bool = e(paramByteBuffer);
      if (bool) {
        RA();
        return true;
      }
      return false;
    }

    return false;
  }
}