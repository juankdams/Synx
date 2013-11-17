import java.nio.ByteBuffer;
import java.util.ArrayList;

final class dFh
{
  private final cQQ kTP = new cQQ();

  private dFh(dbF paramdbF) {  } 
  public void z() { this.lOX.kTP.aBM = this.kTP.aBM;
    this.lOX.kTP.dLT.clear();
    this.lOX.kTP.dLT.ensureCapacity(this.kTP.dLT.size());
    this.lOX.kTP.dLT.addAll(this.kTP.dLT);
    this.lOX.kTP.dQi.clear();
    this.lOX.kTP.dQi.ensureCapacity(this.kTP.dQi.size());
    this.lOX.kTP.dQi.addAll(this.kTP.dQi);
    this.lOX.kTP.dQj.clear();
    this.lOX.kTP.dQj.ensureCapacity(this.kTP.dQj.size());
    this.lOX.kTP.dQj.addAll(this.kTP.dQj);
    this.lOX.kTP.dQk.clear();
    this.lOX.kTP.dQk.ensureCapacity(this.kTP.dQk.size());
    this.lOX.kTP.dQk.addAll(this.kTP.dQk);
    this.lOX.kTP.dQl = this.kTP.dQl; }

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