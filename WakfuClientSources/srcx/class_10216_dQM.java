import java.nio.ByteBuffer;
import java.util.ArrayList;

final class dQM
{
  private final awE lhM = new awE();

  private dQM(dkE paramdkE) {  } 
  public void z() { this.mlq.lhM.aBM = this.lhM.aBM;
    this.mlq.lhM.dLR.clear();
    this.mlq.lhM.dLR.ensureCapacity(this.lhM.dLR.size());
    this.mlq.lhM.dLR.addAll(this.lhM.dLR);
    this.mlq.lhM.dLS.clear();
    this.mlq.lhM.dLS.ensureCapacity(this.lhM.dLS.size());
    this.mlq.lhM.dLS.addAll(this.lhM.dLS);
    this.mlq.lhM.dLT.clear();
    this.mlq.lhM.dLT.ensureCapacity(this.lhM.dLT.size());
    this.mlq.lhM.dLT.addAll(this.lhM.dLT);
    this.mlq.lhM.dLU.clear();
    this.mlq.lhM.dLU.ensureCapacity(this.lhM.dLU.size());
    this.mlq.lhM.dLU.addAll(this.lhM.dLU);
    this.mlq.lhM.dLV = this.lhM.dLV; }

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