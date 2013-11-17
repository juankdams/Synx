import java.nio.ByteBuffer;
import java.util.ArrayList;

final class bQl
{
  private int aBM = 0;
  private final ArrayList dLR = new ArrayList(0);
  private final ArrayList dLS = new ArrayList(0);
  private final ArrayList dLT = new ArrayList(0);
  private final ArrayList dLU = new ArrayList(0);
  private dCF dLV = null;

  private bQl(awE paramawE) {  } 
  public void z() { this.gYu.aBM = this.aBM;
    this.gYu.dLR.clear();
    this.gYu.dLR.ensureCapacity(this.dLR.size());
    this.gYu.dLR.addAll(this.dLR);
    this.gYu.dLS.clear();
    this.gYu.dLS.ensureCapacity(this.dLS.size());
    this.gYu.dLS.addAll(this.dLS);
    this.gYu.dLT.clear();
    this.gYu.dLT.ensureCapacity(this.dLT.size());
    this.gYu.dLT.addAll(this.dLT);
    this.gYu.dLU.clear();
    this.gYu.dLU.ensureCapacity(this.dLU.size());
    this.gYu.dLU.addAll(this.dLU);
    this.gYu.dLV = this.dLV; }

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