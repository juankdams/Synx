import java.nio.ByteBuffer;

final class bsA
{
  private final aTz dVA = new aTz();

  private bsA(aBA paramaBA) {  } 
  public void z() { this.fZv.dVA.aGg = this.dVA.aGg;
    this.fZv.dVA.name = this.dVA.name;
    this.fZv.dVA.eRD = this.dVA.eRD;
    this.fZv.dVA.eRE = this.dVA.eRE;
    this.fZv.dVA.eRF = this.dVA.eRF;
    this.fZv.dVA.eRG = this.dVA.eRG;
    this.fZv.dVA.eRH = this.dVA.eRH;
    this.fZv.dVA.eRI = this.dVA.eRI;
    this.fZv.dVA.eRJ = this.dVA.eRJ;
    this.fZv.dVA.eRK = this.dVA.eRK;
    this.fZv.dVA.eRL = this.dVA.eRL;
    this.fZv.dVA.eRM = this.dVA.eRM; }

  private boolean m(ByteBuffer paramByteBuffer)
  {
    boolean bool = this.dVA.b(paramByteBuffer, 313);
    if (!bool)
      return false;
    return true;
  }

  public void bAG() {
  }

  public boolean b(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramInt < 313)
    {
      return false;
    }if (paramInt < 315) {
      boolean bool = m(paramByteBuffer);
      if (bool) {
        bAG();
        return true;
      }
      return false;
    }

    return false;
  }
}