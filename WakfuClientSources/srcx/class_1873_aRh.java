import java.nio.ByteBuffer;
import java.util.ArrayList;

final class aRh
{
  private final ArrayList aZC = new ArrayList(0);
  private dQK bNV = null;
  private final ArrayList bNW = new ArrayList(0);

  private aRh(FU paramFU) {  } 
  public void z() { this.eNW.aZC.clear();
    this.eNW.aZC.ensureCapacity(this.aZC.size());
    this.eNW.aZC.addAll(this.aZC);
    this.eNW.bNV = this.bNV;
    this.eNW.bNW.clear();
    this.eNW.bNW.ensureCapacity(this.bNW.size());
    this.eNW.bNW.addAll(this.bNW); }

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