import java.util.Iterator;
import java.util.NoSuchElementException;

class dnG
  implements cXU
{
  short[] lnJ = this.hMR.lMu.Vq();
  int lnK = -1;
  boolean lnL;
  boolean lnM;
  Iterator lnN;
  dIN lnO;

  dnG(dDP paramdDP)
  {
  }

  public boolean cLp()
  {
    if (cVp())
      return true;
    if (cVo())
      return true;
    if (cVn())
      return true;
    return false;
  }

  private boolean cVn() {
    if (this.lnK >= this.lnJ.length - 1)
      return false;
    this.lnK += 1;
    this.lnL = true;
    this.lnM = false;
    return cVo();
  }

  private boolean cVo() {
    if (!cVq())
      return false;
    if (this.lnM)
      return false;
    cSU localcSU = (cSU)this.hMR.lMu.cx(this.lnJ[this.lnK]);
    if (!this.lnL) {
      this.lnM = true;
      this.lnN = localcSU.cIL().iterator();
      return cVp();
    }
    this.lnL = false;
    this.lnN = localcSU.cIN().iterator();
    return this.lnN.hasNext() ? cVp() : cVo();
  }

  private boolean cVp() {
    if (!cVr()) {
      this.lnO = null;
      return false;
    }
    dIN localdIN = (dIN)this.lnN.next();
    if (!localdIN.isPersistent())
      return cLp();
    this.lnO = localdIN;
    this.lnN.remove();
    return true;
  }

  private boolean cVq() {
    return (this.lnK >= 0) && (this.lnK < this.lnJ.length);
  }

  private boolean cVr() {
    return (this.lnN != null) && (this.lnN.hasNext());
  }

  public bvk cLq() {
    if (this.lnO == null)
      throw new NoSuchElementException();
    return bvk.gf(this.hMR.aXW).rg(this.lnJ[this.lnK]).fs(this.lnM);
  }

  public dIN cLr() {
    if (this.lnO == null)
      throw new NoSuchElementException();
    return this.lnO;
  }
}