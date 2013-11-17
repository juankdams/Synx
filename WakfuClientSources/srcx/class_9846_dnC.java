import java.nio.ByteBuffer;
import java.util.ArrayList;

final class dnC
{
  private short hcC = 0;
  private int hcD = 0;
  private final dVs hcE = new dVs();

  private dnC(bSf parambSf) {  } 
  public void z() { this.hlu.hcC = this.hcC;
    this.hlu.hcD = this.hcD;
    this.hlu.hcE.aZC.clear();
    this.hlu.hcE.aZC.ensureCapacity(this.hcE.aZC.size());
    this.hlu.hcE.aZC.addAll(this.hcE.aZC); }

  private boolean f(ByteBuffer paramByteBuffer)
  {
    boolean bool = this.hcE.b(paramByteBuffer, 1);
    if (!bool)
      return false;
    return true;
  }

  private boolean aK(ByteBuffer paramByteBuffer) {
    this.hcC = paramByteBuffer.getShort();
    boolean bool = this.hcE.b(paramByteBuffer, 10006);
    if (!bool)
      return false;
    return true;
  }

  public void cVf() {
  }

  public void cVg() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 1)
    {
      return false;
    }
    boolean bool;
    if (paramInt < 10006) {
      bool = f(paramByteBuffer);
      if (bool) {
        cVf();
        cVg();
        return true;
      }
      return false;
    }
    if (paramInt < 10008) {
      bool = aK(paramByteBuffer);
      if (bool) {
        cVg();
        return true;
      }
      return false;
    }

    return false;
  }
}