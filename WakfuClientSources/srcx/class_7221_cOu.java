import java.util.Iterator;

class cOu
  implements Iterator
{
  bFe kwU = null;

  boolean kwV = false;
  protected final Iterator iCm;

  public cOu(cGk paramcGk, Iterator paramIterator)
  {
    this.iCm = paramIterator;
  }

  public boolean hasNext() {
    if (this.kwV) {
      return false;
    }
    while (this.kwU == null) {
      if (!this.iCm.hasNext()) {
        this.kwV = true;
        return false;
      }
      this.kwU = ((bFe)this.iCm.next());
      if (this.iCn.h(this.kwU)) {
        this.kwU = null;
      }
    }
    return true;
  }

  public bFe Ef() {
    if (!hasNext()) {
      throw new UnsupportedOperationException();
    }
    bFe localbFe = this.kwU;
    this.kwU = null;
    return localbFe;
  }

  public void remove() {
    throw new UnsupportedOperationException();
  }
}